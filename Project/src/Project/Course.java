

public class Course implements Comparable<Course> {
	
private boolean isGraduateCourse;
private int numCredits, courseNum;
private String courseDept;
//constructor
public Course(boolean isGraduateCourse, int courseNum, 
		String courseDept, int numCredits) {
	
		this.isGraduateCourse = isGraduateCourse;
	
		if (courseNum < 0) {
			this.courseNum = 0;
			
		}else {
			this.courseNum = courseNum;
		}
	
		this.courseDept = courseDept;
	
		if(numCredits < 0) {
			this.numCredits = 0;
		
		}else {
			this.numCredits = numCredits ;
		}
}
	
	

//getters
public boolean isGraduateCourse() {
	return this.isGraduateCourse;
	}

public int getCourseNum() {
	return this.courseNum;
	}

public String getCourseDept() {
	return this.courseDept;
}
public int getNumCredits() {
	return this.numCredits;
}

public String getCourseName() {
	if (this.isGraduateCourse == true) {
		return "G" + this.courseDept + this.courseNum;
	}
	
	return "U" + this.courseDept + this.courseNum;
	
}

public boolean equals(Object obj) {
	Course c = (Course) obj;
	  if(this.isGraduateCourse != c.isGraduateCourse) {
		  return false;
	  }
	  if(this.courseNum != c.courseNum) {
		  return false;
	  }
		        
	if(this.courseDept != c.courseDept) {
		 return false;
	}
		        
	if(this.numCredits != c.numCredits) {
		return false;
	}
	return true;
}

@Override
public String toString() {
    if(isGraduateCourse == true) {
    	 return String.format("Course: %3s-%3d | Number of Credits: %02d | Graduate",getCourseDept(), getCourseNum(), getNumCredits(),isGraduateCourse());	
    }
         return String.format("Course: %3s-%3d | Number of Credits: %02d | Undergraduate",getCourseDept(), getCourseNum(), getNumCredits(),isGraduateCourse());
}
@Override
public int compareTo(Course otherEmpl) {
          
	return Integer.compare(courseNum, otherEmpl.courseNum);
}
}
