import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Paciente paciente = new Paciente();

        System.out.print("Ingresa el nombre del paciente: ");
        paciente.nombre_paciente = teclado.nextLine();

        System.out.print("Ingresa la edad del paciente: ");
        paciente.edad = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Ingresa el número de expediente: ");
        paciente.numero_expediente = teclado.nextLine();

        System.out.println();
        paciente.MostrarInformacion();

        teclado.close();
    }
}
