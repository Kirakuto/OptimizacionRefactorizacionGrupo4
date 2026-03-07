/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4entornos;
import java.util.ArrayList;
/**
 *
 * @author WEB1-32
 */
public class SistemaTienda {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void venderProducto(String nombre, int cantidad) {
        for (Producto i : productos) {
            if (i.getNombre().equals(nombre)) {
                // DUPLICACIÓN DE LÓGICA: Verificación de stock
                if (i.getStock() >= cantidad) {
                    i.setStock(i.getStock()-cantidad);
                    double total = calcularPrecioFinal(cantidad*i.getPrecio());

                    System.out.println("Venta realizada: " + total);
                } else {
                    System.out.println("Error: No hay stock suficiente");
                }
            }
        }
    }
    
    private double calcularPrecioFinal(double base) {
        return base * 1.21;
    }
}