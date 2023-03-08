package com.App1.App1.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class QuizDTO {
    private Double score1;
    private Double score2;
    private Double score3;
    private String fresherId;
    private String subjectId;
}
