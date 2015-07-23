
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEmployee_reportsdata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEmployee_reportsdata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="employee_reportsdata" type="{http://tempuri.org/}employee_reportsdata" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEmployee_reportsdata", propOrder = {
    "employeeReportsdata"
})
public class ArrayOfEmployeeReportsdata {

    @XmlElement(name = "employee_reportsdata", nillable = true)
    protected List<EmployeeReportsdata> employeeReportsdata;

    /**
     * Gets the value of the employeeReportsdata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeReportsdata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeReportsdata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeReportsdata }
     * 
     * 
     */
    public List<EmployeeReportsdata> getEmployeeReportsdata() {
        if (employeeReportsdata == null) {
            employeeReportsdata = new ArrayList<EmployeeReportsdata>();
        }
        return this.employeeReportsdata;
    }

}
