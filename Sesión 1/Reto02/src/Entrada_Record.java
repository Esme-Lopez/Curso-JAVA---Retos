public record Entrada_Record(String nombre_evento, double precio) {

    //Metodo para mostrar información

    public void mostrarInformacion(){
        System.out.println("Evento: "+nombre_evento+" | Precio: $"+precio);
    }
}
