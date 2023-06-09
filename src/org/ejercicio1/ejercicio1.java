package org.ejercicio1;

import java.io.BufferedWriter;
import java.io.Console;
import java.io.FileWriter;

public class ejercicio1 {
    public static void main(String[] args) throws Exception {
        Console c = System.console();
        FileWriter fw = new FileWriter("src/org/ficheros/ejercicio1.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        String text = c.readLine("Por favor introduzca un texto de almenos 30  caracteres\n");
        int resto = 30 - text.length();
        if (text.length() >= 30) {
            System.out.println("Se ha guardado correctamente");
        } else {
            System.out.println("Le ha faltado: " + resto + " caracteres");
        }

        text = text.toUpperCase().replace(" ", "_");

        System.out.println(text);
        bw.write(text);
        bw.close();

    }
}
