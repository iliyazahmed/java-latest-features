package com.finno.finno_payments_service.dto;

import lombok.Data;

@Data
public class StandardResponse {
	private Integer statusCode;
	private Boolean status;
	private String responseDescription;
	private String transactionId;
}
