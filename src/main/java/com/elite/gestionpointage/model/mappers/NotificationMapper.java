package com.elite.gestionpointage.model.mappers;

import com.elite.gestionpointage.model.dto.NotificationDTO;
import com.elite.gestionpointage.model.entities.Notification;
import org.springframework.stereotype.Component;

@Component
public class NotificationMapper {

    public NotificationDTO toDTO(Notification notification) {
        NotificationDTO dto = new NotificationDTO();
        dto.setId(notification.getId());
        dto.setTypeNotification(notification.getTypeNotification());
        dto.setDestinataire(notification.getDestinataire());
        dto.setDateEnvoi(notification.getDateEnvoi());
        dto.setEtat(notification.getEtat());
        return dto;
    }

    public Notification toEntity(NotificationDTO dto) {
        Notification notification = new Notification();
        notification.setId(dto.getId());
        notification.setTypeNotification(dto.getTypeNotification());
        notification.setDestinataire(dto.getDestinataire());
        notification.setDateEnvoi(dto.getDateEnvoi());
        notification.setEtat(dto.getEtat());
        return notification;
    }
}
