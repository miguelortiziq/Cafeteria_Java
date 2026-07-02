public abstract class Producto {

    private String nombre;
    private double precio;
    private boolean disponible;

    public Producto(String nombre, double precio, boolean disponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public abstract void mostrarInformacion();
}