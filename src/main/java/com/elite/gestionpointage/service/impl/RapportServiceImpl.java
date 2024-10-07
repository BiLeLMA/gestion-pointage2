package com.elite.gestionpointage.service.impl;

import com.elite.gestionpointage.model.dto.RapportDTO;
import com.elite.gestionpointage.model.mappers.RapportMapper;
import com.elite.gestionpointage.model.entities.Rapport;
import com.elite.gestionpointage.repository.RapportRepository;
import com.elite.gestionpointage.service.RapportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RapportServiceImpl implements RapportService {

    @Autowired
    private RapportRepository rapportRepository;

    @Autowired
    private RapportMapper rapportMapper;

    @Override
    public List<RapportDTO> findAll() {
        return rapportRepository.findAll()
                .stream()
                .map(rapportMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public RapportDTO findById(Long id) {
        return rapportRepository.findById(id)
                .map(rapportMapper::toDTO)
                .orElse(null);
    }

    @Override
    public RapportDTO save(RapportDTO rapportDTO) {
        Rapport rapport = rapportMapper.toEntity(rapportDTO);
        return rapportMapper.toDTO(rapportRepository.save(rapport));
    }

    @Override
    public void deleteById(Long id) {
        rapportRepository.deleteById(id);
    }
}
