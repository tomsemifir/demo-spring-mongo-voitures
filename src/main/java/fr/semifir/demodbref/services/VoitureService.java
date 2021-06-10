package fr.semifir.demodbref.services;

import fr.semifir.demodbref.models.Voiture;

import java.util.List;

public interface VoitureService extends GenericService<Voiture> {

    public List<Voiture> findByMarque(String marque);
}
