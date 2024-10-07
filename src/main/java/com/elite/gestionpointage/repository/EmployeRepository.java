package com.elite.gestionpointage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.elite.gestionpointage.model.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
    
}
