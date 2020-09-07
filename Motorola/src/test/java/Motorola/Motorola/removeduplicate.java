package Motorola.Motorola;

import java.util.ArrayList;
import java.util.Scanner;

public class removeduplicate {

	public static void main(String[] args) {
		
		ArrayList<String> inputs = new ArrayList<>();
		ArrayList<String> uniques = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values. Enter the keyword 'Exit' once done entering the values:\n");
		while(sc.hasNext()) {
			String data = sc.next();
			if(data.equals("Exit") || data.equals("exit") || data.equals("EXIT"))
			{
				break;
			}
			inputs.add(data);
			
		}
		
		for(String i : inputs) {
			if(!uniques.contains(i))
				uniques.add(i);
		}
		System.out.println(inputs);
		System.out.println(uniques);
	}
}
