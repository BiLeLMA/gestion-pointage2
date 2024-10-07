package com.elite.gestionpointage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.elite.gestionpointage.model.entities.Rapport;

public interface RapportRepository extends JpaRepository<Rapport, Long> {
   
}
