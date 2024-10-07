package com.elite.gestionpointage.service.impl;

import com.elite.gestionpointage.model.dto.CongeDTO;
import com.elite.gestionpointage.model.mappers.CongeMapper;
import com.elite.gestionpointage.model.entities.Conge;
import com.elite.gestionpointage.repository.CongeRepository;
import com.elite.gestionpointage.service.CongeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CongeServiceImpl implements CongeService {

    @Autowired
    private CongeRepository congeRepository;

    @Autowired
    private CongeMapper congeMapper;

    @Override
    public List<CongeDTO> findAll() {
        return congeRepository.findAll()
                .stream()
                .map(congeMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CongeDTO findById(Long id) {
        return congeRepository.findById(id)
                .map(congeMapper::toDTO)
                .orElse(null);
    }

    @Override
    public CongeDTO save(CongeDTO congeDTO) {
        Conge conge = congeMapper.toEntity(congeDTO);
        return congeMapper.toDTO(congeRepository.save(conge));
    }

    @Override
    public void deleteById(Long id) {
        congeRepository.deleteById(id);
    }
}
