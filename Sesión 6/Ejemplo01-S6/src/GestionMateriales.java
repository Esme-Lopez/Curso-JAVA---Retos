import java.util.*;

// Clase principal del programa
public class GestionMateriales {
    public static void main(String[] args) {

        //LIST - Usamos una lista para registrar el orden en que llegan los materiales
        List<String> materialesRecibidos = new ArrayList<>();

        // Agregamos materiales en el orden en que llegaron a la línea de producción
        materialesRecibidos.add("Tornillo M6");
        materialesRecibidos.add("Arandela 8mm");
        materialesRecibidos.add("Tornillo M6"); // Llega un material repetido
        materialesRecibidos.add("Tuerca M6");

        // Mostramos la lista completa, incluyendo repeticiones
        System.out.println("Orden de llegada de materiales:");
        for (String material : materialesRecibidos) {
            System.out.println("- " + material);
        }

        //SET - Usamos un conjunto para registrar lotes únicos y evitar duplicados
        Set<String> lotesUnicos = new HashSet<>();

        // Agregamos lotes
        lotesUnicos.add("Lote-001");
        lotesUnicos.add("Lote-002");
        lotesUnicos.add("Lote-001"); // Intento de duplicado: no se agregará de nuevo

        // Mostramos los lotes registrados, sin duplicados
        System.out.println("\nLotes registrados (sin duplicados):");
        for (String lote : lotesUnicos) {
            System.out.println("- " + lote);
        }

        //MAP - Usamos un mapa para asociar códigos de pieza con su descripción
        Map<String, String> catalogoPiezas = new HashMap<>();

        // Agregamos pares clave-valor (código -> descripción)
        catalogoPiezas.put("PZ-1001", "Tornillo M6 x 20mm");
        catalogoPiezas.put("PZ-1002", "Tuerca M6");
        catalogoPiezas.put("PZ-1003", "Arandela 8mm");

        // Mostramos todas las entradas del catálogo
        System.out.println("\nCatálogo de piezas (Código -> Descripción):");
        for (Map.Entry<String, String> entrada : catalogoPiezas.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }

        //Búsqueda: mostramos la descripción de una pieza a partir de su código
        String codigoBuscado = "PZ-1002";
        System.out.println("\nDescripción de la pieza " + codigoBuscado + ": " + catalogoPiezas.get(codigoBuscado));
    }
}
