# JDBC

![image](https://github.com/user-attachments/assets/133f43ff-3227-462e-aaf8-1d4bdb68a649)

# SQLite

![image](https://github.com/user-attachments/assets/7129481a-206e-4596-9a05-65edbf527c9d)

- SQLite es un sistema de gestión de bases de datos relacional compatible con ACID (Atomicidad, Consistencia, Aislamiento y Durabilidad), que grantiza la integgridad y fiabilidad. 
- Está contenida en un pequeña ​ biblioteca escrita en C. 
- SQLite es un proyecto de dominio público​ 

## Configurar driver JDBC de SQLite en VS Code

- Descarga el driver JDBC para SQLite https://github.com/xerial/sqlite-jdbc He adjuntado el driver (*.jar).
- Añade el jar en el directorio lib de tu proyecto:

![image](https://github.com/user-attachments/assets/7fd36741-bfaf-4cd7-9897-9e948d58cbc7)


## Extesión 

![image](https://github.com/user-attachments/assets/2b0e8e39-025f-48ad-8721-50e3d5a379ae)

___

# Crear la base de datos

- Vamos a crear una carpeta llamada data y dentro un archivo vacío llamado biblioteca.db.
- Después ejecutamos "Open Database"

![image](https://github.com/user-attachments/assets/3a39fbeb-5459-43f3-85a4-fbbbcc53be5c)

- Aparecerá la pestaña para explorar la base de datos:

![image](https://github.com/user-attachments/assets/e1250a11-8311-4a62-91e8-05d658a7e69c)

- Ejecutaremos la query:

![image](https://github.com/user-attachments/assets/39597c81-dcff-4bf5-a589-42e2fc79b6a2)

- Copia este contenido:

```
-- Tabla de usuarios
CREATE TABLE IF NOT EXISTS usuarios (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL
);

-- Tabla de materiales (libros, revistas, DVD)
CREATE TABLE IF NOT EXISTS materiales (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    titulo TEXT NOT NULL,
    tipo TEXT NOT NULL,         -- 'Libro', 'Revista', 'DVD'
    autor TEXT,                 -- solo para libros
    numero INTEGER,             -- solo para revistas
    duracion INTEGER           -- solo para DVDs
);


-- Insertar usuarios
INSERT INTO usuarios(nombre) VALUES ('María'), ('Luis');

-- Insertar materiales
INSERT INTO materiales(titulo, tipo, autor, numero, duracion) VALUES
('El Quijote', 'Libro', 'Miguel de Cervantes', NULL, NULL),
('National Geographic', 'Revista', NULL, 202, NULL),
('Matrix', 'DVD', NULL, NULL, 136);

```

- Ejecuta la query:

![image](https://github.com/user-attachments/assets/b030af75-1c03-4b46-8f9a-e8da85e24b6f)

- Ya tenemos montada la base de datos:

![image](https://github.com/user-attachments/assets/a8eab1f9-71a3-496e-a82f-5d738829948b)


![image](https://github.com/user-attachments/assets/4b134154-7241-43b0-980e-ffdf32135029)

___

# Montar el modelo de clases en mi proyecto

Material, Libro, Revista y DVD.

**Material:**

- Es una clase abstracta: no se puede instanciar directamente.
- Contiene atributos comunes a todos los materiales: id y titulo.
- Será heredada por Libro, Revista y DVD.

**Libro:**

Es un material con el campo adicional autor.

**Revista:**

Es un material con el campo adicional numero.

**DVD:**

Es un material con el campo adicional duración.


# Crear la clase de conexión

```
public class DBConnection {
    private static final String URL = "jdbc:sqlite:data/biblioteca.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
```

___ 

# AVANZADO: Gestión de préstamos en la biblioteca

```
-- Tabla de préstamos
CREATE TABLE IF NOT EXISTS prestamos (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    usuario_id INTEGER NOT NULL,
    material_id INTEGER NOT NULL,
    fecha TEXT NOT NULL,  -- formato 'YYYY-MM-DD'
    FOREIGN KEY(usuario_id) REFERENCES usuarios(id),
    FOREIGN KEY(material_id) REFERENCES materiales(id)
);

-- Insertar préstamos
INSERT INTO prestamos(usuario_id, material_id, fecha) VALUES
(1, 1, '2024-05-01'),
(2, 2, '2024-05-03'),
(1, 3, '2024-05-05');
```

