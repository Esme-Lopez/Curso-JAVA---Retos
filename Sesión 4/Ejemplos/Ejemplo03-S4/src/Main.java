import java.util.Objects;

public class Main {
    public static void main (String[] args){

        //Creamos dos empleados con valores null en el nombre
        Empleado e1 = new Empleado(null, 25);
        Empleado e2 = new Empleado(null, 26);

        //Usamos Objects.equals() para comparar los nombres (evita NullPointerException)
        boolean nombresIguales = Objects.equals(e1.nombre(), e2.nombre());

        //Monstramos los objetos y la comparación
        System.out.println("Empleado 1: "+e1);
        System.out.println("Empelado 2: "+e2);
        System.out.println("¿Los nombres son iguales? "+nombresIguales);
    }
}
