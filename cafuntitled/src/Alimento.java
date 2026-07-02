public class Alimento extends Producto implements Vendible {

    private boolean vegetariano;
    private int calorias;

    public Alimento(String nombre, double precio, boolean disponible,
                    boolean vegetariano, int calorias) {

        super(nombre, precio, disponible);
        this.vegetariano = vegetariano;
        this.calorias = calorias;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public double calcularPrecioFinal() {

        double precioFinal = getPrecio();

        // Descuento del 10% para alimentos vegetarianos
        if (vegetariano) {
            precioFinal *= 0.90;
        }

        return precioFinal;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("----- ALIMENTO -----");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Disponible: " + isDisponible());
        System.out.println("Vegetariano: " + vegetariano);
        System.out.println("Calorías: " + calorias);
        System.out.println("Precio Final: $" + calcularPrecioFinal());
        System.out.println();
    }
}