package Trip.Hotel;

import java.util.Date;

public class Hotel {
	

	private String NomeCompleto;
	private Date DataNascimento;
	private String Sexo;
	private String Telefone;
	private String Documento;
	private String Reserva;
	private String Quarto;
	private Date DataChekin;
	private Date DataCheckout;
	
	
	public Hotel(String nomeCompleto, Date dataNascimento, String sexo, String telefone, String documento, String reserva, String quarto, Date dataChekin, Date dataCheckout) {
		super();
		NomeCompleto = nomeCompleto;
		DataNascimento = dataNascimento;
		Sexo = sexo;
		Telefone = telefone;
		Documento = documento;
		Reserva = reserva;
		Quarto = quarto;
		DataChekin = dataChekin;
		DataCheckout = dataCheckout;
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

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getDocumento() {
		return Documento;
	}

	public void setDocumento(String documento) {
		Documento = documento;
	}

	public String getReserva() {
		return Reserva;
	}
	public void setReserva(String reserva) {
		Reserva = reserva;
	}
	public String getQuarto() {
		return Quarto;
	}
	public void setQuarto(String quarto) {
		Quarto = quarto;
	}
	
	public Date getDataChekin() {
		return DataChekin;
	}

	public void setDataChekin(Date dataChekin) {
		DataChekin = dataChekin;
	}

	public Date getDataCheckout() {
		return DataCheckout;
	}

	public void setDataCheckout(Date dataCheckout) {
		DataCheckout = dataCheckout;
	}

	
	public void Comprar(Hotel h)
	{
		
	}
	public void Cancelar(Hotel hotel)
	{
		
	}
	
}
