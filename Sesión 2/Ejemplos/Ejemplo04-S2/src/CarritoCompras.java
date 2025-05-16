public class CarritoCompras {

    public static void main(String[] args){
        String[] productos = {"Laptop", "Mouse", "Teclado", "Pantalla", "Audífonos"};

        //for clásico
        System.out.println("Productos en el carrito: ");
        for (int i=0; i< productos.length; i++){
            System.out.println("- "+productos[i]);
        }

        //for-each con control de flujo
        System.out.println("\nRecorriendo con for-each");
        for (String producto : productos){
            if (producto.equals("Teclado")) continue; //Saltar teclado
            if (producto.equals("Pantalla")) break; //Detener en pantalla
            System.out.println("Producto válido: "+producto);
        }
    }
}
