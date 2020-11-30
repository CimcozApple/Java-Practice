package practice.lambda;

public class LambdaClass {

//	@Override
//	public String testLambda(String word) {
//		return 
//	}

	public static void main(String[] args) {
		
		LambdaInterface testing = (word) -> word; //one line body, no need for curly brackets or return keyword or return type
			
		System.out.println("Firas");
		
		testing.testLambda("Firas");
	

		Thread running = new Thread(() -> System.out.println("print"));
		running.run();
	
	
	}
}
