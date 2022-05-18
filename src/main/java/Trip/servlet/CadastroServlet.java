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


@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String number = req.getParameter("number");
		Date dataNascimento = converterParaDate(req.getParameter("txtdatanascimento")); 
		String login = req.getParameter("txtlogin");
		String senha = req.getParameter("txtsenha");
				
		resp.sendRedirect("mostrar");
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
