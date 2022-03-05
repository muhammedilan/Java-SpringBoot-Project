package com.example.demo.core.utilities.results;

public class ErrorDataResult<D> extends DataResult<D> {

	public ErrorDataResult(D data, String message) {
		super(data, message,false);
	}

}
