package com.elite.gestionpointage.service;

import com.elite.gestionpointage.model.dto.EmployeDTO;
import java.util.List;

public interface EmployeService {
	
    List<EmployeDTO> findAll();
    EmployeDTO findById(Long id);
    EmployeDTO save(EmployeDTO employeDTO);
    
    void deleteById(Long id);
}
