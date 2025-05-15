public class CentralEmergencias {
    public static void main (String[] args){
        Ambulancia ambulancia = new Ambulancia("Ambulancia","Esmeralda ");
        Patrulla patrulla = new Patrulla("Patrulla","Norberto ");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Gloria ");

        System.out.println();
        ambulancia.iniciarOperador();

        System.out.println();
        patrulla.iniciarOperacion();

        System.out.println();
        bomberos.inicarOperacion();
    }
}
