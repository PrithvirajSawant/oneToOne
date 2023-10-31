package oneToOne.util;

import java.util.Scanner;

import oneToOne.entities.Person;

public class PersonUtil {
	public static Scanner sc = new Scanner(System.in);
	public static Person getPerson()
	{
		System.out.println("Enter the Person Details");
		return new Person(sc.next(), sc.nextInt(), sc.next());
	}

}
