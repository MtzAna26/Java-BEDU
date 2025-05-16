import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class RegistroMuestrasGeneticas {
    public static void main(String[] args){
        ArrayList<String> ordenMuestras  = new ArrayList<>();
        HashSet<String> especiesUnicas = new HashSet<>();
        HashMap<String, String> muestraInvestigador  = new HashMap<>();
        registrarMuestra("Homo sapiens", "M-001", "Dra. López", ordenMuestras, especiesUnicas, muestraInvestigador);
        registrarMuestra("Mus musculus", "M-002", "Dr. Hernández", ordenMuestras, especiesUnicas, muestraInvestigador);
        registrarMuestra("Arabidopsis thaliana", "M-003", "Dra. Gómez", ordenMuestras, especiesUnicas, muestraInvestigador);
        registrarMuestra("Homo sapiens", "M-004", "Dr. Torres", ordenMuestras, especiesUnicas, muestraInvestigador);
        System.out.println(" Orden de llegada de muestras:");
        for (String especie : ordenMuestras) {
            System.out.println("- " + especie);
        }

        System.out.println("\n Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        System.out.println("\nRelación ID de muestra → Investigador:");
        for (String id : muestraInvestigador.keySet()) {
            System.out.println("- " + id + " → " + muestraInvestigador.get(id));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n Ingresa un ID de muestra para buscar al investigador responsable: ");
        String idBusqueda = scanner.nextLine();
        if (muestraInvestigador.containsKey(idBusqueda)) {
            System.out.println("Investigador responsable de " + idBusqueda + ": " + muestraInvestigador.get(idBusqueda));
        } else {
            System.out.println("No se encontró ninguna muestra con ese ID.");
        }

        scanner.close();
    }

    /**
     * Registra una nueva muestra en las estructuras correspondientes
     */
    public static void registrarMuestra(String especie, String idMuestra, String investigador,
                                        ArrayList<String> ordenMuestras, HashSet<String> especiesUnicas,
                                        HashMap<String, String> muestraInvestigador) {
        ordenMuestras.add(especie);               // Guardar orden de llegada
        especiesUnicas.add(especie);              // Agregar especie al set de únicas
        muestraInvestigador.put(idMuestra, investigador); // Asociar ID con investigador
    }
}