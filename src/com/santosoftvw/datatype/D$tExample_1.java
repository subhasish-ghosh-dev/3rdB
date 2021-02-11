package com.santosoftvw.datatype;

public class D$tExample_1 {
	//primitive data types
	//instance variable
	//Identifier rule (class name, variable name, method name) :  first character alphabetic letter, alphaneumeric letter _ , no space, u can use $ after your first character
	//variable declaration
	boolean flag$;//1 bit
	char code;//16 bit    '\u0000' (or 0) to '\uffff' (or 65,535 inclusive)
	byte b;//8 bit range -128 to 127
	short s;//16 bit  minimum value is -32,768 and maximum value is 32,767
	int i;//32 bit    - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1)
	long l;//64 bit    -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)
	float j;//32bit single precision  decimal values up to 7 digits of precision 0.1234567
	double d;//64 bit double precision    decimal values up to 16 digits of precision 0.123456789012345
	
	//class type or wrapper type
	String txt;
	
	
	static Integer example;
	
	//constructor
	/*public D$tExample_1(){
		
	}*/
	//constructor overloading
	public D$tExample_1(boolean f, float j, byte k){
		flag$ = f;
		this.j=  j; // 3.4534534534534533E18 = 3.4534534534534533 * 10^18
		b = k;
	}
	
	public D$tExample_1(boolean flag$){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D$tExample_1 ex = new D$tExample_1(true, (long)3453453453453453453L, (byte)129);
		ex.flag$ = true;
		String st = "1299889";
		int t = Integer.valueOf(st);
		ex.d=3.123456789876655444333333222222;
		System.out.println(ex.flag$ + "   " + ex.d + "   " + ex.b +" "+t);
		example = 12;
	}

}
