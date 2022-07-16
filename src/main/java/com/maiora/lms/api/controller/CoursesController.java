package com.maiora.lms.api.controller;

import java.lang.reflect.Type;
import java.util.Date;
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

import com.maiora.lms.api.dto.AssignmentsDTO;
import com.maiora.lms.api.dto.coursesDTO;
import com.maiora.lms.api.model.CourseSave;
import com.maiora.lms.api.model.PaymentModel;
import com.maiora.lms.api.model.courses;
import com.maiora.lms.api.service.CoursesService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/maioraservice")
@Api(description = "REST API for Address Of LMS")
public class CoursesController {

	
	@Autowired
	private CoursesService courseService;
	
	/***
	 * Get all Filters
	 * 
	 * @return
	 */
	@RequestMapping(value = "/Courses/from/{from}/pagesize/{pagesize}/filtertext/{filtertext}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The Lists Of filtered assignments", notes = "Get All The Lists Of filtered assignments")
	public ResponseEntity<?> getAllFilters(@PathVariable("from") int from, @PathVariable("pagesize") int pagesize,
			@PathVariable("filtertext") String filtertext) {
		
		try {
			String logmsg = "Get all Address Information -from:" + from + "pagesize" + pagesize + "filtertext"
					+ filtertext + "Date" + new Date();
			ModelMapper modelMapper = new ModelMapper();
			Type listType = new TypeToken<List<AssignmentsDTO>>() {
			}.getType();

			List<courses> coursesModel = courseService.readAllcourses(from, pagesize, filtertext);
			List<coursesDTO> assignDTO = modelMapper.map(coursesModel,listType);
			return new ResponseEntity<>(assignDTO, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	/***
	 * Create new Assignment
	 * 
	 * @param Assignment
	 * @return
	 */
	@RequestMapping(value = "/Courses/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Create A New Address")
	public ResponseEntity<?> createNewAdds(@Validated @RequestBody coursesDTO coursesDTO) {
		try {
			ModelMapper modelMapper = new ModelMapper();
			courses coursesModel = modelMapper.map(coursesDTO, courses.class);
			courses result = courseService.addcourses(coursesModel);
			return new ResponseEntity<courses>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	/***
	 * Update Assignment information
	 * 
	 * @param config
	 * @return
	 */
	@RequestMapping(value = "/Courses/v1/update", method = RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value = "Updateing The address Based On The Necessaity", notes = "Updating The address")
	public ResponseEntity<?> updateOutlet(@RequestBody coursesDTO coursesDTO) {
		try {
			ModelMapper modelMapper = new ModelMapper();
			courses coursesModel = modelMapper.map(coursesDTO,courses.class);
			courses result = courseService.updateTheExistingcourses(coursesModel);
			return new ResponseEntity<courses>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage = "";
			if (ex.getCause() != null) {
				Throwable getmessage = ex.getCause().getCause();
				errorMessage = getmessage.getMessage();
			} else
				errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	/***
	 * Get all Data
	 * 
	 * @return
	 */
	@RequestMapping(value = "/courses/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllFilters() {
		
		try {
			ModelMapper modelMapper = new ModelMapper();
			Type listType = new TypeToken<List<coursesDTO>>() {
			}.getType();

			List<courses> sellerModel = courseService.getAllData();
			List<coursesDTO> sellerDTO = modelMapper.map(sellerModel,listType);
			return new ResponseEntity<>(sellerDTO, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
			
		}

	}
	
	
	
	/***
	 * Create new Course
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/NewCourses/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Courses", notes = "API Used To Create A New Courses")
	public ResponseEntity<?> createNewCourse(@Validated @RequestBody CourseSave courseSave) {
		try {
			
			CourseSave result = courseService.addNewCourses(courseSave);
			return new ResponseEntity<CourseSave>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	

	/***
	 * Get new Course
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/NewCourses/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Creating Courses", notes = "API Used To Create A New Courses")
	public ResponseEntity<?> getNewCourse() {
		try {
			
			List<CourseSave> courses = courseService.getAllCouData();
			return new ResponseEntity<>(courses, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
			
		}

	}
	
	
	
	
	
	/***
	 * Get new Course
	 * 
	 * @param Course
	 * @return
	 */
	@RequestMapping(value = "/NewCourses/v1/getById/{courseid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Creating Courses", notes = "API Used To Create A New Courses")
	public ResponseEntity<?> getCourseById(@PathVariable("courseid") int courseid) {
		try {
			
			CourseSave courses = courseService.findCourseById(courseid);
			return new ResponseEntity<>(courses, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
			
		}

	}
	
	
	
	/***
	 * Create new Course 
	 * 
	 * @param Payment 
	 * @return
	 */
	@RequestMapping(value = "/Coursenew/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating new course", notes = "API Used To Create A course ")
	public ResponseEntity<?> createNewPayemnt(@Validated @RequestBody PaymentModel paymentModel) {
		try {
			PaymentModel result = courseService.addCourse(paymentModel);
			System.out.println(result.toString());
			return new ResponseEntity<PaymentModel>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	/***
	 * get new Course 
	 * 
	 * @param  
	 * @return
	 */
	@RequestMapping(value = "/Coursenew/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Creating new course", notes = "API Used To Create A course ")
	public ResponseEntity<?> getNewCoursess() {
		try {
			
			List<PaymentModel> courses = courseService.getAllCoursesData();
			return new ResponseEntity<>(courses, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
			
		}
	}

	
	
	/***
	 * get new Course 
	 * 
	 * @param  
	 * @return
	 */
	@RequestMapping(value = "/Coursenew/v1/getById/{paymentid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Creating new course", notes = "API Used To Create A course ")
	public ResponseEntity<?> getNewCoursesById(@PathVariable("paymentid") int paymentid) {
		try {
			
			PaymentModel courses = courseService.getAllCoursesById(paymentid);
			return new ResponseEntity<>(courses, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
			
		}
	}
	
	
	
}
