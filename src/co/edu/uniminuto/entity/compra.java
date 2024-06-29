
package co.edu.uniminuto.entity;

import java.util.ArrayList;
import java.util.List;


public class compra {
    private cliente cliente;
    private List<producto> productos;
    private static final double IMPUESTO = 0.20;
    
    public compra(cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }
    public void agregarProducto(producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (producto producto : productos) {
            total += producto.calcularSubtotal();
        }
        return total;
    }

    public double calcularImpuesto() {
        return calcularTotal() * IMPUESTO;
    }

    public double calcularTotalConImpuesto() {
        return calcularTotal() + calcularImpuesto();
    }
     public void imprimirTicket() {
        System.out.println("-FACTURA -");
        System.out.println(cliente);
        System.out.println("_Productos Comprados_");
        for (producto producto : productos) {
            System.out.println(producto);
        }
        System.out.println("Total sin impuestos: " + calcularTotal());
        System.out.println("Impuestos: " + calcularImpuesto());
        System.out.println("Total a pagar: " + calcularTotalConImpuesto());
        System.out.println("---------------");
     } 
}
    

