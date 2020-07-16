/*
 * In encapsulation, always use getter and setter method to access the variables of the other class. 
 * Only way to access the other's class variables is thru the methods (i.e. getter & setter)
 * Also, make sure to set the variables of this class are private and the methods used to access these 
 * variables should be public. These means that you are binding your data with these methods. 
 * And whenever you bind your data with methods - this process is known as encapsulation
 * Encapsulation -> Binding Data with Methods
 */

class Student {
	private int rollNo;
	private String studentName;
	
	//Getters and Setters
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int r) {
		this.rollNo = r;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String s) {
		this.studentName = s;
	}
	
	
}

public class GetterSetterDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setRollNo(1);
		s1.setStudentName("Riddhi");
		
		System.out.println(s1.getRollNo());
		System.out.println(s1.getStudentName());

	}

}
