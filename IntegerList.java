import java.util.*;
public class IntegerList {
	Scanner sc=new Scanner(System.in);
	public void getList()
	{
		List<Integer> list=new ArrayList<Integer>();
		
		System.out.println("enter upto how many numbers you want to store");
		int n=sc.nextInt();
		
		System.out.println("Give the distinct integer");
		int k=sc.nextInt();
		int left=1,right=k+1,i=0;
		while(i<=k)
		{
			if(i%2==0)
			{
				list.add(left);
				left=left+1;
			}
			else {
				list.add(right);
				right=right-1;
			}
			i++;
		}
		System.out.println(list);	

	}
	
	
	
}
