package week3.day2;

public class AssignmentFindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {3, 2, 11, 4, 6, 7};
		int[] b = {1, 2, 8, 4, 9, 7};
		System.out.println("Intersection numbers are listed below:");
		for (int i=0; i<a.length-1 ; i++)
		{
			for (int j=0; j<b.length-1; j++)
			{
				if (a[i] == b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
