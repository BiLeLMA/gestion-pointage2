package com.elite.gestionpointage.model.entities;

import java.time.LocalDateTime;
import com.elite.gestionpointage.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
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


public class Notification extends BaseEntity {
	
    private String typeNotification;
    private String destinataire;
    private LocalDateTime dateEnvoi;
    private Boolean etat;
    
}
