package com.elite.gestionpointage.controller;

import com.elite.gestionpointage.model.dto.CongeDTO;
import com.elite.gestionpointage.service.CongeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/conges")
public class CongeController {

    @Autowired
    private CongeService congeService;

    @GetMapping
    public List<CongeDTO> getAllConges() {
        return congeService.findAll();
    }

    @GetMapping("/{id}")
    public CongeDTO getCongeById(@PathVariable Long id) {
        return congeService.findById(id);
    }

    @PostMapping
    public CongeDTO createConge(@RequestBody CongeDTO congeDTO) {
        return congeService.save(congeDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteConge(@PathVariable Long id) {
        congeService.deleteById(id);
    }
}
