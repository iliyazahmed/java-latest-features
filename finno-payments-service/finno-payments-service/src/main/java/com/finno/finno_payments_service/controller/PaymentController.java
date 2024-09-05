package com.finno.finno_payments_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finno.finno_payments_service.dto.GetTransactionDetailsResponse;
import com.finno.finno_payments_service.dto.PaymentRequest;
import com.finno.finno_payments_service.dto.StandardResponse;
import com.finno.finno_payments_service.dto.StandardResponseByEmail;
import com.finno.finno_payments_service.dto.UpdateRequest;
import com.finno.finno_payments_service.entity.PaymentDTO;
import com.finno.finno_payments_service.service.PaymentService;

@RestController
@RequestMapping("/payment-gateway")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@PostMapping("/save")
	public ResponseEntity<StandardResponse> saveTransaction(@RequestBody PaymentRequest paymentRequest) {
		StandardResponse saveTransaction = paymentService.saveTransaction(paymentRequest);
		if (saveTransaction.isStatus()) {
			return new ResponseEntity<>(saveTransaction, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(saveTransaction, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/find-by-id/{transactionId}")
	public ResponseEntity<GetTransactionDetailsResponse> findTransactionDetails(
			@PathVariable("transactionId") String transactionId) {
		GetTransactionDetailsResponse transactionDetails = paymentService.getTransactionDetails(transactionId);
		if (transactionDetails.isStatus()) {
			return new ResponseEntity<>(transactionDetails, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(transactionDetails, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/update-details")
	public ResponseEntity<StandardResponse> updateDetails(@RequestBody UpdateRequest updateReq) {
		StandardResponse saveTransaction = paymentService.updateCustomerDetails(updateReq);
		if (saveTransaction.isStatus()) {
			return new ResponseEntity<>(saveTransaction, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(saveTransaction, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/find-by-email/{emailId}")
	public ResponseEntity<StandardResponseByEmail> findTrnsactionbyEmail(@PathVariable("emailId") String emailId) {
		StandardResponseByEmail byEmail = paymentService.getByEmail(emailId);
		if (byEmail.isStatus()) {
			return new ResponseEntity<>(byEmail, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(byEmail, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
