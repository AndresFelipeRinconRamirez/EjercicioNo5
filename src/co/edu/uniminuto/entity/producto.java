
package co.edu.uniminuto.entity;


public class producto {

    private String descripcion;
    private double precio;
    private int cantidad;
    
    public producto(String descripcion, double precio, int cantidad){
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    } 

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    public double calcularSubtotal(){
        return precio * cantidad;
    }
    @Override
    public String toString(){
    return "Producto: " + descripcion + ", Precio: " + precio + ", Cantidad: " 
            + cantidad + ", Subtotal: " + calcularSubtotal();
    
    
    }
    
}
    

