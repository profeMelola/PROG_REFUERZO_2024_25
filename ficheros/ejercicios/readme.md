# Práctica 1: Login por Consola en Java

## 💡 Descripción

En esta práctica trabajaremos con una aplicación de consola en Java que simula un sistema de login de usuarios. Se trata de una práctica orientada a manejar clases, listas de objetos, lectura por consola, y el registro de datos en ficheros.

---

## 🎯 Objetivos

- Leer usuario y contraseña por consola.
- Comprobar si el usuario está registrado (simulado con una lista en memoria).
- Mostrar un mensaje de bienvenida si el login es correcto.
- Permitir reintentos si el login es incorrecto, o salir.
- Registrar cada intento (éxito o fallo) en un fichero de texto con formato **CSV**.
- Utilizar la API de ficheros `java.nio`.

---

## 🧱 Estructura del Proyecto

- `Usuario`: clase que representa un usuario con `username` y `password`.
- `UsuarioDAO`: contiene una lista predefinida de usuarios y un método de autenticación.

```
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

}  
```
- `LoginLogger`: escribe los intentos de login en un fichero CSV llamado `login_logs.csv`.
- `Main`: clase principal que gestiona la interacción por consola.

---

## 📝 Formato del Log (`login_logs.csv`)

Cada intento de login se registra con la siguiente estructura:

**Ejemplo:**
```
pepe,OK,2025-05-07 10:32:01
juan,FAIL,2025-05-07 10:32:42
```

**Pista para dar el formato correcto a cada registro en el archivo CSV:**

```
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String linea = String.format("%s,%s,%s\n", username, exito ? "OK" : "FAIL", timestamp);

```

___
## PENDIENTE PARA LA PRÓXIMA CLASE. Investiga por adelantado ;-)

![image](https://github.com/user-attachments/assets/61231598-d7b8-45f8-836b-f7774272b733)


En clase hemos visto como crear el fichero y escribir líneas (registros) con la clase **Files**:

```
Files.write(Paths.get(FILE_PATH), linea.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
```

Prueba a crear el fichero login_logs.csv de diferentes formas, usando siempre **try con recursos**:

- Con FileWriter. 
- Con BufferedWriter: puedes obtener un BufferedWriter de dos formas:
  
      ```
          // Forma 1
          BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH,true))
  
          // Forma 2
          BufferedWriter bw = Files.newBufferedWriter(Paths.get(FILE_PATH), Charset.forName("UTF-8"),StandardOpenOption.CREATE, StandardOpenOption.APPEND)
  
      ```


### ¿Qué beneficio tiene crear y escribir en el fichero de texto con FileWriter, BufferedWriter, Files.write?

Revisa la teoría https://github.com/profeMelola/PROG_REFUERZO_2024_25/blob/main/ficheros/readme.md

___
### Ejemplos de try con y sin recursos

**Sin recursos:**

```
BufferedWriter bw = null;
try {
    bw = new BufferedWriter(new FileWriter("ruta/del/archivo.txt", true));
    bw.write("Escribiendo sin try con recursos");
    bw.newLine();
} catch (IOException e) {
    e.printStackTrace();
} finally {
    try {
        if (bw != null) {
            bw.close(); // Es obligatorio cerrarlo manualmente
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

```

**Con recursos:**

Aquí no necesitas finally porque el recurso se cierra automáticamente al final del bloque try.

```
try (BufferedWriter bw = new BufferedWriter(new FileWriter("ruta/del/archivo.txt", true))) {
    bw.write("Escribiendo con try con recursos");
    bw.newLine();
} catch (IOException e) {
    e.printStackTrace();
}

```
___
### Leer archivo CSV y generar informes

Partiendo de este método, procesa cada línea del archivo y pinta por consola cuántos intentos han sido OK y cuántos FAIL.

```
public static void leerCSV() throws IOException {
        System.out.println("*********** CONTENIDO DEL LOG ***********");

        List<String> lineas = Files.readAllLines(Paths.get(FILE_PATH));
        lineas.forEach(System.out::println);

        // for (String linea : lineas) {
        //     System.out.println(linea);
        // }
        
        // OTRA FORMA: Con Files.newBufferedReader
        /*try ( BufferedReader br = Files.newBufferedReader(FILE_PATH)) {
            String linea = null;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        }*/


        System.out.println("********************************************************");

    }   
```

**Solución:**

```
    public static void leerCSV() throws IOException {
        System.out.println("*********** CONTENIDO DEL LOG ***********");

        List<String> lineas = Files.readAllLines(Paths.get(FILE_PATH));
        //lineas.forEach(System.out::println);

        int okCount = 0;
        int failCount = 0;        


        for (String linea : lineas) {
            System.out.println(linea);
            String[] partes = linea.split(",");
            if (partes.length >= 2) {
                String estado = partes[1].trim();
                if (estado.equalsIgnoreCase("OK")) {
                    okCount++;
                } else if (estado.equalsIgnoreCase("FAIL")) {
                    failCount++;
                }
            }
        }        

        System.out.println("********************************************************");
        System.out.println("Total OK: " + okCount);
        System.out.println("Total FAIL: " + failCount);
        System.out.println("********************************************************");

    }    
```
