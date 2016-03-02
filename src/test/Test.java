package test;

import exceptionHandling.ExceptionHandler;

public class Test {

	public static void main(String[] args) {
		try {
			Test test = null;
			test.notify();
		} catch (Exception e) {
			ExceptionHandler.HandleException(e);
		}
	}

}
