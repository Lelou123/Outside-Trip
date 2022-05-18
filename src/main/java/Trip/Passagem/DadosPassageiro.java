package Trip.Passagem;

import java.util.Date;

public class DadosPassageiro {

	private String NomeCompleto;
	private Character Sexo;
	private Date DataNascimento;
	private String Documento;
	private String Telefone;
	
	public DadosPassageiro(String nomeCompleto, Character sexo, String documento,Date dataNascimento, String telefone) {
		super();
		
		NomeCompleto = nomeCompleto;
		Sexo = sexo;
		Documento = documento;
		DataNascimento = dataNascimento;
		Telefone = telefone;
	}

	public String getNomeCompleto() {
		return NomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		NomeCompleto = nomeCompleto;
	}

	public Character getSexo() {
		return Sexo;
	}

	public void setSexo(Character sexo) {
		Sexo = sexo;
	}

	public Date getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}

	public String getDocumento() {
		return Documento;
	}

	public void setDocumento(String documento) {
		Documento = documento;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	
	
}
