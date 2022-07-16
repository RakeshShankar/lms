package com.maiora.lms.api.controller;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.maiora.lms.api.dto.AssignmentsDTO;
import com.maiora.lms.api.dto.coursesDTO;
import com.maiora.lms.api.model.Assignments;
import com.maiora.lms.api.model.CourseDetails;
import com.maiora.lms.api.model.Introduction;
import com.maiora.lms.api.model.LessonIntro;
import com.maiora.lms.api.service.IELTSIntroService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/maioraservice")
@Api(description = "REST API for IELTS Introduction")
public class IELTSIntroController {
	
	@Autowired
	private IELTSIntroService ieltsIntroSerice;
	

	/***
	 * Get all Course Data
	 * 
	 * @return
	 */
	@RequestMapping(value = "/coursesDesc/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All IELTS Course Introduction", notes = "Get All The Information")
	public ResponseEntity<?> getAllFilters() {
		
		try {
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
	
	
	/***
	 * Create IELTS Course Introduction
	 * 
	 * @param 
	 * @return
	 */
	@RequestMapping(value = "/coursesDesc/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Create IELTS Course Introduction", notes = "API Used To Create IELTS Course Introduction")
	public ResponseEntity<?> createNewCourse(@Validated @RequestBody CourseDetails coursedetails) {
		try {
			CourseDetails result = ieltsIntroSerice.addCourses(coursedetails);
			return new ResponseEntity<CourseDetails>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/***
	 * save IELTS Lesson
	 * 
	 * @param 
	 * @return
	 */
	@RequestMapping(value = "/lessonDesc/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Create IELTS Lesson Introduction", notes = "API Used To Create IELTS Lesson Introduction")
	public ResponseEntity<?> createNewLesson(@Validated @RequestBody LessonIntro lessonIntro) {
		try {
			LessonIntro result = ieltsIntroSerice.addLessons(lessonIntro);
			return new ResponseEntity<LessonIntro>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	

}
