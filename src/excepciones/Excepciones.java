package excepciones;

public class Excepciones {
    public static void main(String[] args) {

        // Ejemplo 1
        try {
            int resultado = 3/0;
        } catch (Exception e){
            System.out.println("La división esta mal");
        }


        //ejemplo 2
        int edades[] = {12,32,23,55,43};

        try{
            System.out.println("La posisión de la edad 5 es: " + edades[5]);
        }catch (Exception e){
            System.out.println("el dato es incorrecto");
        }
    }
}
