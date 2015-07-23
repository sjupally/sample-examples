
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for employee_reportsdata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="employee_reportsdata">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}EntityObject">
 *       &lt;sequence>
 *         &lt;element name="Emp_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emp_Current_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emp_Secondary_Current_ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmpName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Project_Manager_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Program_Manager_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProgramManager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Employee_Project_Manager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emp_Designation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emp_Designation_Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Emp_Band_Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Emp_Band" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Department_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Employee_Department" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Work_Station_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emp_Email_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emp_Mobile_Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extension_No" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Personal_EmailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Employee_Qualification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emp_Date_of_Join" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="emp_gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emp_bloodgroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="employee_type_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employee_location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employee_extension_no" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emp_deployed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Emp_Work_Station" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emp_status" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Passport_Expiry_Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Employee_Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubProjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Previous_Experience" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="VL_Experience" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Total_Experience" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="Technology_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emp_Technology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Project" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bloodgroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMOPool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmpRemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PMORemarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emp_Bond_Status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Emp_Bond_Years" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Visa_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certifiationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="technologyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificationIDGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="certificationNameGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emp_File_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emp_Qualification_Graduation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Emp_Qualification_PG" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Emp_Qualification_Others" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emp_QuaGrad_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Emp_QuaPG_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee_reportsdata", propOrder = {
    "empId",
    "empCurrentID",
    "empSecondaryCurrentID",
    "empName",
    "projectManagerId",
    "programManagerId",
    "programManager",
    "employeeProjectManager",
    "empDesignation",
    "empDesignationId",
    "empBandId",
    "empBand",
    "departmentName",
    "employeeDepartment",
    "workStationNo",
    "locationName",
    "empEmailId",
    "empMobileNumber",
    "extensionNo",
    "personalEmailID",
    "employeeQualification",
    "empDateOfJoin",
    "empGender",
    "empBloodgroup",
    "employeeTypeName",
    "employeeLocation",
    "employeeExtensionNo",
    "empDeployed",
    "empWorkStation",
    "empStatus",
    "passportExpiryDate",
    "employeeProject",
    "subProjectId",
    "previousExperience",
    "vlExperience",
    "totalExperience",
    "technologyName",
    "empTechnology",
    "project",
    "projectId",
    "bloodgroup",
    "pmoPool",
    "empRemarks",
    "pmoRemarks",
    "empBondStatus",
    "empBondYears",
    "visaType",
    "certifiationId",
    "technologyId",
    "certificationIDGroup",
    "certificationNameGroup",
    "empFileName",
    "empQualificationGraduation",
    "empQualificationPG",
    "empQualificationOthers",
    "empQuaGradName",
    "empQuaPGName"
})
public class EmployeeReportsdata
    extends EntityObject
{

    @XmlElement(name = "Emp_Id")
    protected String empId;
    @XmlElement(name = "Emp_Current_ID")
    protected String empCurrentID;
    @XmlElement(name = "Emp_Secondary_Current_ID")
    protected String empSecondaryCurrentID;
    @XmlElement(name = "EmpName")
    protected String empName;
    @XmlElement(name = "Project_Manager_Id")
    protected String projectManagerId;
    @XmlElement(name = "Program_Manager_Id")
    protected String programManagerId;
    @XmlElement(name = "ProgramManager")
    protected String programManager;
    @XmlElement(name = "Employee_Project_Manager")
    protected String employeeProjectManager;
    @XmlElement(name = "Emp_Designation")
    protected String empDesignation;
    @XmlElement(name = "Emp_Designation_Id", required = true, type = Integer.class, nillable = true)
    protected Integer empDesignationId;
    @XmlElement(name = "Emp_Band_Id", required = true, type = Long.class, nillable = true)
    protected Long empBandId;
    @XmlElement(name = "Emp_Band")
    protected String empBand;
    @XmlElement(name = "Department_Name")
    protected String departmentName;
    @XmlElement(name = "Employee_Department", required = true, type = Integer.class, nillable = true)
    protected Integer employeeDepartment;
    @XmlElement(name = "Work_Station_No")
    protected String workStationNo;
    @XmlElement(name = "location_name")
    protected String locationName;
    @XmlElement(name = "Emp_Email_Id")
    protected String empEmailId;
    @XmlElement(name = "Emp_Mobile_Number")
    protected String empMobileNumber;
    @XmlElement(name = "Extension_No")
    protected String extensionNo;
    @XmlElement(name = "Personal_EmailID")
    protected String personalEmailID;
    @XmlElement(name = "Employee_Qualification")
    protected String employeeQualification;
    @XmlElement(name = "emp_Date_of_Join", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar empDateOfJoin;
    @XmlElement(name = "emp_gender")
    protected String empGender;
    @XmlElement(name = "emp_bloodgroup", required = true, type = Integer.class, nillable = true)
    protected Integer empBloodgroup;
    @XmlElement(name = "employee_type_name")
    protected String employeeTypeName;
    @XmlElement(name = "employee_location")
    protected String employeeLocation;
    @XmlElement(name = "employee_extension_no")
    protected String employeeExtensionNo;
    @XmlElement(name = "emp_deployed")
    protected boolean empDeployed;
    @XmlElement(name = "Emp_Work_Station")
    protected String empWorkStation;
    @XmlElement(name = "emp_status", required = true, type = Short.class, nillable = true)
    protected Short empStatus;
    @XmlElement(name = "Passport_Expiry_Date", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passportExpiryDate;
    @XmlElement(name = "Employee_Project")
    protected String employeeProject;
    @XmlElement(name = "SubProjectId", required = true, type = Integer.class, nillable = true)
    protected Integer subProjectId;
    @XmlElement(name = "Previous_Experience", required = true, type = Float.class, nillable = true)
    protected Float previousExperience;
    @XmlElement(name = "VL_Experience", required = true, type = Float.class, nillable = true)
    protected Float vlExperience;
    @XmlElement(name = "Total_Experience", required = true, type = Float.class, nillable = true)
    protected Float totalExperience;
    @XmlElement(name = "Technology_Name")
    protected String technologyName;
    @XmlElement(name = "Emp_Technology")
    protected String empTechnology;
    @XmlElement(name = "Project")
    protected String project;
    @XmlElement(name = "ProjectId", required = true, type = Integer.class, nillable = true)
    protected Integer projectId;
    protected String bloodgroup;
    @XmlElement(name = "PMOPool")
    protected String pmoPool;
    @XmlElement(name = "EmpRemarks")
    protected String empRemarks;
    @XmlElement(name = "PMORemarks")
    protected String pmoRemarks;
    @XmlElement(name = "Emp_Bond_Status", required = true, type = Boolean.class, nillable = true)
    protected Boolean empBondStatus;
    @XmlElement(name = "Emp_Bond_Years", required = true, type = Integer.class, nillable = true)
    protected Integer empBondYears;
    @XmlElement(name = "Visa_Type")
    protected String visaType;
    protected String certifiationId;
    protected String technologyId;
    protected String certificationIDGroup;
    protected String certificationNameGroup;
    @XmlElement(name = "Emp_File_Name")
    protected String empFileName;
    @XmlElement(name = "Emp_Qualification_Graduation", required = true, type = Integer.class, nillable = true)
    protected Integer empQualificationGraduation;
    @XmlElement(name = "Emp_Qualification_PG", required = true, type = Integer.class, nillable = true)
    protected Integer empQualificationPG;
    @XmlElement(name = "Emp_Qualification_Others")
    protected String empQualificationOthers;
    @XmlElement(name = "Emp_QuaGrad_name")
    protected String empQuaGradName;
    @XmlElement(name = "Emp_QuaPG_name")
    protected String empQuaPGName;

    /**
     * Gets the value of the empId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * Sets the value of the empId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpId(String value) {
        this.empId = value;
    }

    /**
     * Gets the value of the empCurrentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpCurrentID() {
        return empCurrentID;
    }

    /**
     * Sets the value of the empCurrentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpCurrentID(String value) {
        this.empCurrentID = value;
    }

    /**
     * Gets the value of the empSecondaryCurrentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpSecondaryCurrentID() {
        return empSecondaryCurrentID;
    }

    /**
     * Sets the value of the empSecondaryCurrentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpSecondaryCurrentID(String value) {
        this.empSecondaryCurrentID = value;
    }

    /**
     * Gets the value of the empName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * Sets the value of the empName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpName(String value) {
        this.empName = value;
    }

    /**
     * Gets the value of the projectManagerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectManagerId() {
        return projectManagerId;
    }

    /**
     * Sets the value of the projectManagerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectManagerId(String value) {
        this.projectManagerId = value;
    }

    /**
     * Gets the value of the programManagerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramManagerId() {
        return programManagerId;
    }

    /**
     * Sets the value of the programManagerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramManagerId(String value) {
        this.programManagerId = value;
    }

    /**
     * Gets the value of the programManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramManager() {
        return programManager;
    }

    /**
     * Sets the value of the programManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramManager(String value) {
        this.programManager = value;
    }

    /**
     * Gets the value of the employeeProjectManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeProjectManager() {
        return employeeProjectManager;
    }

    /**
     * Sets the value of the employeeProjectManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeProjectManager(String value) {
        this.employeeProjectManager = value;
    }

    /**
     * Gets the value of the empDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpDesignation() {
        return empDesignation;
    }

    /**
     * Sets the value of the empDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpDesignation(String value) {
        this.empDesignation = value;
    }

    /**
     * Gets the value of the empDesignationId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmpDesignationId() {
        return empDesignationId;
    }

    /**
     * Sets the value of the empDesignationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmpDesignationId(Integer value) {
        this.empDesignationId = value;
    }

    /**
     * Gets the value of the empBandId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEmpBandId() {
        return empBandId;
    }

    /**
     * Sets the value of the empBandId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEmpBandId(Long value) {
        this.empBandId = value;
    }

    /**
     * Gets the value of the empBand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpBand() {
        return empBand;
    }

    /**
     * Sets the value of the empBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpBand(String value) {
        this.empBand = value;
    }

    /**
     * Gets the value of the departmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets the value of the departmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

    /**
     * Gets the value of the employeeDepartment property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmployeeDepartment() {
        return employeeDepartment;
    }

    /**
     * Sets the value of the employeeDepartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmployeeDepartment(Integer value) {
        this.employeeDepartment = value;
    }

    /**
     * Gets the value of the workStationNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkStationNo() {
        return workStationNo;
    }

    /**
     * Sets the value of the workStationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkStationNo(String value) {
        this.workStationNo = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the empEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpEmailId() {
        return empEmailId;
    }

    /**
     * Sets the value of the empEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpEmailId(String value) {
        this.empEmailId = value;
    }

    /**
     * Gets the value of the empMobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpMobileNumber() {
        return empMobileNumber;
    }

    /**
     * Sets the value of the empMobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpMobileNumber(String value) {
        this.empMobileNumber = value;
    }

    /**
     * Gets the value of the extensionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionNo() {
        return extensionNo;
    }

    /**
     * Sets the value of the extensionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionNo(String value) {
        this.extensionNo = value;
    }

    /**
     * Gets the value of the personalEmailID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalEmailID() {
        return personalEmailID;
    }

    /**
     * Sets the value of the personalEmailID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalEmailID(String value) {
        this.personalEmailID = value;
    }

    /**
     * Gets the value of the employeeQualification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeQualification() {
        return employeeQualification;
    }

    /**
     * Sets the value of the employeeQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeQualification(String value) {
        this.employeeQualification = value;
    }

    /**
     * Gets the value of the empDateOfJoin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmpDateOfJoin() {
        return empDateOfJoin;
    }

    /**
     * Sets the value of the empDateOfJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmpDateOfJoin(XMLGregorianCalendar value) {
        this.empDateOfJoin = value;
    }

    /**
     * Gets the value of the empGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpGender() {
        return empGender;
    }

    /**
     * Sets the value of the empGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpGender(String value) {
        this.empGender = value;
    }

    /**
     * Gets the value of the empBloodgroup property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmpBloodgroup() {
        return empBloodgroup;
    }

    /**
     * Sets the value of the empBloodgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmpBloodgroup(Integer value) {
        this.empBloodgroup = value;
    }

    /**
     * Gets the value of the employeeTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeTypeName() {
        return employeeTypeName;
    }

    /**
     * Sets the value of the employeeTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeTypeName(String value) {
        this.employeeTypeName = value;
    }

    /**
     * Gets the value of the employeeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeLocation() {
        return employeeLocation;
    }

    /**
     * Sets the value of the employeeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeLocation(String value) {
        this.employeeLocation = value;
    }

    /**
     * Gets the value of the employeeExtensionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeExtensionNo() {
        return employeeExtensionNo;
    }

    /**
     * Sets the value of the employeeExtensionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeExtensionNo(String value) {
        this.employeeExtensionNo = value;
    }

    /**
     * Gets the value of the empDeployed property.
     * 
     */
    public boolean isEmpDeployed() {
        return empDeployed;
    }

    /**
     * Sets the value of the empDeployed property.
     * 
     */
    public void setEmpDeployed(boolean value) {
        this.empDeployed = value;
    }

    /**
     * Gets the value of the empWorkStation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpWorkStation() {
        return empWorkStation;
    }

    /**
     * Sets the value of the empWorkStation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpWorkStation(String value) {
        this.empWorkStation = value;
    }

    /**
     * Gets the value of the empStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getEmpStatus() {
        return empStatus;
    }

    /**
     * Sets the value of the empStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEmpStatus(Short value) {
        this.empStatus = value;
    }

    /**
     * Gets the value of the passportExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPassportExpiryDate() {
        return passportExpiryDate;
    }

    /**
     * Sets the value of the passportExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPassportExpiryDate(XMLGregorianCalendar value) {
        this.passportExpiryDate = value;
    }

    /**
     * Gets the value of the employeeProject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeProject() {
        return employeeProject;
    }

    /**
     * Sets the value of the employeeProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeProject(String value) {
        this.employeeProject = value;
    }

    /**
     * Gets the value of the subProjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubProjectId() {
        return subProjectId;
    }

    /**
     * Sets the value of the subProjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubProjectId(Integer value) {
        this.subProjectId = value;
    }

    /**
     * Gets the value of the previousExperience property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPreviousExperience() {
        return previousExperience;
    }

    /**
     * Sets the value of the previousExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPreviousExperience(Float value) {
        this.previousExperience = value;
    }

    /**
     * Gets the value of the vlExperience property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVLExperience() {
        return vlExperience;
    }

    /**
     * Sets the value of the vlExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVLExperience(Float value) {
        this.vlExperience = value;
    }

    /**
     * Gets the value of the totalExperience property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalExperience() {
        return totalExperience;
    }

    /**
     * Sets the value of the totalExperience property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalExperience(Float value) {
        this.totalExperience = value;
    }

    /**
     * Gets the value of the technologyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnologyName() {
        return technologyName;
    }

    /**
     * Sets the value of the technologyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnologyName(String value) {
        this.technologyName = value;
    }

    /**
     * Gets the value of the empTechnology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpTechnology() {
        return empTechnology;
    }

    /**
     * Sets the value of the empTechnology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpTechnology(String value) {
        this.empTechnology = value;
    }

    /**
     * Gets the value of the project property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProject() {
        return project;
    }

    /**
     * Sets the value of the project property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProject(String value) {
        this.project = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectId(Integer value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the bloodgroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloodgroup() {
        return bloodgroup;
    }

    /**
     * Sets the value of the bloodgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloodgroup(String value) {
        this.bloodgroup = value;
    }

    /**
     * Gets the value of the pmoPool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMOPool() {
        return pmoPool;
    }

    /**
     * Sets the value of the pmoPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMOPool(String value) {
        this.pmoPool = value;
    }

    /**
     * Gets the value of the empRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpRemarks() {
        return empRemarks;
    }

    /**
     * Sets the value of the empRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpRemarks(String value) {
        this.empRemarks = value;
    }

    /**
     * Gets the value of the pmoRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMORemarks() {
        return pmoRemarks;
    }

    /**
     * Sets the value of the pmoRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMORemarks(String value) {
        this.pmoRemarks = value;
    }

    /**
     * Gets the value of the empBondStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmpBondStatus() {
        return empBondStatus;
    }

    /**
     * Sets the value of the empBondStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmpBondStatus(Boolean value) {
        this.empBondStatus = value;
    }

    /**
     * Gets the value of the empBondYears property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmpBondYears() {
        return empBondYears;
    }

    /**
     * Sets the value of the empBondYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmpBondYears(Integer value) {
        this.empBondYears = value;
    }

    /**
     * Gets the value of the visaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaType() {
        return visaType;
    }

    /**
     * Sets the value of the visaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaType(String value) {
        this.visaType = value;
    }

    /**
     * Gets the value of the certifiationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertifiationId() {
        return certifiationId;
    }

    /**
     * Sets the value of the certifiationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertifiationId(String value) {
        this.certifiationId = value;
    }

    /**
     * Gets the value of the technologyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnologyId() {
        return technologyId;
    }

    /**
     * Sets the value of the technologyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnologyId(String value) {
        this.technologyId = value;
    }

    /**
     * Gets the value of the certificationIDGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationIDGroup() {
        return certificationIDGroup;
    }

    /**
     * Sets the value of the certificationIDGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationIDGroup(String value) {
        this.certificationIDGroup = value;
    }

    /**
     * Gets the value of the certificationNameGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationNameGroup() {
        return certificationNameGroup;
    }

    /**
     * Sets the value of the certificationNameGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationNameGroup(String value) {
        this.certificationNameGroup = value;
    }

    /**
     * Gets the value of the empFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpFileName() {
        return empFileName;
    }

    /**
     * Sets the value of the empFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpFileName(String value) {
        this.empFileName = value;
    }

    /**
     * Gets the value of the empQualificationGraduation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmpQualificationGraduation() {
        return empQualificationGraduation;
    }

    /**
     * Sets the value of the empQualificationGraduation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmpQualificationGraduation(Integer value) {
        this.empQualificationGraduation = value;
    }

    /**
     * Gets the value of the empQualificationPG property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmpQualificationPG() {
        return empQualificationPG;
    }

    /**
     * Sets the value of the empQualificationPG property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmpQualificationPG(Integer value) {
        this.empQualificationPG = value;
    }

    /**
     * Gets the value of the empQualificationOthers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpQualificationOthers() {
        return empQualificationOthers;
    }

    /**
     * Sets the value of the empQualificationOthers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpQualificationOthers(String value) {
        this.empQualificationOthers = value;
    }

    /**
     * Gets the value of the empQuaGradName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpQuaGradName() {
        return empQuaGradName;
    }

    /**
     * Sets the value of the empQuaGradName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpQuaGradName(String value) {
        this.empQuaGradName = value;
    }

    /**
     * Gets the value of the empQuaPGName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpQuaPGName() {
        return empQuaPGName;
    }

    /**
     * Sets the value of the empQuaPGName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpQuaPGName(String value) {
        this.empQuaPGName = value;
    }

}
