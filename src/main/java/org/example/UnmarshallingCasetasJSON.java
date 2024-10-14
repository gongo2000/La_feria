package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class UnmarshallingCasetasJSON {
    public List<CasetaFeria> unmarshallingCasetasJSON() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File("casetas.json");
            if (file.exists()) {
                return mapper.readValue(file, mapper.getTypeFactory().constructCollectionType(List.class, CasetaFeria.class));
            } else {
                System.out.println("El archivo casetas.json no existe.");
                return null;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}