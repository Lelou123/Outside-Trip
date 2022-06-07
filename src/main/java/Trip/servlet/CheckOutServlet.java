package Trip.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Trip.Carrinho.Carrinho;
import Trip.Cliente.Cliente;
import Trip.Passagem.DadosPassageiro;
import Trip.Passagem.DadosPassageiroDao;


@WebServlet("/CheckOut")
public class CheckOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()){			
			
			
			Cliente cl = (Cliente) request.getSession().getAttribute("auth");
			ArrayList<Carrinho> car_List = (ArrayList<Carrinho>) request.getSession().getAttribute("cart-list");
			int pId;
			if(cl != null && car_List != null) {
				DadosPassageiro dP = new DadosPassageiro();
				int hotelId;
				for(Carrinho c1: car_List) {
					if(c1.getId() < 10) {
						hotelId = c1.getId();
						dP.setNomeCompleto(cl.getNomeCompleto());
						dP.setDataNascimento(cl.getDataNascimento());
						dP.setDocumento(cl.getDocumento());
						dP.setTelefone(cl.getTelefone());
						
						
						dP.setIdCliente(cl.getIdCliente());
						dP.setIdHotel(hotelId);
						break;
					}
				}
				
				for(Carrinho c: car_List) {
					pId = c.getId();
					
					if(c.getId() > 10) {
						pId = c.getId() - 10;
						dP.setIdPassagens(pId);
					}
									
					pId = 0;
					DadosPassageiroDao dPDao = new DadosPassageiroDao();
					
					boolean result = dPDao.dadosPassageiro(dP);
					if(!result) break;
				}
				car_List.clear();
				response.sendRedirect("Pedidos.jsp");
			}else {
				if(cl == null) response.sendRedirect("Index.jsp#loginmodel");
				response.sendRedirect("Carrinho.jsp");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
