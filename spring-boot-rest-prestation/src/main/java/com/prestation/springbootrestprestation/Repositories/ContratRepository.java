package com.prestation.springbootrestprestation.Repositories;

import com.prestation.springbootrestprestation.entities.Contrat;
import com.prestation.springbootrestprestation.entities.Prestation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
    ArrayList<Contrat> findContratById(Long id);
    ArrayList<Prestation> findContratByNumeroContrat(Long num);
}
