/*
 * Class: CMSC203 
 * Instructor: Khandan Vahabzadeh Monshi
 * Description: Write a class named Patient that has fields for the following data
 * Due: 09/27/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _Brian Addo__
*/


public class Patient
{
    // Private fields to store patient information
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String ZipCode;
	private String phoneNumber;
	private String emergencyName;
	private String emergencyPhoneNumber;



	/**
	 * 
	 * No arg constructor
	 */
	public Patient()
	{
		this.firstName = "FirstName";
		this.middleName = "MiddleName";
		this.lastName = "LastName";
		this.streetAddress = "StreetAddress";
		this.city = "City";
		this.state = "State";
		this.ZipCode = "12345";
		this.phoneNumber = "123-456-7890";
		this.emergencyName = "EmergencyName";
		this.emergencyPhoneNumber = "123-456-7890";
	}


	/**
	 * Constructor with first, middle, and last name parameters.
	 * @param firstName first name of patient
	 * @param middleName middle name of patient
	 * @param lastName last name of patient
	 */
	public Patient(String firstName, String middleName, String lastName)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	/**
	 * Constructor with all patient attributes as parameters.
	 * @param firstName first name of patient
	 * @param middleName middle name of patient
	 * @param lastName last name of patient
	 * @param streetAddress street address of patient
	 * @param city city where patient lives
	 * @param state state where patient lives
	 * @param ZipCode ZipCode area of patient
	 * @param phoneNumber phone number of patient
	 * @param emergencyName name of patient's emergency contact
	 * @param emergencyPhoneNumber number of patient's emergency contact
	 */
	public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state, String ZipCode, String phoneNumber, String emergencyName, String emergencyPhoneNumber)
	{
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.ZipCode = ZipCode;
		this.phoneNumber = phoneNumber;
		this.emergencyName = emergencyName;
		this.emergencyPhoneNumber = emergencyPhoneNumber;
	}
	
	/**
	 * Accessor for getting patient first name
	 * @return first name
	 */
	public String getFirstName() 
	{
        return firstName;
    }

	/**
	 * Accessor for getting patient middle name
	 * @return middle name
	 */
    public String getMiddleName() 
    {
        return middleName;
    }

    /**
     * Accessor for getting patient last name
     * @return last name
     */
    public String getLastName() 
    {
        return lastName;
    }

    /**
     * Accessor for getting patient street address
     * @return street address
     */
    public String getStreetAddress() 
    {
        return streetAddress;
    }

    /**
	 * Accessor for getting patient city
	 * @return
	 */
    public String getCity() 
    {
        return city;
    }

    /**
	 * Accessor for getting patient state
	 * @return state
	 */
    public String getState() 
    {
        return state;
    }

    /**
	 * Accessor for getting patient ZipCode
	 * @return ZipCode
	 */
    public String getZipCode() 
    {
        return ZipCode;
    }

    /**
	 * Accessor for getting patient phone number
	 * @return phone number
	 */
    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    /**
	 * Accessor for getting patient emergency contact name
	 * @return
	 */
    public String getEmergencyName() 
    {
        return emergencyName;
    }

    /**
	 * Accessor for getting patient emergency contact phone number
	 * @return
	 */
    public String getEmergencyPhoneNUmber() 
    {
        return emergencyPhoneNumber;
    }
    
    /**
     * Mutator for setting patient first name
     * @param firstName first name of patient
     */
    public void setFirstName(String firstName) 
	{
        this.firstName = firstName;
    }

    /**
     * Mutator for setting patient middle name
     * @param middleName middle name of patient
     */
    public void setMiddleName(String middleName) 
    {
    	this.middleName = middleName;
    }

    
    /**
     * Mutator for setting patient last name
     * @param lastName last name of patient
     */
    public void setLastName(String lastName) 
    {
    	this.lastName = lastName;
    }

    /**
     * Mutator for setting patient street address
     * @param streetAddress street address of patient
     */
    public void setStreetAddress(String streetAddress) 
    {
    	this.streetAddress = streetAddress;
    }

    
    /**
     * Mutator for setting patient city
     * @param city city where patient lives
     */
    public void setCity(String city) 
    {
    	this.city = city;
    }

    /**
     * Mutator for setting patient state
     * @param state state where patient lives
     */
    public void setState(String state) 
    {
    	this.state = state;
    }

    /**
     * Mutator for setting patient ZipCode
     * @param ZipCode ZipCode area of patient
     */
    public void setZipCode(String ZipCode) 
    {
    	this.ZipCode = ZipCode;
    }

    /**
     * Mutator for setting patient phone number
     * @param phoneNumber phone number of patient
     */
    public void setPhoneNumber(String phoneNumber) 
    {
    	this.phoneNumber = phoneNumber;
    }

    /**
     * Mutator for setting patient emergency contact name
     * @param emergencyName name of patient's emergency contact
     */
    public void setEmergencyName(String emergencyName) 
    {
    	this.emergencyName = emergencyName;
    }

    /**
     * Mutator for setting patient emergency contact phone number
     * @param emergencyPhoneNumber number of patient's emergency contact
     */
    public void setEmergencyPhoneNumber(String emergencyPhoneNumber) 
    {
    	this.emergencyPhoneNumber = emergencyPhoneNumber;
    }
		
    /**
     * Build the full name of the patient
     * @return first, middle and last name of patient
     */
    public String buildFullName()
    {
    	return firstName + " " + middleName + " " + lastName;
    }
    
    /**
     * Build address of the patient
     * @return street address,city and ZipCode
     */
    public String buildAddress() 
    {
        return streetAddress + " " + city + " " + state + " " + ZipCode;
    }

    /**
     * Build emergency contact information
     * @return emergency name and phone number
     */
    public String buildEmergencyContact()
    {
        return emergencyName + " " + emergencyPhoneNumber;
    }
    
    /**
     * Display patient information
     */
    public String toString() 
    {
        return "Patient info:\n" +
                "Name: " + buildFullName() + "\n" +
                "Address: " + buildAddress() + "\n" +
                "EmergencyContact: " + buildEmergencyContact();
    }


}



