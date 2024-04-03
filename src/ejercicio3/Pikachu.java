package ejercicio3;

public class Pikachu extends Pokemon implements IElectrico{

    //CONSTRUCTOR
    public Pikachu() {
    }

    //CLASES ABSTRACTAS
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataca placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataca arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataca mordisco");
    }

    //INTERFACES
    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataca impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataca puño trueno");
    }
}
