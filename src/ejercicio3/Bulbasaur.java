package ejercicio3;

public class Bulbasaur extends Pokemon implements IPlanta {

    //CONSTRUCTOR
    public Bulbasaur() {
    }

    //CLASES ABSTRACTAS
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataca placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasaur y este es mi ataca arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur y este es mi ataca mordisco");
    }

    //INTERFACES
    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataca drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y este es mi ataca paralizar");
    }
}
