package com.elite.gestionpointage.service;

import com.elite.gestionpointage.model.dto.CongeDTO;
import java.util.List;

public interface CongeService {
	
    List<CongeDTO> findAll();
    CongeDTO findById(Long id);
    CongeDTO save(CongeDTO congeDTO);
    
    void deleteById(Long id);
}
