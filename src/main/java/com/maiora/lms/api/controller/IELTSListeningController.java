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

import com.maiora.lms.api.model.ExcercisesListen;
import com.maiora.lms.api.model.ExerciseLesson;
import com.maiora.lms.api.model.Introduction;
import com.maiora.lms.api.model.ListenExercise;
import com.maiora.lms.api.model.ListenLesson;
import com.maiora.lms.api.model.ListenTest;
import com.maiora.lms.api.model.ListeningLesson;
import com.maiora.lms.api.service.IELTSIntroService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/maioraservice")
@Api(description = "REST API for IELTS Listening")
public class IELTSListeningController {
	@Autowired
	private IELTSIntroService ieltsIntroSerice;
	

	/***
	 * Get all Course Listening Data
	 * 
	 * @return
	 */
	@RequestMapping(value = "/coursesListenDesc/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Course Writing Introduction", notes = "Get All IELTS Course Writing Information")
	public ResponseEntity<?> getAllWritingFilters() {
		
		try {
			List<Introduction> allIELTSCourses = ieltsIntroSerice.getAllIELTSCourses();
			return new ResponseEntity<>(allIELTSCourses, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/listening/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save IELTS Reading Test Introduction", notes = "Save IELTS Reading Test Introduction")
	public ResponseEntity<?> saveListeningIntro(@Validated @RequestBody ListeningLesson listeningLesson) {
		try {
			ListeningLesson test = ieltsIntroSerice.saveListeningLesson(listeningLesson);
			return new ResponseEntity<ListeningLesson>(test, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}
	}

	/***
	 * Get all Reading Test Data
	 * 
	 * @return
	 */
	@RequestMapping(value = "/listening/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Reading Test Introduction", notes = "Get All The Reading Test Information")
	public ResponseEntity<?> getAllListeningIntro() {

		try {

			List<ListeningLesson> allReadingTests = ieltsIntroSerice.getAllListeningLesson();
			return new ResponseEntity<>(allReadingTests, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "/listening/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Reading Test Introduction", notes = "Get All The Reading Test Information")
	public ResponseEntity<?> getAllListeningIntroById(@PathVariable("index") int index) {

		try {

			ListeningLesson allReadingTests = ieltsIntroSerice.getAllListeningLessonById(index);
			return new ResponseEntity<>(allReadingTests, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	
	
	@RequestMapping(value = "listeningExercise/lesson/{lessonid}/exercise/{excerciseid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Reading Test Introduction", notes = "Get All The Reading Test Information")
	public ResponseEntity<?> getListeningExercisebylessonidandexerciseid(@PathVariable("lessonid") int lessonid, @PathVariable("excerciseid") int excerciseid) {

		try {

			ExcercisesListen allReadingTests = ieltsIntroSerice.getListeningExercisebylessonidandexerciseid(lessonid,excerciseid);
			return new ResponseEntity<>(allReadingTests, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	


	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@RequestMapping(value = "/listenSave/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save IELTS Reading Lesson Introduction", notes = "Save IELTS Reading Test Introduction")
	public ResponseEntity<?> saveListeningIntrod(@Validated @RequestBody ListenLesson listenLesson) {
		try {
			ListenLesson lesson = ieltsIntroSerice.saveListenIntroLesson(listenLesson);
			return new ResponseEntity<ListenLesson>(lesson, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}
	}

	/***
	 * Get all Reading Test Data
	 * 
	 * @return
	 */
	@RequestMapping(value = "/listensave/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Reading Test Introduction", notes = "Get All The Reading Test Information")
	public ResponseEntity<?> getAllListeningIntrod() {

		try {

			List<ListenLesson> allReadingTests = ieltsIntroSerice.getAllListening();
			return new ResponseEntity<>(allReadingTests, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "/listensave/v1/getById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Introduction", notes = "Get All The Information")
	public ResponseEntity<?> getAllListeningIntrById(@PathVariable("id") int id) {

		try {

			ListenLesson allReadingTests = ieltsIntroSerice.getAllListeningLessonsById(id);
			return new ResponseEntity<>(allReadingTests, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}	
	
	
	
	
	
	@RequestMapping(value = "/listenTest/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save IELTS Reading Lesson Introduction", notes = "Save IELTS Reading Test Introduction")
	public ResponseEntity<?> saveListeningTest(@Validated @RequestBody ListenTest listenTest) {
		try {
			ListenTest lesson = ieltsIntroSerice.saveListenTest(listenTest);
			return new ResponseEntity<ListenTest>(lesson, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@RequestMapping(value = "/listenTest/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Reading Test Introduction", notes = "Get All The Reading Test Information")
	public ResponseEntity<?> getAllListeningTest() {

		try {

			List<ListenTest> allReadingTests = ieltsIntroSerice.getAllListeningTests();
			return new ResponseEntity<>(allReadingTests, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "listeningTest/lesson/{lessonid}/test/{testid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Reading Test Introduction", notes = "Get All The Reading Test Information")
	public ResponseEntity<?> getListeningTestbyLessonidandTestid(@PathVariable("lessonid") int lessonid, @PathVariable("testid") int testid) {

		try {

			ListenTest tests = ieltsIntroSerice.getListeningTestbylessonidandtestid(lessonid,testid);
			return new ResponseEntity<>(tests, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	@RequestMapping(value = "/listenExerciseLesson/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save IELTS Reading Lesson Introduction", notes = "Save IELTS Reading Test Introduction")
	public ResponseEntity<?> saveListenExerciseLesson(@Validated @RequestBody ListenExercise listenExercise) {
		try {
			ListenExercise lesson = ieltsIntroSerice.saveListenExerciseLesson(listenExercise);
			return new ResponseEntity<ListenExercise>(lesson, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
	
	
	@RequestMapping(value = "/listenExerciseLesson/lesson/{lessonid}/exercise/{excerciseid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Reading Test Introduction", notes = "Get All The Reading Test Information")
	public ResponseEntity<?> getListeningBylessonidandexerciseid(@PathVariable("lessonid") int lessonid,
			@PathVariable("excerciseid") int excerciseid) {

		try {

			ListenExercise allReadingTests = ieltsIntroSerice.getExercisebylessonidandexerciseid(lessonid,
					excerciseid);
			return new ResponseEntity<>(allReadingTests, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
}
