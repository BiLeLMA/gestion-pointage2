package com.elite.gestionpointage.repository;

import com.elite.gestionpointage.model.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
   
    List<Notification> findByEtat(Boolean etat);
}
