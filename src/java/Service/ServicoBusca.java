package Service;

import Model.beam.Produto;
import Model.dao.ProdutoDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServicoBusca extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String desc = request.getParameter("desc");
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.readForDesc(desc);
        request.setAttribute("produtos", produtos);
        RequestDispatcher rd = request.getRequestDispatcher("Busca.jsp");
        rd.forward(request, response);
    }
}
