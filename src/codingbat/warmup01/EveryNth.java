package codingbat.warmup01;

public class EveryNth {

	public String everyNth(String str, int n) {
		  
		  int ln = str.length();
		  
		  StringBuilder result = new StringBuilder(); 
		  
		  for(int i=0; i<ln; i=i+n){
		    result.append(String.valueOf(str.charAt(i)));
		  }
		  
		  return result.toString();
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
