package ClasesAbstractas;

public class ClaAbstractas {

    public static void main(String[] args) {

        Cuadrado cuadra1 = new Cuadrado(1,1, 4);
        System.out.println(cuadra1.calcularArea());

        Circulo cir1 = new Circulo(1,1,2);
        System.out.println(cir1.calcularArea());
    }


}
