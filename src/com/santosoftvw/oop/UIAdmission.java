package com.santosoftvw.oop;

public class UIAdmission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Student.types t = 	Student.types.ADMISSION;
		t.type = "beginner";
		Student st = new Student(89, 78, 76, t);
		
		st.processAdmission();
	}

}
