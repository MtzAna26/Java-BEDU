package lógica_narrativa;

public class DialogoTexto implements GestorDialogo {
    @Override
    public void mostrarDialogo(String personaje, String dialogo) {
        System.out.println(personaje + ": \"" + dialogo + "\"");
    }
}