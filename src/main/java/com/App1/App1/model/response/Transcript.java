package com.App1.App1.model.response;

import com.App1.App1.model.entity.Quiz;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@NoArgsConstructor
public class Transcript extends Quiz{
    private String fresherName;
    private String id;
    private Double score1;
    private Double score2;
    private Double score3;
    private Double average;

    public Transcript(String fresherName, String id, Double score1, Double score2, Double score3, Double average) {
        this.fresherName = fresherName;
        this.id = id;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.average = (double)Math.round(average * 100) / 100;
    }
    public Transcript(Quiz quiz) {
        this.fresherName = quiz.getFresher().getFresherName();
        this.id = quiz.getSubject().getLp();
        this.score1 = quiz.getScore1();
        this.score2 = quiz.getScore2();
        this.score3 = quiz.getScore3();
        this.average = (double)Math.round(((score1+score2+score3)/3) * 100) / 100;
    }
}