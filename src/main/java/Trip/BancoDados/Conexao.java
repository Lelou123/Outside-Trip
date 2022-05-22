package Trip.BancoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
		
	
	public static Connection conexao() 
	{
		
		Connection con = null;
		
		try {
			con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","01031994");
			System.out.println("Conexão com o Banco de Dados feita com Sucesso");
			
		} catch (SQLException e) {
			System.err.println("Erro ao tentar Conectar com o Banco de Dados");
			e.printStackTrace();
		}
		
		return con;
	}
	}

