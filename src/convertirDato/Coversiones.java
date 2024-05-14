package convertirDato;

public class Coversiones {
    public static void main(String[] args) {

        //Primera coversión: De double a entero o double
            double num = 1.67;

            //Casteo a Entero:
            int numInt = (int) num;

            //Casteo a Long:
            long numLong = (long) num;

            System.out.println("double: " + num);
            System.out.println("int: " + numInt);
            System.out.println("long: " + numLong);

        //Segunda conversión: De String a entrero o double
            String cantidad = "15";
            String precio = "150.27";

            //Casteo a entero
            int cantEntero = Integer.parseInt(cantidad);

            //Casteo a double
            double precioDouble = Double.parseDouble(precio);

            System.out.println("El valor total de la compra es: " + (cantEntero * precioDouble));

        //Tercera converción: De entero o double a String
            int edad = 31;
            double estatura = 1.67;

            String edadString = String.valueOf(edad);
            String estaturaString = String.valueOf(estatura);

            System.out.println("Edad: " + edadString + " Estatura: " + estaturaString);

    }
}
