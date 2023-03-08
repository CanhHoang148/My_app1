package com.App1.App1.service;

import com.App1.App1.model.entity.Fresher;
import com.App1.App1.model.response.Transcript;

import java.util.List;

public interface FresherService {
    List<Fresher> getAllFresher();

    List<Transcript> getTranscript();

    Fresher addFresher(Fresher fresher);

    Fresher editFresher(Fresher fresher);

    void deleteFresher(String id);

    List<Fresher> searchFresherWithFresherName(String fresherName);

    Fresher searchFresherWithFresherEmail(String fresherEmail);

    List<Fresher> searchFresherWithLP(String lp);
}