package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("MY ID");

	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("my student info");
		
	}
public void getStudentInfo(String email, long phoneNumber) {
	System.out.println("my personal info");
		
	}

public static void main(String[] args) {
	Students obj = new Students();
	obj.getStudentInfo(25);
	obj.getStudentInfo(25, "Deepan");
	obj.getStudentInfo("deepan.arivazhagan@gmail.com", 125869854);
}

}
