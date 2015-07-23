package com.gaurav.jaxws.services;

import javax.jws.WebService;

//GenericMethods interface Implementation
@WebService(endpointInterface = "com.gaurav.jaxws.services.GenericMethods")
public class GenericMethodsImpl implements GenericMethods {

	public boolean isParsableToInteger(String strValue) {
		try {
			Integer.parseInt(strValue);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	@Override
	public String getFactorial(String inputString) {

		String factorialResult = "Not a Valid Number";

		if (inputString == null || inputString.trim().length() == 0) {
			return "";
		}

		if (isParsableToInteger(inputString)) {

			Long number = Long.parseLong(inputString);

			Long factorial = number;

			for (Long i = (number - 1); i > 1; i--) {
				factorial = factorial * i;
			}
			factorialResult = "Factorial of given number " + number + " is " + String.valueOf(factorial);

		}

		return factorialResult;
	}

	@Override
	public String getPrimeNumber(String inputString) {
		int result;
		String returnValue = "Not a Valid Number";
		boolean flag = true;
		if (isParsableToInteger(inputString)) {
			int number = Integer.parseInt(inputString);
			for (int i = 2; i <= number / 2; i++) {
				result = number % i;
				if (result == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				returnValue = number + " is Prime Number";
			else
				returnValue = number + " is not Prime Number";
		}
		return returnValue;
	}

	@Override
	public String getOddAndEven(String inputString) {
		String returnValue = "Not a Valid Number";
		if (isParsableToInteger(inputString)) {
			int number = Integer.parseInt(inputString);
			if (number % 2 == 0)
				returnValue = number + " is even number";
			else
				returnValue = number + " is odd number";
		}
		return returnValue;
	}
}
