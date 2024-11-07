package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Mi Empresa Laura y Juliana");

        Proveedor proveedor1 = new Proveedor("Proveedor A", "1234567890");
        Proveedor proveedor2 = new Proveedor("Proveedor B", "0987654321");
        Proveedor proveedor3 = new Proveedor("Proveedor C", "1122334455");


        Envasado envasado1 = new Envasado("E001", "Mermelada de fresas", 50.00, proveedor1, LocalDate.of(2023, 5, 20), 1.5, PaisOrigen.ARGENTINA);
        Envasado envasado2 = new Envasado("E002", "Aceitunas en conserva", 75.00, proveedor2, LocalDate.of(2023, 6, 15), 2.0, PaisOrigen.CHILE);
        Envasado envasado3 = new Envasado("E003", "Salsa de tomate", 100.00, proveedor3, LocalDate.of(2023, 7, 10), 1.2, PaisOrigen.PERU);

        Refrigerado refrigerado1 = new Refrigerado("R001", "Leche fresca", 120.00, proveedor1, "AP001", -5.0);
        Refrigerado refrigerado2 = new Refrigerado("R002", "Pechuga congelada", 140.00, proveedor2, "AP002", -3.5);
        Refrigerado refrigerado3 = new Refrigerado("R003", "yogurt", 160.00, proveedor3, "AP003", -4.0);

        Perecedero perecedero1 = new Perecedero("P001", "platano", 30.00, proveedor1, LocalDate.of(2023, 12, 31));
        Perecedero perecedero2 = new Perecedero("P002", "tomate", 25.00, proveedor2, LocalDate.of(2024, 1, 15));
        Perecedero perecedero3 = new Perecedero("P003", "lechuga", 35.00, proveedor3, LocalDate.of(2024, 2, 10));

        empresa.agregarProducto(envasado1);
        empresa.agregarProducto(envasado2);
        empresa.agregarProducto(envasado3);

        empresa.agregarProducto(refrigerado1);
        empresa.agregarProducto(refrigerado2);
        empresa.agregarProducto(refrigerado3);
        
        empresa.agregarProducto(perecedero1);
        empresa.agregarProducto(perecedero2);
        empresa.agregarProducto(perecedero3);

        empresa.agregarProveedor(proveedor1);
        empresa.agregarProveedor(proveedor2);
        empresa.agregarProveedor(proveedor3);

        proveedor1.agregarProducto(envasado1);
        proveedor1.agregarProducto(refrigerado1);
        proveedor1.agregarProducto(perecedero1);

        proveedor2.agregarProducto(envasado2);
        proveedor2.agregarProducto(refrigerado2);
        proveedor2.agregarProducto(perecedero2);

        proveedor3.agregarProducto(envasado3);
        proveedor3.agregarProducto(refrigerado3);
        proveedor3.agregarProducto(perecedero3);

        refrigerado1.iniciarProcesoRefrigeracion();
        
        double precioVentaPerecedero=perecedero1.calcularPrecioVenta();
            Empresa.mostrarMensaje("El producto "+perecedero1.getNombre()+" tiene un precio de $"+precioVentaPerecedero);

        double precioVentaRefrigerado=refrigerado1.calcularPrecioVenta();
            Empresa.mostrarMensaje("El producto "+refrigerado1.getNombre()+" tiene un precio de $"+precioVentaRefrigerado);

        
        double precioVentaEnvasado=envasado1.calcularPrecioVenta();
            Empresa.mostrarMensaje("El producto "+envasado1.getNombre()+" tiene un precio de $"+precioVentaEnvasado);
        

        double impuestoPerecedero= perecedero1.calcularImpuesto();
            Empresa.mostrarMensaje("El producto "+perecedero1.getNombre()+" Tiene un impuesto de "+impuestoPerecedero);
        
        
        double impuestoRefrigerado= refrigerado1.calcularImpuesto();
            Empresa.mostrarMensaje("El producto "+refrigerado1.getNombre()+" Tiene un impuesto de "+impuestoRefrigerado);

        double impuestoEnvasado= envasado1.calcularImpuesto();
            Empresa.mostrarMensaje("El producto "+envasado1.getNombre()+" Tiene un impuesto de "+impuestoEnvasado);

        Empresa.mostrarMensaje(empresa.toString());
    }

}
