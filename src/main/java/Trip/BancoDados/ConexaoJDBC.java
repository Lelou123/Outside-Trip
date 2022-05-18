package Trip.BancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoJDBC {
	
	private static Connection connection; 
	private static final String DRIVER = "com.mysql.jdbc.MySQLConnector";
	@SuppressWarnings("unused")
	private static final String SERVIDOR = "localhost";
	@SuppressWarnings("unused")
	private static final String PORTA = "3306";
	@SuppressWarnings("unused")
	private static final String BANCO = "mydb";
	private static final String URL = "jdbc:mysql://localhost:3306/mydb";
	private static final String USUARIO = "root";
	private static final String SENHA = "01031994";
	
	private ConexaoJDBC() {
		
	}
		
	public static synchronized Connection getConnection() {
		if (connection == null) {
			try {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(URL, USUARIO, SENHA);
			} catch (ClassNotFoundException e) {
				JOptionPane.showMessageDialog(null, "! Erro ao carregar o driver de conexão com o Banco de Dados !\n" + e);
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null, " X Não foi possível estabalecer uma conexão com o Banco de Dados X\n" + e);
			}
		}
		JOptionPane.showMessageDialog(null, "Conexão com o Banco de Dados realizada com sucesso!!!!");
		return connection;
	}

	public static PreparedStatement prepareStatement(String string) {
		return null;
	}	
		


}

