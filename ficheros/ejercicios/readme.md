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

    public boolean autenticar(String username, String password) {
        return usuarios.stream()
                       .anyMatch(u -> u.getUsername().equals(username) && u.getPassword().equals(password));
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
