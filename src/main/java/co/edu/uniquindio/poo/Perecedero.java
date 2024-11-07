package co.edu.uniquindio.poo;

import java.time.LocalDate;
public class Perecedero extends Producto implements IProducto{
    
    private LocalDate fechaVencimiento;

    public Perecedero(String codigo, String nombre, double precioCompra, Proveedor proveedor,
            LocalDate fechaVencimiento) {
        super(codigo, nombre, precioCompra, proveedor);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "Perecedero: " +super.toString()+", fechaVencimiento: " +fechaVencimiento;
    }
    
    @Override
    public double calcularPrecioVenta() {
        double precioVenta=getPrecioCompra()+(getPrecioCompra()*0.35);
        return precioVenta;
    }

    @Override
    public double calcularImpuesto() {
        double precio=calcularPrecioVenta();
        double impuesto=precio*0.08;
        return impuesto;
        
    }



    
}
