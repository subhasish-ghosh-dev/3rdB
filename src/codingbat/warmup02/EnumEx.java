package codingbat.warmup02;

public class EnumEx {

	enum MONTH {January, February, March };
	enum TIMEZONE { 
		GMT600USIndianaStarke("(GMT-10:00) America/Adak"), 
		GMT500AmericaAtikokan("(GMT-10:00) America/Atka");
		
		private final String timeZoneId;

	    private TIMEZONE(String timeZoneId) {
	        this.timeZoneId = timeZoneId;
	    }
	
	}
	
	
	public enum Level {
	    HIGH  (3),  //calls constructor with value 3
	    MEDIUM(2),  //calls constructor with value 2
	    LOW   (1)   //calls constructor with value 1
	    ; // semicolon needed when fields / methods follow


	    private final int levelCode;

	    private Level(int levelCode) {
	        this.levelCode = levelCode;
	    }
	    
	    public int getLevelCode() {
	    	
	        return this.levelCode;
	    }
	    
	}
		
	static final int Y = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"h","l","k"};
		
		//int i=0; i<str.length(); i++
		for(String s : str){
			System.out.println(s);
		}
		
		for(TIMEZONE t : TIMEZONE.values()){
			
			System.out.println(t.name() + " : "+ t.timeZoneId);
		}
		
		for(Level level : Level.values()){
			System.out.println(level.levelCode);
		}
		/*
		switch(MONTH.January) {
		
			case January: 
				//Y=9;
				System.out.println("January Month"+Y); 
				break;
			case February: 
				System.out.println("February Month"); 
				break;
			case March: 
				System.out.println("March Month"); 
				break;
			
			default:
				System.out.println("No Month"); 
				break;
		
		}
		*/
		
	}

}
