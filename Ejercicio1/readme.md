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
        double edadMedia = calcularEdadMedia(edades);
        System.out.println(edadMedia);

        System.out.println("2.NOMBRE DEL PERSONAJE DE LOS SIMPSON QUE TIENE MÁS PUNTOS:");
        String nombre = obtenerPersonajeMasPuntos(nombres,puntos);
        System.out.println(nombre);

        System.out.println("3.DNIS REPETIDOS");
        mostrarDnisRepetidos(dnis);
```
