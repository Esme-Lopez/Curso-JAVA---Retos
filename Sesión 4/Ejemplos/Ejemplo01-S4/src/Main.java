public class Main {
    public static void main(String[] args){

        //Constructor por defecto
        TicketSoporte ticket1 = new TicketSoporte();
        System.out.println("Ticket creado con constructor por defecto: ");
        ticket1.mostrarInfo();

        //Constructor con parametros
        TicketSoporte ticket2 = new TicketSoporte("Error al inicar sesión","Acceso",1);
        System.out.println("\nTicket creado con constructor con parámetros: ");
        ticket2.mostrarInfo();
        System.out.println();

        //Cerrar ticket y mostrar nuevamente
        ticket2.cerrar();
        System.out.println();
        ticket2.mostrarInfo();

        //Constructor de copia
        TicketSoporte ticket3 = new TicketSoporte(ticket2);
        System.out.println("\nTicket copiado desde otro: ");
        ticket3.mostrarInfo();

        //Constructor sobrecargado con solo titulo
        TicketSoporte ticket4 = new TicketSoporte("Consulta sobre facturación");
        System.out.println("\nTicket con constructor sobrecargado (Solo título): ");
        ticket4.mostrarInfo();
    }
}
