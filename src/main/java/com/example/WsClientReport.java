package com.example;

import java.util.List;

import org.tempuri.ArrayOfEmployeeBand;
import org.tempuri.ArrayOfEmployeeReportsdata;
import org.tempuri.EmployeeBand;
import org.tempuri.EmployeeDetailsWebService;
import org.tempuri.EmployeeDetailsWebServiceSoap;
import org.tempuri.EmployeeReportsdata;

public class WsClientReport {
	public static void main(String[] args) throws Exception {
		try {
			EmployeeDetailsWebService soapConnectionFactory = new EmployeeDetailsWebService();
			EmployeeDetailsWebServiceSoap soapConnection = soapConnectionFactory.getEmployeeDetailsWebServiceSoap();

			ArrayOfEmployeeReportsdata soapResponse = soapConnection.getReportData();

			List<EmployeeReportsdata> list = soapResponse.getEmployeeReportsdata();
			for (EmployeeReportsdata employeeReportsdata : list) {
				
			}

			// soapConnection.close();
		} catch (Exception e) {
			System.err.println("Error occurred while sending SOAP Request to Server");
			e.printStackTrace();
		}
	}

}
