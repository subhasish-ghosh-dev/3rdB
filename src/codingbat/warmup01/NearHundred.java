package codingbat.warmup01;

public class NearHundred {
	
	public boolean nearHundred(int n) {
		  int diff = n;
		  if(diff>=90 && diff<=110){
		    return true;
		  }
		  else if(diff>=190 && diff<=210){
		    return true;
		  }
		  else{
		    return false;
		  }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
