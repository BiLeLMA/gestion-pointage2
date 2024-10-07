package com.elite.gestionpointage.model.mappers;

import com.elite.gestionpointage.model.dto.RapportDTO;
import com.elite.gestionpointage.model.entities.Rapport;
import org.springframework.stereotype.Component;

@Component
public class RapportMapper {

    public RapportDTO toDTO(Rapport rapport) {
        RapportDTO dto = new RapportDTO();
        dto.setId(rapport.getId());
        dto.setTypeRapport(rapport.getTypeRapport());
        dto.setPeriode(rapport.getPeriode());
        dto.setContenu(rapport.getContenu());
        return dto;
    }

    public Rapport toEntity(RapportDTO dto) {
        Rapport rapport = new Rapport();
        rapport.setId(dto.getId());
        rapport.setTypeRapport(dto.getTypeRapport());
        rapport.setPeriode(dto.getPeriode());
        rapport.setContenu(dto.getContenu());
        return rapport;
    }
}