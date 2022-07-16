package com.maiora.lms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.maiora.lms.api.model.ExerciseLesson;
import com.maiora.lms.api.model.ExerciseWrite;
import com.maiora.lms.api.model.Introduction;
import com.maiora.lms.api.model.LessonWrite;
import com.maiora.lms.api.model.WriteExerciseLesson;
import com.maiora.lms.api.service.IELTSWriteService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/maioraservice")
@Api(description = "REST API for IELTS Writing")
public class IELTSWritingController {

	@Autowired
	private IELTSWriteService ieltsWriteService;

	
	/***
	 * Get all Course Writing Data
	 * 
	 * @return
	 */
	@RequestMapping(value = "/coursesWriteDesc/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Course Writing Introduction", notes = "Get All IELTS Course Writing Information")
	public ResponseEntity<?> getAllWritingFilters() {

		try {

			List<Introduction> allWritingCourses = ieltsWriteService.getAllWritingCourses();
			return new ResponseEntity<>(allWritingCourses, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	/***
	 * Save all Course Writing Data
	 *
	 * @return
	 */
	@RequestMapping(value = "/coursesWriteDesc/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save All IELTS Course Writing Introduction", notes = "API Used To Create A Course Writing Introduction")
	public ResponseEntity<?> createNewAdds(@Validated @RequestBody Introduction introduction) {
		try {
//			ModelMapper modelMapper = new ModelMapper();
//			Assignments assignmentModel = modelMapper.map(assignmentDTO, Assignments.class);
			Introduction intro = ieltsWriteService.addCourseWriting(introduction);
			return new ResponseEntity<Introduction>(intro, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	

	/***
	 * Save all Course Writing Data
	 *
	 * @return
	 */
	@RequestMapping(value = "/coursesWriteLesson/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save All IELTS Course Writing Lesson Introduction", notes = "API Used To Create A Course Writing Introduction")
	public ResponseEntity<?> createNewLesson(@Validated @RequestBody LessonWrite lessonwrite) {
		try {
//			ModelMapper modelMapper = new ModelMapper();
//			Assignments assignmentModel = modelMapper.map(assignmentDTO, Assignments.class);
			LessonWrite lesson = ieltsWriteService.addLessonWrite(lessonwrite);
			return new ResponseEntity<LessonWrite>(lesson, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	/***
	 * Get all Course Writing Data
	 *
	 * @return
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/***
	 * Save IELTS Writing Exercises Introduction
	 *
	 * @return
	 */
	@RequestMapping(value = "/courseWriteExercise/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save IELTS Writing Exercises Introduction", notes = "API Used To Create A Course Writing Introduction")
	public ResponseEntity<?> createNewExercise(@Validated @RequestBody ExerciseWrite exercisewrite) {
		try {
			
			ExerciseWrite exercise = ieltsWriteService.addWriteExercise(exercisewrite);
			System.out.println(exercise.toString());
			return new ResponseEntity<ExerciseWrite>(exercise, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	/***
	 * Get all Course Writing Data
	 * 
	 * @return
	 */
	@RequestMapping(value = "/courseWriteExercise/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Course Writing Introduction", notes = "Get All IELTS Course Writing Information")
	public ResponseEntity<?> getAllWritingExercise() {

		try {

			List<ExerciseWrite> allWritingExericises = ieltsWriteService.getAllWritingExercises();
			return new ResponseEntity<>(allWritingExericises, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	@RequestMapping(value = "/writeexerciseLesson/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "POST for reading exercise1 and lesson 1", notes = "Save IELTS Reading Test Introduction")
	public ResponseEntity<?> saveWritingExercise(@Validated @RequestBody WriteExerciseLesson writeExerciseLesson) {
		try {
			WriteExerciseLesson test = ieltsWriteService.saveExerciseLesson(writeExerciseLesson);
			return new ResponseEntity<WriteExerciseLesson>(test, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
	@RequestMapping(value = "/writeExerciseLesson/lesson/{lessonid}/exercise/{excerciseid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Reading Test Introduction", notes = "Get All The Reading Test Information")
	public ResponseEntity<?> getListeningExercisebylessonidandexerciseid(@PathVariable("lessonid") int lessonid,
			@PathVariable("excerciseid") int excerciseid) {

		try {

			WriteExerciseLesson allReadingTests = ieltsWriteService.getWriteExercisebylessonidandexerciseid(lessonid,
					excerciseid);
			return new ResponseEntity<>(allReadingTests, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
