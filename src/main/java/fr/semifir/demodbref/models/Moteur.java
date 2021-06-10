package fr.semifir.demodbref.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Moteur {

    @Id
    private String id;
    private int km;
}
