public class Main {
    public static void main (String[] args){
        Factura f1 = new Factura("ABC123", "Esmeralda Lopez", 1450.0);
        Factura f2 = new Factura("ABC123","Esbeydy Lopez",1450.0);

        System.out.println(f1);
        System.out.println(f2);

        System.out.println("¿Las facturas son iguales? "+f1.equals(f2));
    }
}
