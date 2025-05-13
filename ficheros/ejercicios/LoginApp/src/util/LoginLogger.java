package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class LoginLogger {

    private static final String FILE_PATH = "login_logs.csv";

    public static void registrarIntento(String username, boolean exito) throws IOException{

        String linea = username +"_"+exito;
     
        Files.write(Paths.get(FILE_PATH), linea.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}
