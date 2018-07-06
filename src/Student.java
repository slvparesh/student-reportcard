
public class Student {

	
	int studentID;
	String studentName;
	String departmentName;
	int semesterNo;
	
	Student(){
		
		}
	Student(int studentID,String studentName,String departmentName,int semesterNo){
		
		this.studentID=studentID;
		this.studentName=studentName;
		this.departmentName=departmentName;
		this.semesterNo=semesterNo;
	}

	
	void display(){
		System.out.println("Student ID : "+studentID);
		System.out.println("Name of the Student : "+studentName);
		System.out.println("Department Name : "+departmentName);
		System.out.println("Semester Number : "+semesterNo);
		
		
	}
	
	
	
	
	
	
	
	
}
