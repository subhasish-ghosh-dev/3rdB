package codingbat.warmup01;

public class FrontBack {
	
	public String frontBack(String str) {
		  
		  if(str.length()>0){
		      char[] ch = new char[str.length()];
		  
		      int first = 0;
		      int last = str.length()-1;
		      
		      ch[first] = str.charAt(last);
		      ch[last]  = str.charAt(first);
		      
		      for(int i=1; i<str.length()-1; i++){
		        ch[i] = str.charAt(i);
		      }
		      
		      return new String(ch);
		    
		  }
		  
		  else{
		    return str;
		  }
		  
		  
		  
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrontBack f = new FrontBack();
		f.frontBack("Chocolate");
	}

}
