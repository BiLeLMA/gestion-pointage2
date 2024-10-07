package com.elite.gestionpointage.service.impl;

import com.elite.gestionpointage.model.dto.EmployeDTO;
import com.elite.gestionpointage.model.mappers.EmployeMapper;
import com.elite.gestionpointage.model.entities.Employe;
import com.elite.gestionpointage.repository.EmployeRepository;
import com.elite.gestionpointage.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeServiceImpl implements EmployeService {

    @Autowired
    private EmployeRepository employeRepository;

    @Autowired
    private EmployeMapper employeMapper;

    @Override
    public List<EmployeDTO> findAll() {
        return employeRepository.findAll()
                .stream()
                .map(employeMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeDTO findById(Long id) {
        return employeRepository.findById(id)
                .map(employeMapper::toDTO)
                .orElse(null);
    }

    @Override
    public EmployeDTO save(EmployeDTO employeDTO) {
        Employe employe = employeMapper.toEntity(employeDTO);
        return employeMapper.toDTO(employeRepository.save(employe));
    }

    @Override
    public void deleteById(Long id) {
        employeRepository.deleteById(id);
    }
}
