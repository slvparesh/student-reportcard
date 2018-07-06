
public class StudentReportCard extends Student {

	
	int total_subjects; 
	int points_earned; 
	float gpa; 
	float cgpa;
	float GPA=0.0f;
	float CGPA =0.0f;
	
	
	StudentReportCard(int studentID, String studentName, String departmentName, int semesterNo, int total_subjects, int points_earned)
	{
		super(studentID,studentName,departmentName,semesterNo);
		this.total_subjects=total_subjects;
		this.points_earned=points_earned;
	}


	float gpaCalculator(){
		
		GPA = (total_subjects * points_earned) / 7;
		return GPA;
	}
	float cgpaCalculator(float gpa){
		
		CGPA = (GPA) /(semesterNo);
		return CGPA;	
	}
	
	
	void display(){
	  System.out.println("Student ID : "+studentID);  
	  System.out.println("Name of the student : "+studentName);
	  System.out.println("Department Name : " +departmentName);
	  System.out.println("Semester Number : "+semesterNo);
	  gpa  =gpaCalculator();
	  System.out.println("GPA Computed : "+gpa);
	   cgpa=cgpaCalculator(gpa);
	  System.out.println("CGPA Computed : "+cgpa);
	}
	
	
}
