package fr.semifir.demodbref.repositories;

import fr.semifir.demodbref.models.Moteur;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MoteurRepository extends MongoRepository<Moteur, String> {
}
