package com.App1.App1.service;

import com.App1.App1.model.entity.Quiz;

public interface LinkService {
    String addFresherToCenter(String centerId, String fresherId);

    Quiz addScore(Quiz score, String fresherId, String subjectId);
}
