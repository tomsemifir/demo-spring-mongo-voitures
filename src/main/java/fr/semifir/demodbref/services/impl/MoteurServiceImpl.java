package fr.semifir.demodbref.services.impl;

import fr.semifir.demodbref.models.Moteur;
import org.springframework.data.mongodb.repository.MongoRepository;

public class MoteurServiceImpl extends GenericServiceImpl<Moteur> {

    public MoteurServiceImpl(MongoRepository<Moteur, String> repository) {
        super(repository);
    }
}
