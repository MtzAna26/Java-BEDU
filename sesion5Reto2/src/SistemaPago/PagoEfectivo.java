package SistemaPago;

public class PagoEfectivo extends MetodoPago{
    public PagoEfectivo(String tipo_pago, double monto){
        super(tipo_pago, monto);
    }
    @Override
    public boolean autenticar(){
        return true;
    };
    @Override
    public void procesarPago(){
        System.out.println("Autenticación exitosa");
        System.out.println("Procesando pago en efectivo por: $" + monto);
    }
}
