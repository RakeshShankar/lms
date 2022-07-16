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
import com.maiora.lms.api.dto.CountryDTO;
import com.maiora.lms.api.model.Assignments;
import com.maiora.lms.api.model.Country;
import com.maiora.lms.api.service.CountyService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/maioraservice")
@Api(description = "REST API for Address Of LMS")
public class CountryController {

	@Autowired
	private CountyService countryService;

	/***
	 * Get all Filters
	 * 
	 * @return
	 */
	@RequestMapping(value = "/Country/from/{from}/pagesize/{pagesize}/filtertext/{filtertext}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The Lists Of filtered assignments", notes = "Get All The Lists Of filtered assignments")
	public ResponseEntity<?> getAllFilters(@PathVariable("from") int from, @PathVariable("pagesize") int pagesize,
			@PathVariable("filtertext") String filtertext) {

		try {
			String logmsg = "Get all Address Information -from:" + from + "pagesize" + pagesize + "filtertext"
					+ filtertext + "Date" + new Date();
			ModelMapper modelMapper = new ModelMapper();
			Type listType = new TypeToken<List<CountryDTO>>() {
			}.getType();

			List<Country> countryModel = countryService.readAllCountry(from, pagesize, filtertext);
			List<CountryDTO> countryDTO = modelMapper.map(countryModel, listType);
			return new ResponseEntity<>(countryDTO, HttpStatus.OK);
			// return
			// restTemplate.getForObject("http://MallService/api/maioraservice/Mall/v1/from/1/pagesize/1/filtertext/1",
			// MallModel.class);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
			// return null;
		}

	}

	/***
	 * Create new Assignment
	 * 
	 * @param Assignment
	 * @return
	 */
	@RequestMapping(value = "/Country/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Create A New Address")
	public ResponseEntity<?> createNewAdds(@Validated @RequestBody CountryDTO countryDTO) {
		try {
			ModelMapper modelMapper = new ModelMapper();
			Country countryModel = modelMapper.map(countryDTO, Country.class);
			Country result = countryService.addCountry(countryModel);
			return new ResponseEntity<Country>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/Country/v1/update", method = RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value = "Updateing The address Based On The Necessaity", notes = "Updating The address")
	public ResponseEntity<?> updateOutlet(@RequestBody CountryDTO countryDTO) {
		try {
			ModelMapper modelMapper = new ModelMapper();
			Country countryModel = modelMapper.map(countryDTO, Country.class);
			Country result = countryService.updateTheExistingCountry(countryModel);
			return new ResponseEntity<Country>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/Country/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllFilters() {

		try {
			ModelMapper modelMapper = new ModelMapper();
			Type listType = new TypeToken<List<CountryDTO>>() {
			}.getType();

			List<Country> sellerModel = countryService.getAllData();
			List<CountryDTO> sellerDTO = modelMapper.map(sellerModel, listType);
			return new ResponseEntity<>(sellerDTO, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);

		}

	}

}
