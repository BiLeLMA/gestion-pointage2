package com.elite.gestionpointage.model.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class NotificationDTO {
	
    private Long id;  
    private String typeNotification;
    private String destinataire;
    private LocalDateTime dateEnvoi;
    private Boolean etat;
}
