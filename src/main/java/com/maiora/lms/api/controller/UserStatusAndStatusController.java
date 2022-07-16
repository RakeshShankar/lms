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
import com.maiora.lms.api.dto.UserCourseandStatusDTO;
import com.maiora.lms.api.model.Assignments;
import com.maiora.lms.api.model.UserCourseandStatus;
import com.maiora.lms.api.service.UserCourseandStatusService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/maioraservice")
@Api(description = "REST API for Address Of LMS")
public class UserStatusAndStatusController {
	
	@Autowired
	private UserCourseandStatusService userStatusService;
	
	/***
	 * Get all Filters
	 * 
	 * @return
	 */
	@RequestMapping(value = "/userCourseStatus/from/{from}/pagesize/{pagesize}/filtertext/{filtertext}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The Lists Of filtered assignments", notes = "Get All The Lists Of filtered assignments")
	public ResponseEntity<?> getAllFilters(@PathVariable("from") int from, @PathVariable("pagesize") int pagesize,
			@PathVariable("filtertext") String filtertext) {
		
		try {
			String logmsg = "Get all Address Information -from:" + from + "pagesize" + pagesize + "filtertext"
					+ filtertext + "Date" + new Date();
			ModelMapper modelMapper = new ModelMapper();
			Type listType = new TypeToken<List<UserCourseandStatusDTO>>() {
			}.getType();

			List<UserCourseandStatus> userCouseStatusModel = userStatusService.readAllUserCourseStatus(from, pagesize, filtertext);
			List<UserCourseandStatusDTO> userCouseStatusDTO = modelMapper.map(userCouseStatusModel,listType);
			return new ResponseEntity<>(userCouseStatusDTO, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	/***
	 * Create new userCourseStatus
	 * 
	 * @param userCourseStatus
	 * @return
	 */
	@RequestMapping(value = "/userCourseStatus/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Create A New Address")
	public ResponseEntity<?> createNewAdds(@Validated @RequestBody UserCourseandStatusDTO userCouseStatusDTO) {
		try {
			ModelMapper modelMapper = new ModelMapper();
			UserCourseandStatus userCouseStatusModel = modelMapper.map(userCouseStatusDTO, UserCourseandStatus.class);
			UserCourseandStatus result = userStatusService.addUserCourseStatus(userCouseStatusModel);
			return new ResponseEntity<UserCourseandStatus>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/userCourseStatus/v1/update", method = RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value = "Updateing The address Based On The Necessaity", notes = "Updating The address")
	public ResponseEntity<?> updateOutlet(@RequestBody UserCourseandStatusDTO assignDTO) {
		try {
			ModelMapper modelMapper = new ModelMapper();
			UserCourseandStatus userCouseStatusModel = modelMapper.map(assignDTO,UserCourseandStatus.class);
			UserCourseandStatus result = userStatusService.updateTheExistingUserCourseStatus(userCouseStatusModel);
			return new ResponseEntity<UserCourseandStatus>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/userCourseStatus/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllFilters() {
		
		try {
			ModelMapper modelMapper = new ModelMapper();
			Type listType = new TypeToken<List<UserCourseandStatusDTO>>() {
			}.getType();

			List<UserCourseandStatus> sellerModel = userStatusService.getAllData();
			List<UserCourseandStatusDTO> sellerDTO = modelMapper.map(sellerModel,listType);
			return new ResponseEntity<>(sellerDTO, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

}
