
package Ejercicio5;

import co.edu.uniminuto.entity.cliente;
import co.edu.uniminuto.entity.compra;
import co.edu.uniminuto.entity.producto;
import java.util.Scanner;

/**
 *5. Calcular el valor a pagar de un cliente por su compra, se desea saber los
 * productos que ha comprado: precio, cantidad, descripción. También el total 
 * a pagar y cálculo de impuestos,adicional se debe tener el nombre, apellidos
 * y documento del cliente.
 * 
 */
public class Ejercicio5 {
    private static Scanner scanner = new Scanner (System.in);
  
    public static void main(String[] args) {
        System.out.println("Ingrese los datos del cliente:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Documento: ");
        String documento = scanner.nextLine();

        cliente cliente = new cliente(nombre, apellidos, documento);
        compra compra = new compra(cliente);

        int opcion;
        
        do {
            System.out.println("-- Menu de Compra --");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Imprimir Factura");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    agregarProducto(compra);
                    break;
                case 2:
                    compra.imprimirTicket();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }
        } while (opcion != 3);
    }

    private static void agregarProducto(compra compra) {
        System.out.print("Ingrese el producto: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese la cantidad : ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); 

        producto producto = new producto(descripcion, precio, cantidad);
        compra.agregarProducto(producto);
        System.out.println("Producto agregado correctamente.");
    }
    
}
