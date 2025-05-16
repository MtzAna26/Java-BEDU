package lógica_narrativa;
import java.util.Scanner;


public class DecisionBinaria implements LogicaDecision {
    @Override
    public String tomarDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué decides hacer? (1) Entrar a la cueva (2) Regresar al campamento");
        String opcion = scanner.nextLine();
        return opcion.equals("1") ? "cueva" : "campamento";
    }
}