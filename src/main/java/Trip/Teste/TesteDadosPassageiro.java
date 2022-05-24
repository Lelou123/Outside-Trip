package Trip.Teste;

import java.util.Date;

import Trip.Passagem.DadosPassageiro;
import Trip.Passagem.DadosPassageiroDao;

public class TesteDadosPassageiro { 
	
	public static void main(String[] args) {
		
		DadosPassageiro dadosPassageiro = new DadosPassageiro(null, "Christian Beadles", "Masculino", new Date(),"23669862455","11000000", null, null, null);
		
		DadosPassageiroDao dadosPassageiroDao = new DadosPassageiroDao();
		dadosPassageiroDao.dadosPassageiro(dadosPassageiro);
		
	}

}
