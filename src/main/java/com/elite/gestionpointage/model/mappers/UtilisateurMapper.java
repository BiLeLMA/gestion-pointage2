package com.elite.gestionpointage.model.mappers;

import com.elite.gestionpointage.model.dto.UtilisateurDTO;
import com.elite.gestionpointage.model.entities.Utilisateur;
import org.springframework.stereotype.Component;

@Component
public class UtilisateurMapper {

    public UtilisateurDTO toDTO(Utilisateur utilisateur) {
        UtilisateurDTO dto = new UtilisateurDTO();
        dto.setId(utilisateur.getId());
        dto.setNom(utilisateur.getNom());
        dto.setEmail(utilisateur.getEmail());
        dto.setRole(utilisateur.getRole());  // Récupération du rôle
        return dto;
    }

    public Utilisateur toEntity(UtilisateurDTO dto) {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(dto.getId());
        utilisateur.setNom(dto.getNom());
        utilisateur.setEmail(dto.getEmail());
        return utilisateur;
    }

    // Nouvelle méthode pour mettre à jour l'entité existante
    public Utilisateur toEntity(UtilisateurDTO dto, Utilisateur utilisateur) {
        utilisateur.setNom(dto.getNom());
        utilisateur.setEmail(dto.getEmail());
        // Le rôle peut être dérivé automatiquement selon la classe
        return utilisateur;
    }
}
