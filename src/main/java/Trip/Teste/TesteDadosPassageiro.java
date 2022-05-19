package Trip.Teste;

import java.util.Date;

import Trip.Passagem.DadosPassageiro;
import Trip.Passagem.DadosPassageiroDao;

public class TesteDadosPassageiro { 
	
	public static void main(String[] args) {
		
		DadosPassageiro dadosPassageiro = new DadosPassageiro("Christian Beadles", "M", new Date(),"23669862455","11000000");
		
		DadosPassageiroDao dadosPassageiroDao = new DadosPassageiroDao();
		dadosPassageiroDao.dadosPassageiro(dadosPassageiro);
		
	}

}
