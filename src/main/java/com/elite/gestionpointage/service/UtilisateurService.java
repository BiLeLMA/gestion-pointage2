package com.elite.gestionpointage.service;

import com.elite.gestionpointage.model.dto.UtilisateurDTO;
import java.util.List;

public interface UtilisateurService {
	
    List<UtilisateurDTO> findAll();
    
    UtilisateurDTO findById(Long id);
    UtilisateurDTO save(UtilisateurDTO utilisateurDTO);
    
    void deleteById(Long id);
}
