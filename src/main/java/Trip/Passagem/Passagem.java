package Trip.Passagem;

import java.util.Date;

public class Passagem {
	
	private Integer IdPassagens;
	
	private String Passageiros;
	private String Poltrona;
<<<<<<< HEAD
	private AssentoClasse Classe;
=======
	private String Classe;
	private String Reserva;
>>>>>>> 3f20e6038e3f17210bb2c5391c2bcc7a76af80dc
	private String Origem;
	private String Destino;
	private Date DataPartida;
	private Date DataRetorno;
	
<<<<<<< HEAD
	public Passagem(Integer idPassagens, String passageiros, String poltrona, AssentoClasse classe, String origem, String destino, Date dataPartida, Date dataRetorno) {
=======
	public Passagem(Integer idPassagens, String passageiros, String poltrona, String classe, String reserva, String origem, String destino, Date dataPartida, Date dataRetorno) {
>>>>>>> 3f20e6038e3f17210bb2c5391c2bcc7a76af80dc
		super();
		IdPassagens = idPassagens;
		Passageiros = passageiros;
		Poltrona = poltrona;
		Classe = classe;
		Origem = origem;
		Destino = destino;
		DataPartida = dataPartida;
		DataRetorno = dataRetorno;
	}
	

	public Passagem() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getIdPassagens() {
		return IdPassagens;
	}

	public void setIdPassagens(Integer idPassagens) {
		IdPassagens = idPassagens;
	}

	public String getPassageiros() {
		return Passageiros;
	}

	public void setPassageiros(String passageiros) {
		Passageiros = passageiros;
	}

	public String getPoltrona() {
		return Poltrona;
	}

	public void setPoltrona(String poltrona) {
		Poltrona = poltrona;
	}

	public String getClasse() {
		return Classe;
	}

	public void setClasse(String classe) {
		Classe = classe;
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
