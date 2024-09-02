package com.finno.finno_payments_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finno.finno_payments_service.dto.PaymentRequest;
import com.finno.finno_payments_service.dto.StandardResponse;
import com.finno.finno_payments_service.service.PaymentService;

@RestController
@RequestMapping("/payment-gateway")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@PostMapping("/save")
	public ResponseEntity<StandardResponse> saveTransaction(@RequestBody PaymentRequest paymentRequest) {
		StandardResponse saveTransaction = paymentService.saveTransaction(paymentRequest);
		if (saveTransaction.getStatus()) {
			return new ResponseEntity<>(saveTransaction, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>(saveTransaction, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}
