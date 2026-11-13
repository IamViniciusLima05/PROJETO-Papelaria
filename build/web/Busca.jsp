<%@page import="Model.dao.ProdutoDAO"%>
<%@page import="Model.beam.Produto"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="estilo.css" rel="stylesheet" />
    </head>
    <body>
        <h1>Produtos Encotrados</h1>


        <%
            List<Produto> lista = (List<Produto>) request.getAttribute("produtos");
        %>




        <%
            for (Produto p : lista) {
        %>

        <table>
            <th>
                <img src="<%=p.getImage()%>" width="200" height="200"/><br>
                <%=p.getDescricao()%><br>
                <%=p.getPreco()%><br>
            </th>
        </table>

        <%
            }
        %>

    </body>
</html>
