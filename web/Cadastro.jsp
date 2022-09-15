<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Model.dao.CadastroDAO"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.12.1/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="estilo.css" rel="stylesheet" />
    </head>
    <body>
        <!-- Navegação-->
        <nav class="navbar navbar-expand-lg bg-secondary text-uppercase fixed-top" id="mainNav">
            <div class="container">
                <a class="navbar-brand js-scroll-trigger">O QUE PROCURA?</a><button class="navbar-toggler navbar-toggler-right text-uppercase font-weight-bold bg-primary text-white rounded" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">Menu <i class="fas fa-bars"></i></button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="index.html">Página Home</a></li>
                        <li class="nav-item mx-0 mx-lg-1"><a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger" href="Login.jsp">Fazer Login</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <form action="ServicoCadastro" method="POST" style="margin-top: 150px;">
            <h1 class="page-section-heading text-center text-uppercase text-secondary mb-0">CADASTRO</h1>
            <div class="control-group">
                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                    <label>Name</label><input class="form-control" id="Name" type="text" placeholder="Nome" required="required" data-validation-required-message="Por favor, coloque seu nome." />
                        <p class="help-block text-danger"></p>
                 </div>
            </div>
            <div class="control-group">
                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                    <label>Email Address</label><input class="form-control" id="email" type="email" placeholder="E-mail" required="required" data-validation-required-message="Por favor, coloque seu e-mail." />
                        <p class="help-block text-danger"></p>
                </div>
            </div>
            <div class="control-group">
                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                    <label>Password</label><input class="form-control" id="password" type="text" placeholder="Senha" required="required" data-validation-required-message="Por favor, coloque sua senha" />
                        <p class="help-block text-danger"></p>
                </div>
            </div>
            <div class="control-group">
                <div class="form-group floating-label-form-group controls mb-0 pb-2">
                    <label>Endereço</label><input class="form-control" id="endereco" type="text" placeholder="Endereço" required="required" data-validation-required-message="Por favor, coloque seu endereço" />
                        <p class="help-block text-danger"></p>
                </div>
                <div>
                    <button class="btn btn-primary btn-xl" id="sendMessageButton" type="submit" style="margin-top:10px;">Cadastrar</button>
                </div>
            </div>
        </form>
    </body>
</html>