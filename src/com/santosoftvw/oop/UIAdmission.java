package com.santosoftvw.oop;

import java.util.Scanner;

import com.santosoftvw.oop.Student.types;

public class UIAdmission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Student.types t = 	Student.types.ADMISSION;
		//t.type = "credit transfer";		
		t.type = "beginner";
		Student st = new Student(79, 78, 76, t);
		//Student st = new Student(4, t);
		
		st.processAdmission();
		
		//String[] course = {"CSE 2104", "CSE 2102", "CSE 2103"};
		//double[] marks = {45,51,57};
		String[] course = new String[3];
		double[] marks = new double[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three course code s");
		int count=0;
		while(count<=2 && sc.hasNext()){
			if(count<=2){
				course[count++]=sc.next();	
			}				
			else
				break;			
		}
		System.out.println("Enter marks for three courses");
		count=0;
		System.out.println("Mark for Course CODE:"+course[count]);	
		while(count<=2 && sc.hasNext()){			
			if(count<=2){							
				marks[count++]=sc.nextDouble();
				if(count<=2)System.out.println("Mark for Course CODE:"+course[count]);
			}
			else{
				break;
			}
		}	
		sc.close();
		Student stu = new Student("2034052",course, marks);
		stu.calc();
		stu.display();
	}

}
