package Trip.BancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Inserir {

	public static void main(String[] args) {
		try {
			Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "01031994");
			
			System.out.println("Conecatado com a database com sucesso");
			
	PreparedStatement preparedStatement = conexao.prepareStatement("Inserir cliente com valores(?,?,?)");
			
			preparedStatement.setString(1, "?");
			preparedStatement.setString(2, "???");
			preparedStatement.setString(3, "????");

			
			preparedStatement.executeUpdate();
			
			System.out.println("Database inserida com sucesso");
			
		} catch (SQLException e) {
			System.out.println("Erro ao se conectar com a database");
		}

	}

}
