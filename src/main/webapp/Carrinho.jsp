
<!--<%@ page contentType="text/html; charset=UTF-8"%> -->

<%@page import="Trip.Cliente.*"%>
<%@page import="Trip.Carrinho.*"%>
<%@page import="java.util.*"%>
<%
Cliente auth = (Cliente) request.getSession().getAttribute("auth");
if (auth != null) {
	request.setAttribute("auth", auth);
}

ArrayList<Carrinho> car_List = (ArrayList<Carrinho>) session.getAttribute("cart-list");
List<Carrinho> carrProd = null;
if(car_List != null){
	ProdutoDao pDao = new ProdutoDao();
	carrProd = pDao.getCarrProd(car_List);
	request.setAttribute("cart_list", car_List);
}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"  crossorigin="anonymous" referrerpolicy="no-referrer" />
	
	<style type="text/css">
		.table tbody td{
			vertical-align: middle;
		}
		
		.btn-incre, .btn-decre{
			box-shadow: none;
			font-size: 25px;		
		}
		
	</style>
	
<title>Carrinho</title>
</head>
<body>
	<div class="container">
		<div class="d-flex py-3">
			<h3>Preço total: R$111</h3>
			<a class="mx-3 btn btn-primary" href="#">Check Out</a>
		</div>
		<table class="table table-loght">
			<thead>
				<tr>
					<th scope="col">Nome Da reserva</th>
					<th scope="col">Quarto</th>
					<th scope="col">Checkin</th>
					<th scope="col">Checkout</th>
					<th scope="col">Preço</th>
					<th scope="col">Compre agora</th>
					<th scope="col">Cancelar</th>
				</tr>
			</thead>
			<tbody>
				
					<%
					if(car_List != null){
						for(Carrinho c: carrProd){%>
							<tr>
							<td><%=c.getReserva() %></td>
							<td><%=c.getQuarto() %></td>
							<td><%=c.getDataChekin() %></td>					
							<td><%=c.getDataCheckout() %></td>	
							<td><%=c.getPreco() %></td>					
							<td>
								<form method="post" action="" class="form-inline">
									<input type="hidden" name="id" value=<%=c.getId() %> class="form-input" />
									<div class="form-group d-flex justify-content-between">
										<a class="btn btn-sm btn-decre"><i class="fas fa-minus-square"></i></a>
										
											<input type="text"
											name="quantity" class="form-control" value="1" readonly /> 
										<a class="btn btn-sm btn-incre"><i class="fas fa-plus-square"></i></a> 
									</div>
								</form>
							</td>
							<td><a class="btn btn-sm btn-danger" href="#">Remover</a></td>
						</tr>
						<%}
					}
					%>
					
			</tbody>
		</table>
	</div>
</body>
</html>