package stacks;

import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();

        System.out.println("pila:" + pila);
        System.out.println("Esta vacia: " + pila.isEmpty());

        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);

        //mostrar
        System.out.println("pila: " + pila);
        System.out.println("Esta vacia: " + pila.isEmpty());

        //recorrido:
        for(Integer num:pila){
            System.out.println(num);
        }

        //eliminar el ultimo registro
        pila.pop();

        System.out.println("Esta el 3?" + pila.search(2)); // botará un numero aleoterio: si es positivo: si esta el
        // numero, si es negativo: no esta el numero.
        System.out.println("Último agregado: " + pila.peek());
    }
}
