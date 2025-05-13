import java.util.Scanner;

import model.UsuarioDAO;
import util.LoginLogger;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Pedir username y pwd por consola
        Scanner sc = new Scanner(System.in);
        UsuarioDAO dao = new UsuarioDAO();
        boolean salir = false;

        do {
            System.out.println("Usuario:");
            String username = sc.nextLine();

            System.out.println("Password:");
            String pwd = sc.nextLine();

            boolean autenticado = dao.autenticar(username, pwd);

            // hacer try catch
            LoginLogger.registrarIntento(username, autenticado);

            if (autenticado)
            {
                System.out.println("Bienvenido "+username);
                salir = true;
            } else{
                System.out.println("usuario y pwd incorrectos!!!!");
                System.out.println("Desea intentarlo de nuevo? (s/n)");
                String opcion = sc.nextLine();
                if (opcion.equalsIgnoreCase("n"))
                    salir = true;
            }


        }while(!salir);

        
    }
}
