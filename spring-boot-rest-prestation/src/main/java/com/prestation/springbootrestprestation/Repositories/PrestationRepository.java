package com.prestation.springbootrestprestation.Repositories;

import com.prestation.springbootrestprestation.entities.Prestation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;


public interface PrestationRepository  extends JpaRepository<Prestation,Long> {
    ArrayList<Prestation> findPrestationById(Long id);
    ArrayList<Prestation> findPrestationByNomprestation(String nom);
}
