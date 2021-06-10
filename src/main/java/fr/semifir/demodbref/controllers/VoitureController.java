package fr.semifir.demodbref.controllers;

import fr.semifir.demodbref.models.Voiture;
import fr.semifir.demodbref.services.impl.VoitureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("voitures")
@CrossOrigin
public class VoitureController {

    @Autowired
    private VoitureServiceImpl service;

    @GetMapping("")
    public List<Voiture> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Voiture findById(@PathVariable String id) {
        return this.service.findById(id);
    }

    @PostMapping("")
    public Voiture save(@RequestBody Voiture voiture) {
        return this.service.save(voiture);
    }


}
