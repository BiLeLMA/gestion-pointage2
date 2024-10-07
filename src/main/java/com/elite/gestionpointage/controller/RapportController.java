package com.elite.gestionpointage.controller;

import com.elite.gestionpointage.model.dto.RapportDTO;
import com.elite.gestionpointage.service.RapportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rapports")
public class RapportController {

    @Autowired
    private RapportService rapportService;

    @GetMapping
    public List<RapportDTO> getAllRapports() {
        return rapportService.findAll();
    }

    @GetMapping("/{id}")
    public RapportDTO getRapportById(@PathVariable Long id) {
        return rapportService.findById(id);
    }

    @PostMapping
    public RapportDTO createRapport(@RequestBody RapportDTO rapportDTO) {
        return rapportService.save(rapportDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteRapport(@PathVariable Long id) {
        rapportService.deleteById(id);
    }
}
