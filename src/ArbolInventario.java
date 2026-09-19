/**
 * Clase ArbolInventario (La Lógica)
 * Administra la estructura del Árbol Binario de Búsqueda (ABB) para el inventario.
 * Aplica el patrón de métodos envoltorios: uno público (invocado por Main) y uno
 * privado recursivo (que navega los nodos a través de sus punteros).
 */
public class ArbolInventario {
    private Producto raiz; // Primer nodo del árbol; raíz principal

    /**
     * Constructor: Inicializa el árbol vacío.
     */
    public ArbolInventario() {
        this.raiz = null;
    }

    /**
     * Verifica si el árbol carece de nodos.
     * return true si la raíz es null, false en caso contrario.
     */
    public boolean estaVacio() {
        return raiz == null;
    }

    // ===============================================================
    // 1. INSERTAR (Recursivo)
    // ===============================================================

    /**
     * Método público para registrar un producto.
     * Inicia la inserción recursiva desde la raíz del árbol.
     */
    public void insertar(int id, String nombre) {
        raiz = insertarRecursivo(raiz, id, nombre);
    }

    /**
     * Método privado y recursivo para ubicar la posición correcta según el ID.
     */
    private Producto insertarRecursivo(Producto actual, int id, String nombre) {
        // CASO BASE: Si el nodo actual es null, se encontró la posición libre.
        if (actual == null) {
            return new Producto(id, nombre);
        }

        // Si el nuevo ID es menor, se desciende por la rama izquierda.
        if (id < actual.getId()) {
            actual.setIzquierdo(insertarRecursivo(actual.getIzquierdo(), id, nombre));
        } 
        // Si el nuevo ID es mayor, se desciende por la rama derecha.
        else if (id > actual.getId()) {
            actual.setDerecho(insertarRecursivo(actual.getDerecho(), id, nombre));
        }
        // Si el ID ya existe, no se inserta duplicado (regla del ABB).

        return actual; // Devuelve el nodo actualizado
    }

    // ===============================================================
    // 2. RECORRIDO INORDEN (Muestra el inventario ordenado)
    // ===============================================================

    /**
     * Método público para iniciar el recorrido inorden.
     */
    public void mostrarInorden() {
        if (estaVacio()) {
            System.out.println("El inventario está vacío.");
            return;
        }
        mostrarInordenRecursivo(raiz);
    }

    /**
     * Método privado recursivo: Visita Izquierda -> Raíz -> Derecha.
     * Muestra los productos ordenados de menor a mayor por su ID.
     */
    private void mostrarInordenRecursivo(Producto nodo) {
        if (nodo != null) {
            mostrarInordenRecursivo(nodo.getIzquierdo()); // 1. Recorre subárbol izquierdo
            imprimir(nodo);                               // 2. Procesa nodo actual
            mostrarInordenRecursivo(nodo.getDerecho());   // 3. Recorre subárbol derecho
        }
    }

    /**
     * Formatea e imprime los datos de un nodo de producto.
     */
    private void imprimir(Producto nodo) {
        System.out.println("ID: " + nodo.getId() + " | Producto: " + nodo.getNombre());
    }

    // ===============================================================
    // 3. BUSCAR (Por ID)
    // ===============================================================

    /**
     * Método público para consultar la existencia de un producto.
     * return Mensaje descriptivo indicando si se encontró o no.
     */
    public String buscar(int id) {
        boolean encontrado = buscarRecursivo(raiz, id);
        return encontrado ? "Producto con ID " + id + " SÍ existe en el inventario." 
                          : "El producto con ID " + id + " NO existe.";
    }

    /**
     * Método privado recursivo que navega descartando la mitad de la estructura en cada paso.
     */
    private boolean buscarRecursivo(Producto actual, int id) {
        if (actual == null) return false;          // Caso base: Se llegó al final sin éxito
        if (id == actual.getId()) return true;      // Caso base: Elemento hallado

        // Desciende a la izquierda si es menor, o a la derecha si es mayor
        return id < actual.getId()
            ? buscarRecursivo(actual.getIzquierdo(), id)
            : buscarRecursivo(actual.getDerecho(), id);
    }
}