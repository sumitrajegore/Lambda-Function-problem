@FunctionalInterface
interface IMathFunction {

	int calculate(int a, int b);
}

public class MathOperationApp {

		 public static void main(String[] args) {
		
		     //method referance	
		     IMathFunction add = Integer :: sum;
		     
		     //lambda function
		     IMathFunction subtract = (x,y) -> x - y ;
		     IMathFunction multiply = (x,y) -> x * y ;
		     IMathFunction div = (x,y) -> x / y ;
		
		     
		     	 System.out.println("addition is " +add.calculate(6,3));
			 System.out.println("subtraction is " +subtract.calculate(6,3));
			 System.out.println("multiply is " +multiply.calculate(6,3));
			 System.out.println("division is " +div.calculate(6,3));
    	 	}
 
}
