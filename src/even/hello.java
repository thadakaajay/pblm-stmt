package even;

import java.util.Scanner;

public class hello {

	  public static void main(String args[]) {
Scanner s =new Scanner(System.in);
System.out.println("enter the number:");
	int n = s.nextInt();

	System.out.print("Even Numbers from 1 to "+n+" are: ");

	for (int i = 1; i <= n; i++) {


	   if (i % 2 == 0) {

	 System.out.print(i + " ");

	   }

	}

	  }
}
