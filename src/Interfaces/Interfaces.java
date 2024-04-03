package Interfaces;

public class Interfaces {

    public static void main(String[] args) {

        Cuadrado cuadra1 = new Cuadrado(4);
        System.out.println(cuadra1.calcularArea());

        Circulo cir1 = new Circulo(2);
        System.out.println(cir1.calcularArea());
    }


}
