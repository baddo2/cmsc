/*
 * Class: CMSC203 
 * Instructor: Khandan Vahabzadeh Monshi
 * Description: Write a class named Procedure that represents a medical procedure that has been performed on a patient.
 * Due: 09/27/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _Brian Addo__
*/

public class Procedure 
{
	//Private fields for procedure info
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double procedureCharges;

    /**
     * No arg constructor
     */
    public Procedure() 
    {
    	procedureName = "Procedure Name";
    	procedureDate = "Procedure Date";
    	practitionerName = "Practitioner Name";
    	procedureCharges = 10000000000000.00;
    }

    
    /**
     * Constructor with procedure name and date parameters
     * @param procedureName name of procedure
     * @param procedureDate date of procedure
     */
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }


    /**
     * Constructor with all procedure attributes as parameters.
     * @param procedureName name of procedure
     * @param procedureDate date of procedure
     * @param practitionerName name of practitioner
     * @param procedureCharges charge for procedure
     */
    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharges) 
    {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharges = procedureCharges;
    }

    
    /**
     * Accessor for getting procedure name
     * @return name of procedure
     */
    public String getProcedureName() 
    {
        return procedureName;
    }

    /**
     * Accessor for getting procedure date
     * @return date of procedure
     */
    public String getProcedureDate() 
    {
        return procedureDate;
    }

    
    /**
     * Accessor for getting practitioner name
     * @return name of practitioner
     */
    public String getPractitionerName() 
    {
        return practitionerName;
    }

    /**
     * Accessor for getting procedure charges
     * @return charge of procedure
     */
    public double getProcedureCharges() 
    {
        return procedureCharges;
    }


    /**
     * Mutator for setting procedure name
     * @param procedureName name of procedure
     */
    public void setProcedureName(String procedureName) 
    {
        this.procedureName = procedureName;
    }

    /**
     * Mutator for setting procedure date
     * @param procedureDate date of procedure
     */
    public void setProcedureDate(String procedureDate) 
    {
        this.procedureDate = procedureDate;
    }

    /**
     * Mutator for setting practitioner name
     * @param practitionerName name of practitioner
     */
    public void setPractitionerName(String practitionerName) 
    {
        this.practitionerName = practitionerName;
    }

    /**
     * Mutator methods for setting procedure charges
     * @param procedureCharges charges of procedure
     */
    public void setProcedureCharges(double procedureCharges) 
    {
        this.procedureCharges = procedureCharges;
    }

    
   /**
    * Display procedure information
    */
    public String toString() 
    {
        return "Procedure Info:\n" +
                "Procedure: " + procedureName + "\n" +
                "Procedure Date: " + procedureDate + "\n" +
                "Practitioner Name: " + practitionerName + "\n" +
                "Procedure Charges: $" + procedureCharges;
    }
    
}
