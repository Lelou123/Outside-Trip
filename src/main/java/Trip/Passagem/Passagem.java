package Trip.Passagem;

import java.util.Date;

public class Passagem {
	
	private Integer IdPassagens;
	
	private String Passageiros;
	private String Poltrona;
	private AssentoClasse Classe;
	private String Origem;
	private String Destino;
	private Date DataPartida;
	private Date DataRetorno;
	
	public Passagem(Integer idPassagens, String passageiros, String poltrona, AssentoClasse classe, String origem, String destino, Date dataPartida, Date dataRetorno) {
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

	public AssentoClasse getClasse() {
		return Classe;
	}

	public void setClasse(AssentoClasse classe) {
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
