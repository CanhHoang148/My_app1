package com.App1.App1.model.dto;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class QuizDTOTest {
    @Test
    void set_getScore01() {
        QuizDTO quizDTO = new QuizDTO();
        quizDTO.setScore1(7.5);
        assertEquals(7.5,quizDTO.getScore1());
    }

    @Test
    void set_getScore02() {
        QuizDTO quizDTO = new QuizDTO();
        quizDTO.setScore2(5.0);
        assertEquals(5.0,quizDTO.getScore2());
    }

    @Test
    void set_getScore03() {
        QuizDTO quizDTO = new QuizDTO();
        quizDTO.setScore3(6.0);
        assertEquals(6.0,quizDTO.getScore3());
    }

    @Test
    void set_getFresherId() {
        QuizDTO quizDTO = new QuizDTO();
        quizDTO.setFresherId("123");
        assertEquals("123",quizDTO.getFresherId());
    }

    @Test
    void set_getSubjectId() {
        QuizDTO quizDTO = new QuizDTO();
        quizDTO.setSubjectId("quiz1");
        assertEquals("quiz1",quizDTO.getSubjectId());
    }

    @Test
    void testScoreDTOConstructor() {
        QuizDTO quizDTO = new QuizDTO(5.0,6.0,7.0,"123","quiz2");
        assertEquals(5.0,quizDTO.getScore1());
        assertEquals(6.0,quizDTO.getScore2());
        assertEquals(7.0,quizDTO.getScore3());
        assertEquals("123",quizDTO.getFresherId());
        assertEquals("quiz2",quizDTO.getSubjectId());
    }
}
