
public class SecondLargestNOInArray {

	public static void main(String[] args) {
		int a[]= {-12,45,-23,64,100,24};
		for(int i=0;i<a.length;i++)//here we are reading array 
		{
			for(int j=i+1;j<a.length;j++)//here we r also reading array but from second ele
			{
			int temp=0;
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			   }
			System.out.println("second largest ele:"+a[i]);
			}
			
		System.out.println("second largest ele:"+a[i]);

		}
	}

}
