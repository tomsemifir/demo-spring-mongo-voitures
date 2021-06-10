package fr.semifir.demodbref.services.impl;

import fr.semifir.demodbref.models.Voiture;
import fr.semifir.demodbref.repositories.VoitureRepository;
import fr.semifir.demodbref.services.VoitureService;

import java.util.List;

public class VoitureServiceImpl extends GenericServiceImpl<Voiture> {

    public VoitureServiceImpl(VoitureRepository repository) {
        super(repository);
    }

}
