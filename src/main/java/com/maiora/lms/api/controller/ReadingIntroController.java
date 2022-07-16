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

import com.maiora.lms.api.model.LesExcercises;
import com.maiora.lms.api.model.ReadExecOne;
import com.maiora.lms.api.model.ReadExecThree;
import com.maiora.lms.api.model.ReadExecTwo;
import com.maiora.lms.api.model.ReadIntroModel;
import com.maiora.lms.api.model.ReadLesson;
import com.maiora.lms.api.model.ReadTest;
import com.maiora.lms.api.service.ReadingIntroService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/maioraservice")
@Api(description = "REST API for Reading Intro Of LMS")
public class ReadingIntroController {
	
	@Autowired
	private ReadingIntroService readingIntroService;
	
	/***
	 * Create Reading Introduction
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readIntro/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Reading Introduction", notes = "API Used To Save Reading Introduction")
	public ResponseEntity<?> createNewAdds(@Validated @RequestBody ReadIntroModel readIntroModel) {
		try {
			
			ReadIntroModel result = readingIntroService.saveIntroduction(readIntroModel);
			return new ResponseEntity<>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/readIntro/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllFilters() {
		
		try {
			List<ReadIntroModel> result = readingIntroService.getAllData();
			for (ReadIntroModel readIntroModel : result) {
				System.out.println(readIntroModel);
			}
			return new ResponseEntity<>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/readIntro/v1/getById/{readintromodelid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllDataById(@PathVariable("readintromodelid") int readintromodelid) {
		
		try {
			ReadIntroModel result = readingIntroService.getAllDataById(readintromodelid);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	

	
	
	
	
	/***
	 * Create Lesson Introduction
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readLesson/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Read Lesson", notes = "API Used To Save Reading Lesson")
	public ResponseEntity<?> createReadLesson(@Validated @RequestBody ReadLesson readLesson) {
		try {
			ReadLesson result = readingIntroService.saveReadLesson(readLesson);
			return new ResponseEntity<>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/readLesson/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllLessonData() {
		
		try {
			List<ReadLesson> result = readingIntroService.getAllLessonData();
			return new ResponseEntity<>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/readLesson/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllLessonDataById(@PathVariable("index") int index) {
		
		try {
			ReadLesson result = readingIntroService.getAllLessonDataById(index);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	@RequestMapping(value = "readExercise/lesson/{lessonid}/exercise/{excerciseid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Reading Exercise by lessonid and exerciseid ", notes = "Reading Exercise by lessonid and exerciseid ")
	public ResponseEntity<?> getExercisebyLessonidandExerciseid(@PathVariable("lessonid") int lessonid, @PathVariable("excerciseid") int excerciseid) {
		
		try {
			LesExcercises result = readingIntroService.getExercisebyLessonidandExerciseid(lessonid,excerciseid);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	
	
	/***
	 * Create Lesson Introduction
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readLessonTwo/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Read Lesson", notes = "API Used To Save Reading Lesson")
	public ResponseEntity<?> createReadLessonTwo(@Validated @RequestBody ReadLesson readLesson) {
		try {
			ReadLesson result = readingIntroService.saveReadLesson(readLesson);
			return new ResponseEntity<>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/readLessonTwo/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllLessonDataTwo() {
		
		try {
			List<ReadLesson> result = readingIntroService.getAllLessonData();
			return new ResponseEntity<>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/readLessonTwo/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllLessonDatById(@PathVariable("index") int index) {
		
		try {
			ReadLesson result = readingIntroService.getAllLessonDataById(index);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	/***
	 * Create Lesson Introduction
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readLessonThree/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Read Lesson", notes = "API Used To Save Reading Lesson")
	public ResponseEntity<?> createReadLessonThree(@Validated @RequestBody ReadLesson readLesson) {
		try {
			ReadLesson result = readingIntroService.saveReadLesson(readLesson);
			return new ResponseEntity<>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/readLessonThree/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllLessonDataThree() {
		
		try {
			List<ReadLesson> result = readingIntroService.getAllLessonData();
			return new ResponseEntity<>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/readLessonThree/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllLessonDataThreeById(@PathVariable("index") int index) {
		
		try {
			ReadLesson result = readingIntroService.getAllLessonDataById(index);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	
	/***
	 * Create Lesson Introduction
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readLessonFour/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Read Lesson", notes = "API Used To Save Reading Lesson")
	public ResponseEntity<?> createReadLessonFour(@Validated @RequestBody ReadLesson readLesson) {
		try {
			ReadLesson result = readingIntroService.saveReadLesson(readLesson);
			return new ResponseEntity<>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/readLessonFour/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllLessonDataFour() {
		
		try {
			List<ReadLesson> result = readingIntroService.getAllLessonData();
			return new ResponseEntity<>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/readLessonFour/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllLessonDataFourById(@PathVariable("index") int index) {
		
		try {
			ReadLesson result = readingIntroService.getAllLessonDataById(index);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	/***
	 * Create Lesson Introduction
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readLessonFive/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Read Lesson", notes = "API Used To Save Reading Lesson")
	public ResponseEntity<?> createReadLessonFive(@Validated @RequestBody ReadLesson readLesson) {
		try {
			ReadLesson result = readingIntroService.saveReadLesson(readLesson);
			return new ResponseEntity<>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/readLessonFive/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllLessonDataFive() {
		
		try {
			List<ReadLesson> result = readingIntroService.getAllLessonData();
			return new ResponseEntity<>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/readLessonFive/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllLessonDatFiveById(@PathVariable("index") int index) {
		
		try {
			ReadLesson result = readingIntroService.getAllLessonDataById(index);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	
	/***
	 * Create Lesson Introduction
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readLessonSix/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Read Lesson", notes = "API Used To Save Reading Lesson")
	public ResponseEntity<?> createReadLessonSix(@Validated @RequestBody ReadLesson readLesson) {
		try {
			ReadLesson result = readingIntroService.saveReadLesson(readLesson);
			return new ResponseEntity<>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/readLessonSix/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllLessonDataSix() {
		
		try {
			List<ReadLesson> result = readingIntroService.getAllLessonData();
			return new ResponseEntity<>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/readLessonSix/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllLessonDataSixById(@PathVariable("index") int index) {
		
		try {
			ReadLesson result = readingIntroService.getAllLessonDataById(index);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	/***
	 * Create Lesson Introduction
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readLessonSeven/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Read Lesson", notes = "API Used To Save Reading Lesson")
	public ResponseEntity<?> createReadLessonSeven(@Validated @RequestBody ReadLesson readLesson) {
		try {
			ReadLesson result = readingIntroService.saveReadLesson(readLesson);
			return new ResponseEntity<>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/readLessonSeven/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllLessonDataSeven() {
		
		try {
			List<ReadLesson> result = readingIntroService.getAllLessonData();
			return new ResponseEntity<>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/readLessonSeven/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllLessonDataSevenById(@PathVariable("index") int index) {
		
		try {
			ReadLesson result = readingIntroService.getAllLessonDataById(index);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/***
	 * Save Reading Excercise 1 introduction 
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readExercise/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Reading Excercise 1 introduction ", notes = "API Used To Save Reading Excercise 1 introduction ")
	public ResponseEntity<?> createReadExerOne(@Validated @RequestBody ReadExecOne readExecOne) {
		try {
			ReadExecOne result = readingIntroService.saveReadExercise(readExecOne);
			System.out.println(result.toString());
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	/***
	 * Get Reading Excercise 1 introduction 
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readExercise/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get Reading Excercise 1 introduction ", notes = "API Used To Get Reading Excercise 1 introduction ")
	public ResponseEntity<?> getReadExerOne() {
			try {
			List<ReadExecOne> result = readingIntroService.getAllExerData();
			for (ReadExecOne readIntroModel : result) {
				System.out.println(readIntroModel);
			}
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	/***
	 * Get Reading Excercise 1 introduction 
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readExercise/v1/getById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get Reading Excercise 1 introduction ", notes = "API Used To Get Reading Excercise 1 introduction ")
	public ResponseEntity<?> getReadExerOneById(@PathVariable("id") int id) {
			try {
			ReadExecOne result = readingIntroService.getAllExerDataById(id);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	
	
	
	
	
	

	/***
	 * Save Reading Excercise 2 introduction 
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readExerciseTwo/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Reading Excercise 2 introduction ", notes = "API Used To Save Reading Excercise 1 introduction ")
	public ResponseEntity<?> createReadExerTwo(@Validated @RequestBody ReadExecTwo readExectwo) {
		try {
			ReadExecTwo result = readingIntroService.saveReadExercise(readExectwo);
			System.out.println(result.toString());
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	/***
	 * Get Reading Excercise 2 introduction 
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readExerciseTwo/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get Reading Excercise 2 introduction ", notes = "API Used To Get Reading Excercise 2 introduction ")
	public ResponseEntity<?> getReadExerTwo() {
			try {
			List<ReadExecTwo> result = readingIntroService.getAllExerDataTwo();
			for (ReadExecTwo readIntroModel : result) {
				System.out.println(readIntroModel);
			}
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	/***
	 * Get Reading Excercise 2 introduction 
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readExerciseTwo/v1/getById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get Reading Excercise 2 introduction ", notes = "API Used To Get Reading Excercise 2 introduction ")
	public ResponseEntity<?> getReadExerTwo(@PathVariable("id") int id) {
			try {
			ReadExecTwo result = readingIntroService.getAllExerDataTwoById(id);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/***
	 * Save Reading Exercise 3 introduction 
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readExerciseThree/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Reading Excercise 3 introduction ", notes = "API Used To Save Reading Excercise 3 introduction ")
	public ResponseEntity<?> createReadExerThree(@Validated @RequestBody ReadExecThree readExecThree) {
		try {
			ReadExecThree result = readingIntroService.saveReadExerciseThree(readExecThree);
			System.out.println(result.toString());
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	/***
	 * Get Reading Exercise 3 introduction 
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readExerciseThree/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get Reading Excercise 2 introduction ", notes = "API Used To Get Reading Excercise 2 introduction ")
	public ResponseEntity<?> getReadExerThree() {
			try {
			List<ReadExecThree> result = readingIntroService.getAllExerDataThree();
			for (ReadExecThree readIntroModel : result) {
				System.out.println(readIntroModel);
			}
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	/***
	 * Get Reading Exercise 3 introduction 
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readExerciseThree/v1/getById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get Reading Excercise 3 introduction ", notes = "API Used To Get Reading Excercise 2 introduction ")
	public ResponseEntity<?> getReadExerThreeById(@PathVariable("id") int id) {
			try {
			ReadExecThree result = readingIntroService.getAllExerDataThreeById(id);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	@RequestMapping(value = "/readTest/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Reading Excercise 3 introduction ", notes = "API Used To Save Reading Excercise 3 introduction ")
	public ResponseEntity<?> createTest(@Validated @RequestBody ReadTest readTest) {
		try {
			ReadTest result = readingIntroService.saveReadTest(readTest);
			System.out.println(result.toString());
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "/readTest/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get Reading Excercise 2 introduction ", notes = "API Used To Get Reading Excercise 2 introduction ")
	public ResponseEntity<?> getTest() {
			try {
			List<ReadTest> result = readingIntroService.getAllTests();
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	/***
	 * Get Reading Exercise 3 introduction 
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/readTest/v1/getById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get Reading Excercise 3 introduction ", notes = "API Used To Get Reading Excercise 2 introduction ")
	public ResponseEntity<?> getTestById(@PathVariable("id") int id) {
			try {
				ReadTest result = readingIntroService.getTestById(id);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "/readTest/v1/getByTestId/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get Reading Excercise 3 introduction ", notes = "API Used To Get Reading Excercise 2 introduction ")
	public ResponseEntity<?> getTestByLessonId(@PathVariable("id") int id) {
			try {
				ReadTest result = readingIntroService.getTestByLessonId(id);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	@RequestMapping(value = "/readTest/lesson/{lessonid}/test/{testid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Reading Test by lessonid and testid", notes = "Reading Test by lessonid and testid")
	public ResponseEntity<?> getTestByLessonIdandTestId(@PathVariable("lessonid") int lessonid, @PathVariable("testid") int testid) {
			try {
				ReadTest result = readingIntroService.getTestByLessonandTestId(lessonid,testid);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	
	
	
	
	
}
