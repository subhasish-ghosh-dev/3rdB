package codingbat.warmup02;

public class StringMatch {

	public int stringMatch(String a, String b) {
		  
		  int count=0;
		  boolean bigger = false;
		  if(a.length()>=b.length()){
		    bigger = true;
		  }
		  
		  if(bigger){
		    for(int i=0; i<b.length(); i++){
		      if(i<b.length()-2 && a.substring(i,i+2).equals(b.substring(i,i+2))){
		        count++;
		      }
		      else if(i==b.length()-2 && a.substring(i,i+2).equals(b.substring(i))){
		        count++;
		      }
		    }  
		  }
		  else {
		    for(int i=0; i<a.length(); i++){
		      if(i<a.length()-2 && a.substring(i,i+2).equals(b.substring(i,i+2))){
		        count++;
		      }
		      else if(i==a.length()-2 && b.substring(i,i+2).equals(a.substring(i))){
		        count++;
		      }
		    }
		  }
		  
		  
		  return count;
		}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMatch str = new StringMatch();
		str.stringMatch("abc", "abc");
	}

}
