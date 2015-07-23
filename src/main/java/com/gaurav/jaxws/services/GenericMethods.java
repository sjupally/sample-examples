package com.gaurav.jaxws.services;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface GenericMethods {

	@WebMethod
	public String getFactorial(String inputString);

	@WebMethod
	public String getPrimeNumber(String inputString);

	@WebMethod
	public String getOddAndEven(String inputString);

}