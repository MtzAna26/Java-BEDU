import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        String archivoLog = "errores.log";
        String archivoRegistroFallos = "registro_fallos.txt";

        int totalLineas = 0;
        int totalErrores = 0;
        int totalWarnings = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivoLog))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                totalLineas++;

                if (linea.contains("ERROR")) {
                    totalErrores++;
                }
                if (linea.contains("WARNING")) {
                    totalWarnings++;
                }
            }

            // Cálculo de porcentaje
            int totalErroresYWarnings = totalErrores + totalWarnings;
            double porcentaje = totalLineas == 0 ? 0 : ((double) totalErroresYWarnings / totalLineas) * 100;

            // Mostrar resumen
            System.out.println("📊 Resumen del Análisis de Logs:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores (ERROR): " + totalErrores);
            System.out.println("Cantidad de advertencias (WARNING): " + totalWarnings);
            System.out.printf("Porcentaje de líneas con errores y advertencias: %.2f%%\n", porcentaje);

        } catch (IOException e) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoRegistroFallos, true))) {
                bw.write("❌ Error al analizar el archivo: " + e.getMessage());
                bw.newLine();
            } catch (IOException ex) {
                System.err.println("❗ No se pudo escribir en registro_fallos.txt: " + ex.getMessage());
            }
        }
    }
}
