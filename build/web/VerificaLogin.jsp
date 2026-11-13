
<%@page import="Model.dao.CadastroDAO"%>


<%
    String login = request.getParameter("nome");
    String senha = request.getParameter("senha");

    CadastroDAO dao = new CadastroDAO();
    if (dao.checkLogin(login, senha)) {
        session.setAttribute("usuario", dao.checkLogin(login, senha));
        response.sendRedirect("index.jsp");
    } else {
        response.sendRedirect("Login.jsp?erro=UsuarioIncorreta");
    }
%>

