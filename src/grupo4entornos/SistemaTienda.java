package grupo4entornos;
import java.util.ArrayList;

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
                    LogUtils.logError("No hay stock suficiente");
                }
            }
        }
    }
    
    private double calcularPrecioFinal(double base) {
        return base * 1.21;
    }
}
