<!DOCTYPE html>
<html lang="pt-br">

<head>

<%@ page contentType="text/html; charset=UTF-8"%>

<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Outside Trip</title>

<link rel="stylesheet" href="./css/splide.min.css">
<link rel="stylesheet" href="./css/style.css">
<link rel="icon" href="./imgs/icons/aviao.png">
<script src="./js/splide.min.js"></script>

</head>

<body>
	<header>

		<div class="menu-mobile">
			<div class="aside-fechar">
				<h1 class="brand">
					<a href="Index.jsp">Out<span>s</span>ide trip
					</a>
				</h1>
				<button class="fechar-menu">✕</button>
			</div>

			<ul>
				<li><a href="sobreNos.html">Sobre Nós</a></li>
				<li><a href="#cardi">Cards</a></li>
				<li><a href="#hotel">Hotéis</a></li>
				<li><a href="#passagem">Passagens</a></li>
				<li><a href="pagePagamento.html">Carrinho</a></li>
				<li><a href="Index.jsp#loginmodel" class="login">Login</a></li>
			</ul>

		</div>


		<div class="overlay"></div>
		<div class="container">

			<nav>
				<h1 class="brand">
					<a href="Index.jsp">Out<span>s</span>ide trip
					</a>
				</h1>
				<button class="aside-menu">☰</button>
				<ul>
					<li><a href="sobreNos.jsp">Sobre Nós</a></li>
					<li><a href="#cardi">Cards</a></li>
					<li><a href="#hotel">Hotéis</a></li>
					<li><a href="#passagem">Passagens</a></li>
					<li><a href="pagePagamento.jsp">carrinho</a></li>
					<li><a href="Index.jsp#loginmodel" class="login"> Login</a></li>
				</ul>
				<div id="loginmodel" class="loginmodel" style="z-index: 2;">
					<div class="popup">
						<h2>Entrar</h2>
						<div class="content">
							<section>
								<input class="form-v-001" id="usuario_input"
									placeholder="Usuario"> <input class="form-v-001"
									id="senha_input" type="password" placeholder="senha">

								<div class="bts-login">
									<button class="neons">
										<a href="./Index.jsp">Login</a>
									</button>
									<button class="neons">
										<a href="./Inscrever-se.jsp">Inscrever-se</a>
									</button>
								</div>
							</section>
						</div>
						<a class="close" href="#">&times;</a>
					</div>

				</div>
		</div>
		</div>


		</div>

		</nav>
		<form>
			<section class="Selecionar">
				<div>
					<label class="origem" for="text">Origem:</label> <label
						class="destino" for="text">Destino:</label> <label class="dataID"
						for="data">Data de ida:</label> <label class="dataID" for="data">Data
						de volta:</label>
				</div>
				<input type="text" placeholder="De onde vai Sair?" name="nome"
					required> <input type="text"
					placeholder="Para onde você vai?"> <input type="date"
					id="data" name="dataIda"> <input type="date" id="data"
					name="dataVolt"> <select name="format" id="format">
					<option value="pessoa">1 Passageiro</option>
					<option value="pessoa">2 Passageiros</option>
					<option value="pessoa">3 Passageiros</option>
					<option value="pessoa">4 Passageiros</option>
					<option value="pessoa">5 Passageiros</option>
					<option value="pessoa">6 Passageiros</option>
					<option value="pessoa">7 Passageiros</option>
					<option value="pessoa">8 Passageiros</option>
					<option value="pessoa">9 Passageiros</option>
				</select> <select name="format" id="format">
					<option value="pessoa">0 Crianças</option>
					<option value="pessoa">1 Criança</option>
					<option value="pessoa">2 Crianças</option>
					<option value="pessoa">3 Crianças</option>
					<option value="pessoa">4 Crianças</option>
					<option value="pessoa">5 Crianças</option>
					<option value="pessoa">6 Crianças</option>
					<option value="pessoa">7 Crianças</option>
					<option value="pessoa">8 Crianças</option>
					<option value="pessoa">9 Crianças</option>
				</select>
				<button class="neons">Buscar voos</button>

				<h2 class="Slogan">Relaxe … Você está com a gente!</h2>
				<h2 class="Slogan2">Nós simplificamos</h2>



			</section>
		</form>
		</div>

		</section>

	</header>



	<div class="passagens-splide">
		<h2 class="chamadopsg" id="passagem">Ofertas imperdíveis de voos
			internacionais</h2>
		<div class="splide">
			<div class="splide__track">
				<ul class="splide__list">
					<li class="splide__slide">
						<div class="box">
							<!--img-box---------->
							<div class="slide-img">
								<img alt="1"
									src="https://images.unsplash.com/photo-1502602898657-3e91760cbb34?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=873&q=80">
								<!--overlayer---------->
								<div class="overlay">
									<!--buy-btn------>
									<a href="pagePagamento.html" class="buy-btn">Compre já</a>
								</div>
							</div>
							<!--detail-box--------->
							<div class="detail-box">
								<!--type-------->
								<div class="type">
									<a href="#">frança - paris </a> <span>valor economica:</span>
								</div>
								<!--price-------->
								<a href="#" class="price">R$3.300.11</a>

							</div>

						</div>

					</li>
					<li class="splide__slide">
						<div class="box">
							<!--img-box---------->
							<div class="slide-img">
								<img alt="1"
									src="https://images.unsplash.com/photo-1524047934617-cb782c24e5f3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80">
								<!--overlayer---------->
								<div class="overlay">
									<!--buy-btn------>
									<a href="pagePagamento.html" class="buy-btn">Compre já</a>
								</div>
							</div>
							<!--detail-box--------->
							<div class="detail-box">
								<!--type-------->
								<div class="type">
									<a href="#">holanda - amisterdam</a> <span>valor
										economica:</span>
								</div>
								<!--price-------->
								<a href="#" class="price">R$3.100.60</a>

							</div>

						</div>
					</li>
					<li class="splide__slide">
						<div class="box">
							<!--img-box---------->
							<div class="slide-img">
								<img alt="1"
									src="https://images.unsplash.com/photo-1541336032412-2048a678540d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80">
								<!--overlayer---------->
								<div class="overlay">
									<!--buy-btn------>
									<a href="pagePagamento.html" class="buy-btn">Compre já</a>
								</div>
							</div>
							<!--detail-box--------->
							<div class="detail-box">
								<!--type-------->
								<div class="type">
									<a href="#">EUA - nova iorque</a> <span>valor economica:</span>
								</div>
								<!--price-------->
								<a href="#" class="price">R$2.900.67</a>

							</div>

						</div>
					</li>
					<li class="splide__slide">
						<div class="box">
							<!--img-box---------->
							<div class="slide-img">
								<img alt="1"
									src="https://images.unsplash.com/photo-1581091287680-7fa25bf39e7b?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80">
								<!--overlayer---------->
								<div class="overlay">
									<!--buy-btn------>
									<a href="pagePagamento.html" class="buy-btn">Compre já</a>
								</div>
							</div>
							<!--detail-box--------->
							<div class="detail-box">
								<!--type-------->
								<div class="type">
									<a href="#">canada - ottawa</a> <span>valor economica:</span>
								</div>
								<!--price-------->
								<a href="#" class="price">R$5.100.11</a>

							</div>

						</div>
					</li>
					<li class="splide__slide">
						<div class="box">
							<!--img-box---------->
							<div class="slide-img">
								<img alt="1"
									src="https://images.unsplash.com/photo-1544092683-c0c9ebb368e5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=851&q=80">
								<!--overlayer---------->
								<div class="overlay">
									<!--buy-btn------>
									<a href="pagePagamento.html" class="buy-btn">Compre já</a>
								</div>
							</div>
							<!--detail-box--------->
							<div class="detail-box">
								<!--type-------->
								<div class="type">
									<a href="#">Dubai</a> <span>valor economica:</span>
								</div>
								<!--price-------->
								<a href="#" class="price">R$4.800.48</a>

							</div>

						</div>
					</li>
					<li class="splide__slide">
						<div class="box">
							<!--img-box---------->
							<div class="slide-img">
								<img alt="1"
									src="https://images.unsplash.com/photo-1593839154339-377e24b3ba32?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=904&q=80">
								<!--overlayer---------->
								<div class="overlay">
									<!--buy-btn------>
									<a href="pagePagamento.html" class="buy-btn">Compre já</a>
								</div>
							</div>
							<!--detail-box--------->
							<div class="detail-box">
								<!--type-------->
								<div class="type">
									<a href="#">japao - tokyo </a> <span>valor economica:</span>
								</div>
								<!--price-------->
								<a href="#" class="price">R$5.500.70</a>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</div>

	</div>

	<!--HOTEIS-------->
	<div class="card-hotel">

		<!--CARD HOTEL 1-------->
		<div class="caaaard">

			<div class="caaaard-img">
				<img
					src="https://cf.bstatic.com/xdata/images/hotel/max1024x768/189448134.jpg?k=a898adcce6d013738e95745c425e7bdb41ccb743542e5462e73f7cf64857f042&o=&hp=1"
					alt="">
			</div>
			<div class="caaaard-info">
				<p class="texttt-title">Holanda Amisterdam</p>
				<p class="texttt-body">
					Contem 2 passagens (ida e volta) <br> Mais estadia de uma
					semana no Olympic Hotel

				</p>
			</div>
			<div class="caaaard-footer">
				<span class="texttt-title">De R$ 9.430<br>por R$ 8.480

				</span>
				<div class="caaaard-button">
					<svg class="svg-icon" viewBox="0 0 20 20">
              <path
							d="M17.72,5.011H8.026c-0.271,0-0.49,0.219-0.49,0.489c0,0.271,0.219,0.489,0.49,0.489h8.962l-1.979,4.773H6.763L4.935,5.343C4.926,5.316,4.897,5.309,4.884,5.286c-0.011-0.024,0-0.051-0.017-0.074C4.833,5.166,4.025,4.081,2.33,3.908C2.068,3.883,1.822,4.075,1.795,4.344C1.767,4.612,1.962,4.853,2.231,4.88c1.143,0.118,1.703,0.738,1.808,0.866l1.91,5.661c0.066,0.199,0.252,0.333,0.463,0.333h8.924c0.116,0,0.22-0.053,0.308-0.128c0.027-0.023,0.042-0.048,0.063-0.076c0.026-0.034,0.063-0.058,0.08-0.099l2.384-5.75c0.062-0.151,0.046-0.323-0.045-0.458C18.036,5.092,17.883,5.011,17.72,5.011z">
              </path>
              <path
							d="M8.251,12.386c-1.023,0-1.856,0.834-1.856,1.856s0.833,1.853,1.856,1.853c1.021,0,1.853-0.83,1.853-1.853S9.273,12.386,8.251,12.386z M8.251,15.116c-0.484,0-0.877-0.393-0.877-0.874c0-0.484,0.394-0.878,0.877-0.878c0.482,0,0.875,0.394,0.875,0.878C9.126,14.724,8.733,15.116,8.251,15.116z">
              </path>
              <path
							d="M13.972,12.386c-1.022,0-1.855,0.834-1.855,1.856s0.833,1.853,1.855,1.853s1.854-0.83,1.854-1.853S14.994,12.386,13.972,12.386z M13.972,15.116c-0.484,0-0.878-0.393-0.878-0.874c0-0.484,0.394-0.878,0.878-0.878c0.482,0,0.875,0.394,0.875,0.878C14.847,14.724,14.454,15.116,13.972,15.116z">
              </path>
            </svg>
				</div>
			</div>
		</div>

		<!--CARD HOTEL 2-------->
		<div class="caaaard">
			<div class="caaaard-img">
				<img
					src="https://images.trvl-media.com/hotels/1000000/30000/25100/25033/88b59aab.jpg?impolicy=resizecrop&rw=1200&ra=fit"
					alt="img hotel ">


			</div>
			<div class="caaaard-info">
				<p class="texttt-title">Estados Unidos Nova York</p>
				<p class="texttt-body">
					Contem 4 passagens (ida e volta) <br>Mais estadia de 4 dias em
					Row NYC at Times Square

				</p>
			</div>
			<div class="caaaard-footer">
				<span class="texttt-title">De R$ 9.410 <br>Por R$ 8.570

				</span>
				<div class="caaaard-button">
					<svg class="svg-icon" viewBox="0 0 20 20">
              <path
							d="M17.72,5.011H8.026c-0.271,0-0.49,0.219-0.49,0.489c0,0.271,0.219,0.489,0.49,0.489h8.962l-1.979,4.773H6.763L4.935,5.343C4.926,5.316,4.897,5.309,4.884,5.286c-0.011-0.024,0-0.051-0.017-0.074C4.833,5.166,4.025,4.081,2.33,3.908C2.068,3.883,1.822,4.075,1.795,4.344C1.767,4.612,1.962,4.853,2.231,4.88c1.143,0.118,1.703,0.738,1.808,0.866l1.91,5.661c0.066,0.199,0.252,0.333,0.463,0.333h8.924c0.116,0,0.22-0.053,0.308-0.128c0.027-0.023,0.042-0.048,0.063-0.076c0.026-0.034,0.063-0.058,0.08-0.099l2.384-5.75c0.062-0.151,0.046-0.323-0.045-0.458C18.036,5.092,17.883,5.011,17.72,5.011z">
              </path>
              <path
							d="M8.251,12.386c-1.023,0-1.856,0.834-1.856,1.856s0.833,1.853,1.856,1.853c1.021,0,1.853-0.83,1.853-1.853S9.273,12.386,8.251,12.386z M8.251,15.116c-0.484,0-0.877-0.393-0.877-0.874c0-0.484,0.394-0.878,0.877-0.878c0.482,0,0.875,0.394,0.875,0.878C9.126,14.724,8.733,15.116,8.251,15.116z">
              </path>
              <path
							d="M13.972,12.386c-1.022,0-1.855,0.834-1.855,1.856s0.833,1.853,1.855,1.853s1.854-0.83,1.854-1.853S14.994,12.386,13.972,12.386z M13.972,15.116c-0.484,0-0.878-0.393-0.878-0.874c0-0.484,0.394-0.878,0.878-0.878c0.482,0,0.875,0.394,0.875,0.878C14.847,14.724,14.454,15.116,13.972,15.116z">
              </path>
            </svg>
				</div>
			</div>
		</div>

		<!--CARD HOTEL 3-------->
		<div class="caaaard">
			<div class="caaaard-img">
				<img
					src="https://static.budgetplaces.com/establishment/28/01/10128/2.jpg"
					alt="img hotel ">


			</div>
			<div class="caaaard-info">
				<p class="texttt-title">França Paris</p>
				<p class="texttt-body">
					Contem 2 passagens (ida e volta) <br>Mais estadia de uma
					semana no Au Pacific Hotel
				</p>
			</div>
			<div class="caaaard-footer">
				<span class="texttt-title">De R$ 10.100<br>Por R$ 9.100

				</span>
				<div class="caaaard-button">
					<svg class="svg-icon" viewBox="0 0 20 20">
              <path
							d="M17.72,5.011H8.026c-0.271,0-0.49,0.219-0.49,0.489c0,0.271,0.219,0.489,0.49,0.489h8.962l-1.979,4.773H6.763L4.935,5.343C4.926,5.316,4.897,5.309,4.884,5.286c-0.011-0.024,0-0.051-0.017-0.074C4.833,5.166,4.025,4.081,2.33,3.908C2.068,3.883,1.822,4.075,1.795,4.344C1.767,4.612,1.962,4.853,2.231,4.88c1.143,0.118,1.703,0.738,1.808,0.866l1.91,5.661c0.066,0.199,0.252,0.333,0.463,0.333h8.924c0.116,0,0.22-0.053,0.308-0.128c0.027-0.023,0.042-0.048,0.063-0.076c0.026-0.034,0.063-0.058,0.08-0.099l2.384-5.75c0.062-0.151,0.046-0.323-0.045-0.458C18.036,5.092,17.883,5.011,17.72,5.011z">
              </path>
              <path
							d="M8.251,12.386c-1.023,0-1.856,0.834-1.856,1.856s0.833,1.853,1.856,1.853c1.021,0,1.853-0.83,1.853-1.853S9.273,12.386,8.251,12.386z M8.251,15.116c-0.484,0-0.877-0.393-0.877-0.874c0-0.484,0.394-0.878,0.877-0.878c0.482,0,0.875,0.394,0.875,0.878C9.126,14.724,8.733,15.116,8.251,15.116z">
              </path>
              <path
							d="M13.972,12.386c-1.022,0-1.855,0.834-1.855,1.856s0.833,1.853,1.855,1.853s1.854-0.83,1.854-1.853S14.994,12.386,13.972,12.386z M13.972,15.116c-0.484,0-0.878-0.393-0.878-0.874c0-0.484,0.394-0.878,0.878-0.878c0.482,0,0.875,0.394,0.875,0.878C14.847,14.724,14.454,15.116,13.972,15.116z">
              </path>
            </svg>
				</div>
			</div>
		</div>


		<div class="caaaard">
			<div class="caaaard-img">
				<img
					src="https://casa.abril.com.br/wp-content/uploads/2021/12/Os-principais-8-erros-na-hora-de-compor-a-decorac%CC%A7a%CC%83o-dos-quartos-01-.jpeg"
					alt="img hotel ">


			</div>
			<div class="caaaard-info">
				<p class="texttt-title">Itália Roma</p>
				<p class="texttt-body">
					Contem 3 passagens (somente volta) <br>Mais estadia de duas
					semanas no Havaí
				</p>
			</div>
			<div class="caaaard-footer">
				<span class="texttt-title">De R$ 6.500<br>Por R$ 3.200

				</span>
				<div class="caaaard-button">
					<svg class="svg-icon" viewBox="0 0 20 20">
              <path
							d="M17.72,5.011H8.026c-0.271,0-0.49,0.219-0.49,0.489c0,0.271,0.219,0.489,0.49,0.489h8.962l-1.979,4.773H6.763L4.935,5.343C4.926,5.316,4.897,5.309,4.884,5.286c-0.011-0.024,0-0.051-0.017-0.074C4.833,5.166,4.025,4.081,2.33,3.908C2.068,3.883,1.822,4.075,1.795,4.344C1.767,4.612,1.962,4.853,2.231,4.88c1.143,0.118,1.703,0.738,1.808,0.866l1.91,5.661c0.066,0.199,0.252,0.333,0.463,0.333h8.924c0.116,0,0.22-0.053,0.308-0.128c0.027-0.023,0.042-0.048,0.063-0.076c0.026-0.034,0.063-0.058,0.08-0.099l2.384-5.75c0.062-0.151,0.046-0.323-0.045-0.458C18.036,5.092,17.883,5.011,17.72,5.011z">
              </path>
              <path
							d="M8.251,12.386c-1.023,0-1.856,0.834-1.856,1.856s0.833,1.853,1.856,1.853c1.021,0,1.853-0.83,1.853-1.853S9.273,12.386,8.251,12.386z M8.251,15.116c-0.484,0-0.877-0.393-0.877-0.874c0-0.484,0.394-0.878,0.877-0.878c0.482,0,0.875,0.394,0.875,0.878C9.126,14.724,8.733,15.116,8.251,15.116z">
              </path>
              <path
							d="M13.972,12.386c-1.022,0-1.855,0.834-1.855,1.856s0.833,1.853,1.855,1.853s1.854-0.83,1.854-1.853S14.994,12.386,13.972,12.386z M13.972,15.116c-0.484,0-0.878-0.393-0.878-0.874c0-0.484,0.394-0.878,0.878-0.878c0.482,0,0.875,0.394,0.875,0.878C14.847,14.724,14.454,15.116,13.972,15.116z">
              </path>
            </svg>
				</div>
			</div>
		</div>


	</div>

	<!--CARDS-------->
	<h2 class="slogan-cards">VEJA SÓ O QUE PREPARAMOS PARA OS CLIENTES
		DA Outside Trip</h2>

	<div class="cardes">
		<section>
			<div class="containercard" id="cardi">
				<div class="cardi">
					<div class="contentcard">

						<h2>01</h2>
						<h3>Cliente Executivo:</h3>
						<p>É o cliente que possui o nosso programa “Outside trip
							Milhas”, ou seja, o cartão fidelidade para resgatar pontos
							acumulados de antigas viagens e reverter em descontos para
							viagens internacionais. Também ganha desconto em passagem no mês
							de aniversário, possui assentos em poltronas reclináveis, fila
							para embarque com prioridade e além disso, com direito a todos os
							outros diversos serviços! Obs: Está incluso o ganho exclusivo de:
							Chip de celular para uso no exterior.</p>
						<button class="bt-maisif">
							<a href="#">mais infomaçoes</a>
						</button>
					</div>
		</section>
		<section>
			<div class="containercard">
				<div class="cardi">
					<div class="contentcard">
						<h2>02</h2>
						<h3>Cliente Premium:</h3>
						<p>O hábito de jogar videogame é adotado por 38% da população
							brasileira, assim, nossa empresa oferece um “Nintendo Switch”
							para o nosso cliente se divertir durante a viagem com diversos
							jogos exclusivos e além de, 1 mês de Spotify para você curtir
							escutando músicas, podcasts e muito mais. Obs: Está incluso o
							ganho de: uma Necessaire, Cobertor Manta e Fone de Ouvido.</p>
						<button class="bt-maisif">
							<a href="#">mais infomaçoes</a>
						</button>
					</div>
		</section>
		<section>
			<div class="containercard">
				<div class="cardi">
					<div class="contentcard">
						<h2>03</h2>
						<h3>Cliente VIP:</h3>
						<p>Nosso Cliente Vip ganha desconto em passagem no mês do seu
							aniversário. Como também, Carregador Portátil, Almofada de
							Pescoço, Fone de Ouvido, 3 meses de Spotify ou 6 meses de PSN
							Plus.</p>
						<button class="bt-maisif">
							<a href="#">mais infomaçoes</a>
						</button>
					</div>
		</section>

		<section>
			<div class="containercard">
				<div class="cardi">
					<div class="contentcard">
						<h2>04</h2>
						<h3>Cliente:</h3>
						<p>Todo mundo adora dar um cochilo durante o voo e por isso
							nossa empresa pensou em presentear nossos clientes com a Almofada
							de Pescoço, o uso desse item tem como principal objetivo impedir
							que a cabeça “caia” ao pegar no sono durante a viagem, dessa
							forma, mantendo-a em uma posição mais confortável. Como também
							ganha Fone de Ouvido, Cobertor Manta e Necessaire.</p>
						<button class="bt-maisif">
							<a href="#">mais infomaçoes</a>
						</button>
					</div>
		</section>
	</div>

	<!--BUTTON UP -------->
	<button class="button-scroll" onclick="scrolltop()">Voltar ao
		topo</button>


	<footer>
		<div style="width: 26%;">
			<h4>Formas de pagamento</h4>
			<img
				src="https://www.cvc.com.br/imageproc/image/upload/v1/global/logos/cards/visa.svg"
				alt="Visa"> <img
				src="https://www.cvc.com.br/imageproc/image/upload/v1/global/logos/payments/mastercard.svg"
				alt="Mastercard"> <img
				src="https://almundo-com-res.cloudinary.com/image/upload/e_trim/c_fill,g_auto/e_sharpen/q_auto:eco,f_auto,fl_lossy/v1/global/logos/cards/elo.svg"
				alt="Elo"> <img
				src="https://www.cvc.com.br/imageproc/image/upload/v1/global/logos/cards/american-express.svg"
				alt="American Express"> <img
				src="https://www.cvc.com.br/imageproc/image/upload/v1/global/logos/cards/diners.svg"
				alt="Diners"> <img
				src="https://www.cvc.com.br/imageproc/image/upload/v1/global/logos/cards/hipercard.svg"
				alt="Hipercard">
		</div>
		<label id="CopyrightFooter">© Copyright 2002-2022
			OutsideTrip.com.br - All Rights Reserved -</label>

		<div class="social-media">

			<h4>Siga ofertas nas redes</h4>
			<a href="#" target="_blank"><img
				src="https://www.cvc.com.br/imageproc/image/upload/v1/global/icons/social/socialFacebook.svg"
				alt="Facebook"></a> <a
				href="https://www.instagram.com/outsidetrip1/" target="_blank"><img
				src="https://www.cvc.com.br/imageproc/image/upload/v1/global/icons/social/socialInstagram.svg"
				alt="Instagram"></a> <a href="#" target="_blank"><img
				src="https://www.cvc.com.br/imageproc/image/upload/v1/global/icons/social/socialTwitter.svg"
				alt="Twitter"></a> <a href="#" target="_blank"><img
				src="https://www.cvc.com.br/imageproc/image/upload/v1/global/icons/social/socialYoutube.svg"
				alt="YouTube"></a>

		</div>


		<span></span>
	</footer>


	<!--ANIMAÇÃO DOS CARDS -------->
	<script type="text/javascript" src="./js/vanilla-tilt.js"></script>

	<script>
		VanillaTilt.init(document.querySelectorAll(".cardi"), {
			max : 25,
			speed : 400,
			glare : true,
			"max-glare" : 1,
		});
	</script>

</body>

<script src="./js/script.js"></script>

<!--ANIMAÇÃO PASSAGENS -------->
<script>
	var splide = new Splide('.splide', {
		type : 'loop',
		perPage : 3,
		autoplay : true,
	});

	splide.mount();
</script>

<!--ANIMAÇÃO BOTÃO UP -------->
<script>
	function scrolltop() {
		window.scrollTo({
			top : 0,
			behavior : 'smooth'
		})
	}
</script>

</html>