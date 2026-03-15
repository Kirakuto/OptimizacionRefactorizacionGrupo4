/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo4entornos;
import java.util.ArrayList;
import java.util.List;
/**
  * Clase principal que gestiona el proceso de venta.
 * Se ha refactorizado para eliminar lógica duplicada y mejorar la cohesión.
 * @author Asier Fuentes    
 */
public class SistemaTienda {
    private List<Producto> productos = new ArrayList<>();

    /**
     * Procesa la venta de un producto si existe stock.
     * @param nombre Nombre del producto.
     * @param cantidad Unidades solicitadas.
     */
    public void venderProducto(String nombre, int cantidad) {
        for (Producto p : productos) {
            if (p.getNombre().equals(nombre)) {
                if (p.hayStock(cantidad)) {
                    p.reducirStock(cantidad);
                    System.out.println("Venta realizada: " + p.calcularPrecioFinal(cantidad));
                } else {
                    Logger.logError("No hay stock suficiente para " + nombre);
                }
                return;
            }
        }
    }
}