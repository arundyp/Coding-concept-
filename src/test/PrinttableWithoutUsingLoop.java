package test;

public class PrinttableWithoutUsingLoop {
	static int i=1;
	public static void main(String[] args) {
		
		if(i<=10)
		{
			System.out.printf("%d ",i++*15);
			main(null);
		}
	}

}
