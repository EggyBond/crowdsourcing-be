package com.yourapp.core.model;


import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;


@MappedSuperclass
@Getter @Setter
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Instant createdAt = Instant.now();
    private Instant updatedAt;


    @PreUpdate
    public void preUpdate() { this.updatedAt = Instant.now(); }
}