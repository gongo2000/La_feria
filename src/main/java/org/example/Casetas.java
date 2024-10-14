package org.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "casetas")
@XmlAccessorType(XmlAccessType.FIELD)
public class Casetas {
    private List<CasetaFeria> casetas;

    public Casetas() {
        this.casetas = new ArrayList<>();
    }

    public List<CasetaFeria> getCasetas() {
        return casetas;
    }

    public void setCasetas(List<CasetaFeria> casetas) {
        this.casetas = casetas;
    }
}