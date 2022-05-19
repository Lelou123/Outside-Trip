<!DOCTYPE html>
<html lang="pt-br">

<head>
<%@ page contentType="text/html; charset=UTF-8"%>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="./css/inscrever.css" />
<link rel="icon" href="./imgs/icons/avatar.png">

<title>Cadastro</title>	
</head>

<body>
    <div class="container">
        <div class="form-image">
            <div class="box">
                <span></span>
                <div class="content">
                  <h2>Ei, Conta pra gente um pouco sobre você!</h2>
                </div>
              </div>
        </div>
        <div class="form">
            <form action="#">
                <div class="form-header">
                    <div class="title">
                        <h1>Cadastre-se</h1>
                    </div>
                </div>

                <div class="input-group">
                    <div class="input-box">
                        <label for="firstname">Primeiro Nome</label>
                        <input id="name" type="text" name="name" placeholder="Digite seu primeiro nome" required>
                    </div>

                    
                    <div class="input-box">
                        <label for="email">E-mail</label>
                        <input id="email" type="email" name="email" placeholder="Digite seu e-mail" required>
                    </div>

                    <div class="input-box">
                        <label for="number">Celular</label>
                        <input id="number" type="tel" name="number" placeholder="(xx) xxxx-xxxx" required>
                    </div>

                    <div class="input-box">
                        <label for="number">Data de nascimento</label>
                        <input type="date" id="data" name="dataIda">
                    </div>

                    <div class="input-box">
                        <label for="confirmPassword">CPF</label>
                        <input id="confirmPassword" type="password" name="confirmPassword" placeholder="Digite seu CPF" required>
                    </div>

                    <div class="input-box">
                        <label for="number">Login</label>
                        <input id="number" type="tel" name="number" placeholder="Digite seu user" required>
                    </div>
                    
                    <div class="input-box">
                        <label for="password">Senha</label>
                        <input id="password" type="password" name="password" placeholder="Digite sua senha" required>
                    </div>


                    

                </div>

                <div class="gender-inputs">
                    <div class="gender-title">
                        <h6>Gênero</h6>
                    </div>

                    <div class="gender-group">
                        <div class="gender-input">
                            <input id="female" type="radio" name="gender">
                            <label for="female">Feminino</label>
                        </div>

                        <div class="gender-input">
                            <input id="male" type="radio" name="gender">
                            <label for="male">Masculino</label>
                        </div>

                        <div class="gender-input">
                            <input id="others" type="radio" name="gender">
                            <label for="others">Outros</label>
                        </div>

                        <div class="gender-input">
                            <input id="none" type="radio" name="gender">
                            <label for="none">Prefiro não dizer</label>
                        </div>
                    </div>
                </div>

                <div class="continue-button">
                    <button><a href="./Index.jsp">Continuar</a> </button>
                </div>
            </form>
        </div>
    </div>
</body>
</html>