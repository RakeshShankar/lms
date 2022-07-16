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
import com.maiora.lms.api.dto.EnquiryDetailsDTO;
import com.maiora.lms.api.model.Assignments;
import com.maiora.lms.api.model.EnquiryDetails;
import com.maiora.lms.api.service.EnquireDetailsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/maioraservice")
@Api(description = "REST API for Address Of LMS")
public class EnquiryDetailsController {
	
	@Autowired
	private EnquireDetailsService enquiryDetailService;
	/***
	 * Get all Filters
	 * 
	 * @return
	 */
	@RequestMapping(value = "/EnquireDetails/from/{from}/pagesize/{pagesize}/filtertext/{filtertext}", method = RequestMethod.GET)
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

			List<EnquiryDetails> enquiryDetailModel = enquiryDetailService.readAllEnquiryDetails(from, pagesize, filtertext);
			List<EnquiryDetailsDTO> assignDTO = modelMapper.map(enquiryDetailModel,listType);
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
	@RequestMapping(value = "/EnquireDetails/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Create A New Address")
	public ResponseEntity<?> createNewAdds(@Validated @RequestBody EnquiryDetailsDTO enquiryDetailDTO) {
		try {
			ModelMapper modelMapper = new ModelMapper();
			EnquiryDetails enquiryDetailModel = modelMapper.map(enquiryDetailDTO, EnquiryDetails.class);
			EnquiryDetails result = enquiryDetailService.addEnquiryDetails(enquiryDetailModel);
			return new ResponseEntity<EnquiryDetails>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/EnquireDetails/v1/update", method = RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value = "Updateing The address Based On The Necessaity", notes = "Updating The address")
	public ResponseEntity<?> updateOutlet(@RequestBody EnquiryDetailsDTO enquiryDetailDTO) {
		try {
			ModelMapper modelMapper = new ModelMapper();
			EnquiryDetails enquiryDetailModel = modelMapper.map(enquiryDetailDTO,EnquiryDetails.class);
			EnquiryDetails result = enquiryDetailService.updateTheExistingEnquiryDetails(enquiryDetailModel);
			return new ResponseEntity<EnquiryDetails>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/EnquiryDetails/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllFilters() {
		
		try {
			ModelMapper modelMapper = new ModelMapper();
			Type listType = new TypeToken<List<EnquiryDetailsDTO>>() {
			}.getType();

			List<EnquiryDetails> sellerModel = enquiryDetailService.getAllData();
			List<EnquiryDetailsDTO> sellerDTO = modelMapper.map(sellerModel,listType);
			return new ResponseEntity<>(sellerDTO, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	

}
