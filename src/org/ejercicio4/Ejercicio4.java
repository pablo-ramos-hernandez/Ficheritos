package org.ejercicio4;

import java.io.Console;
import java.io.IOException;

import org.ejercicio4.utils.Utils;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opcion;
        String color = "";
        String numeroPatas = "";
        Console c = System.console();
        opcion = c.readLine("Que opcion desea la primera añade y la segunda elimina");

        switch (opcion) {
            case "1":
                color = c.readLine("De que color es la mesa");

                numeroPatas = c.readLine("Cuantas patas tiene la silla");

                Utils utils = new Utils(color, numeroPatas);

                utils.guardarMesa(color, numeroPatas);
                break;
            case "2":
                Utils utils2 = new Utils(color, numeroPatas);
                utils2.mostrarMesas();
                break;
            default:
                System.out.println("Debe introducir los valores asignados");
                ;
        }
    }
}
