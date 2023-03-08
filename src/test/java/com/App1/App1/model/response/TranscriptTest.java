package com.App1.App1.model.response;

import com.App1.App1.model.entity.Fresher;
import com.App1.App1.model.entity.Quiz;
import com.App1.App1.model.entity.Subject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class TranscriptTest {
    @Test
    void set_getFresherName() {
        Transcript transcript = new Transcript();
        transcript.setFresherName("junit Nguyen");
        assertEquals("junit Nguyen",transcript.getFresherName());
    }

    @Test
    void set_getLp() {
        Transcript transcript = new Transcript();
        transcript.setId("JAVA");
        assertEquals("JAVA",transcript.getId());
    }

    @Test
    void set_getScore01() {
        Transcript transcript = new Transcript();
        transcript.setScore1(8.5);
        assertEquals(8.5,transcript.getScore1());
    }

    @Test
    void set_getScore02() {
        Transcript transcript = new Transcript();
        transcript.setScore2(9.0);
        assertEquals(9,transcript.getScore2());
    }

    @Test
    void set_getScore03() {
        Transcript transcript = new Transcript();
        transcript.setScore3(8.0);
        assertEquals(8,transcript.getScore3());
    }

    @Test
    void set_getAverage() {
        Transcript transcript = new Transcript();
        transcript.setAverage(8.5);
        assertEquals(8.5,transcript.getAverage());
    }

    @Test
    void testTranscriptConstructor() {
        Transcript transcript = new Transcript("junit Nguyen","PYTHON",
                6d,5d,5.5,7.5);
        assertEquals("junit Nguyen",transcript.getFresherName());
        assertEquals("PYTHON",transcript.getId());
        assertEquals(6d,transcript.getScore1());
        assertEquals(5d,transcript.getScore2());
        assertEquals(5.5,transcript.getScore3());
        assertEquals(7.5,transcript.getAverage());
    }
    @Test
    void testTranscriptConstructorExtendsScore(){
        Fresher fresher = new Fresher("","Kevin","","","");
        Subject subject = new Subject("","JAVA",null);
        Quiz quiz = new Quiz(1L,4d,5d,6d,fresher,subject);
        Transcript transcript = new Transcript(quiz);
        assertEquals(4d,transcript.getScore1());
        assertEquals(5d,transcript.getScore2());
        assertEquals(6d,transcript.getScore3());
        assertEquals("Kevin",transcript.getFresherName());
        assertEquals("JAVA",transcript.getId());
    }
}
