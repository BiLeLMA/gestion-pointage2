package com.elite.gestionpointage.model.mappers;

import com.elite.gestionpointage.model.dto.CongeDTO;
import com.elite.gestionpointage.model.entities.Conge;
import org.springframework.stereotype.Component;

@Component
public class CongeMapper {

    public CongeDTO toDTO(Conge conge) {
        CongeDTO dto = new CongeDTO();
        dto.setId(conge.getId());
        dto.setDateDebut(conge.getDateDebut());
        dto.setDateFin(conge.getDateFin());
        dto.setMotif(conge.getMotif());
        dto.setStatut(conge.getStatut());
        dto.setEmployeId(conge.getEmploye().getId());
        return dto;
    }

    public Conge toEntity(CongeDTO dto) {
        Conge conge = new Conge();
        conge.setId(dto.getId());
        conge.setDateDebut(dto.getDateDebut());
        conge.setDateFin(dto.getDateFin());
        conge.setMotif(dto.getMotif());
        conge.setStatut(dto.getStatut());
        return conge;
    }
}