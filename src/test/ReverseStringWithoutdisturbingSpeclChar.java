package test;

public class ReverseStringWithoutdisturbingSpeclChar  {
	
	
	public static void main(String[] args) {
		String str="a_b_cdr_fg_kg";
		// String str = "a!!!b.c.d,e'f,ghi";
		char arr[]=str.toCharArray();
		
		reverse(arr);
		String rev= new String(arr);
		System.out.println(rev);
	}
	
	public static void reverse(char arr[])
	{
		int r=arr.length - 1;
		int l=0;
		
		while(l<r)
		{
			if(!Character.isAlphabetic(arr[l]))
			{
				l++;
			}
			else if (!Character.isAlphabetic(arr[r])) {
				r--;
				
			}
			else
			{
				
				char temp=arr[l];
				arr[l]=arr[r];
				arr[r]=temp;
				l++;
				r--;
				
			}
		}
		
		
	}
	

}
