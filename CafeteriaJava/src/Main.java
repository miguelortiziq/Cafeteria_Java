
public class Main {

    public static void main(String[] args) {
        //Instanciar el Menú de la cafetería
        Menu menuCafeteria = new Menu();

        //Crear al menos 3 bebidas
        Bebida bebida1 = new Bebida("Café Americano", 45.00, true, "Medium", true);
        Bebida bebida2 = new Bebida("Capuccino", 55.00, true, "Large", true); // Subirá $15 por ser Large -> $70
        Bebida bebida3 = new Bebida("Té Verde", 40.00, true, "Small", false);

        // Crear al menos 3 alimentos
        Alimento alimento1 = new Alimento("Sandwich", 95.00, true, false, 450);
        Alimento alimento2 = new Alimento("Muffin", 45.00, true, true, 320); // Conserva precio o aplica desc. si aplica
        Alimento alimento3 = new Alimento("Ensalada", 80.00, true, true, 200);

        //  Agregar los productos al menú general
        menuCafeteria.agregarProducto(bebida1);
        menuCafeteria.agregarProducto(bebida2);
        menuCafeteria.agregarProducto(bebida3);
        menuCafeteria.agregarProducto(alimento1);
        menuCafeteria.agregarProducto(alimento2);
        menuCafeteria.agregarProducto(alimento3);

        // Mostrar el menú completo
        menuCafeteria.mostrarMenu();
        System.out.println(); // Salto de línea para dar orden visual

        // Crear una orden de compra
        Orden ordenCliente = new Orden();

        // Agregar mínimo cuatro productos (Simulando la selección del menú)
        System.out.println("Producto agregado:");
        ordenCliente.agregarProducto(bebida2); // Capuccino
        System.out.println(bebida2.getNombre() + "\n");

        System.out.println("Producto agregado:");
        ordenCliente.agregarProducto(alimento1); // Sandwich
        System.out.println(alimento1.getNombre() + "\n");

        System.out.println("Producto agregado:");
        ordenCliente.agregarProducto(alimento2); // Muffin
        System.out.println(alimento2.getNombre() + "\n");

        //Mostrar la orden y calcular los totales
        ordenCliente.mostrarOrden();

    }//main

}//Main
