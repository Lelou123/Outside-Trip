package Trip.Passagem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Trip.BancoDados.Conexao;

public class PassagemDao {
	
	private PreparedStatement preparador;
	private ResultSet result;
	
	public void passagem(Passagem passagem) {

		Connection conexao = Conexao.conexao();

		String sql = "INSERT INTO Passagens_Aereas(passageiros,poltrona,classe,origem,destino,data_partida,data_retorno) VALUES(?,?,?,?,?,?,?)";

		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setString(1, passagem.getPassageiros());
			preparador.setString(2, passagem.getPoltrona());
			preparador.setObject(3, passagem.getClasse().getClass());
			preparador.setString(4, passagem.getOrigem());
			preparador.setString(5, passagem.getDestino());
			preparador.setDate(6, new Date(passagem.getDataPartida().getTime()));
			preparador.setDate(7, new Date(passagem.getDataRetorno().getTime()));

			preparador.execute();
			System.out.println("Passagem Reservada com Sucesso");
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Passagem> getAllProducts(){
		List<Passagem> passagem = new ArrayList<Passagem>();
		String query = "SELECT * FROM Passagens_Aereas";
		Connection conexao = Conexao.conexao();
		try {
			
			preparador = conexao.prepareStatement(query);
			result = preparador.executeQuery();
			while(result.next()) {
				Passagem row = new Passagem();
				row.setIdPassagens(result.getInt("idPassagens"));
				row.setPassageiros(result.getString("passageiros"));
				row.setPoltrona(result.getString("poltrona"));
				row.setClasse(result.getString("classe"));
				row.setReserva(result.getString("reserva"));
				row.setOrigem(result.getString("destino"));
				row.setDestino(result.getString("origem"));
				row.setDataPartida(result.getDate("data_partida"));
				row.setDataRetorno(result.getDate("data_retorno"));
			}
			
		} catch (Exception e) {
			
		}
		return passagem;
	}
	

	
		
	}

