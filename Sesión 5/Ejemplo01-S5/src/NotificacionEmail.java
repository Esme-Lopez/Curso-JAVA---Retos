public class NotificacionEmail extends Notificacion{

    String destinatario;

    public NotificacionEmail(String mensaje, String destinatario){
        super(mensaje); //se llama al constructor de la clase base
        this.destinatario = destinatario;
    }

    public void enviarEmail(){
        System.out.println("Enviando email a: "+destinatario+": "+mensaje);
    }
}
