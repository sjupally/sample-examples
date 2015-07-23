
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetReportDataResult" type="{http://tempuri.org/}ArrayOfEmployee_reportsdata" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getReportDataResult"
})
@XmlRootElement(name = "GetReportDataResponse")
public class GetReportDataResponse {

    @XmlElement(name = "GetReportDataResult")
    protected ArrayOfEmployeeReportsdata getReportDataResult;

    /**
     * Gets the value of the getReportDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEmployeeReportsdata }
     *     
     */
    public ArrayOfEmployeeReportsdata getGetReportDataResult() {
        return getReportDataResult;
    }

    /**
     * Sets the value of the getReportDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEmployeeReportsdata }
     *     
     */
    public void setGetReportDataResult(ArrayOfEmployeeReportsdata value) {
        this.getReportDataResult = value;
    }

}
