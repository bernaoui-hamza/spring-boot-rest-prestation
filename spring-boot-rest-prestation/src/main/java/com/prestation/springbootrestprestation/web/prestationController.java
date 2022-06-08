package com.prestation.springbootrestprestation.web;

import com.prestation.springbootrestprestation.Repositories.ContratRepository;
import com.prestation.springbootrestprestation.Repositories.PrestationRepository;
import com.prestation.springbootrestprestation.entities.Contrat;
import com.prestation.springbootrestprestation.entities.Prestation;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
public class prestationController {
    PrestationRepository prestationRepository;
    ContratRepository contratRepository;

    @GetMapping(path = "/prestationId")
    public ArrayList<Prestation> getId_Prestation(Long id) {
        ArrayList<Prestation> listP = prestationRepository.findPrestationById(id);
        return listP;
    }
    @GetMapping (value =  "/prestations" )
    public ArrayList<Prestation> getPrestation()
    {

        ArrayList<Prestation> listePR = (ArrayList<Prestation>) prestationRepository.findAll();
        return listePR;
    }
    @GetMapping(path = "/prestationName")
    public ArrayList<Prestation> getByName_Prestation(String n) {
        ArrayList<Prestation> listP = prestationRepository.findPrestationByNomprestation(n);
        return listP;
    }
    @GetMapping(path = "/addPrestation")
    public void add_Prestation(Prestation p1){
        prestationRepository.save(p1);

    }
    @GetMapping(path = "/contratId")
    public ArrayList<Contrat> getId_Contrat(Long id) {
        ArrayList<Contrat> listP = contratRepository.findContratById(id);
        return listP;
    }

    @GetMapping(path = "/ContratName")
    public ArrayList<Prestation> getByNum_Contrat(Long num) {
        ArrayList<Prestation> listP = contratRepository.findContratByNumeroContrat(num);
        return listP;
    }
    @GetMapping(path = "/addContrat")
    public void add_Contrat(Contrat c1){
        contratRepository.save(c1);

    }
}
