package com.maiora.lms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.maiora.lms.api.model.WriteLessonOne;
import com.maiora.lms.api.service.ExercisesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/maioraservice")
@Api(description = "REST API for Reading Intro Of LMS")
public class ExercisesController {
	
	@Autowired
	private ExercisesService exercisesService; 

	@RequestMapping(value = "/getLessonsByExerciseId/v1/getById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getLessonsByExerciseId(@PathVariable("id") int id) {

		try {
			List<WriteLessonOne> result = exercisesService.getLessonsByExerciseId(id);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	@RequestMapping(value = "/getLessonsByExerciseId/v1/getById/{id}/{idd}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getExcerciseByLessonIdandExcerciseId(@PathVariable("id") int id,@PathVariable("idd") int idd) {

		try {
			List<WriteLessonOne> result = exercisesService.getExcerciseByLessonIdandExcerciseId(id,idd);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
}
