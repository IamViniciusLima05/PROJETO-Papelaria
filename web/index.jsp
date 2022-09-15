<%@page import="Model.dao.CadastroDAO"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Papelaria</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form action="ServicoBusca" method="POST">
            <input type="submit" value="Busca" />
            <input type="text" name="desc"/>
        </form>

        <form action="Cadastro.jsp">
            <input type="submit" value="Cadastro"/>
        </form>

        <form action="Login.jsp">
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
