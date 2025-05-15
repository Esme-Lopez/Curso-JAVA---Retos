public class Main {
    public static void main (String[] args){

        //Con RFC
        Factura factura1 = new Factura(2500.0,"Instalación de red local y configuración","LAGE200304674");
        //Sin RFC
        Factura factura2 = new Factura(1000.0,"Desarrollo de Sistema",null);

        System.out.println(factura1.getResumen());
        System.out.println();
        System.out.println(factura2.getResumen());
    }
}
