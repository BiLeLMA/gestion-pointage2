package com.elite.gestionpointage.service;

import com.elite.gestionpointage.model.dto.PointageDTO;
import java.util.List;

public interface PointageService {
	
    List<PointageDTO> findAll();
    PointageDTO findById(Long id);
    List<PointageDTO> findByEmployeId(Long employeId);
    PointageDTO save(PointageDTO pointageDTO);
    
    void deleteById(Long id);
}
