package com.dart.carrentalplatform.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Response exception(Exception e) {
		log.error(e.getMessage());
		e.printStackTrace();
		return Response.fail().setMessage("异常：" + e.toString());
	}
}
