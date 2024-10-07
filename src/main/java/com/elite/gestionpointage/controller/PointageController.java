package com.elite.gestionpointage.controller;

import com.elite.gestionpointage.model.dto.PointageDTO;
import com.elite.gestionpointage.service.PointageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pointages")
public class PointageController {

    @Autowired
    private PointageService pointageService;

    @GetMapping
    public List<PointageDTO> getAllPointages() {
        return pointageService.findAll();
    }

    @GetMapping("/{id}")
    public PointageDTO getPointageById(@PathVariable Long id) {
        return pointageService.findById(id);
    }

    @GetMapping("/employe/{employeId}")
    public List<PointageDTO> getPointagesByEmployeId(@PathVariable Long employeId) {
        return pointageService.findByEmployeId(employeId);
    }

    @PostMapping
    public PointageDTO createPointage(@RequestBody PointageDTO pointageDTO) {
        return pointageService.save(pointageDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePointage(@PathVariable Long id) {
        pointageService.deleteById(id);
    }
}
