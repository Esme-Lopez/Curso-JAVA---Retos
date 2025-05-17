public class Paquete1 {
    private String destinatario;
    private double peso;

    public Paquete1(String destinatario, double peso) {
        this.destinatario = destinatario;
        this.peso = peso;
    }

    public void imprimirEtiqueta() {
        System.out.println("Enviando a: " + destinatario);
    }

    public double calcularCostoEnvio() {
        return peso * 10.5; // tarifa fija por kilo
    }
}
