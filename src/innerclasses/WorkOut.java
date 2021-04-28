package innerclasses;

public class WorkOut {
	
	private float stepNo;
	private float speed;
	private float calorieBurned;
	
	
	private WorkOut(float s, float sp){
		this.speed = sp;
		this.stepNo = s;
	}
	
	private void calculateCalorieBurned(){
		this.calorieBurned = (stepNo*speed)/IWorkoutResult.RATEOFCALORIESBURNBYSTEP;
	}
	
	private void countWeight(){
		
		
		class Weight{
			
		}
	}
	
	interface IWorkoutResult{
		float RATEOFCALORIESBURNBYSTEP = 987.65F;
		void displayFitness(Person p);
	}
	
	static class Person{
		String name;
		String age;
		double weight;
		WorkOut wt;
		
		Person(float steps, float spd, String n, String a, double w){
			name = n;
			age = a;
			weight = w;
			wt = new WorkOut(steps, spd);
		}
		
		void weightReduced(){
			wt.calculateCalorieBurned();
			weight = weight - wt.calorieBurned * 0.15;
			wt.obj.displayFitness(this);
		}
	}
	
	/*public void display(Person p){
		System.out.println(p.weight);
	}*/
	
	
	IWorkoutResult obj = new IWorkoutResult(){
		public void displayFitness(Person p){
			System.out.println(p.weight);
		}
	};
	
	

}
