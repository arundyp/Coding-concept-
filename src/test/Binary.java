package test;

public class Binary {
	public static void bin(int n)
	{
		if(n==0)
		{
			return ;
		}
		bin(n/2);
		System.out.print(n%2);
	}
	public static void main(String[] args) {
		int n=2;
		bin(n);
	}
	
	
	
}
