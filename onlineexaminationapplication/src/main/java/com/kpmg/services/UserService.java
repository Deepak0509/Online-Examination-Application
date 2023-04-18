package com.kpmg.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpmg.entities.*;
import com.kpmg.repositories.*;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
    
    /*
    public ExamResult takeExam(User user, int level) {
        // Check if the user has already passed this level
        if (user.getPassedLevels() >= level) {
            throw new IllegalArgumentException("User has already passed this level.");
        }

        // Load questions for the given level
        List<Question> questions = loadQuestionsForLevel(level);

        // Create a new exam session
        ExamSession examSession = new ExamSession(user, level, questions);

        // Start the exam session
        ExamResult examResult = examSession.start();

        // Check if the user passed the exam
        if (examResult.getScore() >= getMinimumPassingScore(level)) {
            // Update the user's passed levels
            user.setPassedLevels(level);
            userRepository.save(user);

            // Generate and return a report card
            return generateReportCard(user, examResult);
        } else {
            // User failed the exam, log them out and return the result
            user.setLoggedIn(false);
            userRepository.save(user);
            return examResult;
        }
    }

    private List<Question> loadQuestionsForLevel(int level) {
        // Load questions from the database or a file
        // ...
    }

    private int getMinimumPassingScore(int level) {
        // Load the minimum passing score for the given level from the database or a configuration file
        // ...
    }

    private ExamResult generateReportCard(User user, ExamResult examResult) {
        // Create a new report card and save it to the database
        ReportCard reportCard = new ReportCard(user, examResult);
        // ...

        // Return the report card
        return examResult;
    }
    
    /*
    Note that this is just an example code snippet and you may need to modify it 
    based on your specific requirements and implementation. Also, the UserRepository, 
    QuestionRepository, and ReportCardRepository interfaces should be created and 
    implemented to handle database operations related to the User, Question, and 
    ReportCard entities. The ExamSession and ExamResult classes should also be 
    implemented to handle the exam logic and results
	*/
}