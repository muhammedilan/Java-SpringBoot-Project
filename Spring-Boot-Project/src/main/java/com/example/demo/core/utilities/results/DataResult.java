package com.example.demo.core.utilities.results;

public class DataResult<D> extends Result {

	private D data;
	
	public DataResult(D data,String message, boolean success) {
		super(message, success);
		this.data = data;
	}
	public DataResult(String message,D data) {
		super(message);
		this.data = data;
	}
	
	public D getData() {
		return this.data;
	}
	
}
