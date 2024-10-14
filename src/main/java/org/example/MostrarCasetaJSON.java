package org.example;

import java.util.List;

public class MostrarCasetaJSON {
    public void mostrarCaseta(List<CasetaFeria> casetas, int id) {
        for (CasetaFeria caseta : casetas) {
            if (caseta.getId() == id) {
                System.out.println(caseta.toString());
                return;
            }
        }
        System.out.println("No se encontró la caseta con el ID " + id);
    }
}