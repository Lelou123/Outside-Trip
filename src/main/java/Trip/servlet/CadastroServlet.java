package Trip.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Trip.Cliente.Cliente;
import Trip.Cliente.ClienteDao;

@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String documento = req.getParameter("cpf");
		Date dataNascimento = converterParaDate(req.getParameter("dataNasc")); 
		String usuario = req.getParameter("usuario");
		String telefone = req.getParameter("number");
		String senha = req.getParameter("password");
		 
		Cliente cl = new Cliente(name,dataNascimento, email, telefone, documento,usuario, senha);
		ClienteDao cDao = new ClienteDao();
		cDao.cadastrar(cl);
		
		
		resp.sendRedirect("Index.jsp"); 
		
		
		
	}
	
	private Date converterParaDate(String dataString)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dataNova= null;
		try {
			dataNova = sdf.parse(dataString);
		} catch (ParseException e) {
	
			e.printStackTrace();
		}
		return dataNova;
		
	}
}
