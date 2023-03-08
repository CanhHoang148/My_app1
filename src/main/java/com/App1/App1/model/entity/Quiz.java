package com.App1.App1.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"fresher_id", "subject_id"})
})
public class Quiz {
    @Id
    @Column(name = "Quiz_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long quizId;
    @Column
    private Double score1;
    @Column
    private Double score2;
    @Column
    private Double score3;

    @ManyToOne()
    @MapsId("fresherId")
    @JoinColumn(name = "fresher_id")
    @JsonIgnore
    Fresher fresher;

    @ManyToOne()
    @MapsId("subjectId")
    @JoinColumn(name = "subject_id")
    @JsonIgnore
    Subject subject;
}