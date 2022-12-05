
public class DuplicateEleArray {

	public static void main(String[] args) {
		int count=0;
	
		String arr[]={"Java","c","c++","Python","Java"};
		boolean flag=false;
	
		for(int i=0;i<arr.length;i++)
		{

		for(int j=i+1;j<arr.length;j++)
		{
		  if(arr[i]==arr[j])
		    {
		     System.out.println("found duplicate ele:"+arr[i]);
		      flag=true;
		       count++;
		    }
		  }
		}
		System.out.println(count);
		if(flag==false)
		{ 
			System.out.println("Duplicate ele not found");
		}
		

  }
}