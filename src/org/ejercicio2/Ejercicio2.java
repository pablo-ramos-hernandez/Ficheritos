package org.ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        FileReader rd = new FileReader("src/org/ficheros/ejercicio2.txt");
        BufferedReader bw = new BufferedReader(rd);

        String text = bw.readLine();

        String textFormat = "";

        for (int i = 0; i < text.length(); i++) {
            textFormat += text.charAt(i) + "_" + (int) text.charAt(i) + ";";
        }

        System.out.println("Hola pibe " + textFormat);
        bw.close();
    }
}
