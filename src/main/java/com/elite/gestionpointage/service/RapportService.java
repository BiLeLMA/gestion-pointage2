package com.elite.gestionpointage.service;

import com.elite.gestionpointage.model.dto.RapportDTO;
import java.util.List;

public interface RapportService {
    List<RapportDTO> findAll();
    RapportDTO findById(Long id);
    RapportDTO save(RapportDTO rapportDTO);
    
    void deleteById(Long id);
}
