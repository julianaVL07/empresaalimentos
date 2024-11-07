package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Envasado extends Producto  implements IProducto{
    private LocalDate fechaEnvasado;
    private double pesoEnvase;
    private PaisOrigen paisOrigen;

    public Envasado(String codigo, String nombre, double precioCompra, Proveedor proveedor, LocalDate fechaEnvasado,
            double pesoEnvase, PaisOrigen paisOrigen) {
        super(codigo, nombre, precioCompra, proveedor);
        this.fechaEnvasado = fechaEnvasado;
        this.pesoEnvase = pesoEnvase;
        this.paisOrigen = paisOrigen;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public double getPesoEnvase() {
        return pesoEnvase;
    }

    public void setPesoEnvase(double pesoEnvase) {
        this.pesoEnvase = pesoEnvase;
    }

    public PaisOrigen getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(PaisOrigen paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "Envasado: " +super.toString()+ ", fecha envasado: " +fechaEnvasado + ", peso envase: " + pesoEnvase + "Lb"+ ", pais origen: " + paisOrigen;
    }
   
    @Override
    public double calcularPrecioVenta() {
        double precioVenta=getPrecioCompra()+ (pesoEnvase*300);
        return precioVenta;
    }

    @Override
    public double calcularImpuesto() {
        double precio=calcularPrecioVenta();
        double impuesto=precio*0.1;
        return impuesto;
    }


    
    

    
}
