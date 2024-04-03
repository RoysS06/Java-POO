package Ejercicio2;

public class Main {
    public static void main(String[] args) {

        Alumno alu1 = new Alumno(1,"Roy", "Rodriguez");
        Alumno alu2 = new Alumno();

        System.out.println("El id del primer alumno es: " + alu1.getId());
        System.out.println("El nombre del primer alumno es: " + alu1.getNombre());
        System.out.println("El apellido del primer alumno es: " + alu1.getApellido());

        alu2.setId(2);
        alu2.setNombre("Eduardo");
        alu2.setApellido("Mesia");

        System.out.println("---------------------");

        System.out.println("El id del primer alumno es: " + alu2.getId());
        System.out.println("El nombre del primer alumno es: " + alu2.getNombre());
        System.out.println("El apellido del primer alumno es: " + alu2.getApellido());

        System.out.println("---------------------");

        alu1.setId(4);
        System.out.println();
        System.out.println("El id del primer alumno es: " + alu1.getId());



    }
}
