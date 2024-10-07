package com.elite.gestionpointage.service;

import com.elite.gestionpointage.model.dto.ResponsableRHDTO;
import java.util.List;

public interface ResponsableRHService {
	
    List<ResponsableRHDTO> findAll();
    ResponsableRHDTO findById(Long id);
    ResponsableRHDTO save(ResponsableRHDTO responsableRHDTO);
    
    void deleteById(Long id);
}
