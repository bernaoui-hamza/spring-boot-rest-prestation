package com.prestation.springbootrestprestation.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor

public class Prestation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nomprestation;
    String prestataire;
}
