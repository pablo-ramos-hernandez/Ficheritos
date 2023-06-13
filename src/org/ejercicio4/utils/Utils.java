package org.ejercicio4.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.ejercicio4.Mesa;

public class Utils {

    public static void guardarMesa(Mesa mesa) throws IOException, ClassNotFoundException {
        try {
            FileOutputStream outputStream = new FileOutputStream("src/org/ficheros/ejercicio4.txt");

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);

            objectOutputStream.writeObject(mesa);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void mostrarMesas() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("src/org/ficheros/ejercicio4.txt");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);

        ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
        try {
            Utils u = (Utils) objectInputStream.readObject();
            while (true) {
                System.out.println(u);
                u = (Utils) objectInputStream.readObject();
            }
        } catch (EOFException ex) {
            System.out.println("Hemos llegado al final");
        } catch (ClassNotFoundException e) {
            System.out.println("Se ha producido un error al leer un objeto");
        }
        objectInputStream.close();
    }
}
