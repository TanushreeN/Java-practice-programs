import java.util.Scanner;

public class n_Natural_sum
{
	public static void main(String[] args)
	{
		int sum = 0, n=1;
		System.out.println("Enter the value of n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
				
		sum = n * (n+1)/2;
			
		System.out.println(sum);
		
	}
}
