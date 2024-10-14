package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class MarshallingCasetasJSON {
    public void marshallingCasetasJSON(List<CasetaFeria> casetas) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File("casetas.json"), casetas);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}