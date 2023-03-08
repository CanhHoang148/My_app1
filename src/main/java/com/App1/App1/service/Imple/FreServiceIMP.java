package com.App1.App1.service.Imple;

import com.App1.App1.exception.NotFoundException;
import com.App1.App1.exception.NotImplementedException;
import com.App1.App1.model.entity.Fresher;
import com.App1.App1.model.response.ErrorMessages;
import com.App1.App1.model.response.Transcript;
import com.App1.App1.repositories.FresherRepository;
import com.App1.App1.service.FresherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FreServiceIMP implements FresherService {
    @Autowired
    FresherRepository fresherRepository;

    @Override
    public List<Fresher> getAllFresher() {
        return fresherRepository.findAll();
    }
    @Override
    public List<Transcript> getTranscript() {
        return fresherRepository.getTranscript();
    }
    @Override
    public Fresher addFresher(Fresher fresher) {
        Optional<Fresher> fresherOptional = fresherRepository.findById(fresher.getFresherId());
        if (fresherOptional.isPresent()) {
            throw new NotImplementedException(ErrorMessages.FRESHER_EXISTS_ERROR);
        }
        return fresherRepository.save(fresher);
    }
    @Override
    public Fresher editFresher(Fresher fresher) {
        return fresherRepository.findById(fresher.getFresherId())
                .map(f -> {
                    f.setFresherName(fresher.getFresherName());
                    f.setFresherAddress(fresher.getFresherAddress());
                    f.setFresherPhone(fresher.getFresherPhone());
                    f.setFresherEmail(fresher.getFresherEmail());
                    return fresherRepository.save(f);
                }).orElseGet(()-> fresherRepository.save(fresher));
    }
    @Override
    public void deleteFresher(String id) {
        boolean exists = fresherRepository.existsById(id);
        if(!exists) {
            throw new NotFoundException(ErrorMessages.FRESHER_NULL_ERROR);
        }
        fresherRepository.deleteById(id);
    }
    @Override
    public List<Fresher> searchFresherWithFresherName(String fresherName) {
        List<Fresher> freshers = fresherRepository.findByFresherName(fresherName);
        if(freshers.isEmpty()) {
            throw new NotFoundException(ErrorMessages.FRESHER_NULL_ERROR);
        }
        return freshers;
    }
    @Override
    public Fresher searchFresherWithFresherEmail(String fresherEmail) {
        Optional<Fresher> getFresher = fresherRepository.findByFresherEmail(fresherEmail);
        if(getFresher.isPresent()){
            return getFresher.get();
        }
        throw new NotFoundException(ErrorMessages.FRESHER_NULL_ERROR);
    }
    @Override
    public List<Fresher> searchFresherWithLP(String lp){
        List<Fresher> fresherList = fresherRepository.findByFresherWithLP(lp);
        if(fresherList.isEmpty()){
            throw new NotFoundException(ErrorMessages.FRESHER_NULL_ERROR);
        }
        return fresherList;
    }
}