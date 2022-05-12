package Trip.BancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Atualizacao {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://????", "????", "????");
																													
			System.out.println("Conecatado com a database com sucesso");
		} catch (SQLException e) {
			System.out.println("Erro ao se conectar com a database");
		}
		
	}

}
