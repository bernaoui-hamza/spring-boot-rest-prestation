package com.prestation.springbootrestprestation;

import com.prestation.springbootrestprestation.Repositories.ContratRepository;
import com.prestation.springbootrestprestation.Repositories.PrestationRepository;
import com.prestation.springbootrestprestation.entities.Contrat;
import com.prestation.springbootrestprestation.entities.Prestation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Service
public class SpringBootRestPrestationApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootRestPrestationApplication.class, args);
    }

    @Bean
    CommandLineRunner start(PrestationRepository prestationRepository, ContratRepository contratRepository) {
        return args -> {
            Prestation p1 = new Prestation(null, "prestation4", "prestataire4");
            prestationRepository.save(new Prestation(null, "prestation1", "prestataire1"));
            prestationRepository.save(new Prestation(null, "prestation2", "prestataire2"));
            prestationRepository.save(new Prestation(null, "prestation3", "prestataire3"));
            prestationRepository.save(p1);
            contratRepository.save(new Contrat(null, 123L, "aaa", p1));
            contratRepository.save(new Contrat(null, 456L, "aaa", p1));
            contratRepository.save(new Contrat(null, 789L, "aaa", p1));

        };
    }

}
