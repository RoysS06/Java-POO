package ejercicio3;

public class Squirtle extends Pokemon implements IAgua {

    //CONSTRUCTOR
    public Squirtle() {
    }

    //CLASES ABSTRACTAS
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y este es mi ataca placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi ataca arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtle y este es mi ataca mordisco");
    }

    //INTERFACES
    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y este es mi ataca hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi ataca burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle y este es mi ataca pistola agua");
    }
}
