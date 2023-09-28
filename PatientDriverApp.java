/*
 * Class: CMSC203 
 * Instructor: Khandan Vahabzadeh Monshi
 * Description: Create a class name PatientDriverApp that creates an instance of the Patient class, initialized with sample data. 
 * Then, create three instances of the Procedure class. 
 * Make sure to create each instance using one of each constructor. 
 * Due: 09/27/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _Brian Addo__
*/


public class PatientDriverApp 
{
    public static void main(String[] args)
    {
        // Create patient info
        Patient patient = new Patient();
        patient.setFirstName("Matthew");
        patient.setMiddleName("Erie");
        patient.setLastName("Black");
        patient.setStreetAddress("3843 White Hart Lane");
        patient.setCity("San Diego");
        patient.setState("CA");
        patient.setZipCode("94834");
        patient.setPhoneNumber("(240) 723-8474");
        patient.setEmergencyName("Paul Badman");
        patient.setEmergencyPhoneNumber("345-565-6530");

        // Create three procedures
        Procedure procedure1 = new Procedure("Physical Exam", "09/30/3043");
        procedure1.setPractitionerName("Dr. Robot");
        procedure1.setProcedureCharges(92348.00);
        Procedure procedure2 = new Procedure("Ultrasound", "05/12/2025", "Dr. Lions", 34560.00);
        Procedure procedure3 = new Procedure();
        procedure3.setProcedureName("CAT Scan");
        procedure3.setProcedureDate("06/27/2053");
        procedure3.setPractitionerName("Dr. Smooth");
        procedure3.setProcedureCharges(669700.00);

        // Display patient's information
        System.out.println("Patient info");
        displayPatient(patient);

        // Display procedure information
        System.out.println("\n\n");
        displayProcedure(procedure1);
        System.out.println("\n\n");
        displayProcedure(procedure2);
        System.out.println("\n\n");
        displayProcedure(procedure3);

        // Calculate and display total charges
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("\nTotal Charges: $%.2f\n", totalCharges);
        
        System.out.println("\nStudent Name: Brian Addo\nMC#: MC21098225\nDue Date: 09/27/2023");
        
    }

    /**
     * Method to display patient information
     * @param patient patient info
     */
    public static void displayPatient(Patient patient) 
    {
        System.out.println("  Name: " + patient.buildFullName());
        System.out.println("  Address: " + patient.buildAddress());
        System.out.println("  EmergencyContact: " + patient.buildEmergencyContact());
    }

    /**
     * Method to display procedure information
     * @param procedure procedure info
     */
    public static void displayProcedure(Procedure procedure) 
    {
        System.out.println("\tProcedure: " + procedure.getProcedureName() + 
        					"\n\tProcedureDate= " + procedure.getProcedureDate() +
        					"\n\tPractitioner= " + procedure.getPractitionerName() + 
        					"\n\tCharge= $" + procedure.getProcedureCharges());
    }

    /**
     * Method to calculate total charges
     * @param procedure1 procedure info
     * @param procedure2 procedure info
     * @param procedure3 procedure info
     * @return addition of procedures
     */
    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) 
    {
        return procedure1.getProcedureCharges() + procedure2.getProcedureCharges() + procedure3.getProcedureCharges();
    }
}
