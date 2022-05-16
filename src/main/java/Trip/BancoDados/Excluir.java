package Trip.BancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Excluir {

	public static void main(String[] args) {
		try {
			Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "01031994"); 

			
			System.out.println("Conecatado com a database com sucesso");
			
			PreparedStatement preparedStatement = conexao.prepareStatement("Delete cliente de usuário = ?");
			preparedStatement.setString(1, "????");
			preparedStatement.executeUpdate();
			
			System.out.println("Database deletada com sucesso");
			
		} catch (SQLException e) {
			System.out.println("Erro ao se conectar com a database");
		}

	}
}
