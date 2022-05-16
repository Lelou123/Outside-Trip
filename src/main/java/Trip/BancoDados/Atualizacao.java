package Trip.BancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Atualizacao {

	public static void main(String[] args) {
		try {
			Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root",
					"01031994");
		
			
			System.out.println("Conecatado com a database com sucesso");
			

			PreparedStatement preparedStatement = conexao.prepareStatement("Atualizar cadastro de Cliente de usuário = ?");
			preparedStatement.setString(1, "???");
			preparedStatement.setString(2, "?");

			preparedStatement.executeUpdate();
			
			System.out.println("Database atualizada com sucesso");
			
		} catch (SQLException e) {
			System.out.println("Erro ao se conectar com a database");
		}

	}

}
