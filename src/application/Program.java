package application;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Teacher's name: ");
		String teacher = sc.next();
		
		System.out.println();

		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();
		Set<Integer> setC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		
		System.out.println("Enter the student enrollment code: ");
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			setA.add(number);
		}
		
		System.out.println();

		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		
		System.out.println("Enter the student enrollment code: ");
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			setB.add(number);
		}

		System.out.println();
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		
		System.out.println("Enter the student enrollment code: ");
		for (int i=0; i<n; i++) {
			int number = sc.nextInt();
			setC.add(number);
		}
		
		System.out.println();
		
		Set<Integer> total = new HashSet<>(setA);
		total.addAll(setB);
		total.addAll(setC);

		System.out.println("The professor " + teacher + " has " + total.size() + " students enrolled in his courses.");

		sc.close();
	}
	
}