package co.edu.uniquindio.poo;

public class Producto {
    private String codigo;
    private String nombre;
    private double precioCompra;
    private Proveedor proveedor;

    public Producto(String codigo, String nombre, double precioCompra, Proveedor proveedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.proveedor = proveedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "\nProducto: codigo: " + codigo + ", nombre: " + nombre + ", precioCompra: " + precioCompra + ", proveedor: "
                + proveedor.getNombre();
    }

    
    
    

    
}
