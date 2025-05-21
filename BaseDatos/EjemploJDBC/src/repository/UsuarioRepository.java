package repository;

import db.DBConnection;
import model.Usuario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository implements Repository<Usuario> {

    @Override
    public Usuario selectById(int id) throws SQLException {
        String sql = "SELECT * FROM usuarios WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Usuario(rs.getInt("id"), rs.getString("nombre"));
            }
            return null;
        }
    }

    @Override
    public List<Usuario> selectAll() throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT * FROM usuarios";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                usuarios.add(new Usuario(rs.getInt("id"), rs.getString("nombre")));
            }
        }
        return usuarios;
    }

    @Override
    public void insert(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO usuarios(nombre) VALUES (?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNombre());
            stmt.executeUpdate();
        }
    }

    @Override
    public void update(Usuario usuario) throws SQLException {
        String sql = "UPDATE usuarios SET nombre = ? WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNombre());
            stmt.setInt(2, usuario.getId());
            stmt.executeUpdate();
        }
    }

    @Override
    public void delete(Usuario usuario) throws SQLException {
        delete(usuario.getId());
    }

    @Override
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM usuarios WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
