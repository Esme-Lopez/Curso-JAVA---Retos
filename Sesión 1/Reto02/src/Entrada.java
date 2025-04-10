public class Entrada {

    //ATRIBUTOS
    String nombre_evento;
    double precio;

    //METODO CONSTRUCTOR- con parametros
    //THIS es para saber quién es el ATRIBUTO y el que no tiene es el PARAMETRO
    public Entrada(String nombre_evento, double precio){
        this.nombre_evento = nombre_evento;
        this.precio = precio;
    }

    //METODO PARA MOSTRAR LA INFORMACIÓN

    public void mostrarInformacion(){
        System.out.println("Evento: "+nombre_evento+" | Precio: $"+precio);

    }
}
