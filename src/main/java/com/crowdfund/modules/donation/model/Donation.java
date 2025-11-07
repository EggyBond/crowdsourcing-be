package com.yourapp.modules.donation.model;


import com.yourapp.core.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "donations")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Donation extends BaseEntity {
    private Long donorId;
    private Long postId;
    private Long amount;
    private String status; // PENDING, SUCCESS, FAILED
    private Long paymentId; // FK to Payment
}