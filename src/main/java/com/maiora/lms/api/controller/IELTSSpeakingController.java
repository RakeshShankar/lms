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

import com.maiora.lms.api.dto.coursesDTO;
import com.maiora.lms.api.model.ExcercisesSpeak;
import com.maiora.lms.api.model.Introduction;
import com.maiora.lms.api.model.IntroductionSpeeking;
import com.maiora.lms.api.model.SpeakExe;
import com.maiora.lms.api.model.SpeakExer;
import com.maiora.lms.api.model.SpeakExercise;
import com.maiora.lms.api.model.SpeakLesson;
import com.maiora.lms.api.model.SpeakTest;
import com.maiora.lms.api.model.SpeakTestIntro;
import com.maiora.lms.api.model.SpeakTesting;
import com.maiora.lms.api.model.TutorEvaluate;
import com.maiora.lms.api.service.IELTSIntroService;
import com.maiora.lms.api.service.IELTSSpeakService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/maioraservice")
@Api(description = "REST API for IELTS Speaking")
public class IELTSSpeakingController {

	@Autowired
	private IELTSIntroService ieltsIntroSerice;

	@Autowired
	private IELTSSpeakService ieltsSpeakService;

	/***
	 * Get all Course Speaking Data
	 * 
	 * @return
	 */
	@RequestMapping(value = "/coursesSpeakDesc/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Course Writing Introduction", notes = "Get All IELTS Course Writing Information")
	public ResponseEntity<?> getAllWritingFilters() {

		try {
			ModelMapper modelMapper = new ModelMapper();
			Type listType = new TypeToken<List<coursesDTO>>() {
			}.getType();
			List<Introduction> allIELTSCourses = ieltsIntroSerice.getAllIELTSCourses();

			for (Introduction introduction : allIELTSCourses) {

				System.out.println(introduction);
			}
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


	@RequestMapping(value = "/speakLesson/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save IELTS Speaking Tests", notes = "Save IELTS Speaking Tests")
	public ResponseEntity<?> createSpeakLesson(@Validated @RequestBody SpeakLesson speakLesson) {
		try {

			SpeakLesson speakLessonData = ieltsSpeakService.createSpeakLesson(speakLesson);
			return new ResponseEntity<SpeakLesson>(speakLessonData, HttpStatus.OK);

		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "/speakLesson/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get IELTS Speaking Tests", notes = "Get IELTS Speaking Tests")
	public ResponseEntity<?> getSpeakLesson() {
		try {

			List<SpeakLesson> speakData = ieltsSpeakService.getSpeakLesson();
			return new ResponseEntity<>(speakData, HttpStatus.OK);

		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "/speakLesson/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getSpeakingLessonById(@PathVariable("index") int index) {

		try {
			SpeakLesson model = ieltsSpeakService.getSpeakLessonById(index);
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "speakExercise/lesson/{lessonid}/exercise/{excerciseid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getSpeakingExercisebylessonidandexerciseid(@PathVariable("lessonid") int lessonid, @PathVariable("excerciseid") int excerciseid) {

		try {
			ExcercisesSpeak model = ieltsSpeakService.getSpeakingExercisebylessonidandexerciseid(lessonid,excerciseid);
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	

	
	
	
	
	
	
	

	/***
	 * Save IELTS Speaking Tests
	 * 
	 * @return
	 */
	@RequestMapping(value = "/speakTest/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save IELTS Speaking Tests", notes = "Save IELTS Speaking Tests")
	public ResponseEntity<?> createSpeakTest(@Validated @RequestBody SpeakTest speakTest) {
		try {

			SpeakTest speakTestData = ieltsSpeakService.createSpeakTest(speakTest);
			System.out.println(speakTest.toString() + "The last one");
			return new ResponseEntity<SpeakTest>(speakTestData, HttpStatus.OK);

		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	/***
	 * Get IELTS Speaking Tests
	 * 
	 * @return
	 */
	@RequestMapping(value = "/speakTest/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get IELTS Speaking Tests", notes = "Get IELTS Speaking Tests")
	public ResponseEntity<?> getSpeakTest() {
		try {

			List<SpeakTest> speakTestData = ieltsSpeakService.getSpeakTest();
			System.out.println(speakTestData.toString() + "The last one");
			return new ResponseEntity<>(speakTestData, HttpStatus.OK);

		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	/***
	 * Save IELTS Speaking Excercises Introduction
	 * 
	 * @return
	 */
	@RequestMapping(value = "/speakExercise/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save IELTS Speaking Tests", notes = "Save IELTS Speaking Tests")
	public ResponseEntity<?> createSpeakExercise(@Validated @RequestBody SpeakExercise speakExercise) {
		try {

			SpeakExercise speakTestData = ieltsSpeakService.createSpeakExericse(speakExercise);
			System.out.println(speakExercise.toString() + "The last one");
			return new ResponseEntity<SpeakExercise>(speakTestData, HttpStatus.OK);

		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/speakingintroduct/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Save introduction ")
	public ResponseEntity<?> createSpeakingIntroduction(@Validated @RequestBody IntroductionSpeeking speakIntroduction) {
		try {
			IntroductionSpeeking result = ieltsSpeakService.addSpeakIntroduction(speakIntroduction);
			return new ResponseEntity<IntroductionSpeeking>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	/***
	 * Get all Data
	 * 
	 * @return
	 */
	@RequestMapping(value = "/speakingintroduct/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getSpeakingIntroduction() {

		try {
			List<IntroductionSpeeking> model = ieltsSpeakService.getSpeakIntroduction();
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "/speakingintroduct/v1/getById/{speakid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getSpeakingIntroductionById(@PathVariable("speakid") int speakid) {

		try {
			IntroductionSpeeking model = ieltsSpeakService.getSpeakIntroductionById(speakid);
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	

	@RequestMapping(value = "/speakingtest/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Save introduction ")
	public ResponseEntity<?> createSpeakingTest(@Validated @RequestBody SpeakTestIntro speakTestIntro) {
		try {
			SpeakTestIntro result = ieltsSpeakService.addSpeakTestIntro(speakTestIntro);
			return new ResponseEntity<SpeakTestIntro>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	/***
	 * Get all Data
	 * 
	 * @return
	 */
	@RequestMapping(value = "/speakingtest/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getSpeakingTest() {

		try {
			List<SpeakTestIntro> model = ieltsSpeakService.getSpeakTestIntrod();
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "/speakingtest/v1/getById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getSpeakingTestById(@PathVariable("id") int id) {

		try {
			SpeakTestIntro model = ieltsSpeakService.getSpeakTestIntrodById(id);
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	@RequestMapping(value = "/speakingexer/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Save introduction ")
	public ResponseEntity<?> createSpeakingExe(@Validated @RequestBody SpeakExe speakExe) {
		try {
			SpeakExe result = ieltsSpeakService.addSpeakExe(speakExe);
			return new ResponseEntity<SpeakExe>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	/***
	 * Get all Data
	 * 
	 * @return
	 */
	@RequestMapping(value = "/speakingexer/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getSpeakingExe() {

		try {
			List<SpeakExe> model = ieltsSpeakService.getSpeakExe();
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
		
	
	@RequestMapping(value = "/saveSpeakExer/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Save introduction ")
	public ResponseEntity<?> createSpeakingExe(@Validated @RequestBody SpeakExer speakExer) {
		try {
			SpeakExer result = ieltsSpeakService.addSpeakExer(speakExer);
			return new ResponseEntity<SpeakExer>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "speakTest/lesson/{lessonid}/test/{testid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getSpeakingTestbylessonidandtestid (@PathVariable("lessonid") int lessonid, @PathVariable("testid") int testid) {

		try {
			SpeakTestIntro model = ieltsSpeakService.getSpeakingTestbylessonidandtestid(lessonid,testid);
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	@RequestMapping(value = "/saveSpeakTest/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Save introduction ")
	public ResponseEntity<?> createSpeakTest(@Validated @RequestBody SpeakTesting speakTesting) {
		try {
			SpeakTesting result = ieltsSpeakService.saveSpeakTest(speakTesting);
			return new ResponseEntity<SpeakTesting>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "/saveSpeakTest/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getSpeakTesting() {

		try {
			List<SpeakTesting> model = ieltsSpeakService.getSpeakTesting();
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "/tutorEvaluate/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Save introduction ")
	public ResponseEntity<?> createTutorEvaluate(@Validated @RequestBody TutorEvaluate tutorEvaluate) {
		try {
			TutorEvaluate result = ieltsSpeakService.createTutorEvaluate(tutorEvaluate);
			return new ResponseEntity<TutorEvaluate>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	 
	@RequestMapping(value = "/tutorEvaluate/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getTutorEvaluate() {

		try {
			List<TutorEvaluate> model = ieltsSpeakService.getTutorEvaluate();
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

}
