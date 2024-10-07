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

public class Conge extends BaseEntity {
	
   
	@Column(name = "date_debut")
	private LocalDateTime dateDebut;
    
	 @Column(name = "date_fin")
    private LocalDateTime dateFin;
    
    private String motif;
    private String statut;

    @ManyToOne
    @JoinColumn(name = "employe_id", nullable = false) 
    private Employe employe;

}
