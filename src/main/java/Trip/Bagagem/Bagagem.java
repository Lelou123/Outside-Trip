package Trip.Bagagem;

public class Bagagem {
	private String Tipo;
	private Double Peso;
	private Double PesoMaximo;
	
	public Bagagem(String tipo, Double peso, Double pesoMaximo) {
		super();
		Tipo = tipo;
		Peso = peso;
		PesoMaximo = pesoMaximo;
	}
	
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	public Double getPeso() {
		return Peso;
	}
	public void setPeso(Double peso) {
		Peso = peso;
	}
	public Double getPesoMaximo() {
		return PesoMaximo;
	}
	
	public void setPesoMaximo(Double pesoMaximo) {
		PesoMaximo = pesoMaximo;
	}
	
	
}
