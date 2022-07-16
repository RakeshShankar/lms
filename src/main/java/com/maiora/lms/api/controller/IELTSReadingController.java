package com.maiora.lms.api.controller;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
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

import com.maiora.lms.api.dto.IntroReadDTO;
import com.maiora.lms.api.dto.coursesDTO;
import com.maiora.lms.api.model.ExcercisesListen;
import com.maiora.lms.api.model.ExerciseLesson;
import com.maiora.lms.api.model.IELTSReadTest;
import com.maiora.lms.api.model.IELTSReadingLesson;
import com.maiora.lms.api.model.Introduction;
import com.maiora.lms.api.model.TestLesson;
import com.maiora.lms.api.service.IELTSIntroService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/maioraservice")
@Api(description = "REST API for IELTS Reading")
public class IELTSReadingController {

	@Autowired
	private IELTSIntroService ieltsIntroSerice;

	/***
	 * Get all Course Data
	 * 
	 * @return
	 */
	@RequestMapping(value = "/coursesRead/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Reading Introduction", notes = "Get All The Reading Information")
	public ResponseEntity<?> getAllFilters() {

		try {
			ModelMapper modelMapper = new ModelMapper();
			Type listType = new TypeToken<List<coursesDTO>>() {
			}.getType();
			System.out.println("Inside read controller");
			List<Introduction> allIELTSCourses = ieltsIntroSerice.getAllIELTSCourses();
//			List<IntroductionDTO> sellerDTO = modelMapper.map(allIELTSCourses,listType);
//			List<Assignments> sellerModel = assignmentServ.getAllData();
//			List<AssignmentsDTO> sellerDTO = modelMapper.map(sellerModel,listType);
			return new ResponseEntity<>(allIELTSCourses, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	/***
	 * Save read Course Data // Data is not saving in DB but getting in console
	 * 
	 * @return
	 */
	@RequestMapping(value = "/coursesRead/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save IELTS Reading Introduction", notes = "Save All The Reading Information")
	public ResponseEntity<?> createIELTSRead(@Validated @RequestBody IntroReadDTO introReadDTO) {
		try {
			ModelMapper modelMapper = new ModelMapper();
			System.out.println(introReadDTO.toString() + "Inside create ");
			Introduction introductionModel = modelMapper.map(introReadDTO, Introduction.class);
			System.out.println(introductionModel.toString());
			Introduction saveReadintro = ieltsIntroSerice.createReadCourse(introductionModel);
			System.out.println(saveReadintro.toString() + "The last one");
			return new ResponseEntity<Introduction>(saveReadintro, HttpStatus.OK);

		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	/***
	 * Get all Reading Lesson Data
	 * 
	 * @return
	 */
	@RequestMapping(value = "/coursesReadLesson/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Reading Lesson Introduction", notes = "Get All The Reading Lesson Information")
	public ResponseEntity<?> getAllReadingLessonIntro() {

		try {
			List<IELTSReadingLesson> allReadingLessons = ieltsIntroSerice.getAllReadingLessons();
			return new ResponseEntity<>(allReadingLessons, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	/***
	 * Save IELTS Reading Lesson Introduction
	 * 
	 * @return
	 */
	@RequestMapping(value = "/coursesReadLesson/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save IELTS Reading Lesson Introduction", notes = "Save IELTS Reading Lesson Introduction")
	public ResponseEntity<?> saveReadingLessonIntro(@Validated @RequestBody IELTSReadingLesson ieltsReadingLesson) {
		try {
			IELTSReadingLesson lesson = ieltsIntroSerice.saveReadLesson(ieltsReadingLesson);
			System.out.println(lesson);
			return new ResponseEntity<IELTSReadingLesson>(lesson, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}
	}

	/***
	 * Get all Reading Lesson Data
	 * 
	 * @return
	 */
	@RequestMapping(value = "/coursesReadExercise/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Reading Exercise Introduction", notes = "Get All The Reading Exercise Information")
	public ResponseEntity<?> getAllReadingExerciseIntro() {

		try {

			List<IELTSReadingLesson> allReadingLessons = ieltsIntroSerice.getAllReadingLessons();
			return new ResponseEntity<>(allReadingLessons, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	/***
	 * Save IELTS Reading Lesson Introduction
	 * 
	 * @return
	 */
	@RequestMapping(value = "/coursesReadExercise/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save IELTS Reading Lesson Introduction", notes = "Save IELTS Reading Lesson Introduction")
	public ResponseEntity<?> saveReadingExerciseIntro(@Validated @RequestBody IELTSReadingLesson ieltsReadingLesson) {
		try {
			IELTSReadingLesson lesson = ieltsIntroSerice.saveReadLesson(ieltsReadingLesson);
			return new ResponseEntity<IELTSReadingLesson>(lesson, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}
	}

	/***
	 * Save IELTS Reading Test Introduction
	 * 
	 * @return
	 */
	@RequestMapping(value = "/coursesReadTest/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save IELTS Reading Test Introduction", notes = "Save IELTS Reading Test Introduction")
	public ResponseEntity<?> saveReadingTestIntro(@Validated @RequestBody IELTSReadTest ieltsReadTest) {
		try {
			IELTSReadTest test = ieltsIntroSerice.saveReadTest(ieltsReadTest);
			System.out.println(test.toString());
			return new ResponseEntity<IELTSReadTest>(test, HttpStatus.OK);
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
	@RequestMapping(value = "/coursesReadTest/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Reading Test Introduction", notes = "Get All The Reading Test Information")
	public ResponseEntity<?> getAllReadingTestIntro() {

		try {

			List<IELTSReadTest> allReadingTests = ieltsIntroSerice.getAllReadingTest();
			return new ResponseEntity<>(allReadingTests, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/exerciseLesson/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "POST for reading exercise1 and lesson 1", notes = "Save IELTS Reading Test Introduction")
	public ResponseEntity<?> saveReadingExercise(@Validated @RequestBody ExerciseLesson exerciseLesson) {
		try {
			ExerciseLesson test = ieltsIntroSerice.saveExerciseLesson(exerciseLesson);
			return new ResponseEntity<ExerciseLesson>(test, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/readExerciseLesson/lesson/{lessonid}/exercise/{excerciseid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Reading Test Introduction", notes = "Get All The Reading Test Information")
	public ResponseEntity<?> getListeningExercisebylessonidandexerciseid(@PathVariable("lessonid") int lessonid,
			@PathVariable("excerciseid") int excerciseid) {

		try {

			ExerciseLesson allReadingTests = ieltsIntroSerice.getReadExercisebylessonidandexerciseid(lessonid,
					excerciseid);
			return new ResponseEntity<>(allReadingTests, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	@RequestMapping(value = "/testLesson/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "POST for reading test and lesson", notes = "Save IELTS Reading Test Introduction")
	public ResponseEntity<?> saveTestLesson(@Validated @RequestBody TestLesson testLesson) {
		try {
			TestLesson test = ieltsIntroSerice.saveTestLesson(testLesson);
			return new ResponseEntity<TestLesson>(test, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}
	}
	
	
}
