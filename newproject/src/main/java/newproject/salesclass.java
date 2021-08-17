package newproject;

public class salesclass {

	public void display()
	{
		int [] arr= {23,45,65,78,2};
		int sum=0;
		for(int num:arr)
		{
			sum+=num;
			System.out.println(num);
		}
		System.out.println(sum);
	}
	public void print()
	{
		System.out.println("Print all array members");
		display();
	}
	
	
}
