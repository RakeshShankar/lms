package com.maiora.lms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.maiora.lms.api.model.AllLessonsTest;
import com.maiora.lms.api.model.Assessment;
import com.maiora.lms.api.service.AssessmentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/maioraservice")
@Api(description = "REST API for Assessment LMS")
public class AssessmentController {
	
	@Autowired
	private AssessmentService assessmentService;
	
	@RequestMapping(value = "/assessment/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Assessment Introduction", notes = "API Used To Save Assessment Introduction")
	public ResponseEntity<?> createNewAssessment(@Validated @RequestBody AllLessonsTest allLessonsTest) {
		try {
			
			AllLessonsTest result = assessmentService.saveAssessment(allLessonsTest);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "/assessment/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Assessment Introduction", notes = "Get All The Assessment Introduction")
	public ResponseEntity<?> getAllAssessmentIntro() {

		try {

			List<AllLessonsTest> allReadingTests = assessmentService.getAllAssessments();
			return new ResponseEntity<>(allReadingTests, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	@RequestMapping(value = "/assessmentTwo/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Assessment Introduction", notes = "API Used To Save Assessment Introduction")
	public ResponseEntity<?> createNewAssessmentTwo(@Validated @RequestBody Assessment assessment) {
		try {
			
			Assessment result = assessmentService.saveAssessmentTwo(assessment);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	@RequestMapping(value = "/assessmentTwo/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Assessment Introduction", notes = "Get All The Assessment Introduction")
	public ResponseEntity<?> getAllAssessmentTwoIntro() {

		try {

			List<Assessment> rseults = assessmentService.getAllAssessmentTwo();
			return new ResponseEntity<>(rseults, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	

}
