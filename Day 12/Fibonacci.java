import java.util.Scanner;
public class Fabonacip
{
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;
		if(n == 0)
		{
			System.out.print(0);
		}else if (n == 1)
		{
			System.out.print(1);
		}else {
		for(int i = 2;i <= n; i++)
		{
			c = a+b;
			a = b;
			b = c;
		}
		System.out.print(c);
	}
	}
}
