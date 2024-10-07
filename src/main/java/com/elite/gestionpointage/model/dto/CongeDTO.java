package com.elite.gestionpointage.model.dto;


import java.time.LocalDateTime;
import lombok.Data;

@Data

public class CongeDTO {
    private Long id;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private String motif;
    private String statut;
    private Long employeId; // Lier le congé à un employé
}