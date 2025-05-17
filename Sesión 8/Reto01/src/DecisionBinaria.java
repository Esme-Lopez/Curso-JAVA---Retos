import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String obtenerDecision() {
        System.out.print("Elige una opción (A/B): ");
        return scanner.nextLine();
    }
}
