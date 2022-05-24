package Trip.Teste;

import java.util.Date;

import Trip.Passagem.AssentoClasse;
import Trip.Passagem.Passagem;
import Trip.Passagem.PassagemDao;

public class TestePassagem {


	private static final AssentoClasse ObjectStreamClass = null;

	public static void main(String[] args) {
		
		Passagem passagem = new Passagem("1","4PC", ObjectStreamClass ,"1","São Paulo - Brasil", "Toronto - Canadá", new Date(), new Date());
		
		PassagemDao passagemDao = new PassagemDao();
		passagemDao.passagem(passagem);
		
	}

}
