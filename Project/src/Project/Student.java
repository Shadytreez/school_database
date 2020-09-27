
public class Student extends Person  {
	private static int numStudents;
	private int studentID;
	private Course[] coursesTaken;
	private Integer numCoursesTaken;
	private boolean isGraduate;
	private String major;
	
	//Constructor
	
	public Student() {
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
		this.isGraduate = false;
		this.numStudents++;
		this.studentID = this.numStudents;
		this.major = "undeclared";
	}
	
	public Student(boolean isGraduate) {
		this.coursesTaken = new Course[50];
		this.isGraduate = isGraduate;
		this.numStudents++;
		this.studentID = this.numStudents;
		this.numCoursesTaken = 0;
		this.major = "undeclared";

	}
	
	public Student(String major, boolean isGraduate) {
		this.coursesTaken = new Course[50];
		this.major = major;
		this.isGraduate = isGraduate;
		this.numStudents++;
		this.studentID = this.numStudents;
		this.numCoursesTaken = 0;
		

	}
	
	public Student(String name, int birthYear, String major, boolean isGraduate) {
		this.coursesTaken = new Course[50];
		this.setName(name);
		this.setBirthYear(birthYear);
		this.major = major;
		this.isGraduate = isGraduate;
		this.numStudents++;
		this.studentID = this.numStudents;
		this.numCoursesTaken = 0;
		

	}
	////
	public boolean isGraduate() {
		return this.isGraduate;
	}
	
	public int getNumCoursesTaken() {
		return this.numCoursesTaken;
	}
	
	public static int getNumStudents() {
		return numStudents;
	}
	
	public int getStudentID() {
		
		return this.studentID;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public void setIsGraduate (boolean isGraduate) {
		this.isGraduate = isGraduate;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void addCourseTaken(Course course) {
		 try {
			 coursesTaken[numCoursesTaken] = course;
			 numCoursesTaken++;
		        }
		        catch(ArrayIndexOutOfBoundsException e) {
		            System.out.println("Out of bound");
		        }
	}
	
	public void addCoursesTaken(Course [] course) {
			Course temp[] = new Course[this.coursesTaken.length + course.length] ;
			
			for (int i = 0; i < this.coursesTaken.length; i++ ) {
					temp[i] = this.coursesTaken[i];
					
				}
			for (int i = this.numCoursesTaken; i < course.length; i++ ) {
				temp[i] = course[i];
			}
				
				
			this.coursesTaken = temp;
			//numCoursesTaken = this.coursesTaken.length;	
		
	}
	
	public Course getCourseTaken(int index) {
		try {
		return this.coursesTaken[index];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}
	
	public String getCourseTakenAsString(int index){
		 
		 try {
				return coursesTaken[index].toString() + ", ";
				}
				catch(ArrayIndexOutOfBoundsException e) {
					return null;
				}
	}
	
	public String getAllCoursesTakenAsString() {
		String holder = "";
		for (int i=0; i > numCoursesTaken; i++) {
			holder = holder + getCourseTakenAsString(i) +", ";
		}
		return holder;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student c = (Student) obj;
		if (this.getBirthYear() != c.getBirthYear()) {
			return false;
		}
		if (this.getName() != c.getName()) {
			return false;
		}
		if (this.studentID != c.studentID) {
			return false;
		}
		
		if (this.major != c.major) {
			return false;
		}
		
		if (this.isGraduate != c.isGraduate) {
			return false;
		}
		if(this.numCoursesTaken != c.numCoursesTaken) {
			return false;
		}
		
		if(this.coursesTaken != c.coursesTaken) {
			return false;
		}
		return true;
		
	}
	
	public String helper() {
		if (this.isGraduate == true) {
			return "Graduate";
		}
		return "Undergraduate";
	}
	@Override
	public String toString() {
		
		return super.toString() + String.format(" Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s",
				  this.studentID, this.major, this.helper(), this.numCoursesTaken, getAllCoursesTakenAsString());
		
	}
	
	@Override
	public int compareTo(Person p) {
		if (p instanceof Student) {
			Student e = (Student)p;
			return Integer.compare(numCoursesTaken, e.numCoursesTaken);
		}
		return super.compareTo(p);
	}

}
