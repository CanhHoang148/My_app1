package com.App1.App1.repositories;

import com.App1.App1.model.entity.Fresher;
import com.App1.App1.model.response.Transcript;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FresherRepository extends JpaRepository<Fresher,String> {
    @Query("SELECT new com.App1.App1.model.response.Transcript" +
            "(f.fresherName, sb.id, sc.score1, sc.score2, sc.score3, (sc.score1+sc.score2+sc.score3)/3) " +
            "From Fresher f INNER JOIN Quiz sc ON sc.fresher.fresherId = f.fresherId INNER JOIN " +
            "Subject sb ON sb.subjectId = sc.subject.subjectId")
    public List<Transcript> getTranscript();
    @Query("SELECT new com.App1.App1.model.entity.Fresher" +
            "(f.fresherId ,f.fresherName, f.fresherAddress, f.fresherPhone, f.fresherEmail) " +
            "From Fresher f INNER JOIN Quiz sc ON sc.fresher.fresherId = f.fresherId INNER JOIN " +
            "Subject sb ON sb.subjectId = sc.subject.subjectId " +
            "WHERE sb.lp = :lp")
    public List<Fresher> findByFresherWithLP(String lp);
    public List<Fresher> findByFresherName(String fresherId);
    public Optional<Fresher> findByFresherEmail(String fresherEmail);
}

