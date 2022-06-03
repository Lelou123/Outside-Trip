package Trip.Carrinho;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Trip.BancoDados.Conexao;

public class ProdutoDao {
	
	private String query;
	private PreparedStatement preparador;
	private ResultSet result;
	private Connection conexao;
	
	
	public List<Carrinho> getCarrProd(ArrayList<Carrinho> cartList){
		List<Carrinho> produtos = new ArrayList<Carrinho>();
		
		try {
			Connection conexao = Conexao.conexao();
			if(cartList.size() > 0) {
				for(Carrinho item: cartList) {
					query = "SELECT * FROM reserva_hotel WHERE id=?";
					PreparedStatement preparador = conexao.prepareStatement(query);
					preparador.setInt(1, item.getId());
					result = preparador.executeQuery();
					while(result.next()) {
						Carrinho r = new Carrinho();
						r.setId(result.getInt("id"));
						r.setReserva(result.getString("reserva"));
						r.setQuarto(result.getString("quarto"));
						r.setDataChekin(result.getDate("data_checkin"));
						r.setDataCheckout(result.getDate("data_checkout"));
						r.setQuantity(item.getQuantity());
						produtos.add(r);
					}
				}
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		return produtos;
	}
	
}	
