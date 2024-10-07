package com.elite.gestionpointage.model.mappers;

import com.elite.gestionpointage.model.dto.PointageDTO;
import com.elite.gestionpointage.model.entities.Pointage;
import org.springframework.stereotype.Component;

@Component
public class PointageMapper {

    public PointageDTO toDTO(Pointage pointage) {
        PointageDTO dto = new PointageDTO();
        dto.setId(pointage.getId());
        dto.setDate(pointage.getDate());
        dto.setHeureArrivee(pointage.getHeureArrivee());
        dto.setHeureDepart(pointage.getHeureDepart());
        dto.setEmployeId(pointage.getEmploye().getId());
        return dto;
    }

    public Pointage toEntity(PointageDTO dto) {
        Pointage pointage = new Pointage();
        pointage.setId(dto.getId());
        pointage.setDate(dto.getDate());
        pointage.setHeureArrivee(dto.getHeureArrivee());
        pointage.setHeureDepart(dto.getHeureDepart());
        return pointage;
    }
}