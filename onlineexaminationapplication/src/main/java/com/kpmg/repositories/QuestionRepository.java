package com.kpmg.repositories;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kpmg.entities.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>{

	//void saveAll(List<Question> questions);

}
