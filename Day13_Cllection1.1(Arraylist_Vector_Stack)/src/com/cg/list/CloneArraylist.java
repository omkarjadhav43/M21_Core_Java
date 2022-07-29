package com.cg.list;

import java.util.ArrayList;

public class CloneArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj=new ArrayList();
		obj.add("omkar");
		obj.add(13);
		obj.add(15.50);
		obj.add("rahul");
		System.out.println(obj);
		//shallow copy of arraylist
		Object clonelist;
		clonelist=obj.clone();
		
		System.out.println(clonelist);
		

	}

}
