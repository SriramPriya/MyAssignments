package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AssignmentSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("HCL");
		list.add("Wipro");
		list.add("Aspire System");
		list.add("CTS");
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

}
