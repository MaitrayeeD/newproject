package newproject;

public class salesclass {

	public void display()
	{
		int [] arr= {23,45,65,78,2};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
	
		}
		
		System.out.println("Array size"+arr.length);
	}
	
	
	
	public void print()
	{
		System.out.println("Print all array members");
		display();
	}
	
	
}
