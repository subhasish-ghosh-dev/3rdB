package codingbat.warmup02;

import java.util.*;
//import java.util.ArrayList;


public class SwExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//ArrayList<String> a = new ArrayList();
		//char size = (char)sc.nextByte();
		String size = sc.next();
		switch(size) {

		case "S"  : { System.out.println("size is small"); break;  }
	    case "M"  : { System.out.println("size is medium");   }
	   
	    case "L"  : { System.out.println("size is large");   break; }
	    case "X"  : { System.out.println("size is X-large"); break; }

	    default : { System.out.println("size is not S,M,L or XL: " + size); }
	  }
	}

}
