package Trip.Hotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hotel {
	

	public Integer Id;
	
	private String Reserva;
	private String Local;
	private Date DataChekin;
	private Date DataCheckout;
	private Double Preco;
	//public List<Hotel> Hotel = AddHotels();
	
	

	public Hotel(Integer id,  String reserva, String local, Date dataChekin, Date dataCheckout, Double preco) {
		super();
		Id = id;		
		Reserva = reserva;
		Local = local;
		DataChekin = dataChekin;
		DataCheckout = dataCheckout;
		Preco = preco;
	}
	
	
	public Hotel(Integer id,  String reserva, String local, Date dataChekin, Date dataCheckout) {
		super();
		Id = id;		
		Reserva = reserva;
		Local = local;
		DataChekin = dataChekin;
		DataCheckout = dataCheckout;
		
	}
	
	public Hotel() {}
	
	/*
	 * public List<Hotel> AddHotels() { Hotel.add(new Hotel(
	 * 1,"NovaYork-EUA","217B",new Date(), new Date())); Hotel.add(new Hotel(
	 * 2,"Amsterd� - Holanda","118A",new Date(), new Date())); Hotel.add(new Hotel(
	 * 1,"Paris - Fran�a","036B",new Date(), new Date())); Hotel.add(new Hotel(
	 * 1,"Tokyo - Jap�o","056A",new Date(), new Date()));
	 * 
	 * return Hotel; }
	 */
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getReserva() {
		return Reserva;
	}
	public void setReserva(String reserva) {
		Reserva = reserva;
	}
	public String getQuarto() {
		return Local;
	}
	public void setQuarto(String local) {
		Local = local;
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

	public Double getPreco() {
		return Preco;
	}

	public void setPreco(Double preco) {
		Preco = preco;
	}
	
		
	
}
