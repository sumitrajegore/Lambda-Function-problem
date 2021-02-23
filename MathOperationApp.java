@FunctionalInterface
interface IMathFunction {

	int calculate(int a, int b);

        static void PrintResult(int a, int b, String Function, IMathFunction fobj) {
    	
		System.out.println("result of " +Function +" is "+fobj.calculate(a, b));
	    }
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

                        //passing lambda expression as function parameter using static function
			IMathFunction.PrintResult(6, 3, "addition", add);
		     	IMathFunction.PrintResult(6, 3, "division", subtract);
		     	IMathFunction.PrintResult(6, 3, "addition", multiply);
		     	IMathFunction.PrintResult(6, 3, "division", div);
    	 	}
 
}
