public class MainNarrativa {
    public static void main(String[] args) {
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        PaqueteNarrativo motorNarrativo = new PaqueteNarrativo(transicion, dialogo, decision);
        motorNarrativo.ejecutarEscena();
    }
}
