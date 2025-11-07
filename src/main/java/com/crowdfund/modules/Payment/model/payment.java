package com.yourapp.modules.payment.model;


import com.yourapp.core.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;


@Entity
@Table(name = "payments")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Payment extends BaseEntity {
private String externalId; // provider order id
private Long amount;
private String status; // PENDING, SETTLED, FAILED
private String provider; // MIDTRANS, STRIPE, etc.
private Instant createdAt = Instant.now();
}