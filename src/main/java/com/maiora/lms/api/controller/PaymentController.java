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
import com.maiora.lms.api.dto.PaymentDTO;
import com.maiora.lms.api.model.Assignments;
import com.maiora.lms.api.model.Payment;
import com.maiora.lms.api.model.PaymentModel;
import com.maiora.lms.api.service.PaymentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/maioraservice")
@Api(description = "REST API for Address Of LMS")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	/***
	 * Get all Filters
	 * 
	 * @return
	 */
	@RequestMapping(value = "/Payment/from/{from}/pagesize/{pagesize}/filtertext/{filtertext}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The Lists Of filtered assignments", notes = "Get All The Lists Of filtered assignments")
	public ResponseEntity<?> getAllFilters(@PathVariable("from") int from, @PathVariable("pagesize") int pagesize,
			@PathVariable("filtertext") String filtertext) {
		
		try {
			String logmsg = "Get all Address Information -from:" + from + "pagesize" + pagesize + "filtertext"
					+ filtertext + "Date" + new Date();
			ModelMapper modelMapper = new ModelMapper();
			Type listType = new TypeToken<List<PaymentDTO>>() {
			}.getType();

			List<Payment> paymentModel = paymentService.readAllPayment(from, pagesize, filtertext);
			List<PaymentDTO> paymentDTO = modelMapper.map(paymentModel,listType);
			return new ResponseEntity<>(paymentDTO, HttpStatus.OK);
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
	@RequestMapping(value = "/Payment/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Address", notes = "API Used To Create A New Address")
	public ResponseEntity<?> createNewAdds(@Validated @RequestBody PaymentDTO paymentDTO) {
		try {
			ModelMapper modelMapper = new ModelMapper();
			Payment paymentModel = modelMapper.map(paymentDTO, Payment.class);
			Payment result = paymentService.addPayment(paymentModel);
			return new ResponseEntity<Payment>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/Payment/v1/update", method = RequestMethod.PUT)
	@ResponseBody
	@ApiOperation(value = "Updateing The address Based On The Necessaity", notes = "Updating The address")
	public ResponseEntity<?> updateOutlet(@RequestBody PaymentDTO paymentDTO) {
		try {
			ModelMapper modelMapper = new ModelMapper();
			Payment paymentModel = modelMapper.map(paymentDTO,Payment.class);
			Payment result = paymentService.updateTheExistingAssignment(paymentModel);
			return new ResponseEntity<Payment>(result, HttpStatus.OK);
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
	@RequestMapping(value = "/Payment/v1/getAll", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Get All The ", notes = "Get All The Information")
	public ResponseEntity<?> getAllFilters() {
		
		try {
			ModelMapper modelMapper = new ModelMapper();
			Type listType = new TypeToken<List<PaymentDTO>>() {
			}.getType();

			List<Payment> sellerModel = paymentService.getAllData();
			List<PaymentDTO> sellerDTO = modelMapper.map(sellerModel,listType);
			return new ResponseEntity<>(sellerDTO, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}
	
		
	/***
	 * Create new Payment 
	 * 
	 * @param Payment 
	 * @return
	 */
	@RequestMapping(value = "/PaymentIntegration/v1/create", method = RequestMethod.POST)
	@ResponseBody
	@ApiOperation(value = "Creating Payment Integration ", notes = "API Used To Create A Payment Integration ")
	public ResponseEntity<?> createNewPayemnt(@Validated @RequestBody PaymentModel paymentModel) {
		try {
			PaymentModel result = paymentService.addPaymentIntegration(paymentModel);
			return new ResponseEntity<PaymentModel>(result, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}

	}

	
	/***
	 * Create new Payment 
	 * 
	 * @param Payment 
	 * @return
	 */
	@RequestMapping(value = "/PaymentIntegration/v1/getById/{paymentid}", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Creating Payment Integration ", notes = "API Used To Create A Payment Integration ")
	public ResponseEntity<?> getNewPayemntById(@PathVariable("paymentid") int paymentid) {
		try {
			PaymentModel datas = paymentService.getAllPayDataById(paymentid);
			return new ResponseEntity<>(datas, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	
	

	/***
	 * Create new Payment 
	 * 
	 * @param Payment 
	 * @return
	 */
	@RequestMapping(value = "/PaymentIntegration/v1/get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "Creating Payment Integration ", notes = "API Used To Create A Payment Integration ")
	public ResponseEntity<?> getNewPayemnt() {
		try {
			List<PaymentModel> datas = paymentService.getAllPayData();
			return new ResponseEntity<>(datas, HttpStatus.OK);
		} catch (Exception ex) {
			String errorMessage;
			errorMessage = ex.getMessage();
			return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
		}


	}

}
