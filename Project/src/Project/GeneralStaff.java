
public class GeneralStaff extends Employee{

	private String duty;
	//Constructor
	public GeneralStaff() {
		this.duty = "";
	}
	
	public GeneralStaff(String duty) {
		this.duty = duty;
	}
	
	public GeneralStaff(String deptName, String duty) {
		this.setDeptName(deptName);
		this.duty = duty;
	}
	
	public GeneralStaff(String name, int birthYear, String deptName, String duty) {
		this.setName(name);
		this.setBirthYear(birthYear);
		this.setDeptName(deptName);
		this.duty = duty;
	}
	
	public String getDuty() {
		return this.duty;
	}
	
	public boolean equals(Object obj) {
		GeneralStaff c = (GeneralStaff) obj;
		if(this.getBirthYear() != c.getBirthYear()) {
			return false;
		}
		if(this.getName() != c.getName()) {
			return false;
		}
		if (this.duty != c.duty) {
			return false;
		}
		if (this.getDeptName() != c.getDeptName()) {
			return false;
		}
		if(this.getEmployeeID() != c.getEmployeeID()) {
			return false;
		}
		return true;
	}
	
	public String toString() {
		return super.toString() + String.format(" GeneralStaff: Duty: %10s", this.duty);
	}

}
