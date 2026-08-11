package com.ajay.Examinerdesk.repository;

import com.ajay.Examinerdesk.model.Examiner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExaminerRepository extends JpaRepository<Examiner, Long> {

}