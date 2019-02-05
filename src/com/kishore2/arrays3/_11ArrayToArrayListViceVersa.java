package com.kishore2.arrays3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _11ArrayToArrayListViceVersa {
	public static void main(String[] args) {

		// Array to ArrayList
		String[] array = new String[] { "ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF" };
		System.out.println("Array to ArrayList\n" + "Array :" + Arrays.toString(array));

		List<String> list2 = Arrays.asList(array);
		System.out.println("List :" + list2 + "\n======================\nArrayList to Array");

		// ArrayList to Array using toArray()
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);

		Object[] array1 = arrayList.toArray();
		System.out.println("Array " + Arrays.toString(array1));

	}
}
