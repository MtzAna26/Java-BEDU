import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

class Tema implements Comparable<Tema> {
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
    public int compareTo(Tema otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo); // Orden alfabético
    }

    @Override
    public String toString() {
        return "Tema: " + titulo + " (Prioridad: " + prioridad + ")";
    }
}

public class TemarioEducativo {
    public static void main(String[] args) {
        // Lista concurrente de temas activos
        CopyOnWriteArrayList<Tema> temasActivos = new CopyOnWriteArrayList<>();

        // Agregamos temas
        temasActivos.add(new Tema("Inteligencia Artificial", 2));
        temasActivos.add(new Tema("Algoritmos", 1));
        temasActivos.add(new Tema("Cultura Digital", 3));
        temasActivos.add(new Tema("Bases de Datos", 1));

        System.out.println("🔤 Temas ordenados alfabéticamente:");
        List<Tema> ordenAlfabetico = new CopyOnWriteArrayList<>(temasActivos);
        Collections.sort(ordenAlfabetico);
        ordenAlfabetico.forEach(System.out::println);

        System.out.println("\n📌 Temas ordenados por prioridad:");
        List<Tema> ordenPrioridad = new CopyOnWriteArrayList<>(temasActivos);
        ordenPrioridad.sort(Comparator.comparingInt(Tema::getPrioridad));
        ordenPrioridad.forEach(System.out::println);

        // Repositorio concurrente de materiales por tema
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Inteligencia Artificial", "https://recursos.com/ia");
        recursos.put("Algoritmos", "https://recursos.com/algoritmos");
        recursos.put("Cultura Digital", "https://recursos.com/cultura");
        recursos.put("Bases de Datos", "https://recursos.com/bd");

        System.out.println("\n📚 Repositorio de recursos compartidos:");
        recursos.forEach((tema, enlace) -> {
            System.out.println("Tema: " + tema + " ➡️ Recurso: " + enlace);
        });
    }
}
