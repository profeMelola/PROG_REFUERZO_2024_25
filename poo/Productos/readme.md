# PRODUCTOS: Nos piden hacer que gestionemos una serie de productos.

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
