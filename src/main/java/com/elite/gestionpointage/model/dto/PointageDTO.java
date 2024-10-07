package com.elite.gestionpointage.model.dto;


import java.time.LocalDateTime;
import lombok.Data;

@Data

public class PointageDTO {
    private Long id;
    private LocalDateTime date;
    private LocalDateTime heureArrivee;
    private LocalDateTime heureDepart;
    private Long employeId; // Lier le pointage à un employé
}