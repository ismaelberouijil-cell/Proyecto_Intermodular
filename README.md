# Proyecto_Intermodular

## empezamos nuestra aventura en el trabajo intermodular

Nuestra idea es hacer una web donde salga la informacion de la empresa como a que hora abren, algo sobre cuando se fundo la empresa, alguna historia de la empresa y despues lo importante un sitio donde puedas comprar un movil y ya
### Base de datos
Hemos empezado haciendo en draw io lo importante y es analizar y entender como podemos estructural el draw io

despues hemos ido relacionando y sus respectivas cardinalidades

Despues de terminar con draw io hemos creado la base de datos mirandolo en el draw io y hemos ido cambiando cosas porque no nos convencian

Despues cada consulta
y sus insercion de datos


### Java

El principio es costoso porque no teniamos una idea clara de como llevar a cabo

Despues de la ayuda de algunos profes ya sabemos como orientarlo y ya hemos creado el usuario de cliente en java y tenemos que conectarlo con la base de datos

#### conexion con java y base de datos

Hemos arreglado la base de datos ya hora esta bien y en el src la conexion de java con la base de datos

#### avanzando con base de datos y el cominzo de java

hemos empezado la parte de java y tenemos casi acabado base de datos con insert 

#### Acabamos Base de Datos 

Ahora ya hemos acabado el esquema E-R y hemos casi acabado la parte de java para poder sincronizar

### Entornos
Nosotros cada dia hemos ido añadiendo cosas en el readme, archivos ,directorios pero de manera desordenada y hoy hemos ordenado de manera buena para que podais leerlo bien

### lenguaje de macas
Primeros pasos donde ya hemos creado el index.html con el horario y la lista de moviles, nos falta el css pero ya mas o menos tenemos estamos siguiendo la idea principal

Hemos probado a hacer una cesta la cual nos esta gustando la idea para que cuando le demos nos salga una lista que el usuario haya seleccionado y le interese comprar
#### Cambio_Drastico

Hemos decidido quitar la cesta porque nos va a liar, tambien hemso pensado en que los clientes puedan crear usuarios, puedan registrarse e iniciar sesion, por ahora solo tenemos en el html para que inicie

Vale ya tenemos una idea para poder crear una pagina donde inicie sesion y lleve a otra pagina para poder comprar el artiulo con sus respectivos estilos

Por fin ya la hemso creado
### Sistemas
El trabajo hemos tenido que buscar por muchas paginas para poder acabarlo tras muchas horas de investigacion ya hemos logrado y aprendido como por ejemplo la diferencia entre jdk y jre

### Ampliacion

#### ConexionDB.java

Clase encargada de realizar la conexión con la base de datos MySQL mediante JDBC.

Funciones principales:

abrir conexión,
gestionar credenciales,
conectar Java con MySQL.
Cliente.java

#### Clase modelo que representa la entidad Cliente.

Contiene atributos como:

nombre,
email,
teléfono,
dirección,
contraseña.
Movil.java

#### Clase modelo que representa los móviles del catálogo.

Incluye información como:

modelo,
precio,
RAM,
almacenamiento,
stock,
marca.
ClienteDAO.java

#### Clase DAO encargada de realizar operaciones sobre la tabla Cliente.

Operaciones implementadas:

inserción de clientes,
búsqueda,
consultas SQL,
acceso a datos.
MovilDAO.java

#### Clase DAO encargada de gestionar los móviles de la base de datos.

Permite:

consultar catálogo,
mostrar móviles,
acceder al stock,
recuperar información de productos.
MenuService.java

#### Clase encargada de gestionar la lógica del menú y la interacción con el usuario.

Main.java

#### Clase principal desde donde se ejecuta la aplicación.

Tecnologías utilizadas en Java
Java
JDBC
MySQL Connector
Programación orientada a objetos (POO)
Conceptos aplicados

#### Durante el desarrollo de la parte Java se han utilizado conceptos como:

Clases y objetos.
Encapsulación.
Uso de DAO.
Conexión JDBC.
Separación por capas.
Gestión de datos desde MySQL.
Consultas SQL desde Java.

### IPE Presentación profesional del proyecto
Este proyecto consiste en el desarrollo de una aplicación y página web para la gestión de un catálogo de teléfonos móviles.

La aplicación simula el funcionamiento de una tienda online de móviles, permitiendo gestionar productos, clientes, pedidos, pagos y envíos mediante una base de datos relacional conectada con Java.

El proyecto ha sido desarrollado como parte del Proyecto Intermodular del ciclo DAW, integrando conocimientos de programación, bases de datos y desarrollo web.
Lo que resuelve es El proyecto busca resolver la necesidad de organizar y gestionar la información de una tienda de móviles de forma digital.

Permite:

almacenar productos y marcas,
controlar el stock,
gestionar clientes,
registrar pedidos,
administrar pagos y envíos.

De esta manera, se evita llevar la información manualmente y se facilita la gestión del negocio.

Está pensado para pequeñas o medianas empresas dedicadas a la venta de teléfonos móviles y tecnología.

La aplicación podría utilizarse como base para:

una tienda online,
un sistema interno de gestión,
un catálogo digital de productos.

Desarrolla Desarrollo web
HTML5
CSS3
Programación
Java
Base de datos
MySQL
SQL
Conexión con base de datos
JDBC
Herramientas
GitHub
Visual Studio Code
MySQL Workbench

Y he aprendedio a 
Durante el desarrollo del proyecto he aprendido a:

diseñar bases de datos relacionales,
crear diagramas entidad-relación,
trabajar con claves primarias y foráneas,
realizar consultas SQL,
conectar Java con MySQL mediante JDBC,
organizar un proyecto utilizando clases y DAO,
aplicar programación orientada a objetos,
estructurar una aplicación por capas,
utilizar GitHub para organizar el proyecto.