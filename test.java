import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {


		int[] arr = new int [10]; 
		

		
		
		ArrayList<Integer> list = new ArrayList<Interger>();
		
		
		
		System.out.println(list.size());
		
		
		
		list.add(1);
		System.out.println(list.size());
		
		
		
		list.add(2);
		System.out.println(list.size());
		
		
		list.add(3);
		System.out.println(list.size());	
		
		
		System.out.println(list.get(0));
		
		
		list.remove(1);
		System.out.println(list.get(0));
		
		
		list.set(0, 1000);
		System.out.println(list.get(0));
		
		
		
	}

}
