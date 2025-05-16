public class Main {
    public static void main (String[] args){
        Factura factura1 = new Factura("FAC001", "Juan Perez", 1450.0);
        Factura factura2 = new Factura("FAC001", "Comercial XYZ", 1450.0);
        System.out.println(factura1);
        System.out.println(factura2);
        boolean sonIguales = factura1.equals(factura2);
        System.out.println("¿Las facturas son iguales?: " + sonIguales);
    }
}