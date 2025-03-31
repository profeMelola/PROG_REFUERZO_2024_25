# 📌 Enunciado - Programación Orientada a Objetos (POO) en Java

![image](https://github.com/user-attachments/assets/b7bde352-fc7c-4f72-9a27-f990a376aea6)


## 🛠️ Modelado de Herramientas en Minecraft

Siguiendo los pilares y principios de la **Programación Orientada a Objetos (POO)**, implementa el modelo de clases en base a las siguientes especificaciones:

---

## 🔹 Clase `GestorHerramientas`
- Compuesto por una **lista dinámica** de herramientas.
- Una vez creado el gestor, **no se podrá modificar la lista** salvo por los siguientes métodos:
  - `addHerramienta(Herramienta herramienta)`: Añade una herramienta a la lista.
  - `removeLastHerramienta()`: Elimina la última herramienta de la lista.

---

## 🔹 Clase `Herramienta`
Toda herramienta se caracteriza por:
- `nombre`: **String** → Representa el nombre de la herramienta.
- `durabilidad`: **int** → Indica cuánta resistencia tiene antes de romperse.

Para crear una herramienta es necesario especificar estas dos características.

**Reglas:**
- Una vez creada la herramienta, **no se podrá modificar su nombre**.
- **Sí se podrá modificar su durabilidad**.
- Se debe llevar la cuenta del número total de herramientas creadas. La clase deberá mantener un **contador estático** consultable en cualquier momento.

---

## 🔹 Tipos de Herramientas

### ⛏️ **Clase `Pico`**
- Además de las características básicas, un pico se define por su **material** (`String`).
- Todo pico **mina**, pero dependiendo del tipo de pico la forma de minar es diferente.
- Implementa el método `minar()`, que solo muestra un mensaje por consola.

#### **Subclases de Pico:**
- `PicoDiamante`: Al minar, muestra el mensaje →  
  _"Soy un pico de diamante y mino cualquier bloque"._
- `PicoHierro`: Al minar, muestra el mensaje →  
  _"Soy un pico de hierro y no puedo minar obsidiana"._

---

### 🪓 **Clase `Hacha`**
- Además de las características básicas, un hacha se define por su **eficiencia** (`float`).
- No requiere métodos adicionales, pero debe permitir su creación y modificación de eficiencia.

---

## 📌 Notas Adicionales:
- Implementa los principios de **encapsulación**, **herencia** y **polimorfismo** correctamente.
- Usa modificadores de acceso adecuados (`private`, `protected`, `public`).
- La estructura de clases debe permitir la extensión para agregar nuevos tipos de herramientas en el futuro.

## 🛠️ Modelado UML

![image](https://github.com/user-attachments/assets/384f5f40-2463-4df4-b752-a8cc7d915a55)

