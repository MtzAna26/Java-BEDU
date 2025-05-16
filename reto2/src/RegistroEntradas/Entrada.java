package RegistroEntradas;

public class Entrada {
    String nombre_evento;
    double precio_entrada;

    public Entrada(String nombre_evento, double precio_entrada){
        this.nombre_evento = nombre_evento;
        this.precio_entrada = precio_entrada;
    }

    public void mostrarInformacion(){
        System.out.println("Evento: " + nombre_evento + " | Precio: $" + precio_entrada);
    }
}