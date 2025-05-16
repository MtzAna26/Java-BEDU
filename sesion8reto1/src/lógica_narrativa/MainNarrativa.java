package lógica_narrativa;

public class MainNarrativa {
    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    public MainNarrativa(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void iniciarEscena() {
        dialogo.mostrarDialogo("Narrador", "Estás en medio del bosque al anochecer...");
        dialogo.mostrarDialogo("Compañero", "Hay una cueva misteriosa más adelante, ¿quieres entrar?");

        String eleccion = decision.tomarDecision();

        if (eleccion.equals("cueva")) {
            transicion.ejecutarTransicion("Escena: Interior de la Cueva");
            dialogo.mostrarDialogo("Narrador", "La oscuridad te envuelve mientras avanzas...");
        } else {
            transicion.ejecutarTransicion("Escena: Campamento");
            dialogo.mostrarDialogo("Narrador", "Regresas al calor de la fogata.");
        }
    }

    public static void main(String[] args) {
        MainNarrativa juego = new MainNarrativa(
                new TransicionSimple(),
                new DialogoTexto(),
                new DecisionBinaria()
        );

        juego.iniciarEscena();
    }
}
