import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Comparator;

public class TemarioMensual {

    // Clase interna Tema con Comparable
    static class Tema implements Comparable<Tema> {
        private String titulo;
        private int prioridad;

        public Tema(String titulo, int prioridad) {
            this.titulo = titulo;
            this.prioridad = prioridad;
        }

        public String getTitulo() {
            return titulo;
        }

        public int getPrioridad() {
            return prioridad;
        }

        @Override
        public String toString() {
            return "Tema: " + titulo + " | Prioridad: " + prioridad;
        }

        @Override
        public int compareTo(Tema otro) {
            return this.titulo.compareToIgnoreCase(otro.titulo);
        }
    }

    public static void main(String[] args) {

        // Lista concurrente para los temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        // Agregar temas
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));
        temas.add(new Tema("Resolución de conflictos", 2));

        // Repositorio de recursos compartidos
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/ambiente");
        recursos.put("Resolución de conflictos", "https://recursos.edu/conflictos");

        // Mostrar lista original
        System.out.println("📋 Temas activos (orden de inserción):");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Ordenar alfabéticamente (orden natural)
        Collections.sort(temas);
        System.out.println("\nTemas ordenados alfabéticamente:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Ordenar por prioridad
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        System.out.println("\nTemas ordenados por prioridad:");
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Mostrar recursos por tema
        System.out.println("\nRecursos asociados por tema:");
        for (String titulo : recursos.keySet()) {
            System.out.println("🔗 " + titulo + " → " + recursos.get(titulo));
        }
    }
}
