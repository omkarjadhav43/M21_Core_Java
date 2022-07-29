package com.cg.list;

import java.util.ArrayList;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> v=new Vector<Object>();
		v.add(11);
		v.add("dinesh");
		System.out.println(v);
		//copy all elemets of vector using Addall method
		ArrayList<Object> a=new ArrayList<Object>();
		a.addAll(v);
		System.out.println(a);
		
		
	}

}
