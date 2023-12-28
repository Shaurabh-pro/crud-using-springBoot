package com.SpringDemo.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ressourceName;
	private String fieldName;
	private Object fieldValue;
	
	
	public ResourceNotFoundException(String ressourceName, String fieldName, Object fieldValue) {
		super();
		this.ressourceName = ressourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}


	public String getRessourceName() {
		return ressourceName;
	}


	public String getFieldName() {
		return fieldName;
	}


	public Object getFieldValue() {
		return fieldValue;
	}
	
	
	
	
	
}

