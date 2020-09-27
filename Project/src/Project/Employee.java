

public class Employee extends Person       {

private String deptName;
private static int numEmployees;
private int employeeID;
//constructor
public Employee() {
	this.deptName = "";
	this.numEmployees++;
	this.employeeID = this.numEmployees;
	
}
public Employee(String deptName) {
	this.deptName = deptName;
	this.numEmployees++;
	this.employeeID = this.numEmployees;
}
public Employee(String name, int birthYear, String deptName) {
	this.deptName = deptName;
	this.setBirthYear(birthYear);
	this.setName(name);
	this.numEmployees++;
	this.employeeID = this.numEmployees;
}

//getters
public String getDeptName() {
	return this.deptName;
}

public static int getNumEmployee() {
	return numEmployees;
}

public int getEmployeeID() {
	return this.employeeID;
	
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}


@Override
public boolean equals(Object obj) {
	Employee c = (Employee) obj;
	if (this.deptName != c.deptName ) {
		return false;
	}
	if (this.deptName != c.deptName) {
		return false;
	}
	if (this.getName() != c.getName()) {
		return false;
	}
	if (this.getBirthYear() != c.getBirthYear()) {
		return false;
	}
	return true;
}

@Override
public String toString() {
	return super.toString() + String.format(" Employee: Department: %20s | Employee Number: %3d",
			this.deptName, this.employeeID);
}


public String helper() {
	//turns employeeID into a String for compareTo
	String helper = String.valueOf(employeeID);
	return helper;
}

@Override
public int compareTo(Person p) {
	if (p instanceof Employee) {
		Employee e = (Employee)p;
		return Integer.compare(employeeID, e.employeeID);
	}
	return super.compareTo(p);

}
}
