package fr.semifir.demodbref.repositories;

import fr.semifir.demodbref.models.Voiture;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface VoitureRepository extends MongoRepository<Voiture,String> {

    public List<Voiture> findByMarque(String marque);

}
