package Trip.Hotel;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Trip.BancoDados.Conexao;

public class HotelDao {

	public void reservar(Hotel hotel) {
		
	Connection conexao = Conexao.conexao();
	
	String sql = "INSERT INTO Reserva Hotel(nome_completo,data_nascimento,sexo,telefone,documento,reserva,quarto,dataCheckin,dataCheckout) VALUES(?,?,?,?,?,?,?,?,?)";
	
	try {
		PreparedStatement preparador = conexao.prepareStatement(sql);
		preparador.setString(1, hotel.getNomeCompleto());
		preparador.setDate(2, new Date(hotel.getDataNascimento().getTime()));
		preparador.setNCharacterStream(3, hotel.getSexo());
		preparador.setString(4, hotel.getTelefone());
		preparador.setString(5, hotel.getDocumento());
		preparador.setInt(6, hotel.getReserva());
		preparador.setInt(7, hotel.getQuarto());
		preparador.setDate(8, new Date(hotel.getDataCheckin().getTime()));
		preparador.setDate(8, new Date(hotel.getDataCheckout().getTime()));

		preparador.execute();
		System.out.println("Reserva feita com Sucesso!!!!");
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}

}
}