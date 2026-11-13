package Model.dao;

import Connection.ConnectionFectory;
import Model.beam.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CadastroDAO {

    public void create(Cliente c) {
        Connection con = ConnectionFectory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO cadastro (nome, email, senha, endereco) VALUE(?, ?, ?, ?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setString(3, c.getSenha());
            stmt.setString(4, c.getEndereco());

            if (stmt != null) {
                stmt.executeUpdate();
            }

        } catch (SQLException ex) {

        } finally {
            ConnectionFectory.closeConnection(con, stmt);
        }
    }

    public boolean checkLogin(String login, String senha) {

        Connection con = ConnectionFectory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {
            stmt = con.prepareStatement("SELECT * FROM cadastro WHERE nome = ? and senha = ?");

            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFectory.closeConnection(con, stmt, rs);
        }

        return check;
    }
}
