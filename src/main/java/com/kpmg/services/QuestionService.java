package com.kpmg.services;
import java.util.*;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import com.kpmg.entities.Question;
import com.kpmg.repositories.QuestionRepository;

import com.kpmg.exceptions.InvalidFileException;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;
	
	public Question save(Question question) {
        return questionRepository.save(question);
    }
	
	/*
	public void saveAll(List<Question> questions) {
		
		for(Question qs: questions) {
			questionRepository.save(qs);
		}

	}
	*/
	
	public void addQuestionsFromExcel (MultipartFile file) throws InvalidFileException {
		// TODO Auto-generated method stub
		 try {
		        Workbook workbook = WorkbookFactory.create(file.getInputStream());
		        Sheet sheet = workbook.getSheetAt(0);

		        // Validate the file format
		        /*
		        if (!isValidExcelFile(sheet)) {
		            throw new InvalidFileException("Invalid file format");
		        }
		        */

		        // Parse the questions from the Excel file
		        List<Question> questions = new ArrayList<>();
		        Iterator<Row> rowIterator = sheet.rowIterator();
		        while (rowIterator.hasNext()) {
		            Row row = rowIterator.next();
		            if (row.getRowNum() == 0) {
		                continue; // Skip the header row
		            }
		            String questionText = row.getCell(0).getStringCellValue();
		            String option1 = row.getCell(1).getStringCellValue();
		            String option2 = row.getCell(2).getStringCellValue();
		            String option3 = row.getCell(3).getStringCellValue();
		            String option4 = row.getCell(4).getStringCellValue();
		            int correctOption = (int) row.getCell(5).getNumericCellValue();
		            int level = (int) row.getCell(6).getNumericCellValue();
		            Question question = new Question(questionText, option1, option2, option3, option4, correctOption, level);
		            questions.add(question);
		        }

		        // Save the questions to the database
		        questionRepository.saveAll(questions);
		    } catch (IOException | InvalidFileException e) {
		        throw new InvalidFileException("Invalid file format");
		    }
		
	}

	public void deleteQuestionsFile(String fileName) {
		// TODO Auto-generated method stub
		
	}

}
 
