package com.ajay.Examinerdesk.controller;

import com.ajay.Examinerdesk.model.Examiner;
import com.ajay.Examinerdesk.service.ExaminerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/examiners")
public class ExaminerController {

    @Autowired
    private ExaminerService examinerService;

    @GetMapping
    public List<Examiner> getAllExaminers() {
        return examinerService.getAllExaminers();
    }

    @GetMapping("/{id}")
    public Examiner getExaminerById(@PathVariable Long id) {
        return examinerService.getExaminerById(id);
    }

    @PostMapping
    public Examiner addExaminer(@RequestBody Examiner examiner) {
        return examinerService.saveExaminer(examiner);
    }

    @DeleteMapping("/{id}")
    public String deleteExaminer(@PathVariable Long id) {
        examinerService.deleteExaminer(id);
        return "Examiner deleted successfully!";
    }
    
    @PutMapping("/{id}")
    public Examiner updateExaminer(@PathVariable Long id, @RequestBody Examiner examiner) {
        return examinerService.updateExaminer(id, examiner);
    }
}