import java.awt.print.Pageable;

public class Vuelo {

    //Atributos
    final String codigoVuelo;
    String destino;
    String horaSalida;
    Pasajero asientoReservado;

    //Constructor del vuelo
    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    //Metodo parametro y retorno
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        } else {
            return false;
        }
    }

    //Metodo con sobrecarga
    public boolean reservasAsiento(String nombre, String pasaporte) {
            Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
            return reservarAsiento(nuevoPasajero);
    }

    //Metodo sin retorno
    public void cancelarReservation(){
        asientoReservado = null;
    }

    //Metodo con retorno String
    public String obtenerItinerario(){
        String info = "Itinerario del vuelo: \n";
        info += "Código "+codigoVuelo+"\n";
        info += "Destino: "+destino+"\n";
        info += "Salida: "+horaSalida+"\n";

        if (asientoReservado != null){
            info += "Pasajero: "+asientoReservado.getNombre();
        }else{
            info += "Pasajero: [sin reserva]";
        }return info;
    }
}