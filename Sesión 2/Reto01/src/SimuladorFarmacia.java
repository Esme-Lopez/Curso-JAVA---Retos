import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Solicitar los datos al usuario
        System.out.print("Nombre del medicamento: ");
        String medicameto=scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precio_unitario = scanner.nextDouble();

        System.out.print("Cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        //Calculamos el total sin descuento
        var total_sin_descuento = precio_unitario * cantidad;

        //Si aplica descuento
        boolean aplicar_descuento = total_sin_descuento>500;

        //calcular descuento del 15% con el operador TERNARIO
        double descuento = aplicar_descuento ? total_sin_descuento * 0.15:0.0;

        //Total apagar
        double total = total_sin_descuento - descuento;

        //Mensaje
        System.out.println("Resumen de su compra: ");
        System.out.println("Medicamento: "+medicameto);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Precio Unitario: $"+precio_unitario);
        System.out.println("Total sin descuento: $"+total_sin_descuento);
        System.out.println("¿Aplica descuento? "+aplicar_descuento);
        System.out.println("Descuento: $"+descuento);
        System.out.println("Total a pagar: $"+total);
    }
}
