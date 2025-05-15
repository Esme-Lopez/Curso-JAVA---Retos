public class Main {
    public static void main (String[] args){

        DeclaracionImpuestos declaracion= new DeclaracionImpuestos("ABCD123456789",8700.0);
        CuentaFiscal cuenta = new CuentaFiscal("ABCD123456789",9500.0);

        System.out.println("Declaracion enviada por RFC: "+declaracion.rfcContribuyente()+" por $"+declaracion.montoDeclarado());

        System.out.println("Cuenta fiscal registrada con RFC: "+cuenta.getRfc()+", saldo disponible: $"+cuenta.getSaldoDisponible());

        boolean rfcValido = cuenta.validarRFC(declaracion);
        System.out.println("¿RFC válido para esta cuenta? "+rfcValido);

    }
}
