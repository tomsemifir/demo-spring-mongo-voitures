package fr.semifir.demodbref.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Voiture {

    @Id
    private String id;

    private String marque;
    private String couleur;

    @DBRef
    private Moteur moteur;

}
