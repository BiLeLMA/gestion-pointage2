package com.elite.gestionpointage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.elite.gestionpointage.model.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Utilisateur findByEmail(String email);  
}
