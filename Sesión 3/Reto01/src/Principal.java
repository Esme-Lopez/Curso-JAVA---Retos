public class Principal {
    public static void main(String[] args){

        //creamos al pasajero y vuelo
        Pasajero pasajero = new Pasajero("Esmeralda Lopez","AC2345");
        Vuelo vuelo = new Vuelo("UX123","París","14:30");

        //Reservar asiento
        if (vuelo.reservarAsiento(pasajero)){
            System.out.println("\nReservar realizada con éxito");
        }else{
            System.out.println("No se pudo hacer la reserva");
        }

        //Mostrar itinerario
        System.out.println();
        System.out.println(vuelo.obtenerItinerario());

        //cancelar reserva
        System.out.println("\nCancelando reserva...");
        vuelo.cancelarReservation();

        //Mostrar itinerario sin reserva
        System.out.println();
        System.out.println(vuelo.obtenerItinerario());

        //Reservar nuevamente usando nombre y pasaporte
        System.out.println();
        vuelo.reservasAsiento("Esbeydy Lopez","CD2345");

        //Mostrar itinerario actualizado
        System.out.println();
        System.out.println(vuelo.obtenerItinerario());

    }
}
