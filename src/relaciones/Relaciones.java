package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {
    public static void main(String[] args) {

        Auto aut = new Auto();

        aut.setId(1L);
        aut.setMarca("Hyundai");
        aut.setModelo("grandI10");

        List<Propietarios> listaPropietarios = new ArrayList<Propietarios>();

        Propietarios prop1 = new Propietarios();
        Propietarios prop2 = new Propietarios();
        Propietarios prop3 = new Propietarios();

        prop1.setId(01L);
        prop1.setNombre("Roy");
        prop1.setApellido("Rodriguez");

        prop2.setId(02L);
        prop2.setNombre("Ali");
        prop2.setApellido("Baba");

        prop3.setId(03L);
        prop3.setNombre("German");
        prop3.setApellido("Loero");

        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        listaPropietarios.add(prop3);

        aut.setListaPropietarios(listaPropietarios);

        System.out.println("El auto: " + aut.getMarca() + " " + aut.getModelo() + " " + "tiene como propietarios a: " +
                            aut.getListaPropietarios().toString());
    }
}
