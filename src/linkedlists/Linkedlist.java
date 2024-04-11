package linkedlists;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {

        List<Persona> lista = new LinkedList<>();

        lista.add(new Persona(1, "Roy", 30));
        lista.add(new Persona(2,"Eduardo", 27));
        lista.add(new Persona(3, "Silvia", 60));
        lista.add(new Persona(4, "Marco", 61));

        //Agregando al inicio

        lista.add(0, new Persona(5, "prueba", 90));


        // recorrer con FOREACH
        for(Persona perso:lista){
            System.out.println("Nombre: " + perso.getNombre());
        }
    }
}
