public class TicketSoporte {

    //Atributos de instancia
    private String titulo;
    private String categoria;
    private int prioridad; //1: alta, 2:media, 3:baja
    private boolean estaActivo;

    //Constructor por defecto
    public TicketSoporte(){
        this.titulo = "Sin título";
        this.categoria = "General";
        this.prioridad = 2;
        this.estaActivo = true;
    }

    //Constructor con parámetro
    public TicketSoporte(String titulo, String categoria, int prioridad){
        this.titulo = titulo;
        this.categoria = categoria;
        this.prioridad = prioridad;
    }

    //Constructor de copia
    public TicketSoporte(TicketSoporte otro){
        this.titulo = otro.titulo;
        this.categoria = otro.categoria;
        this.prioridad = otro.prioridad;
        this.estaActivo = otro.estaActivo;
    }

    //Constructor sobrecarga con solo título
    public TicketSoporte(String titulo){
        this.titulo = titulo;
        this.categoria = "Sin categoría";
        this.prioridad = 3; //Baja
        this.estaActivo = true;
    }

    //Metodo para mostrar la informacion del ticket
    public void mostrarInfo(){
        System.out.println("Ticket: "+titulo);
        System.out.println("Categoría: "+categoria);
        System.out.println("Prioridad: "+prioridad);
        System.out.println("Estado: "+(estaActivo ? "Activo" : "Cerrado"));
    }

    //Metodo para cerrar al ticket
    public void cerrar(){
        estaActivo = false;
        System.out.println("El ticket "+titulo+" ha sido cerrado");
    }
}
