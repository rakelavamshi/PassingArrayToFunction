
public class ArrayTest 
{
	public int min(int arr[])
	{
		int m=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(m>arr[i])
				m=arr[i];
			
		}
		return(m);
	}
	
}
