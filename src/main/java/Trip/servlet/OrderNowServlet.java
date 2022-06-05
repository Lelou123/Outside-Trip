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

/**
 * Servlet implementation class OrderNowServlet
 */
@WebServlet("/OrderNow")
public class OrderNowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()){
			Cliente cl = (Cliente) request.getSession().getAttribute("auth");
			
			if(cl != null) {
				
				String hotelId = request.getParameter("id");
				
				System.out.println(cl.getNomeCompleto());
				System.out.println(cl.getDataNascimento());
				System.out.println(cl.getDocumento());
				System.out.println(cl.getTelefone());
				System.out.println(Integer.parseInt(hotelId));			
				System.out.println(cl.getIdCliente());
				
				
				DadosPassageiro dP = new DadosPassageiro();
				dP.setNomeCompleto(cl.getNomeCompleto());
				dP.setDataNascimento(cl.getDataNascimento());
				dP.setDocumento(cl.getDocumento());
				dP.setTelefone(cl.getTelefone());
				dP.setIdHotel(Integer.parseInt(hotelId));
				dP.setIdPassagens(null);
				dP.setIdCliente(cl.getIdCliente());
				
				
				DadosPassageiroDao dPDao = new DadosPassageiroDao();
				
				boolean result = dPDao.dadosPassageiro(dP);
				if(result) {
					
					ArrayList<Carrinho> car_List = (ArrayList<Carrinho>) request.getSession().getAttribute("cart-list");
					if(car_List != null) {
						for(Carrinho c: car_List) {
							if(c.getId() == Integer.parseInt(hotelId)) {
								car_List.remove(car_List.indexOf(c));
								break;
							}						
						}						
					}					
					response.sendRedirect("Pedidos.jsp");
				}else {
					out.print("Pedido falhou");
				}
				
			}else {
				response.sendRedirect("Index.jsp");
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
