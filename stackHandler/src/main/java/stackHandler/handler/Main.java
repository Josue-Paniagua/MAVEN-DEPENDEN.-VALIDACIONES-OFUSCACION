package stackHandler.handler;

import umg.edu.gt.data_structure.stack.impl.SymbolValidator;
import umg.edu.gt.data_structure.stack.manual.StackLinked;
import umg.edu.gt.data_structure.stack.manual.Node;

public class Main {

    public static void main(String[] args) {

        // === PRUEBA VALIDATOR ===
        SymbolValidator validador = new SymbolValidator();
        String validar = "(a+b) * (c+d)";
        String invalido = "([)]";

        System.out.println(validar + " → " + validador.isBalanced(validar));
        System.out.println(invalido + " → " + validador.isBalanced(invalido));

        // === PRUEBA PILA ===
        StackLinked stack = new StackLinked();
        stack.push('A');
        stack.push('B');
        stack.push('C');

        System.out.println("Size: " + stack.getSize());

        Node inicio = stack.getNodeInit();
        if (inicio != null) {
            System.out.println("Nodo inicial: " + inicio.getValue());
        }
    }
}
