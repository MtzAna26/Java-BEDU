package SistemaPago;

public class CajaRegistradora {
    public static void main (String[] args){
        MetodoPago[] pago = {
                new PagoEfectivo("Pago en efectivo", 150),
                new PagoTarjeta("Pago con tarjeta", 1000, 320),
                new PagoTransferencia("Pago por medio de transeferencia", 150,"DDFGGGD523")
        };
        for (MetodoPago pagos: pago){
            if (pagos.autenticar() == true){
                pagos.procesarPago();
                pagos.MostrarResumen();
                System.out.println("");
            }else{
                pagos.procesarPago();
            }
        }
    }
}

