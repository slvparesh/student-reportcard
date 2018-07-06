import java.util.*;


public class MainClass {
	
	
	boolean validateInputs(int studentID, int semNumber,int total_subjects,int points_earned){
		
		 String id=studentID+"";
		 int len;
		len=id.length();
		if((len==4)){
			
			if(semNumber>=1 && semNumber<=7){
							if(total_subjects>=1 && total_subjects<=7){
									if(points_earned>=1&& points_earned <=20)
											return true;
											else
											return false;
											}
											else
										return false;
								}
									else
						return false;
		
	}
		else
			return false;}
	
	public static void main(String[] args) {
	
		MainClass ob=new MainClass();
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter student id");
		int studentID =sc.nextInt();
		System.out.println(" Enter Semester Number");
		int semesterNo=sc.nextInt();
		System.out.println(" Enter total subjects");
		int total_subjects=sc.nextInt();
		System.out.println(" Enter points earned");
		int points_earned=sc.nextInt();
		
		boolean b=ob.validateInputs(studentID, semesterNo, total_subjects, points_earned);
		if(b){
			System.out.println(" Enter student Name");
			String studentName =sc.next();
			System.out.println(" Enter Department Name");
			String departmentName =sc.next();
				
			StudentReportCard reportObject =new StudentReportCard(studentID, studentName,departmentName,semesterNo,total_subjects,points_earned);
			reportObject.display();

	     }
		else
		System.out.println("invalid input");

	
	
	
	
	
	
	
	
	
}}
