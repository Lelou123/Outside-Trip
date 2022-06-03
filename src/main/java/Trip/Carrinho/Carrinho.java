package Trip.Carrinho;

import Trip.Hotel.Hotel;

public class Carrinho extends Hotel{
	
	
	private int Quantity;
	
	public Carrinho() {}
	
	Produto pr = new Produto();
	
	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
}
