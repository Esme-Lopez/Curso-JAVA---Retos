import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){

        Contacto c1 = new Contacto("555-1234");
        Contacto c2 = new Contacto(null);

        //Usando isPresent (menos recomendado)
        if (c1.getTelefono().isPresent()){
            System.out.println("Telefono: "+c1.getTelefono().get());
        }

        //Usamos ifPresent (más recomendado)
        c2.getTelefono().ifPresent(tel -> System.out.println("Telefono: "+tel));

        //orElse: devuelve valor por defecto si no hay nada
        String tel1 = c1.getTelefono().orElse("No registrado");
        String tel2 = c2.getTelefono().orElse("No registrado");

        System.out.println();
        System.out.println("Telefono 1: "+tel1);
        System.out.println("Telefono 2: "+tel2);

        //orElseThrow lanza una excepción si no hay valor
        String telSeguro = c1.getTelefono().orElseThrow(() -> new RuntimeException("Telefono obligatorio"));
    }
}
