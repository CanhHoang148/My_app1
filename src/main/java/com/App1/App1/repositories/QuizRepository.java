package com.App1.App1.repositories;

import com.App1.App1.model.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    @Query("SELECT new com.App1.App1.model.entity.Quiz" +
            "(sc.quizId, sc.score1, sc.score2, sc.score3, sc.fresher, sc.subject) " +
            "FROM Quiz sc WHERE sc.fresher.fresherId = :fresherId AND sc.subject.subjectId = :subjectId")
    public Optional<Quiz> getScore(String fresherId, String subjectId);
}