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

import com.maiora.lms.api.model.IELTSAbout;
import com.maiora.lms.api.model.IELTSTest;
import com.maiora.lms.api.service.IELTSAboutService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/api/maioraservice")
@Api(description = "REST API for IELTS About page")
public class IELTSAboutController {
	
	@Autowired
	private IELTSAboutService ieltsAboutService;
	
	/***
	 * Save read Course Data
	 * 
	 * @return
	 */
	@RequestMapping(value = "/about/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save IELTS About", notes = "Save IELTS About")
	public ResponseEntity<?> createIELTSRead(@Validated @RequestBody IELTSAbout iELTSAbout) {
		try {
//			ModelMapper modelMapper = new ModelMapper();
//			System.out.println(introReadDTO.toString() + "Inside creta ");
//			Introduction introductionModel = modelMapper.map(introReadDTO, Introduction.class);
//			Introduction saveReadintro = ieltsIntroSerice.createReadCourse(introductionModel);
//			return new ResponseEntity<Introduction>(saveReadintro, HttpStatus.OK);
			System.out.println(iELTSAbout.toString()+ "Before saving");
			
			IELTSAbout addAbout = ieltsAboutService.addAbout(iELTSAbout);
			System.out.println("after saving");
			return new ResponseEntity<IELTSAbout>(addAbout, HttpStatus.OK);
		
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
	@RequestMapping(value = "/about/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllFilters() {
		
		try {
			ModelMapper modelMapper = new ModelMapper();
			Type listType = new TypeToken<List<IELTSAbout>>() {
			}.getType();

			List<IELTSAbout> aboutModel = ieltsAboutService.getAllData();
			List<IELTSAbout> sellerDTO = modelMapper.map(aboutModel,listType);
			return new ResponseEntity<>(sellerDTO, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	
	/***
	 * Save read Course Data
	 * 
	 * @return
	 */
	@RequestMapping(value = "/test/v1/creatde", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Save IELTS About", notes = "Save IELTS About")
	public ResponseEntity<?> createTest(@Validated @RequestBody IELTSTest iELTSAbout) {
		try {

			
			IELTSTest addAbout = ieltsAboutService.addTest(iELTSAbout);
			System.out.println("after saving");
			return new ResponseEntity<IELTSTest>(addAbout, HttpStatus.OK);
		
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	
	
	
	
	
	
	
	


}
