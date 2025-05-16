public class Main {
    public static void main(String[] args) {
        // Crear declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("ABC123456789", 50000.0);

        // Crear cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("ABC123456789", 100000.0);

        // Mostrar información
        System.out.println("🧾 Declaración de Impuestos:");
        System.out.println("RFC: " + declaracion.rfcContribuyente());
        System.out.println("Monto declarado: $" + declaracion.montoDeclarado());

        System.out.println("\n🏦 Cuenta Fiscal:");
        System.out.println("RFC: " + cuenta.getRfc());
        System.out.println("Saldo disponible: $" + cuenta.getSaldoDisponible());

        // Validar RFC
        boolean rfcCoincide = cuenta.validarRFC(declaracion);
        System.out.println("\n¿El RFC de la cuenta coincide con el de la declaración? " + (rfcCoincide ? "✅ Sí" : "❌ No"));
    }
}