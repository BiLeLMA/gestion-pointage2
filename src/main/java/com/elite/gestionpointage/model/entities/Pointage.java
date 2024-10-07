package com.elite.gestionpointage.model.entities;

import java.time.LocalDateTime;
import com.elite.gestionpointage.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitialiser","handler"})

public class Pointage extends BaseEntity {
	
	
    private LocalDateTime date;
    
    @Column(name = "heure_arrivee")
    private LocalDateTime heureArrivee;

    @Column(name = "heure_depart")
    private LocalDateTime heureDepart;

    @ManyToOne
    @JoinColumn(name = "employe_id")
    private Employe employe;
}
