import java.util.ArrayList;

public class Menu {

    private ArrayList<Producto> listaProductos;

    public Menu() {
        this.listaProductos = new ArrayList<>();
    }//constructor Menu

    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }//agregarProducto

    public void mostrarMenu(){
        System.out.println("========== MENÚ ==========");
        int contador = 1;
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto prod = listaProductos.get(i);

            if(prod.isDisponible()){
                System.out.println(contadorOpciones + ". " + prod.getNombre() + " - $" + prod.getPrecio());
                contadorOpciones++;
            }//if

        }//for

        System.out.println("==========================");

        public ArrayList<Producto> getListaProductos(){
            return listaProductos;
        }//Obtener lista productos

    }//mostrarMenu
}//class Menu
