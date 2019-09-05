import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, F=1;
		
		System.out.println("Enter the No: ");

		n = sc.nextInt();
		
			
		for (int i = 1; i <=n; i++) {
			
			F = F*i;
					
		}
		System.out.println("Factorial of the No is " +F);
		
	}
}
