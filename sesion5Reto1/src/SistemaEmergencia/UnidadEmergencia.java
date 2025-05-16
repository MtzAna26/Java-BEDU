package SistemaEmergencia;

abstract class UnidadEmergencia {
    protected String nombre;

    public UnidadEmergencia(String nombre) {
        this.nombre = nombre;
    }

    public void activarUnidad() {
        System.out.println(nombre + " activada.");
    }

    public abstract void responder();
}