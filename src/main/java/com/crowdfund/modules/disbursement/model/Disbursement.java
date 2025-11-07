package com.yourapp.modules.disbursement.model;


import com.yourapp.core.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;


@Entity
@Table(name = "disbursements")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Disbursement extends BaseEntity {
    private Long postId;
    private Long hospitalId;
    private Long totalAmount;
    private Instant transferDate;
    private String status; // INITIATED, PROCESSING, COMPLETED, FAILED
    private String paymentReference;
}