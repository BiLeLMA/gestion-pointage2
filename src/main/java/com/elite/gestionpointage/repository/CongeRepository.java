package com.elite.gestionpointage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.elite.gestionpointage.model.entities.Conge;
import java.util.List;

public interface CongeRepository extends JpaRepository<Conge, Long> {
    List<Conge> findByEmployeId(Long employeId);  
}
