package com.elite.gestionpointage.controller;

import com.elite.gestionpointage.model.dto.EmployeDTO;
import com.elite.gestionpointage.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employes")
public class EmployeController {

    @Autowired
    private EmployeService employeService;

    @GetMapping
    public List<EmployeDTO> getAllEmployes() {
        return employeService.findAll();
    }

    @GetMapping("/{id}")
    public EmployeDTO getEmployeById(@PathVariable Long id) {
        return employeService.findById(id);
    }

    @PostMapping
    public EmployeDTO createEmploye(@RequestBody EmployeDTO employeDTO) {
        return employeService.save(employeDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        employeService.deleteById(id);
    }
}
