# DOCUMENTOS: PRÁCTICA GUIADA - Comparar abstract e interface

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



