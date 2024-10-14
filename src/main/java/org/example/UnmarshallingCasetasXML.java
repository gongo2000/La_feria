package org.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UnmarshallingCasetasXML {
    public List<CasetaFeria> unmarshallingCasetasXML() {
        List<CasetaFeria> casetas = new ArrayList<>();
        try {
            JAXBContext context = JAXBContext.newInstance(Casetas.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            File file = new File("casetas.xml");
            if (file.exists()) {
                Casetas casetasXML = (Casetas) unmarshaller.unmarshal(file);
                casetas = casetasXML.getCasetas();
            } else {
                System.out.println("El archivo casetas.xml no existe.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return casetas;
    }
}