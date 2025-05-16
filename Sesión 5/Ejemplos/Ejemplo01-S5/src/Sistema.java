public class Sistema {
    public static void main (String[] args){

        NotificacionEmail email = new NotificacionEmail("Tu pedido ha sido enviado", "esmedeyato@gmail.com");

        //Llamamos a métodos heredados y propios
        email.enviar(); //metodo heredado
        email.enviarEmail(); //metodo propio
    }
}
