
package org.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.List;

public class MarshallingCasetasXML {
    public void marshallingCasetasXML(List<CasetaFeria> casetas) {
        try {
            JAXBContext context = JAXBContext.newInstance(Casetas.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            Casetas casetasXML = new Casetas();
            casetasXML.setCasetas(casetas);

            marshaller.marshal(casetasXML, new File("casetas.xml"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}