package com.yourapp.modules.ml.model;


import com.yourapp.core.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;


@Entity
@Table(name = "analysis_results")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class AnalysisResult extends BaseEntity {
    private Long consultationId;
    @Column(columnDefinition = "text")
    private String diagnosis;
    @Column(columnDefinition = "text")
    private String recommendation;
    private Double riskScore;
    private String mlReferenceId;
    private Instant analyzedAt = Instant.now();
}