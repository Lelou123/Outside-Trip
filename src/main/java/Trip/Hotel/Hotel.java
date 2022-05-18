package Trip.Hotel;

import java.util.Date;

public class Hotel {
	private String NomeCompleto;
	private Date DataNascimento;
	private Character Sexo;
	private String Telefone;
	private String Documento;
	private Integer Reserva;
	private Integer Quarto;
	private Date DataCheckin;
	private Date DataCheckout;
	
	
	public Hotel(String nomeCompleto, Date dataNascimento, Character sexo, String telefone, String documento, Integer reserva, Integer quarto, Date dataCheckin, Date dataCheckout) {
		super();
		NomeCompleto = nomeCompleto;
		DataNascimento = dataNascimento;
		Sexo = sexo;
		Telefone = telefone;
		Documento = documento;
		Reserva = reserva;
		Quarto = quarto;
		DataCheckin = dataCheckin;
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

	public Character getSexo() {
		return Sexo;
	}

	public void setSexo(Character sexo) {
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

	public Integer getReserva() {
		return Reserva;
	}
	public void setReserva(Integer reserva) {
		Reserva = reserva;
	}
	public Integer getQuarto() {
		return Quarto;
	}
	public void setQuarto(Integer quarto) {
		Quarto = quarto;
	}
	
	public Date getDataCheckin() {
		return DataCheckin;
	}

	public void setDataCheckin(Date dataCheckin) {
		DataCheckin = dataCheckin;
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
