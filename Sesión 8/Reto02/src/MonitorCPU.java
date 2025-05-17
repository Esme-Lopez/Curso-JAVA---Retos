import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MonitorCPU {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> registrosCPU = new HashSet<>();

        try {
            System.out.println("Ingrese consumos de CPU en porcentaje (escriba 'fin' para terminar):");

            while (true) {
                System.out.print("Consumo: ");
                String entrada = scanner.nextLine();

                if (entrada.equalsIgnoreCase("fin")) {
                    break;
                }

                int valorCPU;
                try {
                    valorCPU = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida. Debe ingresar un número entero.");
                    continue;
                }

                if (valorCPU < 0 || valorCPU > 100) {
                    System.out.println("El valor debe estar entre 0 y 100.");
                    continue;
                }

                if (!registrosCPU.add(valorCPU)) {
                    System.out.println("Este valor ya fue registrado. No se permiten duplicados.");
                    continue;
                }

                if (valorCPU > 95) {
                    throw new ConsumoCriticoException("Consumo crítico detectado: " + valorCPU + "%");
                }

                System.out.println("Registro aceptado: " + valorCPU + "%");
            }

            System.out.println("\nRegistros finales:");
            for (int registro : registrosCPU) {
                System.out.println("• " + registro + "%");
            }

        } catch (ConsumoCriticoException e) {
            System.out.println("ALERTA: " + e.getMessage());
        } finally {
            System.out.println("\nMonitoreo finalizado. Liberando recursos...");
            scanner.close();
        }
    }
}