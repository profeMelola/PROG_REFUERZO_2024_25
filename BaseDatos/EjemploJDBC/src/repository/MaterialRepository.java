package repository;

import db.DBConnection;
import model.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MaterialRepository implements Repository<Material> {


    @Override
    public Material selectById(int id) throws SQLException {
        String sql = "SELECT * FROM materiales WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return construirMaterialDesdeResultSet(rs);
            } else {
                return null;
            }
        }
    }

    @Override
    public List<Material> selectAll() throws SQLException {
        List<Material> materiales = new ArrayList<>();
        String sql = "SELECT * FROM materiales";

        // try con recursos...
        try (
            Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)
             ) {

            while (rs.next()) {
                materiales.add(construirMaterialDesdeResultSet(rs));
            }

            // No lo necesito porque uso try con recursos
            // conn.close();
            // stmt.close();
            // rs.close();
        }

        return materiales;
    }

    @Override
    public void insert(Material m) throws SQLException {
        String sql = "INSERT INTO materiales(titulo, tipo, autor, numero, duracion) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, m.getTitulo());

            if (m instanceof Libro libro) {
                stmt.setString(2, "Libro");
                stmt.setString(3, libro.getAutor());
                stmt.setNull(4, Types.INTEGER); //Debes indicarle a JDBC el tipo SQL del campo que vas a dejar en null
                stmt.setNull(5, Types.INTEGER);

            } else if (m instanceof Revista revista) {
                stmt.setString(2, "Revista");
                stmt.setNull(3, Types.VARCHAR);
                stmt.setInt(4, revista.getNumero());
                stmt.setNull(5, Types.INTEGER);

            } else if (m instanceof DVD dvd) {
                stmt.setString(2, "DVD");
                stmt.setNull(3, Types.VARCHAR);
                stmt.setNull(4, Types.INTEGER);
                stmt.setInt(5, dvd.getDuracion());
            }

            stmt.executeUpdate();
        }
    }

    @Override
    public void update(Material m) throws SQLException {
        String sql = "UPDATE materiales SET titulo = ?, tipo = ?, autor = ?, numero = ?, duracion = ? WHERE id = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, m.getTitulo());

            if (m instanceof Libro libro) {
                stmt.setString(2, "Libro");
                stmt.setString(3, libro.getAutor());
                stmt.setNull(4, Types.INTEGER);
                stmt.setNull(5, Types.INTEGER);
            } else if (m instanceof Revista revista) {
                stmt.setString(2, "Revista");
                stmt.setNull(3, Types.VARCHAR);
                stmt.setInt(4, revista.getNumero());
                stmt.setNull(5, Types.INTEGER);
            } else if (m instanceof DVD dvd) {
                stmt.setString(2, "DVD");
                stmt.setNull(3, Types.VARCHAR);
                stmt.setNull(4, Types.INTEGER);
                stmt.setInt(5, dvd.getDuracion());
            }

            stmt.setInt(6, m.getId());

            stmt.executeUpdate();
        }
    }

    @Override
    public void delete(Material m) throws SQLException {
        delete(m.getId());
    }

    @Override
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM materiales WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    // // Método de utilidad privado para construir el objeto correcto desde ResultSet
    private Material construirMaterialDesdeResultSet(ResultSet rs) throws SQLException {
        //int id = rs.getInt("id");
        int id = rs.getInt(1); // por posición, empezando por 1
        String titulo = rs.getString("titulo");
        String tipo = rs.getString("tipo");

        // Material material = null;
        // switch (tipo) {
        //     case "Libro" -> material = new Libro(id, titulo, rs.getString("autor"));
        //     case "Revista" -> material = new Revista(id, titulo, rs.getInt("numero"));
        //     case "DVD" -> material = new DVD(id, titulo, rs.getInt("duracion"));
        //     //default -> null;
        // };

        // return material;

        return switch (tipo) {
            case "Libro" -> new Libro(id, titulo, rs.getString("autor"));
            case "Revista" -> new Revista(id, titulo, rs.getInt("numero"));
            case "DVD" -> new DVD(id, titulo, rs.getInt("duracion"));
            default -> null;
        };


    }
}
