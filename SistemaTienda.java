
package grupo4proyecto;
import java.util.ArrayList;

public class SistemaTienda {
    private ArrayList<Producto> ProductosTienda = new ArrayList<>();

    public void venderProducto(String nombre, int cantidad) {
        for (Producto i : ProductosTienda) {
            if (i.getNombre().equals(nombre)) {
                // DUPLICACIÓN DE LÓGICA: Verificación de stock
                if (i.getStock() >= cantidad) {
                    i.setStock(i.getStock()-cantidad);
                    double total = calcularPrecioFinal(cantidad*i.getPrecio());

                    System.out.println("Se ha realizado la venta: " + total);
                } else {
                    System.out.println("Error: El stok del producto no es suficiente");
                }
            }
        }
    }
    
    private double calcularPrecioFinal(double base) {
        return base * 1.21;
    }
}