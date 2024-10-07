package com.elite.gestionpointage.model.mappers;

import com.elite.gestionpointage.model.dto.ResponsableRHDTO;
import com.elite.gestionpointage.model.entities.ResponsableRH;
import org.springframework.stereotype.Component;

@Component
public class ResponsableRHMapper {

    public ResponsableRHDTO toDTO(ResponsableRH responsableRH) {
        ResponsableRHDTO dto = new ResponsableRHDTO();
        dto.setId(responsableRH.getId());
        dto.setNom(responsableRH.getNom());
        dto.setEmail(responsableRH.getEmail());
        dto.setRole(responsableRH.getRole()); // Copie du champ role
        dto.setPrivileges(responsableRH.getPrivileges());
        return dto;
    }

    public ResponsableRH toEntity(ResponsableRHDTO dto) {
        ResponsableRH responsableRH = new ResponsableRH();
        responsableRH.setId(dto.getId());
        responsableRH.setNom(dto.getNom());
        responsableRH.setEmail(dto.getEmail());
        responsableRH.setPrivileges(dto.getPrivileges());
      
        return responsableRH;
    }
}
