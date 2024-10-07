package com.elite.gestionpointage.service.impl;

import com.elite.gestionpointage.model.dto.ResponsableRHDTO;
import com.elite.gestionpointage.model.mappers.ResponsableRHMapper;
import com.elite.gestionpointage.model.entities.ResponsableRH;
import com.elite.gestionpointage.repository.ResponsableRHRepository;
import com.elite.gestionpointage.service.ResponsableRHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResponsableRHServiceImpl implements ResponsableRHService {

    @Autowired
    private ResponsableRHRepository responsableRHRepository;

    @Autowired
    private ResponsableRHMapper responsableRHMapper;

    @Override
    public List<ResponsableRHDTO> findAll() {
        return responsableRHRepository.findAll()
                .stream()
                .map(responsableRHMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ResponsableRHDTO findById(Long id) {
        return responsableRHRepository.findById(id)
                .map(responsableRHMapper::toDTO)
                .orElse(null);
    }

    @Override
    public ResponsableRHDTO save(ResponsableRHDTO responsableRHDTO) {
        ResponsableRH responsableRH = responsableRHMapper.toEntity(responsableRHDTO);
        return responsableRHMapper.toDTO(responsableRHRepository.save(responsableRH));
    }

    @Override
    public void deleteById(Long id) {
        responsableRHRepository.deleteById(id);
    }
}
