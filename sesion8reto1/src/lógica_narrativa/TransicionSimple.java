package lógica_narrativa;

public class TransicionSimple implements TransicionHistoria {
    @Override
    public void ejecutarTransicion(String escena) {
        System.out.println("Transicionando a la escena: " + escena);
    }
}
