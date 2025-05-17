public class PaqueteNarrativo {
    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    public PaqueteNarrativo(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void ejecutarEscena() {
        dialogo.mostrarDialogo("El héroe se encuentra frente a dos caminos...");
        dialogo.mostrarDialogo("A: Un sendero oscuro hacia el bosque.");
        dialogo.mostrarDialogo("B: Un atajo peligroso a través de las ruinas.");

        String eleccion = decision.obtenerDecision();
        transicion.transicionar(eleccion);
        dialogo.mostrarDialogo("Tu decisión ha sido registrada. ¡La aventura continúa!");
    }
}
