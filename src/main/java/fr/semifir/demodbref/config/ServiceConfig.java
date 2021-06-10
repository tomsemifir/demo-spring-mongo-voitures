package fr.semifir.demodbref.config;

import fr.semifir.demodbref.repositories.MoteurRepository;
import fr.semifir.demodbref.repositories.VoitureRepository;
import fr.semifir.demodbref.services.impl.MoteurServiceImpl;
import fr.semifir.demodbref.services.impl.VoitureServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public VoitureServiceImpl voitureServiceFactory(VoitureRepository repository) {
        return new VoitureServiceImpl(repository);
    }

    @Bean
    public MoteurServiceImpl moteurServiceFactory(MoteurRepository repository) {
        return new MoteurServiceImpl(repository);
    }
}
