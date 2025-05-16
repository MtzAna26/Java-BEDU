public class Paciente{
    String nombre_paciente;
    int edad;
    String numero_expediente;
    //método
    public void MostrarInformacion(){
        System.out.println("Paciente: " + nombre_paciente);
        System.out.println("Edad paciente: "+ edad);
        System.out.println("Número de expediente: "+ numero_expediente);
    }
}
