package com.yourapp.modules.post.model;


import com.yourapp.core.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "posts")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Post extends BaseEntity {
    private Long patientId;
    private String title;
    @Column(columnDefinition = "text")
    private String description;
    private Long targetAmount;
    private Long collectedAmount = 0L;
    private String status; // OPEN, FUNDED, CLOSED
}