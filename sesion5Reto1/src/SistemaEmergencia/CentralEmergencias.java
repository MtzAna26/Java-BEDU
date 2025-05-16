package SistemaEmergencia;

public class CentralEmergencias {
    public static void main(String[] args) {
        Operador operador1 = new Operador("Laura");
        Operador operador2 = new Operador("Carlos");
        Operador operador3 = new Operador("Mónica");

        Ambulancia ambulancia = new Ambulancia("Ambulancia #1", operador1);
        Patrulla patrulla = new Patrulla("Patrulla #2", operador2);
        UnidadBomberos bomberos = new UnidadBomberos("Bomberos #3", operador3);

        ambulancia.iniciarOperacion();
        System.out.println("-----");
        patrulla.iniciarOperacion();
        System.out.println("-----");
        bomberos.iniciarOperacion();
    }
}