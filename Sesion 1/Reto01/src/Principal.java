import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Crear objeto Paciente
        Paciente paciente = new Paciente();

        //Solicitar datos al usuario
        System.out.println("Ingresa el nombre del paciente: ");
        paciente.nombre = scanner.nextLine();

        System.out.println("Ingresa la edad del paciente: ");
        paciente.edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingresa el número de expediente: ");
        paciente.n_expediente = scanner.nextLine();

        scanner.close();

        System.out.println("-- Información del Paciente --");
        paciente.mostrarInformacion();
    }
}
