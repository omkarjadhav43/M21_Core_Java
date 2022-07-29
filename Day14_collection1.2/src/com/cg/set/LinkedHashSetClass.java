package com.cg.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Object>obj = new LinkedHashSet<Object> ();
		obj.add("somesh");
		obj.add('g');
		obj.add(3.75);
		System.out.println(obj);
		//To extract the elements of a set separately.
		Object[] arr = obj.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
