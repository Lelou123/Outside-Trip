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
		if(car_List != null){			
			request.setAttribute("cart_list", car_List);
		}
		%>
<!DOCTYPE html>
<html>
<head>
	<%@include file="includes/head.jsp" %>
	<link rel="stylesheet" href="./css/CarrinhoCss.css" />
	
	<meta charset="UTF-8" />
<title>Pedidos cliente</title>
</head>
<body>
	<%@include file="includes/navbarCarrinho.jsp"%>		
</body>
</html>