package com.elite.gestionpointage.model.mappers;

import com.elite.gestionpointage.model.dto.EmployeDTO;
import com.elite.gestionpointage.model.entities.Employe;
import org.springframework.stereotype.Component;

@Component
public class EmployeMapper {

    public EmployeDTO toDTO(Employe employe) {
        EmployeDTO dto = new EmployeDTO();
        dto.setId(employe.getId());
        dto.setNom(employe.getNom());
        dto.setEmail(employe.getEmail());
        dto.setRole(employe.getRole()); 
        dto.setDepartement(employe.getDepartement());
        dto.setPoste(employe.getPoste());
        return dto;
    }

    public Employe toEntity(EmployeDTO dto) {
        Employe employe = new Employe();
        employe.setId(dto.getId());
        employe.setNom(dto.getNom());
        employe.setEmail(dto.getEmail());
        employe.setDepartement(dto.getDepartement());
        employe.setPoste(dto.getPoste());
        return employe;
    }
}
