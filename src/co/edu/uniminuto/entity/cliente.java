
package co.edu.uniminuto.entity;


public class cliente {
    private String nombre;
    private String apellidos;
    private String documento;
    
    public cliente(String nombre, String apellidos, String documento){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento; 
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDocumento() {
        return documento;
    }
    
    @Override
    public String toString() {
        return "Cliente: " + nombre + " " + apellidos + ", Documento: " + documento;
  
    }    

}
    

