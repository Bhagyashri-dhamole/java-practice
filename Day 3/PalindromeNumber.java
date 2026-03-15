import java.util.Scanner;
public class PalindromeNumber
{
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();  // 121
		int temp = n;
		int rev = 0 ;
		while(n > 0)
		{
			int d = n %10;
			 rev = rev * 10 + d;
			n = n/10;
		}
		if(temp == rev)
		{
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not Palindrome Number");
		}
	}
}
