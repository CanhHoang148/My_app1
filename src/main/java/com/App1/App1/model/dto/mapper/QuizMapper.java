package com.App1.App1.model.dto.mapper;

import com.App1.App1.model.dto.QuizDTO;
import com.App1.App1.model.entity.Quiz;

public class QuizMapper {
    public Quiz toquiz(QuizDTO quizDTO){
        Quiz quiz = new Quiz();
        quiz.setScore1(quizDTO.getScore1());
        quiz.setScore2(quizDTO.getScore2());
        quiz.setScore3(quizDTO.getScore3());
        return quiz;
    }
}
