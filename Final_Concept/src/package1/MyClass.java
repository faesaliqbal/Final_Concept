package package1;

public class MyClass {
	
	/*
	 * Use the final keyword to mark a variable constant so that it can be assigned only once.
	 */
	public static final double PI = 3.14;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(PI);
		
		/*
		 * PI is a constant. Any attempt to assign it a value will cause an error.
		 */
		//PI=5.1; //This would throw an error
		
		/*
		 * Methods and classes can also be marked final.
		 * This serves to restrict methods so that they can not be overridden.
		 * and classes so that that can not be made subclasses.
		 */
		

	}

}
