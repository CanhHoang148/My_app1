package com.App1.App1.model.dto.mapper;
import static org.junit.jupiter.api.Assertions.*;

import com.App1.App1.model.dto.QuizDTO;
import com.App1.App1.model.entity.Quiz;
import org.junit.jupiter.api.Test;

class QuizMapperTest {
    @Test
    void toScore() {
        QuizDTO quizDTO = new QuizDTO(5.0,6.0,7.0,"","");
        QuizMapper quizMapper = new QuizMapper();
        Quiz quiz = quizMapper.toquiz(quizDTO);
        assertEquals(5.0,quiz.getScore1());
        assertEquals(6.0,quiz.getScore2());
        assertEquals(7.0,quiz.getScore3());
    }
}
