package Trip.Teste;

import java.util.Date;

import Trip.Hotel.Hotel;
import Trip.Hotel.HotelDao;

public class TesteHotel {

	public static void main(String[] args) {
		
Hotel hotel = new Hotel("Christian Beadles", new Date(),"M","1100000000","23669862455","1","227", new Date(), new Date());
		
		HotelDao hotelDao = new HotelDao();
		hotelDao.reservar(hotel);

	}

}
