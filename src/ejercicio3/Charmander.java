package ejercicio3;

public class Charmander extends Pokemon implements IFuego {

    //CONSTRUCTOR
    public Charmander() {
    }

    //CLASES ABSTRACTAS
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataca placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataca arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataca mordisco");
    }

    //INTERFACES
    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataca puño fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy Charmander y este es mi ataca lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque ascuas");
    }
}
