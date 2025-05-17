public class TransicionSimple implements TransicionHistoria {
    @Override
    public void transicionar(String decision) {
        if ("A".equalsIgnoreCase(decision)) {
            System.out.println("La historia continúa por el camino del bosque encantado...");
        } else if ("B".equalsIgnoreCase(decision)) {
            System.out.println("Te diriges hacia las ruinas de un antiguo castillo...");
        } else {
            System.out.println("La indecisión del héroe ha cambiado el destino.");
        }
    }
}