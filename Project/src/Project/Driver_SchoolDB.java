import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
class Driver_SchoolDB {

	
	 
    public static void main(String[] args) throws FileNotFoundException {
    	 Employee[] employee = new Employee[20];
    	 int employeeNum = 0;
    	 Person[] person = new Person[20];
    	 int personNum = 0;
    	 Student[] student = new Student[20];
    	 int studentNum = 0;
    	 Faculty[] faculty = new Faculty[20];
    	 int facultyNum = 0;
    	 GeneralStaff[] generalStaff = new GeneralStaff[20];
    	 int generalStaffNum = 0;
    	 Course[] course = new Course[20];
    	 int courseNum = 0;
    	 
    	 Scanner sc = new Scanner(System.in); 
    	 
    	 String classType;
    	 
    	File file = new File("SchoolDB_Initial.txt"); 
    	Scanner scnr = null ;
	    try {
	    	
	    	scnr = new Scanner(file).useDelimiter("[  :,!?.]+");
	    
	    	while(scnr.hasNext()) {
	    	
	    		System.out.println(scnr.nextLine());
	    	}
	    	
			
	    }catch (FileNotFoundException e) {
	    	System.err.println("Error: " + e.getMessage());
	    }
	    finally {
	    	scnr.close();
	    }
	    
	    

	   
	    
	    course[courseNum] = new Course(true, 771,"MAT",4); courseNum++;
	    course[courseNum] = new Course(true,777,"CMP",4);  courseNum++;
	    course[courseNum] = new Course(true,711,"CMP",4);  courseNum++;
	    course[courseNum] = new Course(true,723,"MAT",4);  courseNum++;
	    course[courseNum] = new Course(false,168,"CMP",4); courseNum++;
	    course[courseNum] = new Course(false,338,"CMP",4); courseNum++;
	    
	    faculty[facultyNum]  = new Faculty(); facultyNum++;
	    faculty[facultyNum]  = new Faculty(true); facultyNum++;
	    faculty[facultyNum]  = new Faculty("MAT", false); facultyNum++;
	    faculty[facultyNum]  = new Faculty("Superman",1938,"PHY",true); facultyNum++;
	    
	    student[studentNum] = new Student(); studentNum++;
	    student[studentNum] = new Student(false); studentNum++;
	    student[studentNum] = new Student("Math",false); studentNum++;
	    student[studentNum] = new Student("Wonderwoman",1941,"JST",true); studentNum++;
	    
	    generalStaff[generalStaffNum] = new GeneralStaff(); generalStaffNum++;
	    generalStaff[generalStaffNum] = new GeneralStaff("advise students"); generalStaffNum++;
	    generalStaff[generalStaffNum] = new GeneralStaff("Sanitation","clean"); generalStaffNum++;
	    generalStaff[generalStaffNum] = new GeneralStaff("Flash Gordon",1934,"Security","safety"); generalStaffNum++;
	    
	    
	    	
	  
	    
	    
	    
	    
	    
	    System.out.println("");
	    System.out.println("**************************************************************");
	    System.out.println("SCHOOL DATABASE INFO:");
	    System.out.println("");
	    System.out.println("************************************************");
	    System.out.println("COURSES:");
	    for (int num = 0; num < course.length; num++ ) {
	    	if(course[num] != null) {
	    		System.out.println(course[num].toString());
	    	}
	    }
	  
	    
	    //Start printing the output
	    System.out.println("************************************************");
	    System.out.println("************************************************");
	    System.out.println("PERSONS:");
	    System.out.println("************************************************");
	    System.out.println("************************************************");
	    
	    System.out.println("EMPLOYEES:");
	    System.out.println("************************************************");
	    System.out.println("************************************************");
	    
	    //Start printing out the generalStaff array list to the end with toString
	    System.out.println("GENERAL STAFF:");
	    for (int num = 0; num < generalStaff.length; num++ ) {
	    	if(generalStaff[num] != null) {
	    		System.out.println(generalStaff[num].toString());
	    	}
	    }
	    System.out.println("************************************************");
	    System.out.println("************************************************");
	    
	    //Start printing out the faculty array list to the end with toString
	    System.out.println("FACULTY:");
	    for (int num = 0; num < faculty.length; num++ ) {
	    	if(faculty[num] != null) {
	    		System.out.println(faculty[num].toString());
	    	}
	    }
	    System.out.println("************************************************");
	    System.out.println("************************************************");
	    
	    //Start printing out the student array list to the end with toString
	    System.out.println("STUDENTS:");
	    for (int num = 0; num < student.length; num++ ) {
	    	if(student[num] != null) {
	    		System.out.println(student[num].toString());
	    	}
	    }
	    System.out.println("************************************************");
	    System.out.println("**************************************************************");
	    System.out.println("");
	    
 //Menu option
	    
	    System.out.println("MENU PLEASE PICK ONE ---------------- WARNING: CAP SENSITIVE");
	    System.out.println("");
	    System.out.println("a. Create 3 new Course object from inputs");
	    System.out.println("b. Create 3 new Faculty object from inputs");
	    System.out.println("c. Create 3 new GeneralStaff object from inputs");
	    System.out.println("d. Create 3 new Student based on inputs");
	    System.out.println("e. Add 2 new Courses to a Faculty object");
	    System.out.println("f. Add 2 new Courses to a Student object");
	    System.out.println("g. Add an array of 2 Courses to a Faculty object");
	    System.out.println("h. Add an array of 2 Courses to a Student object");
	    System.out.println("i. Add an array of 2 Courses to a Student object");
	    System.out.println("j. Add an array of 2 Courses to a Student object");
	    System.out.println("k. Allow the user to select a Faculty object and a Course object from menus and query the Faculty object for the Course to determine whether the Faculty object teaches it or not.");
	    System.out.println("l. Determine which Faculty object teaches the most and the least courses");
	    System.out.println("m. Determine which Course is the minimum and which is the maximum of all Course objects in the catalog.");
	    System.out.println("n. Determine which Student has the most and least credits");
	    
	   
	    String letters = sc.nextLine();
	    
	    switch (letters ) {
	    case "a" : //a. Create 3 new Course object from inputs
	    	for(int newObjectNum = 0; newObjectNum < 3; newObjectNum++) {
	    		//getting all the variables for course
		    	System.out.println("Is this a Graduate course? True/False");
		    	boolean graduateCourse = sc.nextBoolean();
		    	
		    	System.out.println("What is the class number?");
		    	int num = sc.nextInt();
		    	
		    	System.out.println("What is the major in this new course?");
		    	String major = sc.nextLine();
		    	
		    	System.out.println("What is the amount of credit for this Course?");
		    	int credit = sc.nextInt();
		    	//inserting the variable to course
		    	try {
		    	course[courseNum] = new Course(graduateCourse,num,major,credit);
		    	System.out.println("New object created for course.");
		    	course[courseNum].toString();
		    	courseNum++;
	    		}
		    	catch(ArrayIndexOutOfBoundsException s){
		            System.out.println("Out of bound");
		        }}
		    	break;
		    	
		  case "b":
			  //b. Create 3 new Faculty object from inputs
			  for(int newObjectNum = 0; newObjectNum < 3; newObjectNum++) {
				 //getter variable for faculty
				 boolean istenured ;
				  System.out.println("Give me the faculty name. Type NULL if no name are given.");
				  String name = sc.nextLine();
				  System.out.println("Give me the faculty birthYear. Type -1 if no birth year are given.");
				  int year= sc.nextInt();
				  System.out.println("Give me the faculty department name. Type NULL if no department name");
				  String deptName = sc.nextLine();
				  System.out.println("Give me the faculty tenure statue.");
				  System.out.println("Type NULL if no tenure statue are given or type GIVEN if the tenure statue is given.");
				  String tenured = sc.nextLine();
				  
				  if (tenured != "NULL") {
					  System.out.println("Is the Faulty member is Tenured. True/False");
					   istenured = sc.nextBoolean();
				  }
				  //use if statement to find which constructor to put the variables in
				  try {
				  if(name != "NULL" && year != -1) {
					  faculty[facultyNum] = new Faculty(name,year,deptName,istenured);
					  System.out.println("New object created for faculty.");
					  faculty[facultyNum].toString();
				  }else if(deptName != "NULL") {
					  faculty[facultyNum] = new Faculty(deptName, istenured);
					  System.out.println("New object created for faculty.");
					  faculty[facultyNum].toString();
				  	}else if (tenured != "NULL") {
				  		faculty[facultyNum] = new Faculty( istenured);
				  		System.out.println("New object created for faculty.");
						 faculty[facultyNum].toString();
				  		}else {
				  			faculty[facultyNum] = new Faculty();
				  			System.out.println("New object created for faculty.");
							  faculty[facultyNum].toString();
				  		}
					   facultyNum++;
					   }//just in case for array is out of bound
				  		catch(ArrayIndexOutOfBoundsException e) {
				            System.out.println("Out of bound");
				        }
				  
			  }
			  break;
		  case "c":
			  //c. Create 3 new GeneralStaff object from inputs
			  for(int newObjectNum = 0; newObjectNum < 3; newObjectNum++) {
				  //inputing the variables for the generalStaff object
					  System.out.println("Give me the general staff name. Type NULL if no name are given.");
					  String name = sc.nextLine();
					  System.out.println("Give me the general staff year of birth. Type -1 if no birth year are given.");
					  int year= sc.nextInt();
					  System.out.println("Give me the general staff department name. Type NULL if no department name are given.");
					  String deptName = sc.nextLine();
					  System.out.println("Give me the general staff duty. Type NULL if no department duty are given.");
					  String duty = sc.nextLine();
					  
					  //use if statement to find which constructor to put the variables in
					  try {
					  if(name != "NULL" && year < 0) {
						  generalStaff[generalStaffNum] = new GeneralStaff(name,year,deptName,duty);
						  System.out.println("New object created for general staff.");
						  generalStaff[generalStaffNum].toString();
					  }else if (deptName != "NULL") {
						  generalStaff[generalStaffNum] = new GeneralStaff(deptName, duty);
						  System.out.println("New object created for general staff.");
						  generalStaff[generalStaffNum].toString();
					  }else if (duty != "NULL") {
						  generalStaff[generalStaffNum] = new GeneralStaff( duty);
						  System.out.println("New object created for general staff.");
						  generalStaff[generalStaffNum].toString();
					  }else {
						  generalStaff[generalStaffNum] = new GeneralStaff( );
						  System.out.println("New object created for general staff.");
						  generalStaff[generalStaffNum].toString();
					  }
					  generalStaffNum++;
					  	}
					  catch(ArrayIndexOutOfBoundsException e) {
				            System.out.println("Out of bound");
				        }
					  	}
					  break;
			    	
		  case "d":
			  //d. Create 3 new Student based on inputs
			  for(int newObjectNum = 0; newObjectNum < 3; newObjectNum++) {
				  //getting inputs for the variables
				  boolean isGraduate = true;
				  System.out.println("Give me the Student name. Type NULL if no name are given.");
				  String name = sc.nextLine();
				  System.out.println("Give me the Student birthYear. Type -1 if no birth year are given.");
				  int year= sc.nextInt();
				  System.out.println("Give me the Student major. Type NULL if no major are given.");
				  String major = sc.nextLine();
				  System.out.println("Type NULL if no isGraduate are given");
				  String graduate = sc.nextLine();
				  
				  if (graduate != "NULL") {
					  System.out.println("Does the Faulty member is Tenured. Type true or false");
					  isGraduate = sc.nextBoolean();
				  }
				  
				  //use if statement to find which constructor to put the variables in
				  try {
				  if(name != "NULL" && year != -1) {
					  student[studentNum] = new Student(name,year,major,isGraduate);
					  System.out.println("New object created for student.");
					  generalStaff[generalStaffNum].toString();
				  }else if(major != "NULL") {
					  student[studentNum]  = new Student(major, isGraduate);
					  System.out.println("New object created for student.");
					  student[studentNum].toString();
				  	}else if (graduate != "NULL") {
				  		student[studentNum] = new Student( isGraduate);
				  		System.out.println("New object created for student.");
				  		student[studentNum].toString();
				  		}else {
				  			student[studentNum]  = new Student();
				  			System.out.println("New object created for student.");
				  			student[studentNum].toString();
				  		}
				  studentNum++;
				  }catch(ArrayIndexOutOfBoundsException e) {
			            System.out.println("Out of bound");
			        }
			  }
			  break;
			  
		  case "e":
			  //e. Add 2 new Courses to a Faculty object
			  System.out.println("We are going pick a faculty object to add the courses into.");
			  System.out.println("");
			  
			  //print all of the faculty to make sure the user see what faculty they want to add to
			  for(int num = 0; num < faculty.length; num++) {
				  if(faculty[num] != null) {
				  System.out.println(num + " " + faculty[num].toString());
				  }
			  }
			  System.out.println("Type in the number of the faculty object you want to insert to.");
			  int k = sc.nextInt(); // select one of the faculty to add to
			  
			//print all of the course to make sure the user see what course they want to add to the faculty object
			  System.out.println("We are going to add two courses into a faculty object");
			  System.out.println("");
			  for(int num = 0; num < course.length; num++) {
				  if(course[num] != null) {
				  System.out.println(num + " " + course[num].toString());
				  }
			  }
			  System.out.println("Type in the number of the course object you want to insert to faculty.");
			  int one = sc.nextInt();
			  System.out.println("Pick another course.");
			  int another = sc.nextInt();
			  try {
			  //adding the course into the faculty
			  faculty[k].addCourseTaught(course[one]);
			  faculty[k].addCourseTaught(course[another]);
			  System.out.println("Here are the courses added to the faculty.");
			  faculty[k].getAllCoursesTaughtAsString();
			  }
			  catch(ArrayIndexOutOfBoundsException e) {
		            System.out.println("Out of bound");
		        }
			  break;
			  
		  case "f":
			  //f. Add 2 new Courses to a Student object
			  System.out.println("We are going to pick a student object to add the courses into.");
			  System.out.println("");
			  
			//print all of the student to make sure the user see what student they want to add to
			  for(int num = 0; num < student.length; num++) {
				  if(student[num] != null) {
				  System.out.println(num + " " + student[num].toString());
				  }
			  }
			  System.out.println("Type in the number of the student object you want to insert to.");
			   k = sc.nextInt(); // select one of the faculty to add to
			  
			  System.out.println("We are going to add two courses into a student object");
			  System.out.println("");
			  
			//print all of the course to make sure the user see what course they want to add to student
			  for(int num = 0; num < course.length; num++) {
				  if(course[num] != null) {
				  System.out.println(num + " " + course[num].toString());
				  }
			  }
			  System.out.println("Type in the number of the course object you want to insert to student.");
			   one = sc.nextInt();
			  System.out.println("Pick another course.");
			   another = sc.nextInt();
			  try {
			  //adding the course into the faculty
			  student[k].addCourseTaken(course[one]);
			  student[k].addCourseTaken(course[another]);
			  System.out.println("Here are the courses added to the student.");
			  student[k].getAllCoursesTakenAsString();
			  }
			  catch(ArrayIndexOutOfBoundsException e) {
		            System.out.println("Out of bound");
		        }
			  break;
			  
		  case "g":  
			  //g. Add an array of 2 Courses to a Faculty object
			  System.out.println("We are now adding 2 courses to faculty");
			  System.out.println("");
			  
			//print all of the faculty to make sure the user see what faculty they want to add to
			  for(int num = 0; num < faculty.length; num++) {
				  if(faculty[num] != null) {
				  System.out.println(num + " " + faculty[num].toString());
				  }
			  }
			  System.out.println("Type in the number of the faculty object you want to insert to.");
			   k = sc.nextInt(); // select one of the faculty to add to
			  
			  System.out.println("We are going to add two courses into a faculty object");
			  System.out.println("");
			  
			//print all of the course to make sure the user see what course they want to add to faculty
			  for(int num = 0; num < course.length; num++) {
				  if(course[num] != null) {
				  System.out.println(num + " " + course[num].toString());
				  }
			  }
			  System.out.println("Type in the number of the course object you want to insert to faculty.");
			   one = sc.nextInt();
			  System.out.println("Pick another course.");
			   another = sc.nextInt();
			   Course [] toAddArray = {course[one],course[another]};
			  try {
			  //adding the course into the faculty
			  faculty[k].addCoursesTaught(toAddArray);
			  System.out.println("Here are the courses added to the faculty.");
			  faculty[k].getAllCoursesTaughtAsString();
			  }
			  catch(ArrayIndexOutOfBoundsException e) {
		            System.out.println("Out of bound");
		        }
			  break;
			  
		  case "h":
			  //h. Add an array of 2 Courses to a Student object
			  System.out.println("We are now adding 2 courses to student.");
			  System.out.println("");
			  
			//print all of the student to make sure the user see what student they want to add to
			  for(int num = 0; num < student.length; num++) {
				  if(student[num] != null) {
				  System.out.println(num + " " + student[num].toString());
				  }
			  }
			  System.out.println("Type in the number of the faculty object you want to insert to.");
			   k = sc.nextInt(); // select one of the faculty to add to
			  
			  System.out.println("We are going to add two courses into a student object");
			  System.out.println("");
			  
			//print all of the course to make sure the user see what course they want to add to faculty
			  for(int num = 0; num < course.length; num++) {
				  if(course[num] != null) {
				  System.out.println(num + " " + course[num].toString());
				  }
			  }
			  System.out.println("Type in the number of the course object you want to insert to faculty.");
			   one = sc.nextInt();
			  System.out.println("Pick another course.");
			   another = sc.nextInt();
			   Course [] toAddArrayStudent = {course[one],course[another]};
			  try {
			  //adding the course into the faculty
			  student[k].addCoursesTaken(toAddArrayStudent);
			  System.out.println("Here are the courses added to the student.");
			  student[k].getAllCoursesTakenAsString();
			  }
			  catch(ArrayIndexOutOfBoundsException e) {
		            System.out.println("Out of bound");
			  }
			  break;
			  
		  case "i":
			  //i Get the Course at index (valid and invalid indexes) from a Faculty object
			  //printing out all of the faculty
			  for(int num = 0; num < faculty.length; num++) {
				  if(faculty[num] != null) {
				  System.out.println(num + " " + faculty[num].toString());
				  }
			  }
			  System.out.println("Pick a faculty by their number in the beginning please.");
			  k = sc.nextInt();
			  System.out.println("What is the index that you need ?: ");
			  int index = sc.nextInt();
			  System.out.println("Class at index " + index + " is " + faculty[k].getCourseTaught(index).toString());
			  break;
			  
		  case "j":
			  //j Get the Course at index (valid and invalid indexes) from a Student object
			  //printing out all of the student
			  for(int num = 0; num < student.length; num++) {
				  if(student[num] != null) {
				  System.out.println(num + " " + student[num].toString());
				  }
			  }
			  System.out.println("Pick a faculty by their number in the beginning please.");
			  k = sc.nextInt();
			  System.out.println("What is the index that you need ?: ");
			  index = sc.nextInt();
			  System.out.println("Class at index " + index + " is " + student[k].getCourseTaken(index).toString());
			  break;
			  
		  case "k":
			  
			//k. Allow the user to select a Faculty object and a Course object from menus and query the Faculty object
			  //for the Course to determine whether the Faculty object teaches it or not.
			  System.out.println("We are going pick a faculty object to see if that person teaches a certain class or not.");
			  System.out.println("");
			  
			  //print all of the faculty to make sure the user see what faculty they want to pick
			  for(int num = 0; num < faculty.length; num++) {
				  if(faculty[num] != null) {
				  System.out.println(num + " " + faculty[num].toString());
				  }
			  }
			  System.out.println("Type in the number of the faculty object you want to insert to.");
			   k = sc.nextInt(); // select one of the faculty 
			  
			//print all of the course to make sure the user see what course they want to pick
			  System.out.println("Pick a course you want to see if a faculty member teaches it or not");
			  System.out.println("");
			  for(int num = 0; num < course.length; num++) {
				  if(course[num] != null) {
				  System.out.println(num + " " + course[num].toString());
				  }
			  }
			  System.out.println("Type in the number of the course object you want to see if faculty teaches it.");
			   one = sc.nextInt();
			   boolean match = false;
		    	for(int num = 0; num < faculty[k].getNumCoursesTaught(); num++) {
		    		if(faculty[k].getCourseTaught(num) == course[one]) {
		    			match = true; 
		    		}
		    	}
		    	System.out.println("Faculty teaches that course = " + match);
		       break;
			  
			  
		  case "l":
			  //l Determine which Faculty object teaches the most and the least courses
			  int most = 1;
		       int least = 1;
		       Faculty mostf = null;
		       Faculty leastf = null;
		       
		       for(int num = 0; num< faculty.length; num++) {
		    	   if(faculty[num].getNumCoursesTaught() > most) {
		    		   most = faculty[num].getNumCoursesTaught();
		    		   mostf = faculty[num];
		    	   }
		    	   else if(faculty[num].getNumCoursesTaught() < least) {
		    		   least = faculty[num].getNumCoursesTaught();
		    		   leastf = faculty[num];
		    	   } 
		       }
		       System.out.println(mostf.getName() + "teaches the most class, and "+ leastf.getName() + "teaches the least");
		       break;
		       
		  case "m":
			  //m Determine which Course is the minimum and which is the maximum of all Course objects in the catalog
			  int higher = course[0].getNumCredits();
			  int lower = course[0].getNumCredits();
				Course most1 = null;
		       Course least1 = null;
			  try {   
				  
				  		//check all course for credit
			    	   for(int num = 1; num <course.length; num++) {
			    		   if (course[num].getNumCredits() > higher) {
			    			   higher = course[num].getNumCredits();
				    		   most1 = course[num];
			    		   }
			    		   else if(course[num].getNumCredits() < num) {
			    			   lower = course[num].getNumCredits();
				    		   least1 = course[num];
			    	   }
				       System.out.println(most1.getCourseName() + "has the most credit, and "+ least1.getCourseName() + "has the least");
				    }}
				    catch(NullPointerException e) {
				    	System.out.println("Null point");
				    }
			       break;
		
		  case "n":
			  //n Determine which Student has the most and least credits

			   higher = student[0].getNumCoursesTaken();
			   lower = student[0].getNumCoursesTaken();
				Student most2 = null;
		       Student least2 = null;
			  try {   
				  
				  		//check all course for credit
			    	   for(int num = 1; num <course.length; num++) {
			    		   if (student[num].getNumCoursesTaken() > higher) {
			    			   higher = student[num].getNumCoursesTaken();
				    		   most2 = student[num];
			    		   }
			    		   else if(student[num].getNumCoursesTaken() < num) {
			    			   lower = student[num].getNumCoursesTaken();
				    		   least2 = student[num];
			    	   }
				       System.out.println(most2.getNumCoursesTaken() + "has the most credit, and "+ least2.getNumCoursesTaken() + "has the least");
				    }}
				    catch(NullPointerException e) {
				    	System.out.println("Null point");
				    }
			       break;
			  
		  default: 
			  System.out.println("error wrong input");
			  break;
		    	
		    }
	    
	    //Display all the Objects using toString on the console (this includes existing plus recently added)
	    System.out.println("ALL COURSES");
	    for(int num = 0; num < course.length; num++) {
			  if(course[num] != null) {
			  System.out.println(course[num].toString());
			  }
		  }
	    
	    System.out.println("");
	    System.out.println("ALL FACULTY");
	    
	    for(int num = 0; num < faculty.length; num++) {
			  if(faculty[num] != null) {
			  System.out.println(faculty[num].toString());
			  }
		  }
	    
	    System.out.println("");
	    System.out.println("ALL PERSON");
	    for(int num = 0; num < person.length; num++) {
			  if(person[num] != null) {
			  System.out.println(person[num].toString());
			  }
		  }
	    
	    System.out.println("");
	    System.out.println("ALL STUDENT");
	    for(int num = 0; num < student.length; num++) {
			  if(student[num] != null) {
			  System.out.println(student[num].toString());
			  }
		  }
	    
	    System.out.println("");
	    System.out.println("ALL EMPLOYEE");
	    for(int num = 0; num < employee.length; num++) {
	    	if(employee[num] != null) {
			  System.out.println(employee[num].toString());
			  }
		  }
	    
	    System.out.println("");
	    System.out.println("ALL GENERALSTAFF");
	    for(int num = 0; num < generalStaff.length; num++) {
			  if(generalStaff[num] != null) {
			  System.out.println(generalStaff[num].toString());
			  }
		  }
	  
}
    

}
