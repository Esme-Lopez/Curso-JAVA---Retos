import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class MonitoreoConcurrente {
    public static void main(String[] args) {

        // CopyOnWriteArrayList es una lista segura para entornos con múltiples hilos
        List<String> tecnicosConectados = new CopyOnWriteArrayList<>();
        tecnicosConectados.add("Ana");
        tecnicosConectados.add("Luis");
        tecnicosConectados.add("Carlos");

        // Simulación de múltiples lecturas (en un entorno real sería desde distintos hilos)
        System.out.println("Técnicos actualmente conectados:");
        for (String tecnico : tecnicosConectados) {
            System.out.println("- " + tecnico);
        }

        //ConcurrentHashMap permite modificaciones seguras desde múltiples hilos
        ConcurrentHashMap<String, Double> sensoresTemperatura = new ConcurrentHashMap<>();
        sensoresTemperatura.put("M-01", 68.5);
        sensoresTemperatura.put("M-02", 72.3);
        sensoresTemperatura.put("M-03", 70.0);

        // Actualizaciones simuladas como si provinieran de hilos distintos
        sensoresTemperatura.put("M-01", 69.1); // Nueva lectura para M-01
        sensoresTemperatura.put("M-04", 65.7); // Se agrega nueva máquina

        System.out.println("\nTemperaturas por máquina:");
        for (String maquina : sensoresTemperatura.keySet()) {
            System.out.println(maquina + " → " + sensoresTemperatura.get(maquina) + " °C");
        }
    }
}