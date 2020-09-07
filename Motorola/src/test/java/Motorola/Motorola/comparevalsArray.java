package Motorola.Motorola;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;

public class comparevalsArray {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<>();
		final ArrayList<Integer> l2 = new ArrayList<>();
		HashMap<Integer,String> resultset = new HashMap<>();
		
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Please enter the values of 1st array and press 'q' to terminate");
		while(sc.hasNextInt())
			l1.add(sc.nextInt());
		
		System.out.println("Please enter the values of 2nd array and press 'q' to terminate");
		while(sc2.hasNextInt())
			l2.add(sc2.nextInt());
		
		l1.forEach(e -> {
			l2.forEach(f -> {
				int f1 = e;
				int f2 = f;
				int rs = f1-f2;
				if((rs) >= 0) {
					String ress = "["+f1+", "+f2+"]";
					resultset.put(rs, ress);
				}
			});
		});
		int smallest = Collections.min(resultset.keySet());
		System.out.println("Smallest value is "+smallest+" for pair "+resultset.get(smallest));
	}
}
