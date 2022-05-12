package Trip.Passagem;

import java.util.Date;

public class Passagem {
	private Assento Assento;
	private Integer Reserva;
	private Date DataPartida;
	private Date DataRetorno;
	
	public Passagem(Trip.Passagem.Assento assento, Integer reserva, Date dataPartida, Date dataRetorno) {
		super();
		Assento = assento;
		Reserva = reserva;
		DataPartida = dataPartida;
		DataRetorno = dataRetorno;
	}
	
	public Assento getAssento() {
		return Assento;
	}
	public void setAssento(Assento assento) {
		Assento = assento;
	}
	public Integer getReserva() {
		return Reserva;
	}
	public void setReserva(Integer reserva) {
		Reserva = reserva;
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
