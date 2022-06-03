package Trip.Passagem;

import java.util.Date;

public class DadosPassageiro {

	private Ids IdDados;
	private String NomeCompleto;
	private Date DataNascimento;
	private String Documento;
	private String Telefone;
	
	
	public DadosPassageiro(Ids idDados, String nomeCompleto, Date dataNascimento, String documento,
			String telefone, Integer idReserva, Integer idPassagem, Integer idCliente) {
		super();
		
		NomeCompleto = nomeCompleto;
		Documento = documento;
		DataNascimento = dataNascimento;
		Telefone = telefone;
	
	}

	
	public Ids getIdDados() {
		return IdDados;
	}

	public void setIdDados(Ids idDados) {
		IdDados = idDados;
	}

	public String getNomeCompleto() {
		return NomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		NomeCompleto = nomeCompleto;
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
