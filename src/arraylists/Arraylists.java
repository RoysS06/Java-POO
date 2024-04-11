package arraylists;

import java.util.ArrayList;
import java.util.List;

public class Arraylists {
    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<Persona>();

        lista.add(new Persona(1, "Roy", 30));
        lista.add(new Persona(2,"Eduardo", 27));
        lista.add(new Persona(3, "Silvia", 60));
        lista.add(new Persona(4, "Marco", 61));

        // recorrer con FOREACH

        for(Persona perso:lista){
            System.out.println("El nombre es: " + perso.getNombre());
        }
    }
}
