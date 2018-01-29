package code;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class human {
	public String name;
	public Date DOB;  
	public float height;
	public float weight;
	
	static Scanner scan = new Scanner(System.in);
	
	public void input() {
		
		System.out.println("Name: ");
		name = scan.nextLine();
		
		while (true)
		{	
			try {
				System.out.println("Height: ");
				height = scan.nextFloat();
				break;
			}
			catch(Exception e) {
				//System.out.println("You must input a number!");
				continue;
			}
		}
		
		while (true)
		{	
			try {
				System.out.println("Weight: ");
				weight = scan.nextFloat();
				break;
			}
			catch(Exception e) {
				//System.out.println("You must input a number!");
				continue;
			}
		}
	}
}
