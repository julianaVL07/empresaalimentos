package co.edu.uniquindio.poo;
import java.util.LinkedList;

public class Proveedor {
    private String nombre;
    private String cedula;
    private LinkedList<Producto>productos;

    public Proveedor(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        productos=new LinkedList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "\nProveedor: nombre: " + nombre + ", cedula: " + cedula + " \nproductos: " + productos;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    
}
