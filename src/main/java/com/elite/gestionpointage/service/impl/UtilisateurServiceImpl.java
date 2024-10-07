package com.elite.gestionpointage.service.impl;

import com.elite.gestionpointage.model.dto.UtilisateurDTO;
import com.elite.gestionpointage.model.mappers.UtilisateurMapper;
import com.elite.gestionpointage.model.entities.Utilisateur;
import com.elite.gestionpointage.repository.UtilisateurRepository;
import com.elite.gestionpointage.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private UtilisateurMapper utilisateurMapper;

    @Override
    public List<UtilisateurDTO> findAll() {
        // Récupère tous les utilisateurs et les convertit en DTOs avec le rôle défini
        return utilisateurRepository.findAll()
                .stream()
                .map(utilisateurMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UtilisateurDTO findById(Long id) {
        // Trouve un utilisateur par ID et le convertit en DTO
        return utilisateurRepository.findById(id)
                .map(utilisateurMapper::toDTO)
                .orElse(null);
    }

    @Override
    public UtilisateurDTO save(UtilisateurDTO utilisateurDTO) {
        // Convertit le DTO en entité, sauvegarde l'utilisateur et retourne le DTO mis à jour
        Utilisateur utilisateur = utilisateurMapper.toEntity(utilisateurDTO, new Utilisateur());
        return utilisateurMapper.toDTO(utilisateurRepository.save(utilisateur));
    }

    @Override
    public void deleteById(Long id) {
        // Supprime l'utilisateur par son ID
        utilisateurRepository.deleteById(id);
    }
}
