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

## Para realizar tus pruebas

```
    public static void main(String[] args) throws Exception {
        GestorHerramientas gestor = new GestorHerramientas();

        PicoDiamante pico1 = new PicoDiamante("Pico Pro", 250);
        PicoHierro pico2 = new PicoHierro("Pico Normal", 150);
        Hacha hacha1 = new Hacha("Hacha Rápida", 200, 1.5f);

        gestor.addHerramienta(pico1);
        gestor.addHerramienta(pico2);
        gestor.addHerramienta(hacha1);

        pico1.minar();
        pico2.minar();

        System.out.println("Total de herramientas creadas: " + Herramienta.getTotalHerramientas());

        System.out.println("*TODAS LAS HERRAMIENTAS:");
        System.out.println(gestor.pintaHerramientas());
    }
```

**Debes obtener esto por consola:**

```
Soy un pico de diamante y mino cualquier bloque.
Soy un pico de hierro y no puedo minar obsidiana.
Total de herramientas creadas: 3

*TODAS LAS HERRAMIENTAS:
[
Herramienta [nombre=Pico Pro, durabilidad=250]
Pico [material=Diamante], 
Herramienta [nombre=Pico Normal, durabilidad=150]
Pico [material=Hierro], 
Herramienta [nombre=Hacha Rápida, durabilidad=200]
Hacha [eficiencia=1.5]]
```
___

# Interface

Imagina que estás implementado todo el juego de Maincraf y tienes la siguiente jerarquía de objetos para armas:

![image-2 (1)](https://github.com/user-attachments/assets/cff609a3-9448-45e4-bb70-129dac222323)

En Minecraft, aunque herramientas y armas son de jerarquías distintas (por su uso y propiedades), comparten una funcionalidad importante: se desgastan con el uso. Es decir, tienen durabilidad, y esa durabilidad disminuye cuando se usan.

## Interface Usable

```
public interface Usable {
    void usar(); // reduce durabilidad, muestra mensaje, etc.
}

```
 Tanto una espada como un pico pueden ser usados, gastarse y posiblemente romperse cuando su durabilidad llega a 0.

 **Beneficios de la interfaz Usable:**
    - Permite tratar armas y herramientas de forma uniforme.
    - Puedes recorrer una lista de objetos Usable y llamarlos todos con .usar().
    - Encapsula una funcionalidad transversal sin forzar herencia múltiple.

### Ejemplo de implementación en Herramienta

```
 public abstract class Herramienta implements Usable {
    protected String nombre;
    protected int durabilidad;
    private static int totalHerramientas = 0;

    public Herramienta(String nombre, int durabilidad) {
        this.nombre = nombre;
        this.durabilidad = durabilidad;
        totalHerramientas++;
    }

    @Override
    public void usar() {
        if (durabilidad > 0) {
            durabilidad--;
            System.out.println(nombre + " usada. Durabilidad restante: " + durabilidad);
        } else {
            System.out.println(nombre + " está rota y no puede usarse.");
        }
    }

    // getters, setters, etc.
}
```

### Ejemplo de implementación en Espada

```
public class Espada extends Arma implements Usable {
    public Espada(String nombre, int damage, int durabilidad) {
        super(nombre, damage, durabilidad);
    }

    @Override
    public void usar() {
        if (durabilidad > 0) {
            durabilidad--;
            System.out.println(nombre + " ataca. Durabilidad restante: " + durabilidad);
        } else {
            System.out.println(nombre + " está rota. No puede atacar.");
        }
    }
}

```

___

# Excepción propia

## Objetivo

Que cuando un alumno intente usar una herramienta o un arma sin durabilidad, el programa lance una **excepción personalizada** llamada **HerramientaRotaException.**

**Aprenderemos:**
- Cómo crear una excepción personalizada.
- Cómo lanzar y capturar errores controlados con try-catch.
- Buenas prácticas de control de flujo y diseño robusto.

## Paso 1: crear la excepción personalizada

## Paso 2: el método usar() propage la excepción

## Paso 3: la herramienta lance la excepción

## Paso 4: usar try-catch en el main

