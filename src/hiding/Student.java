package hiding;

public class Student {
	
	// 멤버 변수(필드)
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	
	// 메서드 게터세터
	public String getStudentName() {
		// private변수인 studentName에 접근해 값을 가져오는 public get() 메서드
		return studentName;
	}
	public void setStudentName(String studentName) {
		// private변수인 studentName에 접근해 값을 지정하는 public set() 메서드
		this.studentName = studentName;
	}

}
