/**
 * Clase Producto (El Nodo)
 * Representa cada elemento dentro del Árbol Binario de Búsqueda (ABB).
 * Almacena la información del producto y los punteros a sus subárboles.
 */
public class Producto {
    // Atributos de datos
    private int id;          // Identificador único (clave de ordenamiento)
    private String nombre;   // Nombre descriptivo del producto

    // Punteros a los nodos hijos[cite: 6]
    private Producto izquierdo; // Apunta al hijo con ID menor
    private Producto derecho;   // Apunta al hijo con ID mayor

    /**
     * Constructor para inicializar un nuevo producto (nodo).
     * param id Identificador numérico del producto.
     * param nombre Nombre del producto.
     */
    public Producto(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.izquierdo = null; // Inicialmente no tiene hijo izquierdo
        this.derecho = null;   // Inicialmente no tiene hijo derecho
    }

    // Métodos Getters para obtener la información de los atributos
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public Producto getIzquierdo() { return izquierdo; }
    public Producto getDerecho() { return derecho; }

    // Métodos Setters para modificar las referencias de los punteros y datos
    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setIzquierdo(Producto izquierdo) { this.izquierdo = izquierdo; }
    public void setDerecho(Producto derecho) { this.derecho = derecho; }
}