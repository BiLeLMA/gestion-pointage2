package com.elite.gestionpointage.controller;

import com.elite.gestionpointage.model.dto.ResponsableRHDTO;
import com.elite.gestionpointage.service.ResponsableRHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/responsables")
public class ResponsableRHController {

    @Autowired
    private ResponsableRHService responsableRHService;

    @GetMapping
    public List<ResponsableRHDTO> getAllResponsables() {
        return responsableRHService.findAll();
    }

    @GetMapping("/{id}")
    public ResponsableRHDTO getResponsableById(@PathVariable Long id) {
        return responsableRHService.findById(id);
    }

    @PostMapping
    public ResponsableRHDTO createResponsable(@RequestBody ResponsableRHDTO responsableRHDTO) {
        return responsableRHService.save(responsableRHDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteResponsable(@PathVariable Long id) {
        responsableRHService.deleteById(id);
    }
}
