package Model.dao;

import Connection.ConnectionFectory;
import Model.beam.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    public void create(Produto p) {
        Connection con = ConnectionFectory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO produto (descricao, preco, image) VALUE(?, ?, ?)");
            stmt.setString(1, p.getDescricao());
            stmt.setDouble(2, p.getPreco());
            stmt.setString(3, p.getImage());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvo:" + ex);
        } finally {
            ConnectionFectory.closeConnection(con, stmt);
        }
    }

    public List<Produto> read() {
        Connection con = ConnectionFectory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();

                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setImage(rs.getString("image"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFectory.closeConnection(con, stmt, rs);
        }

        return produtos;
    }

    public void update(Produto p) {
        Connection con = ConnectionFectory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE produto SET descricao = ?, preco = ?, image = ? WHERE id = ?");
            stmt.setString(1, p.getDescricao());
            stmt.setDouble(2, p.getPreco());
            stmt.setString(3, p.getImage());
            stmt.setInt(4, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar:" + ex);
        } finally {
            ConnectionFectory.closeConnection(con, stmt);
        }
    }

    public void delete(Produto p) {
        Connection con = ConnectionFectory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE id = ?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido Com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir:" + ex);
        } finally {
            ConnectionFectory.closeConnection(con, stmt);
        }
    }

    public List<Produto> readForDesc(String desc) {
        Connection con = ConnectionFectory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE descricao LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();

                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setImage(rs.getString("image"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFectory.closeConnection(con, stmt, rs);
        }

        return produtos;
    }

}
