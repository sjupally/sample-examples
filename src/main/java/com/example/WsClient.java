package com.example;

import java.util.List;

import org.tempuri.ArrayOfEmployeeBand;
import org.tempuri.EmployeeBand;
import org.tempuri.EmployeeDetailsWebService;
import org.tempuri.EmployeeDetailsWebServiceSoap;

public class WsClient {
	public static void main(String[] args) throws Exception {
		try {
			EmployeeDetailsWebService soapConnectionFactory = new EmployeeDetailsWebService();
			EmployeeDetailsWebServiceSoap soapConnection = soapConnectionFactory.getEmployeeDetailsWebServiceSoap();

			ArrayOfEmployeeBand soapResponse = soapConnection.getEmployeeBand();

			List<EmployeeBand> list = soapResponse.getEmployeeBand();
			for (EmployeeBand employeeBand : list) {
				System.out.println(employeeBand.getEmpBandId() + "->" + employeeBand.getEmpBandName()+ "->" + employeeBand.getEmpColumn3()+ "->" + employeeBand.getEmpColumn4()+ "->" + employeeBand.getEmpColumn5());
				// System.out.println(employeeBand.getEmpBandName());
			}

			// soapConnection.close();
		} catch (Exception e) {
			System.err.println("Error occurred while sending SOAP Request to Server");
			e.printStackTrace();
		}
	}

}
