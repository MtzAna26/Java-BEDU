package RegistroEntradas;

public record Entrada_Record(String nombre_evento, double precio_entrada) {
    public void mostrarInformacion() {
        System.out.println("Evento: " + nombre_evento + " | Precio: $" + precio_entrada);
    }
}