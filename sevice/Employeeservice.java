package com.greatlearning.sevice;
import com.greatlearning.model.Employee;
public interface Employeeservice{ 
String generateUserEmail(String firstName,String lastName,String departmentName);
String generateUserPassword();
String displayEmployeeDetails(Employee e1) ;
 
}
