package SistemaPago;
import java.util.Objects;

public class PagoTransferencia extends MetodoPago{
    String destino_banco;
    boolean autentificacion;

    public PagoTransferencia (String tipo_pago, double monto, String destino_banco){
        super(tipo_pago, monto);
        this.destino_banco = destino_banco;
    }

    @Override
    public boolean autenticar(){
        String destino2 = "X44562";
        autentificacion = Objects.equals(destino_banco, destino2);
        if (autentificacion){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public void procesarPago(){
        if (autentificacion == true){
            System.out.println("Autenticación exitosa.");
        }else{
            System.out.println("Fallo de autenticación. Transferencia no válida.");
        }
    }
}
