package org.example;
import javax.xml.bind.annotation.*;

public class CasetaFeria {
    //Atributos caseta feria
    private int id;
    private String nombre;
    private String titular;
    private int aforo;
    private String tipoCaseta;

    public CasetaFeria() {
    }

    // Constructor, getters y setters
    public CasetaFeria(int id, String tipoCaseta, int aforo, String titular, String nombre) {
        this.tipoCaseta = tipoCaseta;
        this.aforo = aforo;
        this.titular = titular;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTitular() {
        return titular;
    }

    public int getAforo() {
        return aforo;
    }


    public String getTipoCaseta() {
        return tipoCaseta;
    }


    //toString
    @Override
    public String toString() {
        return "CasetaFeria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", titular='" + titular + '\'' +
                ", aforo=" + aforo +
                ", tipoCaseta='" + tipoCaseta + '\'' +
                '}';
    }
}