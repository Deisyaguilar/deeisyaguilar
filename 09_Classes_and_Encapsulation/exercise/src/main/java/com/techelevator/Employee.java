package com.techelevator;
//Instance variables
//Attribute	    Data Type	Get     Set	    Description
//employeeId	int     	 X		        The employee ID.
//firstName 	String	     X		        The employee's first name.
//lastName  	String	     X	     X	    The employee's last name.
//fullName  	String	     X		        The employee's full name.
//^(derived)
//department	String	     X	     X	    The employee's department.
//annualSalary	double  	 X		        The employee's annual salary.
//Notes
//
//fullName is a derived attribute that returns lastName, firstName.
//Constructor
//Create a constructor for this class that accepts four parameters: int employeeId, String firstName, String lastName, and double annualSalary.
// Use these parameters to set the instance variables of the class.
//
//Methods
//Create a method called raiseSalary() that accepts a double called percent and returns void.
// The method increases the current annual salary by the percentage provided. For example, 5.5 represents 5.5%.

public class Employee {

private int employeeId;
private String firstName;
private String lastName;
private String fullName;
private String department;
private double annualSalary;

public Employee(int employeeId, String firstName, String lastName, double annualSalary){
    this.employeeId = employeeId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.annualSalary = annualSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public String getFirstName() {
    return firstName;
    }
    public String getLastName() {
    return lastName;
    }
    public void setLastName(String lastName) {
    this.lastName = lastName;
    }
    public String getFullName() {
        return lastName + ", " + firstName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void raiseSalary(double percent){
    double raiseAnnualSalary = annualSalary * percent/100.00;
    annualSalary += raiseAnnualSalary;
    }
}
