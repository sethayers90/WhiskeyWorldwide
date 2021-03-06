package com.whiskeyworldwide.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whiskeyworldwide.model.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long>{

}
