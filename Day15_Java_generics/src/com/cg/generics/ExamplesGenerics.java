package com.cg.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExamplesGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>obj = new HashMap<Integer,String> ();
		obj.put(1, "somesh");
		obj.put(2, "shersha");
		System.out.println(obj);
		
		Set<Map.Entry<Integer,String>>itr = obj.entrySet();
		
		Iterator<Map.Entry<Integer,String>>itr1 = itr.iterator();
		
		while(itr1.hasNext())
		{
			Map.Entry e = itr1.next();
			System.out.println(e.getKey() + " " +e.getValue());
		}
		

	}

}
