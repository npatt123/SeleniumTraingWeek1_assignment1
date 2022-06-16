package week1.Day2;

public class EmployeeDetails {
	
	
	 public void printEmployeeName(String empName,int empId) {
		 System.out.println(empName+empId);
	 }
	 public String getEmployeeAddress(String empAddress) {
			 System.out.println(empAddress);
			 return empAddress;
			 }
	 public void printEmployeeSalary(double empSalary) {
		 System.out.println(empSalary);
		 }
	 public void printEmployeeMobileNumber(long mobNum) {
		 System.out.println(mobNum);
		 }
	
	 
	
	
	public static void main(String[] args) {
		
		EmployeeDetails obj = new EmployeeDetails();
		obj.printEmployeeMobileNumber(92217605735l);
		obj.printEmployeeName("Nalini", 124);
		obj.printEmployeeSalary(50000);
		String eAddress = obj.getEmployeeAddress("chennai");
		System.out.println(eAddress);
	
	}

}
  








































