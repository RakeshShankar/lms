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

import com.maiora.lms.api.model.ListenExerOne;
import com.maiora.lms.api.model.ListenExerThree;
import com.maiora.lms.api.model.TestOneExerModel;
import com.maiora.lms.api.model.TestThreeExerModel;
import com.maiora.lms.api.model.TestTwoExerModel;
import com.maiora.lms.api.model.WriteTestModel;
import com.maiora.lms.api.service.ReadTestService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/maioraservice")
@Api(description = "REST API for Address Of LMS")
public class ReadExerciseController {

	@Autowired
	private ReadTestService readTestService;

	/***
	 * Create new Test
	 * 
	 * @param Assignment
	 * @return
	 */
	@RequestMapping(value = "/writetestone/v1/create", method = RequestMethod.POST)
	@ResponseBody
//		@ApiOperation(value = "Creating Address", notes = "API Used To Save Writing Exercise 1 introduction ")
	public ResponseEntity<?> createTestOne(@Validated @RequestBody TestOneExerModel testOneExerModel) {
		try {
			TestOneExerModel result = readTestService.addTestExerOne(testOneExerModel);
			return new ResponseEntity<TestOneExerModel>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/writetestone/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllFilters() {

		try {
			List<TestOneExerModel> model = readTestService.getAllExerOneData();
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	@RequestMapping(value = "/writetestone/v1/getById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllById(@PathVariable("id") int id) {

		try {
			TestOneExerModel model = readTestService.getAllExerOneDataById(id);
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	/***
	 * Create new Test
	 * 
	 * @param Assignment
	 * @return
	 */
	@RequestMapping(value = "/writetesttwo/v1/create", method = RequestMethod.POST)
	@ResponseBody
//	@ApiOperation(value = "Creating Address", notes = "API Used To Save Writing Exercise 1 introduction ")
	public ResponseEntity<?> createTestTwo(@Validated @RequestBody TestTwoExerModel testTwoExerModel) {
		try {
			TestTwoExerModel result = readTestService.addTestExerTwo(testTwoExerModel);
			return new ResponseEntity<TestTwoExerModel>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/writetesttwo/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllFiltersTwo() {

		try {
			List<TestTwoExerModel> model = readTestService.getAllExerTwoData();
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	@RequestMapping(value = "/writetesttwo/v1/getById/{exerid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllFiltersTwoById(@PathVariable("exerid") int exerid) {

		try {
			TestTwoExerModel model = readTestService.getAllExerTwoDataById(exerid);
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	
	
	
	
	

	@RequestMapping(value = "/writetestthree/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Save Writing Exercise 1 introduction ")
	public ResponseEntity<?> createTestTwo(@Validated @RequestBody TestThreeExerModel testThreeExerModel) {
		try {
			TestThreeExerModel result = readTestService.addTestExerThree(testThreeExerModel);
			return new ResponseEntity<TestThreeExerModel>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/writetestthree/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllFiltersThree() {

		try {
			List<TestThreeExerModel> model = readTestService.getAllExerThreeData();
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	@RequestMapping(value = "/writetestthree/v1/getById/{exerid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllFiltersThreeById(@PathVariable("exerid") int exerid) {

		try {
			TestThreeExerModel model = readTestService.getAllExerThreeDataById(exerid);
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	
	
	

	@RequestMapping(value = "/writingtestone/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Save Writing Exercise 1 introduction ")
	public ResponseEntity<?> createWritingTestOne(@Validated @RequestBody WriteTestModel writeTestModel) {
		try {
			WriteTestModel result = readTestService.createWritingTest(writeTestModel);
			return new ResponseEntity<WriteTestModel>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/writingtestone/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getWritingTestOne() {

		try {
			List<WriteTestModel> model = readTestService.getWritingTest();
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "/writingtestone/v1/getById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getWritingTestOneById(@PathVariable("id") int id) {

		try {
			WriteTestModel model = readTestService.getWritingTestById(id);
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	
	
	
	

	@RequestMapping(value = "/writingtesttwo/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Save Writing Exercise 1 introduction ")
	public ResponseEntity<?> createWritingTestTwo(@Validated @RequestBody WriteTestModel writeTestModel) {
		try {
			WriteTestModel result = readTestService.createWritingTest(writeTestModel);
			return new ResponseEntity<WriteTestModel>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/writingtesttwo/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getWritingTestTwo() {

		try {
			List<WriteTestModel> model = readTestService.getWritingTest();
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "/writingtesttwo/v1/getById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getWritingTestTwoById(@PathVariable("id") int id) {

		try {
			WriteTestModel model = readTestService.getWritingTestById(id);
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@RequestMapping(value = "/writingtestthree/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Save Writing Exercise 1 introduction ")
	public ResponseEntity<?> createWritingTestThree(@Validated @RequestBody WriteTestModel writeTestModel) {
		try {
			WriteTestModel result = readTestService.createWritingTest(writeTestModel);
			return new ResponseEntity<WriteTestModel>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/writingtestthree/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getWritingTestThree() {

		try {
			List<WriteTestModel> model = readTestService.getWritingTest();
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	
	@RequestMapping(value = "/writingtestthree/v1/getById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getWritingTestThreeeById(@PathVariable("id") int id) {

		try {
			WriteTestModel model = readTestService.getWritingTestById(id);
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	

	@RequestMapping(value = "/writingtestfour/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Save Writing Exercise 1 introduction ")
	public ResponseEntity<?> createWritingTestFour(@Validated @RequestBody WriteTestModel writeTestModel) {
		try {
			WriteTestModel result = readTestService.createWritingTest(writeTestModel);
			return new ResponseEntity<WriteTestModel>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/writingtestfour/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getWritingTestFour() {

		try {
			List<WriteTestModel> model = readTestService.getWritingTest();
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "/writingtestfour/v1/getById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getWritingTestFourById(@PathVariable("id") int id) {

		try {
			WriteTestModel model = readTestService.getWritingTestById(id);
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	
	
	

	/***
	 * Create new Test
	 * 
	 * @param Assignment
	 * @return
	 */
	@RequestMapping(value = "/listenexerone/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Save Writing Exercise 1 introduction ")
	public ResponseEntity<?> createTestOne(@Validated @RequestBody ListenExerOne listenExerOne) {
		try {
			ListenExerOne result = readTestService.addListenExerOne(listenExerOne);
			return new ResponseEntity<ListenExerOne>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/listenexerone/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllListenFiltersOne() {

		try {
			List<ListenExerOne> model = readTestService.getAllListenExerOne();
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	@RequestMapping(value = "/listenexerone/v1/getById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllListenFiltersOneById(@PathVariable("id") int id) {

		try {
			ListenExerOne model = readTestService.getAllListenExerOneById(id);
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	

	@RequestMapping(value = "/listenexertwo/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Save Writing Exercise 1 introduction ")
	public ResponseEntity<?> createTestTwo(@Validated @RequestBody ListenExerOne listenExerOne) {
		try {
			ListenExerOne result = readTestService.addListenExerOne(listenExerOne);
			return new ResponseEntity<ListenExerOne>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/listenexertwo/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllListenFiltersTwo() {

		try {
			List<ListenExerOne> model = readTestService.getAllListenExerOne();
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	@RequestMapping(value = "/listenexertwo/v1/getById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllListenFiltersTwoById(@PathVariable("id") int id) {

		try {
			ListenExerOne model = readTestService.getAllListenExerOneById(id);
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "/listenexerthree/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Save Writing Exercise 1 introduction ")
	public ResponseEntity<?> createTestThree(@Validated @RequestBody ListenExerThree listenExerThree) {
		try {
			ListenExerThree result = readTestService.addListenExerThree(listenExerThree);
			return new ResponseEntity<ListenExerThree>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/listenexerthree/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllListenFiltersThree() {

		try {
			List<ListenExerThree> model = readTestService.getAllListenExerThree();
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	
	@RequestMapping(value = "/listenexerthree/v1/getById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllListenFiltersThreeById(@PathVariable("id") int id) {

		try {
			ListenExerThree model = readTestService.getAllListenExerThreeById(id);
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	   
	
	
	
	
	@RequestMapping(value = "/listenexerfive/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Save Writing Exercise 1 introduction ")
	public ResponseEntity<?> createTestFive(@Validated @RequestBody ListenExerOne listenExerOne) {
		try {
			ListenExerOne result = readTestService.addListenExerFive(listenExerOne);
			return new ResponseEntity<ListenExerOne>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/listenexerfive/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllListenFiltersFive() {

		try {
			List<ListenExerOne> model = readTestService.getAllListenExerFive();
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
	
	@RequestMapping(value = "/listenexerfive/v1/getById/{id}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllListenFiltersFiveById(@PathVariable("id") int id) {

		try {
			ListenExerOne model = readTestService.getAllListenExerFiveById(id);
			return new ResponseEntity<>(model, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	
	
}
