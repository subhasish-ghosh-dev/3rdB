package codingbat.warmup01;

public class BackAround {
	
	public String backAround(String str) {
		char ch = str.charAt(str.length()-1);
		StringBuffer strB = new StringBuffer();
		strB.append(String.valueOf(ch)).append(str).append(String.valueOf(ch));
		return strB.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
