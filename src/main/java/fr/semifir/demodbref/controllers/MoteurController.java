package fr.semifir.demodbref.controllers;

import fr.semifir.demodbref.models.Moteur;
import fr.semifir.demodbref.services.impl.MoteurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("moteurs")
@CrossOrigin
public class MoteurController {

    @Autowired
    private MoteurServiceImpl service;

    @GetMapping("")
    public List<Moteur> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Moteur findById(@PathVariable String id) {
        return this.service.findById(id);
    }

    @PostMapping("")
    public Moteur save(@RequestBody Moteur moteur) {
        return this.service.save(moteur);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.service.delete(id);
    }
}
