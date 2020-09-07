package Motorola.Motorola;

import java.util.ArrayList;
import java.util.Scanner;


public class compression {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		String input = null;
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> finalChars = new ArrayList<>(); 
		
		int repFlag = 0;
		
		System.out.println("Enter the string");
		
		input = sc.next();
		
		 char[] inputelements = input.toCharArray();
		 int charCounter = 1;
		 int i = 0;
		while (i < inputelements.length - 1) {
			if(inputelements[i] == inputelements[i+1]) {
				repFlag = 1;
				charCounter++;
			}
			else {
				finalChars.add(inputelements[i]);
				finalChars.add((char)(charCounter+'0'));
				charCounter = 1;
			}
			i++;
		}
		
		finalChars.add(inputelements[i]);
		finalChars.add((char)(charCounter+'0'));
			
		for(Character ch: finalChars)
			sb.append(ch);
		
		if(repFlag == 1)
			System.out.println(sb);
		else
			System.out.println(input);
		
		
			
	}
}


//ab
//
//i = 0; i < inputelements.length -1; i++