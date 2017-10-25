import java.util.Scanner;
public class NestedLoop3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number as the side length.");
		int i = in.nextInt();
		System.out.println("      *");
		
		  for (; i < 10 ; i += 2) {
		      for (int j = 0; j < 7 - i / 2; j++)
		        System.out.print(" ");

		      for (int j = 1; j < i; j++)
		        System.out.print("*");

		      System.out.print("\n");
		    }

		    for (; i > 0; i -= 2) {
		      for (int j = 0; j < 7 - i / 2; j++)
		        System.out.print(" ");

		      for (int j = 1; j < i; j++)
		        System.out.print("*");

		      System.out.print("\n");
		    }
		  }
		}