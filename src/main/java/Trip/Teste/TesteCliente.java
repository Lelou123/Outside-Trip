package Trip.Teste;

import java.util.Date;

import Trip.Cliente.Cliente;
import Trip.Cliente.ClienteDao;

public class TesteCliente {

	public static void main(String[] args) {
		
Cliente cliente = new Cliente(null, "Christian Beadles", new Date(),"chrisbeadles@gmail.com","1100000000","23669862455","itsbeadles","cb856", null, null, null, null);
		
		ClienteDao clienteDao = new ClienteDao();
		clienteDao.cadastrar(cliente);
		
	}

}
