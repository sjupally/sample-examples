
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for employee_band complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employee_band">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}EntityObject">
 *       &lt;sequence>
 *         &lt;element name="Emp_BandId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Emp_Band_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Modified" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Emp_column3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emp_column4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emp_column5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emp_column6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emp_column7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emp_column8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee_band", propOrder = {
    "empBandId",
    "empBandName",
    "created",
    "modified",
    "empColumn3",
    "empColumn4",
    "empColumn5",
    "empColumn6",
    "empColumn7",
    "empColumn8"
})
public class EmployeeBand
    extends EntityObject
{

    @XmlElement(name = "Emp_BandId")
    protected long empBandId;
    @XmlElement(name = "Emp_Band_Name")
    protected String empBandName;
    @XmlElement(name = "Created", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "Modified", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modified;
    @XmlElement(name = "Emp_column3")
    protected String empColumn3;
    @XmlElement(name = "Emp_column4")
    protected String empColumn4;
    @XmlElement(name = "Emp_column5")
    protected String empColumn5;
    @XmlElement(name = "Emp_column6")
    protected String empColumn6;
    @XmlElement(name = "Emp_column7")
    protected String empColumn7;
    @XmlElement(name = "Emp_column8")
    protected String empColumn8;

    /**
     * Gets the value of the empBandId property.
     * 
     */
    public long getEmpBandId() {
        return empBandId;
    }

    /**
     * Sets the value of the empBandId property.
     * 
     */
    public void setEmpBandId(long value) {
        this.empBandId = value;
    }

    /**
     * Gets the value of the empBandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpBandName() {
        return empBandName;
    }

    /**
     * Sets the value of the empBandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpBandName(String value) {
        this.empBandName = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the modified property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModified() {
        return modified;
    }

    /**
     * Sets the value of the modified property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModified(XMLGregorianCalendar value) {
        this.modified = value;
    }

    /**
     * Gets the value of the empColumn3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpColumn3() {
        return empColumn3;
    }

    /**
     * Sets the value of the empColumn3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpColumn3(String value) {
        this.empColumn3 = value;
    }

    /**
     * Gets the value of the empColumn4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpColumn4() {
        return empColumn4;
    }

    /**
     * Sets the value of the empColumn4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpColumn4(String value) {
        this.empColumn4 = value;
    }

    /**
     * Gets the value of the empColumn5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpColumn5() {
        return empColumn5;
    }

    /**
     * Sets the value of the empColumn5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpColumn5(String value) {
        this.empColumn5 = value;
    }

    /**
     * Gets the value of the empColumn6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpColumn6() {
        return empColumn6;
    }

    /**
     * Sets the value of the empColumn6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpColumn6(String value) {
        this.empColumn6 = value;
    }

    /**
     * Gets the value of the empColumn7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpColumn7() {
        return empColumn7;
    }

    /**
     * Sets the value of the empColumn7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpColumn7(String value) {
        this.empColumn7 = value;
    }

    /**
     * Gets the value of the empColumn8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpColumn8() {
        return empColumn8;
    }

    /**
     * Sets the value of the empColumn8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpColumn8(String value) {
        this.empColumn8 = value;
    }

}
