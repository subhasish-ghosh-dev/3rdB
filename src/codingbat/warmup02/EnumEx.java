package codingbat.warmup02;

enum MONTH {January, February, March };

public class EnumEx {

	
	enum TIMEZONE { 
		USINDIANA("(GMT-10:00) America/Adak",-10.0), 
		AmericaAtikokan("(GMT-10:00) America/Atka", -10.0);
		
		private final String timeZoneId;

	    private TIMEZONE(String timeZoneId, double i) {
	        this.timeZoneId = timeZoneId;
	    }
	
	    public String formatTime(){
	    	
	    	return "";
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
			System.out.println(level.levelCode+" "+level.getLevelCode());
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
