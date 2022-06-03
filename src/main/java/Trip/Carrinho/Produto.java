package Trip.Carrinho;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Trip.Hotel.Hotel;
import Trip.Passagem.Passagem;

public class Produto {
	
	
	public Hotel hotel;
	
	public Passagem pass;
	
	public List<Hotel> Hotel = new ArrayList<Hotel>();
	
	public List <Passagem> Passagem = new ArrayList<Passagem>();
	
	public Produto(Hotel hotel, Passagem passagem) {		
		Hotel = AddHotels();
		Passagem = new ArrayList<Passagem>();
	}
	
	
	public Produto(Hotel hotel) {
		Hotel = AddHotels();
	}
	
	public Produto(Passagem passagem) {
		Passagem = new ArrayList<Passagem>();
	}
	
	public Produto() {
		Hotel = AddHotels();
		Passagem = new ArrayList<Passagem>();
	}
	
	public List<Hotel> AddHotels() {				
		Hotel.add(new Hotel( 1,"NovaYork-EUA","217B",new Date(), new Date()));
		Hotel.add(new Hotel( 2,"Amsterdã - Holanda","118A",new Date(), new Date()));
		Hotel.add(new Hotel( 1,"Paris - França","036B",new Date(), new Date()));
		Hotel.add(new Hotel( 1,"Roma - Itália","056A",new Date(), new Date()));
		
		return Hotel;
	}
	
	public void AddPassagens() {
		Passagem.add(null);
		Passagem.add(null);
		Passagem.add(null);
		Passagem.add(null);
	}
	
}
