package com.tqi.analisecredito.webfinancasbackend.exception;

//importando o status da requisação

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)

public class ResourceNotFoundExecption extends Exception {
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundExecption(String message) {
		super(message);
		
	}	
}


