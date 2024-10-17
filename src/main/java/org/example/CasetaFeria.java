package org.example;
import javax.naming.Name;
import javax.naming.NamingEnumeration;
import javax.xml.bind.annotation.*;

public class CasetaFeria {
    //Atributos caseta feria
    private int id;
    private String nombre;
    private String titular;
    private int aforo;
    private String tipoCaseta;
    private static int cont=0;
    public CasetaFeria() {
    }

    // Constructor, getters y setters
    public CasetaFeria(String tipoCaseta, int aforo, String titular, String nombre) {
        cont++;
        this.id=cont;
        this.tipoCaseta = tipoCaseta;
        this.aforo = aforo;
        this.titular = titular;
        this.nombre = nombre;
    }

    @XmlElement(name = "id")
    public int getId() {
        return id;
    }
    @XmlElement(name= "nombre")
    public String getNombre() {
        return nombre;
    }
    @XmlElement(name= "nombtitularre")
    public String getTitular() {
        return titular;
    }
    @XmlElement(name= "aforo")
    public int getAforo() {
        return aforo;
    }

    @XmlElement(name= "tipoCaseta")
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