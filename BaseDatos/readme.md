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

___

# Crear la base de datos

Vamos a trabajar con biblioteca.sql.

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

# Gestión de préstamos en la biblioteca

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

