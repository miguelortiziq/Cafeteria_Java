public class Bebida extends Producto implements Vendible {

    private String tamanio;
    private boolean fria;

    public Bebida(String nombre, double precio, boolean disponible,
                  String tamanio, boolean fria) {

        super(nombre, precio, disponible);
        this.tamanio = tamanio;
        this.fria = fria;
    }

    @Override
    public double calcularPrecioFinal() {

        double precio = getPrecio();

        if(tamanio.equalsIgnoreCase("Large")){
            precio += 15;
        }

        return precio;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("----------------------------");
        System.out.println("BEBIDA");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Tamaño: " + tamanio);
        System.out.println("Tipo: " + (fria ? "Fría" : "Caliente"));
        System.out.println("Disponible: " + isDisponible());
    }

}