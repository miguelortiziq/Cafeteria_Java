import java.util.ArrayList;

public class Orden {

    private ArrayList<Producto> productos;

    public Orden() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {

        if (!producto.isDisponible()) {
            System.out.println("No es posible agregar este producto porque no está disponible.");
            return;
        }

        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public void mostrarOrden() {

        System.out.println("\n========== ORDEN ==========");

        for (Producto producto : productos) {

            double precioFinal = 0;

            if (producto instanceof Vendible) {
                precioFinal = ((Vendible) producto).calcularPrecioFinal();
            }

            System.out.printf("%-20s $%.2f%n",
                    producto.getNombre(),
                    precioFinal);
        }

        System.out.println("\nCantidad de productos: " + productos.size());

        double subtotal = calcularSubtotal();
        double iva = subtotal * 0.16;
        double total = subtotal + iva;

        System.out.printf("\nSubtotal: $%.2f%n", subtotal);
        System.out.printf("IVA: $%.2f%n", iva);
        System.out.printf("Total: $%.2f%n", total);
    }

    public double calcularSubtotal() {

        double subtotal = 0;

        for (Producto producto : productos) {

            if (producto instanceof Vendible) {
                subtotal += ((Vendible) producto).calcularPrecioFinal();
            }
        }

        return subtotal;
    }
