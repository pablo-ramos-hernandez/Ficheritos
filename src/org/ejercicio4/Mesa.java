package org.ejercicio4;

import java.io.Serializable;

public class Mesa implements Serializable {
    protected String color;
    protected String numeroDePatas;

    public Mesa(String color, String numeroDePatas) {
        this.color = color;
        this.numeroDePatas = numeroDePatas;
    }

    @Override
    public String toString() {
        return "La mesa es de color " + color + " y tiene " + numeroDePatas;
    }
}
