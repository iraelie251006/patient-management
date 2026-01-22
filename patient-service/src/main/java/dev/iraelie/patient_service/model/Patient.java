package dev.iraelie.patient_service.model;

import jakarta.persistence.Entity;

@Entity
public class Patient {
    private Long id;
    private String name;
}
