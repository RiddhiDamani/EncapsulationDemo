class Student {
	int rollNo;
	String studentName;
	
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
