package Trip.Passagem;

import java.util.Date;

public class Passagem {
	
	private Integer Passageiros;
	private String Poltrona;
	private AssentoClasse Classe;
	private Integer Reserva;
	private String Origem;
	private String Destino;
	private Date DataPartida;
	private Date DataRetorno;
	
	public Passagem(Integer passageiros, String poltrona, Trip.Passagem.AssentoClasse classe, Integer reserva, String origem, String destino, Date dataPartida, Date dataRetorno) {
		super();
		Passageiros = passageiros;
		Poltrona = poltrona;
		Classe = classe;
		Reserva = reserva;
		Origem = origem;
		Destino = destino;
		DataPartida = dataPartida;
		DataRetorno = dataRetorno;
	}
	
	
	public Integer getPassageiros() {
		return Passageiros;
	}

	public void setPassageiros(Integer passageiros) {
		Passageiros = passageiros;
	}

	public String getPoltrona() {
		return Poltrona;
	}

	public void setPoltrona(String poltrona) {
		Poltrona = poltrona;
	}

	public AssentoClasse getClasse() {
		return Classe;
	}

	public void setClasse(AssentoClasse classe) {
		Classe = classe;
	}

	public Integer getReserva() {
		return Reserva;
	}
	public void setReserva(Integer reserva) {
		Reserva = reserva;
	}
	
	public String getOrigem() {
		return Origem;
	}

	public void setOrigem(String origem) {
		Origem = origem;
	}

	public String getDestino() {
		return Destino;
	}

	public void setDestino(String destino) {
		Destino = destino;
	}

	public Date getDataPartida() {
		return DataPartida;
	}
	public void setDataPartida(Date dataPartida) {
		DataPartida = dataPartida;
	}
	public Date getDataRetorno() {
		return DataRetorno;
	}
	public void setDataRetorno(Date dataRetorno) {
		DataRetorno = dataRetorno;
	}
	
	
	
	public void Comprar(Passagem p)
	{
		
	}
	public void Cancelar(Passagem p)
	{
		
	}
	
	
}
