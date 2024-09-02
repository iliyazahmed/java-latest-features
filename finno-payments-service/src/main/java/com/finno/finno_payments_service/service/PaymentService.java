package com.finno.finno_payments_service.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finno.finno_payments_service.dto.PaymentRequest;
import com.finno.finno_payments_service.dto.StandardResponse;
import com.finno.finno_payments_service.entity.PaymentDTO;
import com.finno.finno_payments_service.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	public StandardResponse saveTransaction(PaymentRequest paymentRequest) {
		StandardResponse response = new StandardResponse();
		PaymentDTO paymentDTO = new PaymentDTO();
		paymentDTO.setTransaction_id(UUID.randomUUID().toString());
		paymentDTO.setUsername(paymentRequest.getUsername());
		paymentDTO.setEmail(paymentRequest.getEmailId());
		paymentDTO.setAmount(paymentRequest.getAmount());
		paymentDTO.setPayment_type(paymentRequest.getPaymentType());
		paymentDTO.setDate(getCurrentDate());

		PaymentDTO saveTrnsResponse = paymentRepository.save(paymentDTO);
		if (saveTrnsResponse.getTransaction_id() != null) {
			response.setResponseDescription("Transaction save successfully");
			response.setStatus(true);
			response.setStatusCode(201);
			response.setTransactionId(saveTrnsResponse.getTransaction_id());
		} else {
			response.setResponseDescription("Unable save Transaction ");
			response.setStatus(false);
			response.setStatusCode(500);
		}
		return response;
	}

	private String getCurrentDate() {
		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());
		return ts.toString();
	}

}
