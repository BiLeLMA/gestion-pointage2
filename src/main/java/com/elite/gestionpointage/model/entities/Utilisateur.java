package com.elite.gestionpointage.model.entities;

import com.elite.gestionpointage.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role", discriminatorType = DiscriminatorType.STRING)

public class Utilisateur extends BaseEntity {

    private String nom;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(insertable = false, updatable = false)
    private String role;
}