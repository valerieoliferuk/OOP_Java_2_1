package main;
import java.util.ArrayList;

public class Main {
	
	// Create a solution to store numbers with different type
	// in different arrays
	
	static ArrayList<Integer> IntLst = new ArrayList<>();
	static ArrayList<Float> FloatLst = new ArrayList<>();
	static ArrayList<Double> DoubleLst = new ArrayList<Double>();
	static ArrayList<Long> LongLst = new ArrayList<Long>();
	
	static void shownewlst(int x) {
		IntLst.add(x);
		System.out.print("List of integers: ");
		for (int i: IntLst) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
	
	static void shownewlst(double x) {
		DoubleLst.add(x);
		System.out.print("List of doubles: ");
		for (double i: DoubleLst) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
	
	static void shownewlst(float x) {
		FloatLst.add(x);
		System.out.print("List of floats: ");
		for (float i: FloatLst) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
	}
	
	static void shownewlst(long x) {
		LongLst.add(x);
		System.out.print("List of long integers: ");
		for (long i: LongLst) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
	
	// Count the sum of all numbers in the array
	static double sumOfAllNumInLst(ArrayList<Number> arr) {
		double sum = 0;
		for (Number i: arr) {
			sum = sum + i.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		// Create numbers with different types
		int a = 8;
		float b = 8.99f;
		double c = 10.4;
		long d = 231009109120L;
		
		NumberOperations obj1 = new NumberOperations();
		ArrayList<Number> lst1 = obj1.main();
		
		// Add the numbers to a lst1
		lst1.add(a);
		lst1.add(b);
		lst1.add(c);
		lst1.add(d);
		
		//Print out the list with numbers
		System.out.println(lst1);
		
		// Print out the whole numbers
		for (Number i : lst1) {
			System.out.print(i.intValue()+" ");
		}
		
		System.out.println("");		
		
		// Print out the numbers with 2 decimal places
		for (Number i: lst1) {
			System.out.printf("%.2f ", (i.doubleValue()));
		}
		
		
		System.out.println("");	
		
		//Examples
//		shownewlst(a);
//		shownewlst(34);
//		shownewlst(67);
//		
//		shownewlst(34.5f);
//		shownewlst(3.0685);
		
		System.out.println("");	
		
		double res = sumOfAllNumInLst(lst1);
		System.out.printf("Sum of the all numbers in lst1: %.1f", res);
	}
}

class NumberOperations {
	
	ArrayList<Number> main(){
		ArrayList<Number> lst = new ArrayList<Number>();
		lst.add(10);
		lst.add(20.5);
		lst.add(30);
		lst.add(40.7);
		lst.add(50);
		lst.add(60.3);
		lst.add(70);
		lst.add(80.1);
		lst.add(90);
		lst.add(100.9);
		
		return lst;
		
	}
}