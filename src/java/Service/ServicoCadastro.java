package Service;

import Model.beam.Cliente;
import Model.dao.CadastroDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServicoCadastro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        String endereco = request.getParameter("endereco");

        if (!nome.equals("") &&  !email.equals("") && !senha.equals("") && !endereco.equals("")) {
            Cliente c = new Cliente();

            c.setNome(nome);
            c.setEmail(email);
            c.setSenha(senha);
            c.setEndereco(endereco);

            CadastroDAO dao = new CadastroDAO();
            dao.create(c);
        }
    }
}
