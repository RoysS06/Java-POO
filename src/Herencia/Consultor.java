package Herencia;

public class Consultor extends Persona{

    int numConsultor;
    String nombreConsultora;


    public Consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono,
                     int numConsultor, String nombreConsultora) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.numConsultor = numConsultor;
        this.nombreConsultora = nombreConsultora;
    }
}
