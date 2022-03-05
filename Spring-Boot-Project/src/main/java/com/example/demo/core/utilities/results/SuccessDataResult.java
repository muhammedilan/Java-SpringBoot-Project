package com.example.demo.core.utilities.results;

public class SuccessDataResult<D> extends DataResult<D>{

	public SuccessDataResult(D data, String message) {
		super(data, message,true);
	}

}
