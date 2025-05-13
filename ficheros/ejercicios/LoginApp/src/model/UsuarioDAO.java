package model;

import java.util.ArrayList;
import java.util.Arrays;

public class UsuarioDAO {
    private final ArrayList<Usuario> usuarios;

    public UsuarioDAO() {
        usuarios = new ArrayList<>(Arrays.asList(
            new Usuario("pepe", "1234"),
            new Usuario("juan", "abcd"),
            new Usuario("lola", "lola123"),
            new Usuario("admin", "admin")
        ));
    }

    /**
     * 
     * @param username
     * @param pwd
     * @return
     */
    public boolean autenticar(String username, String pwd){

        for (Usuario usuario : usuarios) {
            if(usuario.username.equals(username) && usuario.pwd.equals(pwd)){
                // podría registar la entrada en el log
                return true;
            }
                
            
        }

        // podría registar la entrada en el log
        return false;
    }

    // FORMA POO: Pendiente contains y todo lo que implica (equals)

    // FORMA API STREMA Y LAMBDA
    public boolean autenticar2(String username, String pwd){
        return usuarios.stream()
                .anyMatch( u -> u.username.equals(username) && u.pwd.equals(pwd));
    }

}  