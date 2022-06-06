package Trip.Passagem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Trip.BancoDados.Conexao;
import Trip.Carrinho.Carrinho;

public class DadosPassageiroDao {
	
	private PreparedStatement preparador;
	private ResultSet result;
	private String query;
	
	public boolean dadosPassageiro(DadosPassageiro dadosPassageiro) {
		boolean result = false;
		Connection conexao = Conexao.conexao();
		
		String sql = "INSERT INTO Dados_Passageiro(nome_completo,data_nascimento,documento,telefone,Reserva_Hotel_id,Passagens_aereas_idPassagens,Cliente_idCliente) VALUES(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setString(1, dadosPassageiro.getNomeCompleto());
			preparador.setDate(2, new Date(dadosPassageiro.getDataNascimento().getTime()));
			preparador.setString(3, dadosPassageiro.getDocumento());
			preparador.setString(4, dadosPassageiro.getTelefone());
			preparador.setInt(5, dadosPassageiro.getIdHotel());
			preparador.setInt(6, dadosPassageiro.getIdPassagens());
			preparador.setInt(7, dadosPassageiro.getIdCliente());		
			
			preparador.execute();
			System.out.println("Reserva de VOO feita com Sucesso");
			result = true;
			conexao.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	public List<Carrinho> usuarioPedidos (int id ){
		List<Carrinho> lista = new ArrayList<>();
		Connection conexao = Conexao.conexao();
		Carrinho c = new Carrinho();
		try {
			
			query = "SELECT * FROM dados_passageiro WHERE Cliente_idCliente=? ORDER BY dados_passageiro.iddados DESC";
			preparador = conexao.prepareStatement(query);
			preparador.setInt(1, id);
			result = preparador.executeQuery();
			while(result.next()) {
				DadosPassageiro dadosP= new DadosPassageiro();
				
				DadosPassageiroDao dpD = new DadosPassageiroDao();
				
				int hotelId = (result.getInt("Reserva_Hotel_id"));
				int passagemId = (result.getInt("Passagens_aereas_idPassagens"));
				System.out.println("Hotel id é: " + hotelId);
				c= dpD.getSingleProduct(hotelId);
				lista.add(c);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	
	public void cancelPedido(int id) {
		Connection conexao = Conexao.conexao();
		try {
			query = "DELETE FROM dados_passageiro WHERE Reserva_Hotel_id=?";
			preparador = conexao.prepareStatement(query);
			preparador.setInt(1, id);
			preparador.execute();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public Carrinho getSingleProduct(int id) {
		Carrinho row = new Carrinho();
		Connection conexao = Conexao.conexao();
		try {
			query= "SELECT * FROM reserva_hotel WHERE id=?";
			preparador = conexao.prepareStatement(query);
			preparador.setInt(1, id);
			result = preparador.executeQuery();
			while(result.next()) {
				row.setId(result.getInt("id"));
				row.setReserva(result.getString("reserva"));
				row.setLocal(result.getString("destino"));
				row.setDataChekin(result.getDate("data_checkin"));
				row.setDataCheckout(result.getDate("data_checkout"));
				row.setPreco(result.getDouble("preco"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return row;
	}
	
	
	
	
	
}

