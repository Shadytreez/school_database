

public class Person implements Comparable<Person> {
private String 	name;
private int birthYear;
//constructor
public Person() {
	name = "";
	birthYear = 0;
}
public Person (String name, int birthYear) {
	this.name = name;
	this.birthYear = birthYear;
}
//getters
	public String getName() {
		return this.name;
	}
	
	public int getBirthYear() {
		return this.birthYear;
	}
	
	//setter
	public void setBirthYear(int year) {
		this.birthYear = year;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
	Person c = (Person) obj;
	
	if (this.name != c.name){
		return false;
	}
	if (this.birthYear != c.birthYear) {
		return false;
	}
	
	return true;
	}
	
	public String helper() {
		//turns birthYear into a String for compareTo
		String helper = String.valueOf(birthYear);
		return helper;
	}
	
	@Override
	public int compareTo(Person p) {
		  int comparisonVal = 0;
		  
		    //sorting by class num
		    
		  comparisonVal = this.helper().compareTo(p.helper());
		   
		    return comparisonVal;
		
	}
	@Override
	public String toString() {
		return String.format("Person: Name: %30s | Birth Year: %4d",  this.name, this.birthYear);
	}
	
}
