package com.elite.gestionpointage.model.dto;

import lombok.Data;

@Data
public class RapportDTO {
	
	
    private Long id;
    private String typeRapport;
    private String periode;
    private String contenu;
}