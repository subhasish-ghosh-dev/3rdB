package com.santosoftvw.oop;

public class Admission implements IExternalAdmission{
	
		
	
	private boolean calculateEligibility(Student student){
		if((student.admissionMarks*0.3+student.sscMarks*0.25+student.hscMarks*0.45)>80){
			return true;
		}
		else {
			return false;
		}
		
	}


	@Override
	public boolean calculateEligibilty(Student stduent) {
		// TODO Auto-generated method stub
		if(MINIMUMLEVELOFUNIVERSITY>=4){
			return true;
		}
		else{
			return false;
		}		
	}
	
	public boolean isStudentEligible(Student student){
		
		return calculateEligibility(student);
		
	}
	
}
