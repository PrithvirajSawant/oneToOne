package oneToOne.util;

import java.util.Scanner;

import oneToOne.entities.Adhar;

public class AdharUtil {
	public static Scanner sc = new Scanner(System.in);
	public static Adhar getAdhar()
	{
		System.out.println("Enter the Adhar details");
		return new Adhar(sc.nextLong(), sc.nextLong());
	}

}
