package com.elite.gestionpointage.service.impl;

import com.elite.gestionpointage.model.dto.PointageDTO;
import com.elite.gestionpointage.model.mappers.PointageMapper;
import com.elite.gestionpointage.model.entities.Pointage;
import com.elite.gestionpointage.repository.PointageRepository;
import com.elite.gestionpointage.service.PointageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PointageServiceImpl implements PointageService {

    @Autowired
    private PointageRepository pointageRepository;

    @Autowired
    private PointageMapper pointageMapper;

    @Override
    public List<PointageDTO> findAll() {
        return pointageRepository.findAll()
                .stream()
                .map(pointageMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PointageDTO findById(Long id) {
        return pointageRepository.findById(id)
                .map(pointageMapper::toDTO)
                .orElse(null);
    }

    @Override
    public List<PointageDTO> findByEmployeId(Long employeId) {
        return pointageRepository.findByEmployeId(employeId)
                .stream()
                .map(pointageMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PointageDTO save(PointageDTO pointageDTO) {
        Pointage pointage = pointageMapper.toEntity(pointageDTO);
        return pointageMapper.toDTO(pointageRepository.save(pointage));
    }

    @Override
    public void deleteById(Long id) {
        pointageRepository.deleteById(id);
    }
}
