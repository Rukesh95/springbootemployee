package com.scg.exceptions;


import java.util.Date;

import lombok.Getter;

@Getter
public class CustomErrorResponse {
	private int statusCode;
	private Date timestamp;
	private String message;
	private String description;

//	public CustomErrorResponse(final String errorMsg) {
//		this.message = errorMsg;
//	}

	public CustomErrorResponse(final int statusCode, final Date localDateTime, final String message,
			final String description) {
		this.statusCode= statusCode;
		this.timestamp = localDateTime;
		this.message = message;
		this.description = description;
	}

}
