package Trip.Passagem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Trip.BancoDados.Conexao;

public class DadosPassageiroDao {

	
	public void dadosPassageiro(DadosPassageiro dadosPassageiro) {
		 
		Connection conexao = Conexao.conexao();
		
		String sql = "INSERT INTO Dados_Passageiro(nome_completo,sexo,data_nascimento,documento,telefone) VALUES(?,?,?,?,?)";
		
		try {
			PreparedStatement preparador = conexao.prepareStatement(sql);
			preparador.setString(1, dadosPassageiro.getNomeCompleto());
			preparador.setCharacter(2, dadosPassageiro.getSexo());
			preparador.setDate(3, new Date(dadosPassageiro.getDataNascimento().getTime()));
			preparador.setString(4, dadosPassageiro.getDocumento());
			preparador.setString(5, dadosPassageiro.getTelefone());
		
		

			preparador.execute();
			System.out.println("Reserva de VOO feita com Sucesso");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
