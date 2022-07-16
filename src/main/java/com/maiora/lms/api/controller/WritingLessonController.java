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

import com.maiora.lms.api.model.ExcercisesWrite;
import com.maiora.lms.api.model.WriteLessonOne;
import com.maiora.lms.api.model.WriteTestModel;
import com.maiora.lms.api.service.WritingLessonService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/maioraservice")
@Api(description = "REST API for Reading Intro Of LMS")
public class WritingLessonController {

	@Autowired
	private WritingLessonService writingLessonService;

	@RequestMapping(value = "/writeLesson/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Reading Introduction", notes = "API Used To Save Reading Introduction")
	public ResponseEntity<?> createWriteLessonOne(@Validated @RequestBody WriteLessonOne writeLessonOne) {
		try {
			WriteLessonOne result = writingLessonService.saveLesson(writeLessonOne);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLesson/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllOneFilters() {

		try {
			List<WriteLessonOne> result = writingLessonService.getLessonData();
			for (WriteLessonOne readIntroModel : result) {
				System.out.println(readIntroModel);
			}
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLesson/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllOneById(@PathVariable("index") int index) {

		try {
			WriteLessonOne result = writingLessonService.getLessonDataById(index);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	@RequestMapping(value = "writeExercise/lesson/{lessonid}/exercise/{excerciseid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getWritingExercisebylessonidandexerciseid (@PathVariable("lessonid") int lessonid,@PathVariable("excerciseid") int excerciseid) {

		try {
			ExcercisesWrite result = writingLessonService.getWritingExercisebylessonidandexerciseid(lessonid,excerciseid);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	@RequestMapping(value = "writeTest/lesson/{lessonid}/test/{testid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getWritingTestbylessonidandtestid (@PathVariable("lessonid") int lessonid,@PathVariable("testid") int testid) {

		try {
			WriteTestModel result = writingLessonService.getWritingTestbylessonidandtestid(lessonid,testid);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	
	
	
	

	@RequestMapping(value = "/writeLessonTwo/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Reading Introduction", notes = "API Used To Save Reading Introduction")
	public ResponseEntity<?> createWriteLessonTwo(@Validated @RequestBody WriteLessonOne writeLessonOne) {
		try {

			WriteLessonOne result = writingLessonService.saveLesson(writeLessonOne);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonTwo/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllTwoFilters() {

		try {
			List<WriteLessonOne> result = writingLessonService.getLessonData();
			for (WriteLessonOne readIntroModel : result) {
				System.out.println(readIntroModel);
			}
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonTwo/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllTwoById(@PathVariable("index") int index) {

		try {
			WriteLessonOne result = writingLessonService.getLessonDataById(index);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonThree/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Reading Introduction", notes = "API Used To Save Reading Introduction")
	public ResponseEntity<?> createWriteLessonThree(@Validated @RequestBody WriteLessonOne writeLessonOne) {
		try {

			WriteLessonOne result = writingLessonService.saveLesson(writeLessonOne);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonThree/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllThreeFilters() {

		try {
			List<WriteLessonOne> result = writingLessonService.getLessonData();
			for (WriteLessonOne readIntroModel : result) {
				System.out.println(readIntroModel);
			}
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonThree/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllThreeById(@PathVariable("index") int index) {

		try {
			WriteLessonOne result = writingLessonService.getLessonDataById(index);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonFour/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Reading Introduction", notes = "API Used To Save Reading Introduction")
	public ResponseEntity<?> createWriteLessonFour(@Validated @RequestBody WriteLessonOne writeLessonOne) {
		try {

			WriteLessonOne result = writingLessonService.saveLesson(writeLessonOne);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonFour/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllFourFilters() {

		try {
			List<WriteLessonOne> result = writingLessonService.getLessonData();
			for (WriteLessonOne readIntroModel : result) {
				System.out.println(readIntroModel);
			}
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonFour/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllFourById(@PathVariable("index") int index) {

		try {
			WriteLessonOne result = writingLessonService.getLessonDataById(index);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonFive/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Reading Introduction", notes = "API Used To Save Reading Introduction")
	public ResponseEntity<?> createWriteLessonFive(@Validated @RequestBody WriteLessonOne writeLessonOne) {
		try {

			WriteLessonOne result = writingLessonService.saveLesson(writeLessonOne);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonFive/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllFiveFilters() {

		try {
			List<WriteLessonOne> result = writingLessonService.getLessonData();
			for (WriteLessonOne readIntroModel : result) {
				System.out.println(readIntroModel);
			}
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonFive/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllByIdFive(@PathVariable("index") int index) {

		try {
			WriteLessonOne result = writingLessonService.getLessonDataById(index);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonSix/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Reading Introduction", notes = "API Used To Save Reading Introduction")
	public ResponseEntity<?> createWriteLessonSix(@Validated @RequestBody WriteLessonOne writeLessonOne) {
		try {

			WriteLessonOne result = writingLessonService.saveLesson(writeLessonOne);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonSix/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllSixFilters() {

		try {
			List<WriteLessonOne> result = writingLessonService.getLessonData();
			for (WriteLessonOne readIntroModel : result) {
				System.out.println(readIntroModel);
			}
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonSix/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllSixById(@PathVariable("index") int index) {

		try {
			WriteLessonOne result = writingLessonService.getLessonDataById(index);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonSeven/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Reading Introduction", notes = "API Used To Save Reading Introduction")
	public ResponseEntity<?> createWriteLessonSeven(@Validated @RequestBody WriteLessonOne writeLessonOne) {
		try {

			WriteLessonOne result = writingLessonService.saveLesson(writeLessonOne);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonSeven/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllSevenFilters() {

		try {
			List<WriteLessonOne> result = writingLessonService.getLessonData();
			for (WriteLessonOne readIntroModel : result) {
				System.out.println(readIntroModel);
			}
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonSeven/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllSevenById(@PathVariable("index") int index) {

		try {
			WriteLessonOne result = writingLessonService.getLessonDataById(index);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonEight/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Reading Introduction", notes = "API Used To Save Reading Introduction")
	public ResponseEntity<?> createWriteLessonEight(@Validated @RequestBody WriteLessonOne writeLessonOne) {
		try {

			WriteLessonOne result = writingLessonService.saveLesson(writeLessonOne);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonEight/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllEightFilters() {

		try {
			List<WriteLessonOne> result = writingLessonService.getLessonData();
			for (WriteLessonOne readIntroModel : result) {
				System.out.println(readIntroModel);
			}
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonEight/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllEightById(@PathVariable("index") int index) {

		try {
			WriteLessonOne result = writingLessonService.getLessonDataById(index);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonNine/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save Reading Introduction", notes = "API Used To Save Reading Introduction")
	public ResponseEntity<?> createWriteLessonNine(@Validated @RequestBody WriteLessonOne writeLessonOne) {
		try {

			WriteLessonOne result = writingLessonService.saveLesson(writeLessonOne);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonNine/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllNineFilters() {

		try {
			List<WriteLessonOne> result = writingLessonService.getLessonData();
			for (WriteLessonOne readIntroModel : result) {
				System.out.println(readIntroModel);
			}
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	@RequestMapping(value = "/writeLessonNine/v1/getById/{index}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get The read intro data", notes = "Get All The Information")
	public ResponseEntity<?> getAllNineById(@PathVariable("index") int index) {

		try {
			WriteLessonOne result = writingLessonService.getLessonDataById(index);
			return new ResponseEntity<>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

}
