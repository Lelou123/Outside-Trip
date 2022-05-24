package Trip.Cliente;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Trip.BancoDados.Conexao;

public class ClienteDao {


	public void cadastrar(Cliente cliente) {
		 
		Connection conexao = Conexao.conexao();
		
		String sql = "INSERT INTO Cliente(nome_completo,data_nascimento,email,telefone,documento,usuario,senha) VALUES(?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setString(1, cliente.getNomeCompleto());
			preparador.setDate(2, new Date(cliente.getDataNascimento().getTime()));
			preparador.setString(3, cliente.getEmail());
			preparador.setString(4, cliente.getTelefone());
			preparador.setString(5, cliente.getDocumento());
			preparador.setString(6, cliente.getUsuario());
			preparador.setString(7, cliente.getSenha());


			preparador.execute();
			System.out.println("Cliente cadastrado com Sucesso!!!");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
