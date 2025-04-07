# EJERCICIO 1: PRÁCTICA GUIADA - Comparar abstract e interface

## HERENCIA

Vamos a suponer que tenemos una jerarquía de clases de tipos de documento que incluye documentos PDF y documentos Word.

![image](https://user-images.githubusercontent.com/91023374/214558331-9fcbcda7-3724-4936-8371-3b63d469c8c6.png)


### Clase Documento

La clase Documento está definida por un título y tiene un método abstracto para validar los documentos:

**public abstract void validar();**

Para crear documentos es necesario indicar el título del mismo. Este título se podrá modificar una vez creado el documento.


### Clase DocumentoPDF

Un documentoDPF es un documento y además posee información de si está protegido o no contra escritura.

Para crear documentos de tipo pdf es necesario indicar por tanto el título y si está protegido o no.

Para validar un documentoPDF simplemente se informa por consola que dicho documento ha sido validado (obviando el proceso de validación...)

```
System.out.println("el documento pdf con titulo" + getTitulo()+" ha sido validado");
```


### Clase Documento Word

Un documento Word es un documento y además posee la versión con la que se ha hecho el documento.

Para crear documentos de tipo word es necesario indicar por tanto el título y la versión.

Para validar un documentoWord simplemente se informa por consola que dicho documento ha sido validado (obviando el proceso de validación...)

```
System.out.println("el documento word con titulo" + getTitulo()+" ha sido validado");
```

### Servicio de Validación

Ya disponemos de la jerarquía de clases , todas ellas comparten un método validar que se usa para validar cada objeto .

Nos queda diseñar una clase ServicioValidación que se encarga de delegar en el método validar de cada documento.

Para ello implementamos una **clase ServicioValidacion** que contenga un ArrayList de Documentos.

Se creará un objeto de la misma por el contructor por defecto.

Para añadir un documento a la lista de documentos se utilizará un método llamado addDocumento:

```
public void addDocumento(Documento d) 
```

Por otro lado, es necesario implementar otro método llamado validar que recorrerá la lista de documentos para validar cada uno de ellos.

**public void validar()**

### Programa principal

En la clase ejecutable crearemos un par de documentos de diferentes tipos y un servicio de validación.

Añadiremos los documentos al servicio de validación y procederemos a realizar la validación de cada documento.


## INTERFACE

Todo es correcto , sin embargo no es tan flexible como quisieramos ya que **la aplicación puede necesitar a futuro validar videos o audios.**

Lamentablemente ni los videos ni los audios son documentos y no los podemos encajar en la jerarquía. 

### ¿Cómo podemos modificar el programa para conseguir que el servicio de validación valide otro tipo de clases?

Podemos evolucionar el diseño y añadir un **interface de validación** de tal forma que otras clases puedan implementarlo (ajenas a la jerarquía).

![image](https://user-images.githubusercontent.com/91023374/214561025-dd2f45db-9a52-4c5d-9240-1276f7ee250b.png)


- La clase video implementará la **interface Validacion** 
- Las clase Documento implementará la **interface Validacion** y ya no tendrá el método abstracto, por tanto no será abstracta.
- Las clases DocumentoWord y DocumentoPDF heredarán de Documento.

### Se ha integrado el concepto de Video en el diseño:

![image](https://user-images.githubusercontent.com/91023374/214562083-781a1f2c-79e9-4089-9f53-e96c49d83228.png)




*Información obtenida de* https://www.arquitecturajava.com/java-herencia-vs-interfaces/



# EJERCICIO 2: Nos piden hacer que gestionemos una serie de productos.

Los productos tienen los siguientes atributos:

- Nombre
- Precio

Tenemos dos tipos de productos:

- *Perecedero:* tiene un atributo llamado días a caducar
- *No perecedero:* tiene un atributo llamado tipo con solo uno de estos dos valores ("Sin devolución", "Permite devolución");

Crea sus constructores, getters, setters y toString.

## Función calcular
Tendremos una función llamada *calcular*, que según cada clase hará una cosa u otra, a esta función le pasaremos un numero siendo la cantidad de productos.

En **Producto**, simplemente seria multiplicar el precio por la cantidad de productos pasados.

En **Perecedero**, aparte de lo que hace producto, el precio se reducirá según los días a caducar:

- Si le queda 1 día para caducar, se reducirá 4 veces el precio final.
- Si le quedan 2 días para caducar, se reducirá 3 veces el precio final.
- Si le quedan 3 días para caducar, se reducirá a la mitad de su precio final.

En **NoPerecedero**, hace lo mismo que en producto.

Crea una clase ejecutable y crea un array de productos y muestra el precio total de vender 5  productos de cada uno. Crea tú mismo los elementos del array.

## Pregunta: ¿Utilizarías una clase abstracta? Razona la respuesta

## NUEVOS REQUISITOS

### REQUISITO 1
Debemos ampliar el programa anterior de tal forma que TODOS los productos deben poder devolverse al proveedor.

- Si son **perecederos** solo pueden devolverse cuando le queda más de 5 días para caducar.
- Si **no son perecederos** solo pueden devolverse en el caso de que el tipo sea "Permite devolución".

#### Pregunta: ¿Utilizarías una clase abstracta? ¿Qué método sería abstracto? Razona la respuesta

### REQUISITO 2
Todos los productos, al igual que todos los clientes y proveedores (producto, cliente y proveedor son clases del programa de gestión de la tienda) deben poder exportarse a formato XML.

Para ello cada producto debe tener implementado el método **convert2XML()**

Este método devuelve un String con el formato del xml de cada objeto.

El xml en el que se convierten los productos, clientes y proveedores son diferentes.

#### Ejemplos de String devuelto por cada clase:

##### XML de productos

&lt;producto&gt;bla bla bla&lt;producto&gt;
  
##### XML de clientes
&lt;cliente&gt;bla bla bla&lt;cliente&gt;
  
##### XML de proveedores
&lt;proveedor&gt;bla bla bla&lt;proveedor&gt;

#### Pregunta: ¿Utilizarías una interface? Razona tu respuesta

No se pide programar las clases Cliente, Proveedor..... pero sí la interface y su implementación en la clase Producto.

## ORDENACIÓN

### Ordenación natural: interfaz Comparable

Ahora queremos establecer el criterio natural de ordenación de todos los productos.

Los productos se ordenarán de forma natural por el precio (siempre por defecto ascendente).

Con el uso de la interface **Comparable** implementa dicha funcionalidad y muestra los productos ordenados.

### Otras ordenaciones: interfaz Comparator (para la tercera evaluación)

Necesitamos generar un informe de los productos ordenados por nombre de forma descendente.

Con el uso de la interface **Comparator** implementa dicha funcionalidad y muestra los productos ordenados por nombre de forma descendente.
