public class Sucio {
 // Listas paralelas (Olor: Primitive Obsession)
 private String[] productos = {"Camiseta", "Pantalon", "Zapatos"};
 private int[] stocks = {50, 20, 10};
 private double[] precios = {15.99, 29.99, 59.99};
 public void venderProducto(String nombre, int cantidad) {
 for (int i = 0; i < productos.length; i++) {
 if (productos[i].equals(nombre)) {
 // DUPLICACIÓN DE LÓGICA: Verificación de stock
 if (stocks[i] >= cantidad) {
 stocks[i] -= cantidad;
 double total = cantidad * precios[i];

 // Lógica de Impuestos (Duplicada en generarFactura)
 double conIva = total * 1.21;

 System.out.println("Venta realizada: " + conIva);
 } else {
 System.out.println("Error: No hay stock suficiente");
 }
 }
 }
 }
 public void generarFactura(String nombre, int cantidad) {
 for (int i = 0; i < productos.length; i++) {
 if (productos[i].equals(nombre)) {
 double base = cantidad * precios[i];

 // DUPLICACIÓN DE LÓGICA: El cálculo del IVA es el mismo
 double totalFactura = base * 1.21;

 System.out.println("FACTURA: " + nombre + " Cant: " + cantidad + " Total: " +
totalFactura);
 }
 }
 }
 public void logError(String msg) {
 // Este método no pertenece a la lógica de tienda (Falta de cohesión)
 System.out.println("[LOG DISCO]: " + msg);
 }