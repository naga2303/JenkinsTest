import java.io.*;

public class Prime {

	public static void prime (int num)
	{
		int i=2;
		if (i==num)
		{
			System.out.println("Prime number");
			
		}			
		while (i<num)
		{
		if(num%i==0)
		{
			System.out.println("not a prime number" +num);
				break;	
		}
		i++;
		}
		if (i==num)
		{
			System.out.println("Prime number" +num);
		}
		
		
	}
	public static void main (String args[]) throws IOException
	{
		int n=5;
		//BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		//System.out.println("Enter the number:");
		//n=Integer.parseInt(br.readLine()); 
		prime(n);
	}
	
}
