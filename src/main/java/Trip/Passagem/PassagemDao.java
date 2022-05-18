package Trip.Passagem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Trip.BancoDados.Conexao;

public class PassagemDao {

	public void passagem(Passagem passagem) {

		Connection conexao = Conexao.conexao();

		String sql = "INSERT INTO Passagens Aéreas(passageiros,poltrona,classe,reserva,origem,destino,data_partida,data_retorno) VALUES(?,?,?,?,?,?,?,?)";

		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setInt(1, passagem.getPassageiros());
			preparador.setString(2, passagem.getPoltrona());
			preparador.setAssentoClasse(3, passagem.getClasse());
			preparador.setInt(4, passagem.getReserva());
			preparador.setString(5, passagem.getOrigem());
			preparador.setString(6, passagem.getDestino());
			preparador.setDate(7, new Date(passagem.getDataPartida().getTime()));
			preparador.setDate(8, new Date(passagem.getDataRetorno().getTime()));

			preparador.execute();
			System.out.println("Passagem Reservada com Sucesso");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
