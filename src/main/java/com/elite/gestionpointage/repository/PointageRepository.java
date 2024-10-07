package com.elite.gestionpointage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.elite.gestionpointage.model.entities.Pointage;


public interface PointageRepository extends JpaRepository<Pointage, Long> {
	
    List<Pointage> findByEmployeId(Long employeId);
}
