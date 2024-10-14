package org.example;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CrearObjets {
        private List<CasetaFeria> casetaslista;

        public CrearObjets() {
            this.casetaslista = new ArrayList<CasetaFeria>();
        }

        //getter y setters
        public List<CasetaFeria> getCasetas () {
            return casetaslista;
        }

        public void setCasetas (List < CasetaFeria > casetas) {
            this.casetaslista = casetas;
        }


        //cargamos las casetas q hay dentro del archivo wen el array
        public void Carga (String casetas) {

                this.casetaslista = new ArrayList<CasetaFeria>();
                Path ficherCaseta = Paths.get("D://2dam//Aceso datos//La feria//src//main//java//org//example//ficheros//casetas.txt");


                try {
                    List<String> lineas = Files.readAllLines(ficherCaseta);
                    while (lineas != null) {
                        //bucle para leer linea a linea y guardarlo
                        for (String linea : lineas) {
                            int id = 1;
                            linea = linea.trim();
                            String[] datos = linea.split(" - ");
                            this.casetaslista.add(new CasetaFeria(id, datos[1], Integer.parseInt(datos[2]), datos[3], datos[4]));
                            id++;
                            System.out.println(casetaslista);
                        }
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
        }
}

