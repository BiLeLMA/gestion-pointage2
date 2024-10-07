package com.elite.gestionpointage.controller;

import com.elite.gestionpointage.model.dto.UtilisateurDTO;
import com.elite.gestionpointage.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping
    public List<UtilisateurDTO> getAllUtilisateurs() {
        return utilisateurService.findAll();
    }

    @GetMapping("/{id}")
    public UtilisateurDTO getUtilisateurById(@PathVariable Long id) {
        return utilisateurService.findById(id);
    }

    @PostMapping
    public UtilisateurDTO createUtilisateur(@RequestBody UtilisateurDTO utilisateurDTO) {
        return utilisateurService.save(utilisateurDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteUtilisateur(@PathVariable Long id) {
        utilisateurService.deleteById(id);
    }
}
