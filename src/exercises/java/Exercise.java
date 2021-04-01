package exercises.java;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataObject[] objs = new DataObject[3];
		
		DataObject obj1 = new DataObject();
		obj1.count = 0;
		objs[0] = obj1;
		
		DataObject obj2 = new DataObject();
		obj2.count = 1;
		objs[1] = obj2;
		
		DataObject obj3 = new DataObject();
		obj3.count = 2;
		objs[2] = obj3;
	
		int sum = 0;
		
		for(DataObject o : objs){
			sum+=o.count;
		}
		
		System.out.println(sum);
	}

}
