package com.ajay.Examinerdesk.service;

import com.ajay.Examinerdesk.model.Examiner;
import com.ajay.Examinerdesk.repository.ExaminerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExaminerService {

    @Autowired
    private ExaminerRepository examinerRepository;

    public List<Examiner> getAllExaminers() {
        return examinerRepository.findAll();
    }

    public Examiner getExaminerById(Long id) {
        return examinerRepository.findById(id).orElse(null);
    }

    public Examiner saveExaminer(Examiner examiner) {
        return examinerRepository.save(examiner);
    }

    public void deleteExaminer(Long id) {
        examinerRepository.deleteById(id);
    }
    
    public Examiner updateExaminer(Long id, Examiner updatedExaminer) {
        Examiner existing = examinerRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(updatedExaminer.getName());
            existing.setEmail(updatedExaminer.getEmail());
            existing.setSubject(updatedExaminer.getSubject());
            return examinerRepository.save(existing);
        }
        return null;
    }
}