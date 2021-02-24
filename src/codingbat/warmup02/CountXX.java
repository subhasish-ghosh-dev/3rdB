package codingbat.warmup02;

public class CountXX {

	int countXX(String str) {
		  
		  int countX = 0;
		  
		  for(int i=0; i<str.length()-1; i++){
		    
		    if(str.charAt(i)=='x'){
		      if(str.charAt(i+1)=='x'){
		        countX++;
		      }
		    }
		    
		  }
		  return countX;
		  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
