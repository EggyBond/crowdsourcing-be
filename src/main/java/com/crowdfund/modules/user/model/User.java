package com.yourapp.modules.user.model;


import com.yourapp.core.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "users")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class User extends BaseEntity {
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private String role; // PATIENT, DOCTOR, DONOR, ORG, ADMIN
    private Boolean verified = false;


    // optional relations
    private Long hospitalId; // FK reference to hospital table
}