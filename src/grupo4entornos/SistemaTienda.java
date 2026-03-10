/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4entornos;

/**
 *
 * @author WEB1-32
 */
public class SistemaTienda {

    // Refactorizado: se elimina Primitive Obsession usando la clase Producto
    private Producto[] productos = {
        new Producto("Camiseta", 50, 15.99),
        new Producto("Pantalon", 20, 29.99),
        new Producto("Zapatos",  10, 59.99)
    };

    public void venderProducto(String nombre, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                if (producto.getStock() >= cantidad) {
                    producto.setStock(producto.getStock() - cantidad);
                    double total = cantidad * producto.getPrecio();

                    // Lógica de Impuestos (refactorizada)
                    double conIva = calcularPrecioFinal(total);

                    System.out.println("Venta realizada: " + conIva);
                } else {
                    System.out.println("Error: No hay stock suficiente");
                }
            }
        }
    }

    public void generarFactura(String nombre, int cantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                double base = cantidad * producto.getPrecio();

                // Cálculo del IVA refactorizado
                double totalFactura = calcularPrecioFinal(base);

                System.out.println("FACTURA: " + nombre + " Cant: " + cantidad + " Total: " + totalFactura);
            }
        }
    }

    // Método extraído para eliminar código duplicado del cálculo del IVA
    private double calcularPrecioFinal(double base) {
        return base * 1.21;
    }
}