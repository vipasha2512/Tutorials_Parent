package Employee_Initial.Arrays;

import Employee_Initial.CommonFiles.Employee;
import Employee_Initial.CommonFiles.EmployeeUtil;
import Employee_Initial.CommonFiles.customExceptions;

//-------------------- This class contains Service methods for Employee Array Packages--------------------

public class EmployeeServices implements EmployeeServicesInterface {

	EmployeeArrayInterface empArrVal;

	// You are just initializing an object that refers to the methods in the EmployeeArray class

	// The file reading has to be handled by the Services or the Util class, but there is no way
	// that the DAO class handles those operations, it is strictly bound to handle only CRUD operations

	public EmployeeServices()
	{
		empArrVal = new EmployeeArray(EmployeeUtil.getArrSize());
		try {
			empArrVal.readFromFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Method to add an employee
	@Override
	public void addEmployee() throws customExceptions
	{
		Employee emp = EmployeeUtil.collectInfo();
		if(emp == null)
			throw new customExceptions("Adding employee failed");
		empArrVal.addEmp(emp);
	}
	
	//Method to delete an Employee
	@Override
	public void deleteEmployee(int empid)
	{
		empArrVal.deleteEmployee(empid);
	}
	
	//Method to Update an Employee Information
	@Override
	public void updateEmployee(int empid) throws customExceptions
	{
		Employee emp;
		emp = EmployeeUtil.collectInfo_Update(empid);
		if (emp == null)
			throw new customExceptions("Updtaing employee failed");
		empArrVal.updateEmp(empid, emp);
	}

	//Display Employees list by ID
	@Override
	public Employee dispEmployeeID(int empid)
	{
		Employee emp = empArrVal.dispEmpID(empid);
		return emp;
	}
	
	//Display all Employees
	@Override
	public Employee[] dispEmployee()
	{
		return empArrVal.dispEmp();
	}
	
	//Get hRA based on empployee id
	@Override
	public float getHRAbyID(int empid) {
		Employee[] tempArrHolder = empArrVal.getEmpArr(); 
		Employee tempObjHolder = null;
		float hra = 0;
		boolean flag = true;
		for (int i = 0; i < tempArrHolder.length; i++) {
			if (tempArrHolder[i] != null) {
				tempObjHolder = tempArrHolder[i];
			}
			if (tempObjHolder.getEin() == empid && flag) {
				hra = tempObjHolder.HRA();
				flag = false;
			}

		}
		// You can also choose to directly send the above equation in a return statement.
		return hra;
	}
	
	//Get gross salary based on employee id
	@Override
	public float grossSalaryByID(int empid) {
		Employee tempObjHolder = null;
		Employee[] tempArrHolder = empArrVal.getEmpArr(); 
		float grossSalary = 0;
		boolean flag = true;
		for (int i = 0; i < tempArrHolder.length; i++) {
			if (tempArrHolder[i] != null) {
				tempObjHolder = tempArrHolder[i];
			}
			if (tempObjHolder.getEin() == empid && flag)  {
				grossSalary = EmployeeUtil.emp_grossSalary(tempObjHolder);
				flag = false;
			}
		}
		return grossSalary;
	}
	
	@Override
	public void saveToFile()
	{
		empArrVal.saveToFile();
	}

}