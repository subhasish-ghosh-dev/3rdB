package codingbat.warmup02;

public class StringTimes {
	
	/*Given a string and a non-negative int n, return a larger string that is n copies of the original string.

			stringTimes("Hi", 2) → "HiHi"
			stringTimes("Hi", 3) → "HiHiHi"
			stringTimes("Hi", 1) → "Hi"
	*/
	
	String st = "welcome";
	String st2 = st.concat("java");
	
	public String stringTimes(String str, int n) {
		
		String newStr = "";
		int i=1;
		while(i<=n){
			newStr = newStr.concat(str); 
			i++;
		}
		
		return newStr;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
