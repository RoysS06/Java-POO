package map;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {
    public static void main(String[] args) {

        Map<Integer,String> mapaEmpleados = new HashMap<>();

        mapaEmpleados.put(1453, "Roy Rodriguez");
        mapaEmpleados.put(1454, "Diana Rios");
        mapaEmpleados.put(1455, "Ian Rodriguez");

        //containsValue: para encontrar un valor en especifico.
        boolean estaono = mapaEmpleados.containsValue("Roy Rodriguez");

        if(estaono == true){
            System.out.println("El empleado si esta");
        }
        else {
            System.out.println("El empleado no esta");
        }

        //containsKey: Para encontrar un key en especifico
        System.out.println(mapaEmpleados.containsKey(1223));

        //.values(): para saber que valores tiene dentro
        System.out.println(mapaEmpleados.values());

        //.keySet: para encontrar los keys que tiene dentro
        System.out.println(mapaEmpleados.keySet());

        //.get(): permite econtrar el valor especificado en base al key
        String nombre = mapaEmpleados.get(1454);
        System.out.println("El nombre del empleado es: " + nombre);

        //remove(): permite eliminar un valor tomando como base el key
        mapaEmpleados.remove(1453);
        System.out.println(mapaEmpleados.values());

    }
}
