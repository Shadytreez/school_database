
public class Faculty extends Employee {

	private Course[] coursesTaught;
	private int numCoursesTaught;
	private boolean isTenured;
	//constructor
	
	public Faculty() {
		this.coursesTaught = new Course [100];
		this.numCoursesTaught = 0;
		this.isTenured = false;
		}
	
	public Faculty(boolean isTenured) {
		this.isTenured = isTenured;
		this.numCoursesTaught = 0;
		coursesTaught = new Course [100];
		
	}
	
	public Faculty(String deptName, boolean isTenured) {
		this.isTenured = isTenured;
		this.setDeptName(deptName);
		this.numCoursesTaught = 0;
		this.coursesTaught = new Course [100];
	}
	public Faculty(String name, int birthYear, String deptName, boolean isTenured) {
		this.setName(name);
		this.setBirthYear(birthYear);
		this.setDeptName(deptName);
		this.isTenured = isTenured;
		this.numCoursesTaught = 0;
		this.coursesTaught = new Course [100];
	}
	
	public boolean isTenured() {
		return isTenured;
	}
	
	public int getNumCoursesTaught() {
		return  numCoursesTaught;
	}
	
	public void setIsTenured(boolean isTenured) {
		this.isTenured = isTenured;
	}
	
	public void addCourseTaught(Course course) {
        try {
        coursesTaught[numCoursesTaught] = course;
        numCoursesTaught++;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bound");
        }
        
    }
		
	public void addCoursesTaught(Course[] course) {
		
		Course temp[] = new Course[this.coursesTaught.length + course.length] ;
		
		for (int i = 0; i < this.coursesTaught.length; i++ ) {
				temp[i] = this.coursesTaught[i];
				
			}
		for (int i = this.numCoursesTaught; i < course.length; i++ ) {
			temp[i] = course[i];
		}
				
		this.coursesTaught = temp;
		
	}
	
	
		
	
	
	public Course getCourseTaught(int index) {
		try {
			return coursesTaught[index];
			}
			catch(ArrayIndexOutOfBoundsException e) {
				return null;
			}	
	}
	
	public String getCourseTaughtAsString(int index) {
	   
		try {
			return coursesTaught[index].toString() + ", ";
			}
			catch(ArrayIndexOutOfBoundsException e) {
				return null;
			}
	}
	public String getAllCoursesTaughtAsString() {
		String holder = "";
		for (int i=0; i > numCoursesTaught; i++) {
			holder = holder + getCourseTaughtAsString(i) +", ";
		}
		return holder;
	}
	
	@Override
	public boolean equals(Object obj) {
		Faculty c = (Faculty)obj;
		if (this.getDeptName() != c.getDeptName() ) {
			return false;
		}
		if (this.getEmployeeID() != c.getEmployeeID()) {
			return false;
		}
		if (this.getName() != c.getName()) {
			return false;
		}
		if (this.getBirthYear() != c.getBirthYear()) {
			return false;
		}
		
		if(this.isTenured != c.isTenured) {
			return false;
		}
		
		if(this.coursesTaught != c.coursesTaught) {
			return false;	
		}
		if(this.numCoursesTaught != c.numCoursesTaught) {
			return false;
		}
		return true;
	}
	
	public String stringHelper() {
		if(this.isTenured == true) {
			return "Is Tenured";
		}
		return "Not Tenured";
	}
	@Override
	public String toString() {
		return super.toString() + String.format(" Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s"
				, this.stringHelper() , this.numCoursesTaught, getAllCoursesTaughtAsString());
	}
	
	@Override
	public int compareTo(Person p) {
		if (p instanceof Faculty) {
			Faculty e = (Faculty)p;
			return Integer.compare(numCoursesTaught, e.numCoursesTaught);
		}
		return super.compareTo(p);
	}

}
