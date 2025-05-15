public class Pasajero {

    //Atributos
    private String nombre;
    private String pasaporte;

    //Construtor
    public Pasajero(String nombre, String pasaporte){
        this.nombre = nombre;
        this.pasaporte = pasaporte;
    }

    //Metodos getter
    public String getNombre(){
        return nombre;
    }

    public String getPasaporte(){
        return pasaporte;
    }
}
