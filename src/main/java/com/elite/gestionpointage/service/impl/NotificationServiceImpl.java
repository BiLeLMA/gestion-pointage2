package com.elite.gestionpointage.service.impl;

import com.elite.gestionpointage.model.dto.NotificationDTO;
import com.elite.gestionpointage.model.mappers.NotificationMapper;
import com.elite.gestionpointage.model.entities.Notification;
import com.elite.gestionpointage.repository.NotificationRepository;
import com.elite.gestionpointage.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    @Autowired
    private NotificationMapper notificationMapper;

    @Override
    public List<NotificationDTO> findAll() {
        return notificationRepository.findAll()
                .stream()
                .map(notificationMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public NotificationDTO findById(Long id) {
        return notificationRepository.findById(id)
                .map(notificationMapper::toDTO)
                .orElse(null);
    }

    @Override
    public NotificationDTO save(NotificationDTO notificationDTO) {
        Notification notification = notificationMapper.toEntity(notificationDTO);
        return notificationMapper.toDTO(notificationRepository.save(notification));
    }

    @Override
    public void deleteById(Long id) {
        notificationRepository.deleteById(id);
    }

    @Override
    public List<NotificationDTO> findByEtat(Boolean etat) {
        return notificationRepository.findByEtat(etat)
                .stream()
                .map(notificationMapper::toDTO)
                .collect(Collectors.toList());
    }
}
