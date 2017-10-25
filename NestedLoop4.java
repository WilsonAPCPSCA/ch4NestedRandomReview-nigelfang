import java.util.Scanner;
public class NestedLoop4 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double x = Math.random();
	System.out.println("How many times do you want to flip a coin?");
	int y = in.nextInt();
	int numTails=0;
	int numHeads=0;
	for(; y > 0; y--) {
		
		if (x >= 0.5){
			System.out.print("H");
		numHeads++;}
		if (x <0.5){
		System.out.print("T");
		numTails++;}
		 x = Math.random();
	}
	System.out.println();
	System.out.println("There were " +numHeads + " heads and " + numTails + " tails.");
	}
	}


