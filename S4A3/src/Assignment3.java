
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee emp = new employee();
		emp.empFName = "Rahul";
		emp.empLName = "Singh";
		emp.empAddress = "Somewhere in Delhi";
		emp.empID = 12;
		System.out.println("Employee Details are as follows:");
		System.out.println("Name:\t\t\t"+emp.empFName+" "+emp.empLName);
		System.out.println("Address:\t\t"+emp.empAddress);
		System.out.println("Employee ID:\t\t"+emp.empID);
		
	}
}

class employee {

	String empFName,empLName,empAddress;
	private String getEmpFName() {
		return empFName;
	}
	private void setEmpFName(String empFName) {
		this.empFName = empFName;
	}
	private String getEmpLName() {
		return empLName;
	}
	private void setEmpLName(String empLName) {
		this.empLName = empLName;
	}
	private String getEmpAddress() {
		return empAddress;
	}
	private void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	private int getEmpID() {
		return empID;
	}
	private void setEmpID(int empID) {
		this.empID = empID;
	}
	int empID;
	
}
