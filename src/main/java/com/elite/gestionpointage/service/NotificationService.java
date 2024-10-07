package com.elite.gestionpointage.service;

import com.elite.gestionpointage.model.dto.NotificationDTO;
import java.util.List;

public interface NotificationService {
	
    List<NotificationDTO> findAll();
    NotificationDTO findById(Long id);
    NotificationDTO save(NotificationDTO notificationDTO);
    void deleteById(Long id);
    List<NotificationDTO> findByEtat(Boolean etat);
    
}
