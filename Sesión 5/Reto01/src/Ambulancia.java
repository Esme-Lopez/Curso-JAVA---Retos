public class Ambulancia extends UnidadEmergencia{
    private SistemaGPS gps;
    private Sirena sirena;
    private Operador operador;

    public Ambulancia(String nombre, String nombreOperador){
        super(nombre);
        gps = new SistemaGPS();
        sirena = new Sirena();
        operador = new Operador(nombreOperador);
    }

    public void iniciarOperador(){
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }

    @Override
    public void responder(){
        System.out.println("Ambulancia en camino al hospital más cercano");
    }
}
