package week2.day2;

public class AssignmentFindIntersection {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array declaration
		int a[]={3,2,11,4,6,7};
		int b[]={1,2,8,4,9,7};
		System.out.println("The matching values are listed below");
		
		for (int i=0; i<a.length;i++)
		{
			for (int j=0; j<b.length;j++)
			{
				if(a[i] == b[j])
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
