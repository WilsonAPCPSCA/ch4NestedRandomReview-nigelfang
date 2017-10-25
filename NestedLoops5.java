package NestedLoops5;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class NestedLoops5 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("How many times do you want to roll the dice");
	int num = in.nextInt();
	int[] list = new int [13];
	for(int i = 0; i<=num; i++){
	int rand1 = rand.nextInt(6);
	int rand2 = rand.nextInt(6);
	int sum = rand1 + rand2;
	System.out.print(sum + " ");
	for (int l=2; l<=12; l++){
		System.out.print(l + ": ");
		for (int m =1; m<=list[l]; m++){
			System.out.print("*");
			
		}
		System.out.println(" ");
	}
}
}
}