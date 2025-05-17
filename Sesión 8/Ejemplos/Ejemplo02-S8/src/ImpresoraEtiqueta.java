public class ImpresoraEtiqueta implements Imprimible{

    public void imprimirEtiqueta(Paquete paquete){
        System.out.println("Envio a: "+paquete.getDestinatario());
    }

}
