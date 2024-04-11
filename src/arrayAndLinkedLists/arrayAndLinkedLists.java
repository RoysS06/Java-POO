package arrayAndLinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arrayAndLinkedLists {
    public static void main(String[] args) {


        List<Persona> listaArray = new ArrayList<Persona>();
        listaArray.add(new Persona(1, "Roy", 30));
        listaArray.add(new Persona(2,"Eduardo", 27));
        listaArray.add(new Persona(3, "Silvia", 60));
        listaArray.add(new Persona(4, "Marco", 61));

        LinkedList<Persona> listaLinked = new LinkedList<>();
        listaLinked.add(new Persona(1, "Roy", 30));
        listaLinked.add(new Persona(2,"Eduardo", 27));
        listaLinked.add(new Persona(3, "Silvia", 60));
        listaLinked.add(new Persona(4, "Marco", 61));

        //Remove ArrayLists:
        listaArray.remove(1);

        //Remove LinkedLists:
        String borrarNombre = "Roy";
        for (Persona elemin:listaLinked){
            if(elemin.getNombre().equals(borrarNombre)){
                listaLinked.remove(elemin);
                break;
            }
        }

        System.out.println("------LUEGO DE ELIMINAR");

        System.out.println("ArrayList");
        for (Persona perso:listaArray){
            System.out.println("Prueba: " + perso.getNombre());
        }

        System.out.println("LinkedList");
        for(Persona perso:listaLinked){
            System.out.println("Prueba: " + perso.getNombre());
        }

        //TAMAÑO DE LISTA
        System.out.println("Que tamaño tiene la Lista?");
        System.out.println("ArrayList: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());

        //PARA OBTENER OBJETO
        System.out.println("Para primer y ultimo objeto (Solo para LinkedList)");
        System.out.println("Primer objeto: " + listaLinked.getFirst().toString());
        System.out.println("Ultimo objeto: " + listaLinked.getLast().toString());

        // BORRANDO LISTAS:
        listaArray.clear();
        listaLinked.clear();

        //Comprobando si esta vacio:
        System.out.println("Esta vacia alguna lista");
        System.out.println("ArrayList: " + listaArray.isEmpty());
        System.out.println("LinkedList: " + listaLinked.isEmpty());

    }
}
