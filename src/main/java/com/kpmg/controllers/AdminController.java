package com.kpmg.controllers;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.kpmg.exceptions.InvalidFileException;
import com.kpmg.services.QuestionService;

@RestController
public class AdminController {

	@Autowired
	private QuestionService questionService;

	@RequestMapping(value = "/view-reports", method = RequestMethod.GET)
	public String viewReports() {
		return "admin-view-reports";
	}

	@RequestMapping(value = "/add-questions-file", method = RequestMethod.GET)
	public String addQuestionsFile() {
		return "admin-add-questions-file";
	}

	@RequestMapping(value = "/upload-questions-file", method = RequestMethod.POST)
	public String uploadQuestionsFile(@RequestParam("file") MultipartFile file) {
		try {
			// validate the file
			if (!file.getContentType().equals("application/vnd.ms-excel")) {
				throw new InvalidFileException("Invalid file format");
			}

			// parse the file and save the questions to the database
			questionService.addQuestionsFromExcel(file);

			return "admin-upload-success";
		} 
		/*
		catch (IOException e) {
			e.printStackTrace();
			return "admin-upload-error";
		} 
		*/
		catch (InvalidFileException e) {
			e.printStackTrace();
			return "admin-upload-error";
		}
	}

	@RequestMapping(value = "/remove-questions-file", method = RequestMethod.GET)
	public String removeQuestionsFile() {
		return "admin-remove-questions-file";
	}

	@RequestMapping(value = "/delete-questions-file", method = RequestMethod.POST)
	public String deleteQuestionsFile(@RequestParam("fileName") String fileName) {
		try {
			questionService.deleteQuestionsFile(fileName);
			
			//Check if the file exists
			
			return "admin-delete-success";
		}	catch (FileNotFoundException ex) {
			//handle file not found exception
			return "error-page";
		}
		
		catch (IOException e) {
			e.printStackTrace();
			return "admin-delete-error";
		}
	}
}