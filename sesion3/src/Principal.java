public class Principal{
    public static void main (String[] args){
        Pasajero pasajero1 = new Pasajero("Ana Mtz", "P12345");
        Vuelo vuelo1 = new Vuelo("UX123", "Barcelona", "14:30");
        vuelo1.reservarAsiento(pasajero1);
        System.out.println(vuelo1.obtenerItinerario());
        vuelo1.cancelarReserva();
        System.out.println(vuelo1.obtenerItinerario());
        vuelo1.reservarAsiento("Mario Gonzalez", "P45689");
        System.out.println(vuelo1.obtenerItinerario());
    }
}