import java.util.Scanner;

/**
 * Clase Main (La Interfaz)
 * Proporciona el menú interactivo para comunicarse con el usuario
 * y llamar las operaciones del árbol del inventario "Tree-Stock".
 */
public class Main {
    public static void main(String[] args) {
        ArbolInventario inventario = new ArbolInventario();
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        // Bucle del menú interactivo que finaliza con la opción 0
        while (opcion != 0) {
            System.out.println("\n=== SISTEMA DE INVENTARIO \"TREE-STOCK\" ===");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Inventario (Recorrido Inorden)");
            System.out.println("3. Buscar Producto por ID");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            // Captura y validación de entrada numérica
            try {
                opcion = sc.nextInt();
            } catch (Exception e) {
                System.out.println(" Error: Debe ingresar un número entero válido.");
                sc.next(); // Limpieza de búfer
                continue;
            }

            // Ejecución de la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del producto: ");
                    try {
                        int id = sc.nextInt();
                        sc.nextLine(); // Limpiar el salto de línea del búfer
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = sc.nextLine();

                        inventario.insertar(id, nombre);
                        System.out.println(" Producto registrado con éxito.");
                    } catch (Exception e) {
                        System.out.println(" Error: El ID debe ser un número entero.");
                        sc.next(); // Limpiar entrada errónea
                    }
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE PRODUCTOS (INORDEN - ORDENADO POR ID) ---");
                    inventario.mostrarInorden(); // Muestra los productos en orden
                    break;

                case 3:
                    System.out.print("Ingrese el ID a buscar: ");
                    try {
                        int idBusqueda = sc.nextInt();
                        String resultado = inventario.buscar(idBusqueda);
                        System.out.println(resultado);
                    } catch (Exception e) {
                        System.out.println(" Error: Debe ingresar un ID numérico válido.");
                        sc.next(); // Limpiar búfer
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema Tree-Stock. ¡Hasta luego!");
                    break;

                default:
                    System.out.println(" Opción no válida. Por favor, intente de nuevo.");
            }
        }
        sc.close(); // Cierre del Scanner al terminar
    }
}