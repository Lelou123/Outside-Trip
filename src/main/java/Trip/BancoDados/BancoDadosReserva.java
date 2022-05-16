package Trip.BancoDados;

import java.util.ArrayList;
import java.util.Date;

import Trip.Cliente.Cliente;

public class BancoDadosReserva {

	private  static ArrayList<Cliente> passageiros = new ArrayList<>();
	private static Integer passagem = 0;
	
	
	static {
		
		// NÃO ESQUECER DE COMPLETAR COM DADOS DO "CLIENTE" //
		Cliente passageiro1 = new Cliente(null, null, null, null, null, null, null, null, null, null, null, null);
		Cliente passageiro2 = new Cliente(null, null, null, null, null, null, null, null, null, null, null, null);
		
		
		BancoDadosReserva.adiciona(passageiro1);
		BancoDadosReserva.adiciona(passageiro2);
		
		
	}
	
	public static void adiciona(Cliente passageiro) {
		passageiro.setPassagem(++passagem);
		BancoDadosReserva.passageiros.add(passageiro);
	}
	
	public static ArrayList<Cliente> getCliente() {
		return BancoDadosReserva.passageiros;
	}

}
