package com.elite.gestionpointage.model.dto;


import lombok.Data;

@Data
public class UtilisateurDTO {
	
    private Long id;
    private String nom;
    private String email;
    private String role; // Employé ou Responsable RH
}
