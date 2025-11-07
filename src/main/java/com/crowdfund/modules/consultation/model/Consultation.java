package com.yourapp.modules.consultation.model;


import com.yourapp.core.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;


@Entity
@Table(name = "consultations")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Consultation extends BaseEntity {
    private Long patientId;
    private Long doctorId;
    private String transcriptUrl; // S3 link
    private Long analysisResultId;
    private Instant startedAt;
}