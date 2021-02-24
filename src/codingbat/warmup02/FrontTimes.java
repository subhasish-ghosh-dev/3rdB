package codingbat.warmup02;

public class FrontTimes {
	
	/*
	 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, 
	 * or whatever is there if the string is less than length 3. Return n copies of the front;
			frontTimes("Chocolate", 2) → "ChoCho"
			frontTimes("Chocolate", 3) → "ChoChoCho"
			frontTimes("Abc", 3) → "AbcAbcAbc"
	 */
	
	public String frontTimes(String str, int n) {
		String newStr = "";
		int i=1;
		while(i<=n){
			if(str.length()>=3)newStr = newStr.concat(str.substring(0,3));
			else newStr = newStr.concat(str);
			i++;
		}
		
		return newStr;
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
