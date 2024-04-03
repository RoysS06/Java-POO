package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Paciente paciente = new Paciente("Roy", "rrodriguezmesia@gmail.com");

        paciente.setWeight(65.6);
        System.out.println(paciente.getweight());

        paciente.setHeight(1.80);
        System.out.println(paciente.getHeight());

        paciente.setPhoneNumber("91534440");
        System.out.println(paciente.getPhoneNumber());
    }
}