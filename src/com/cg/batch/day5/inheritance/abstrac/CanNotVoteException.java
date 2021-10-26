package com.cg.batch.day5.inheritance.abstrac;

public class CanNotVoteException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	CanNotVoteException() {
		super();
	}

	CanNotVoteException(String message) {
		super(message);
	}
}
