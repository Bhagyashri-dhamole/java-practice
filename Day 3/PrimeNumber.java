import java.util.Scanner;
public class PrimeNumber
{
     public static void main(String[] args) 
		{
			Scanner Sc = new Scanner (System.in);
			int n = Sc.nextInt();
			int count = 0;
			for(int i = 1;i <= n; i++)
			{
				if(n % i == 0)
				{
					count++;
				}
				
			}
			if(count == 2)
				{
					System.out.println("Prime number");
				}else{
					System.out.println(" Not Prime number");
				}
		}
	
}
