public class Notificacion {
    String mensaje;

    public Notificacion(String mensaje){
        this.mensaje = mensaje;
    }

    public void enviar(){
        System.out.println("Enviar notificación: "+mensaje);
    }
}
