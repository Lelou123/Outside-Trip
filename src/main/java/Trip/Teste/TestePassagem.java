package Trip.Teste;

import java.util.Date;

import Trip.Passagem.Passagem;
import Trip.Passagem.PassagemDao;

public class TestePassagem {

	public static void main(String[] args) {
		
		Passagem passagem = new Passagem("1","4PC","Primeira Classe","1","S�o Paulo - Brasil", "Toronto - Canad�", new Date(), new Date());
		
		PassagemDao passagemDao = new PassagemDao();
		passagemDao.passagem(passagem);
		
	}

}
