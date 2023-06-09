package org.ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        File ejercicio3 = new File("src/org/ficheros/", "ejercicio3.txt");

        FileWriter fw = new FileWriter(ejercicio3);
        BufferedWriter fichero3Buff = new BufferedWriter(fw);

        FileReader fichero1 = new FileReader("src/org/ficheros/ejercicio1.txt");
        BufferedReader fichero1Buff = new BufferedReader(fichero1);

        FileReader fichero2 = new FileReader("src/org/ficheros/ejercicio2.txt");
        BufferedReader fichero2Buff = new BufferedReader(fichero2);

        String textFichero1 = fichero1Buff.readLine();
        String textFichero2 = fichero2Buff.readLine();
        String text = "- Contenido del fichero uno: " + textFichero1 + "\n"
                + "- Contenido del fichero dos: " + textFichero2 +
                "\n" + "Pablo ha estado aqui";

        fichero3Buff.write(text);
        fichero1Buff.close();
        fichero2Buff.close();
        fichero3Buff.close();
    }

}
