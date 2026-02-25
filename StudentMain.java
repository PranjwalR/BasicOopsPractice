
class Student1{
	
	private String studentName;
	private Long studentRollNo;
	private Long studentMarks;

	 public Student1(String studentName, Long studentRollNo, Long studentMarks){
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
		this.studentMarks = studentMarks;
	}
	public void displayDetails(){
		System.out.println("studentName : "+ studentName +
				   " , studentRollNo : "+ studentRollNo +
				" , studentMarks : "+studentMarks);
	}

}
public class StudentMain{

	public static void main(String[] args){

	Student1 s1 = new Student1("Pranjwal",101L,100L);
	Student1 s2 = new Student1("Ram",102L,90L);
	Student1 s3 = new Student1("Sham",103L,85L);
	s1.displayDetails();
	s2.displayDetails();
	s3.displayDetails();

	}

}