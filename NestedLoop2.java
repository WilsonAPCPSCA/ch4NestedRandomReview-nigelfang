import java.util.Scanner;
public class NestedLoop2 {
Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
	for(int i=1; i<=10; i++ )
	{
		for(int x = 1; x <=10; x++){
		System.out.print(x*i + " ");
	}
		System.out.println();
	}

}}
