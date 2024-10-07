package com.elite.gestionpointage.controller;

import com.elite.gestionpointage.model.dto.NotificationDTO;
import com.elite.gestionpointage.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    // Récupérer toutes les notifications
    @GetMapping
    public List<NotificationDTO> getAllNotifications() {
        return notificationService.findAll();
    }

    // Récupérer une notification par ID
    @GetMapping("/{id}")
    public NotificationDTO getNotificationById(@PathVariable Long id) {
        return notificationService.findById(id);
    }

    // Récupérer les notifications par état
    @GetMapping("/etat/{etat}")
    public List<NotificationDTO> getNotificationsByEtat(@PathVariable Boolean etat) {
        return notificationService.findByEtat(etat);
    }

    // Créer une nouvelle notification
    @PostMapping
    public NotificationDTO createNotification(@RequestBody NotificationDTO notificationDTO) {
        return notificationService.save(notificationDTO);
    }

    // Supprimer une notification par ID
    @DeleteMapping("/{id}")
    public void deleteNotification(@PathVariable Long id) {
        notificationService.deleteById(id);
    }
}
