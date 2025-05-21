import repository.MaterialRepository;
import repository.Repository;

import java.sql.SQLException;
import java.util.List;

import model.DVD;
import model.Libro;
import model.Material;
import model.Revista;

public class App {
    public static void main(String[] args) throws Exception {
        

        // Obtener todos los materiales...
        Repository<Material> materialRepo = new MaterialRepository();

        try{
            System.out.println("********** LISTADO DE MATERIALES ******");
            List<Material> materiales = materialRepo.selectAll();

            for (Material m : materiales) {
                System.out.println(m);
                
            }

            // Insertar materiales nuevos
            materialRepo.insert(new Libro(0, "Cien Años de Soledad 1 DAW B", "Gabriel García Márquez"));
            materialRepo.insert(new Revista(0, "Science Today 1 DAW B", 105));
            materialRepo.insert(new DVD(0, "Interstellar 1 DAW B", 169));

            materialRepo.insert(new DVD(0, null, 169));

            // Actualizar un material existente (por ejemplo, el primer libro con ID 1)
            Material libroActualizado = new Libro(1, "Cien Años de Soledad (Edición Revisada)", "G.G. Márquez");
            materialRepo.update(libroActualizado);

            // Eliminar un material (por ejemplo, ID 3: el DVD Interstellar)
            materialRepo.delete(15);

            System.out.println("********** LISTADO DE MATERIALES ACTUALIZADO ******");
            materiales = materialRepo.selectAll();

            for (Material m : materiales) {
                System.out.println(m);
                
            }

        }catch(SQLException e){
            System.err.println("⚠️ Se produjo una excepción SQL:");
            System.err.println("Mensaje: " + e.getMessage());
            System.err.println("Código SQL: " + e.getErrorCode());
            System.err.println("Estado SQL: " + e.getSQLState());
        }

    }
}
