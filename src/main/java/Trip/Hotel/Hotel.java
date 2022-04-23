package Trip.Hotel;

import java.util.Date;

public class Hotel {
	private Integer Reserva;
	private Integer Quarto;
	private Date DataPartida;
	private Date DataRetorno;
	
	
	public Hotel(Integer reserva, Integer quarto, Date dataPartida, Date dataRetorno) {
		super();
		Reserva = reserva;
		Quarto = quarto;
		DataPartida = dataPartida;
		DataRetorno = dataRetorno;
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
	
	
	public void Comprar(Hotel h)
	{
		
	}
	public void Cancelar(Hotel hotel)
	{
		
	}
	
}
