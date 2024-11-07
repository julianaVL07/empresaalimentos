package co.edu.uniquindio.poo;

public class Refrigerado extends Producto implements IProducto,IRefrigerado{
    
    private String codigoAprobacion;
    private double temperaturaRecomendada;
    
    public Refrigerado(String codigo, String nombre, double precioCompra, Proveedor proveedor, String codigoAprobacion,
            double temperaturaRecomendada) {
        super(codigo, nombre, precioCompra, proveedor);
        this.codigoAprobacion = codigoAprobacion;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public void setCodigoAprobacion(String codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public double getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(double temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    @Override
    public String toString() {
        return "\nRefrigerado: " +super.toString()+", codigoAprobacion: "+ codigoAprobacion + ", temperatura recomendada en grados Celcius: "
                + temperaturaRecomendada;
    }

    @Override
    public double calcularPrecioVenta() {
        double precioventa=getPrecioCompra()+(Math.abs(500*temperaturaRecomendada));
        return precioventa;
    }

    @Override
    public double calcularImpuesto() {
        double precioVenta=calcularPrecioVenta();
        double impuesto= precioVenta*0.05;
        return impuesto;
    }

    @Override
    public void iniciarProcesoRefrigeracion() {
        System.out.println("iniciando proceso de refrigeración...");
        
    }

    

    

}
