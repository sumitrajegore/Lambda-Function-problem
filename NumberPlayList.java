import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class NumberPlayList {

	public static void main(String[] args) {

		List<Integer> myNumberList = new ArrayList<Integer>();
		for(int i=0; i<5; i++)
			myNumberList.add(i);
		
		//method 1: traversing using Iterator
		Iterator<Integer> it = myNumberList.iterator();
		while(it.hasNext()) {

			Integer i = it.next();
			System.out.println("Iterator value :" +i);
		}
		
		//method 2: traversing with consumer interface
		class MyConsumer implements Consumer<Integer> {

			public void accept(Integer t) {

				System.out.println("method 2 consumer implements value :" +t);
			}
		}
		MyConsumer action = new MyConsumer();
		myNumberList.forEach(action);
		
		//method 3: traversing with anonymous consumer interface
		myNumberList.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {

				System.out.println("method 3 for each anonymous class value :" +t);
			}
		});
		
		//method 4: explicit lambda function 
		Consumer<Integer> myNumberListAcion = n-> {

				System.out.println("method 4 for each lambda element value :" +n);
		};
		myNumberList.forEach(myNumberListAcion);
		
		//method 5: explicit lambda function 
		myNumberList.forEach( n-> {

				System.out.println("method 5 for each lambda element value :" +n);
		});
		
               //method 6: explicit lambda function print double vale
		Function<Integer, Double> doubleFunction = Integer::doubleValue;
		myNumberList.forEach( n -> {
			
	        	        System.out.println("method 6 for each lambda double value :" +doubleFunction.apply(n));
		});

                //method 7: explicit lambda function check even
		Predicate<Integer> isEvenFunction = n -> n%2 == 0;
		myNumberList.forEach(n-> {
        	                System.out.println("method 7 for each  value :" +n+ "check for even " +isEvenFunction.test(n));
		});
	}

}
