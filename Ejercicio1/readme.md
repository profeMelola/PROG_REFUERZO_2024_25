# EJERCICIO 1: REPASO PRIMERA EVALUACIÓN

![image](https://github.com/user-attachments/assets/e1b56f8f-4b07-4b00-8095-9eaa9d5a8aef)

## Objetivos

Práctica guiada para repasar conceptos trabajados en la primera evaluación.
- Variables.
- Estructuras condicionales y bucles.
- Arrays.
- Cadenas.
- Métodos estáticos (visibilidad pública y privada).
- Paquetes, clases estáticas de utilidades.


## Partimos de este código

```
        // DIFERENTES FORMAS DE CARGA UN ARRAY
        String[] nombres = {"Homer","Bart","Marge","Lisa","Maggie","Ned","Moe"};

        String[] dnis = new String[7];
        dnis[0] = "11111111A";
        dnis[1] = "11111111B";
        dnis[2] = "11111111C";
        dnis[3] = "11111111C"; // Repetido
        dnis[4] = "11111111E";
        dnis[5] = "11111111A"; // Repetido
        dnis[6] = "11111111G";

        String[] edades = new String[]{"38","10","34","8","1","40","50"};

        int[] puntos = new int[7];
        cargarPuntos(puntos); // método estático privado para cargar aleatoriamente puntos

```

Mediante llamada a métodos estáticos públicos (funciones: método que devuelve un valor y realiza una tarea específica), que se encuentran en una clase de utilidades, vamos obtener:

- Edad media de los personajes de los Simpson.
- Nombre del personaje que tiene más puntos.
- Dnis repetidos.

```
        System.out.println("1.EDAD MEDIA DE LOS PERSONAJES DE LOS SIMPSON");
        double edadMedia = Utilidades.calcularEdadMedia(edades);
        System.out.println(edadMedia);

        System.out.println("2.NOMBRE DEL PERSONAJE DE LOS SIMPSON QUE TIENE MÁS PUNTOS:");
        String nombre = Utilidades.obtenerPersonajeMasPuntos(nombres,puntos);
        System.out.println(nombre);

        System.out.println("3.DNIS REPETIDOS");
        Utilidades.mostrarDnisRepetidos(dnis);
```
___

# EJERCICIO 2: Los Simpsons en Springfield (POO)

## **Objetivos**
Este ejercicio tiene como finalidad aplicar los siguientes conceptos de **Programación Orientada a Objetos (POO)**:

- **Clases y objetos**.
- **Encapsulación y visibilidad (pública y privada)**.
- **Listas o arrays de objetos**.
- **Composición de clases** (una clase que gestiona a otras).
- **Métodos de instancia y de clase**.
- **Métodos de comportamiento en objetos**.

---

## **Descripción**
Vamos a modelar un sistema que gestiona a los personajes de *Los Simpson* en la ciudad de **Springfield**. Para ello, crearemos varias clases con sus respectivos atributos y métodos.

---

## **Clases a Implementar**

### **1. Clase `Simpson`**
Representa a cada personaje de la serie y tiene los siguientes atributos:

- `nombre` (String) → Nombre del personaje.
- `dni` (String) → Documento de identidad del personaje.
- `edad` (int) → Edad del personaje.
- `puntos` (int) → Puntos acumulados (pueden representar popularidad, experiencia, etc.).

#### **Métodos de instancia (comportamientos)**
- `saludar()` → Muestra un mensaje de saludo con el nombre del personaje.
- `ganarPuntos(int cantidad)` → Aumenta los puntos del personaje.
- `perderPuntos(int cantidad)` → Reduce los puntos, asegurándose de que no sean negativos.

---

### **2. Clase `Springfield` (Gestión de los personajes)**
Es una clase que representa la ciudad y contiene una **lista de personajes**. Se encargará de gestionar toda la lógica relacionada con ellos.

#### **Atributos**
- `habitantes` → Lista de personajes (`List<Simpson>`).

#### **Métodos públicos**
- `añadirPersonaje(Simpson personaje)` → Añade un personaje a la lista.
- `mostrarHabitantes()` → Muestra todos los personajes registrados.
- `calcularEdadMedia()` → Devuelve la edad media de los personajes.
- `obtenerPersonajeMasPuntos()` → Devuelve el personaje con más puntos.
- `mostrarDnisRepetidos()` → Muestra los DNIs repetidos.
- `realizarCompetencia(String nombre1, String nombre2)` → Simula una competencia entre dos personajes y ajusta sus puntos.

---

### **Clase Principal (`Main`)**
En la clase `Main`, se deben:
1. Crear varios objetos `Simpson` con los datos de los personajes.
2. Crear un objeto `Springfield` y añadir los personajes a la ciudad.
3. Llamar a los métodos de `Springfield` para obtener información de los habitantes.
4. Hacer que algunos personajes realicen acciones, como saludarse o ganar/perder puntos.
5. Simular una competencia entre dos personajes.

---

## **Ejemplo de Salida Esperada**
```
Bienvenido a Springfield.

1. Añadiendo personajes...
    - Homer Simpson añadido.
    - Bart Simpson añadido.
    - Marge Simpson añadido.
    - Lisa Simpson añadido.

2. Mostrando habitantes:
    - Homer (Edad: 38, Puntos: 50)
    - Bart (Edad: 10, Puntos: 40)
    - Marge (Edad: 34, Puntos: 60)
    - Lisa (Edad: 8, Puntos: 55)

3. EDAD MEDIA DE LOS PERSONAJES:
22.5 años.

4. PERSONAJE CON MÁS PUNTOS:
Marge con 60 puntos.

5. DNIs repetidos:
11111111A

6. Competencia entre Bart y Lisa...
    - Bart gana 10 puntos.
    - Lisa pierde 5 puntos.

7. Estado actual de los puntos:
    - Homer: 50
    - Bart: 50
    - Marge: 60
    - Lisa: 50

8. Homer dice: ¡Hola, soy Homer Simpson y vivo en Springfield!
```