# Sistema de Inventario - Tree-Stock

**Autor:** [Vivian Masiel Quintero Reales]  
**Asignatura:** [Estructura de Datos]
**Docente:** [Carlos Arturo Castro]
---

## 1. Objetivo del Proyecto
Comprender y aplicar el concepto de Árbol Binario de Búsqueda, implementando una estructura dinámica en Java para gestionar productos de un inventario.

El sistema permite:

Registrar productos.
Organizar los productos según su ID.
Mostrar los productos ordenados mediante un recorrido inorden.
Buscar un producto por su ID.
Utilizar métodos recursivos para la inserción y búsqueda.

---

## 2. Descripción

Tree-Stock es una aplicación de consola desarrollada en Java que permite gestionar un inventario de productos utilizando un Árbol Binario de Búsqueda (ABB).

El proyecto permite registrar productos mediante un identificador único (ID), mostrar el inventario ordenado mediante un recorrido inorden y buscar productos por su ID.

El objetivo es aplicar los conceptos de estructuras dinámicas, nodos, punteros y recursividad mediante la implementación manual de un árbol binario de búsqueda.
---
## 3. Estructura del proyecto
EA3_Tree-Stock_Vivian_Quintero/
│
├── src/
│   ├── ArbolInventario.java
│   ├── Main.java
│   └── Producto.java
│
└── README.md

 ## Producto.java

Representa el nodo del árbol.

Contiene:

int id
String nombre
Producto izquierdo
Producto derecho

Los atributos izquierdo y derecho permiten establecer las conexiones entre los nodos del árbol.

## ArbolInventario.java

Contiene la lógica principal del Árbol Binario de Búsqueda.

Incluye:

Inserción recursiva de productos.
Recorrido inorden.
Búsqueda recursiva por ID.
Verificación de si el árbol está vacío.

## Main.java

Contiene la interfaz de consola y el menú interactivo.

El usuario puede seleccionar:

1. Registrar Producto
2. Mostrar Inventario (Recorrido Inorden)
3. Buscar Producto por ID
0. Salir

-----
## 4. Requisitos

Para ejecutar el proyecto se requiere:

Visual Studio Code
JDK Eclipse Temurin
Extensión de Java para Visual Studio Code.

-----
## 5. Instrucciones de ejecución
1. Clonar o descargar el repositorio

Descargar el proyecto desde este repositorio de GitHub.

2. Abrir el proyecto

Abrir la carpeta del proyecto desde Visual Studio Code.

3. Ejecutar el programa

Abrir el archivo:

Main.java

y ejecutar el método main.

También puede ejecutarse desde la terminal utilizando los comandos correspondientes de Java.
4. Utilizar el menú

Al ejecutar el programa aparecerá el siguiente menú:

=== SISTEMA DE INVENTARIO "TREE-STOCK" ===
1. Registrar Producto
2. Mostrar Inventario (Recorrido Inorden)
3. Buscar Producto por ID
0. Salir

----
## 6. Funcionamiento
1. Registrar un producto

La opción 1 solicita:

ID del producto.
Nombre del producto.

El producto se agrega al Árbol Binario de Búsqueda según su ID.
Ejemplo:

Ingrese el ID del producto: 50
Ingrese el nombre del producto: Computador

Producto registrado con éxito.
2. Mostrar inventario

La opción 2 realiza un recorrido inorden del árbol.

El recorrido se realiza de la siguiente manera:

Izquierda → Raíz → Derecha

Esto permite mostrar los productos ordenados de menor a mayor según su ID.

Ejemplo:

--- LISTA DE PRODUCTOS (INORDEN - ORDENADO POR ID) ---

ID: 20 | Producto: Mouse
ID: 35 | Producto: Teclado
ID: 50 | Producto: Computador
ID: 70 | Producto: Monitor
3.  Buscar un producto

La opción 3 permite ingresar un ID para comprobar si el producto existe dentro del inventario.

Ejemplo:

Ingrese el ID a buscar: 50

Producto con ID 50 SÍ existe en el inventario.

Si el producto no existe:

Ingrese el ID a buscar: 100

El producto con ID 100 NO existe.

----
 ## 7. Evidencias de ejecución

 ## Menú principal
 [Menú](Menu.jpeg)
 ## Registro de productos 
 [Registro](registro.jpeg)
 ## Búsqueda de productos 
 [Búsqueda](busqueda.jpeg)
 ## INORDEN
 [INORDEN](inorden.jpeg)

 ----
 ## 8. Video de sustentación
 [Ver video] 