package com.cg.statickeyword;

public class StaticBlock {
  static int num;
 static  String str;
 //StaticBlock()
   static
  
   {
	   num=15;
	   str="om";
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*StaticBlock s=new StaticBlock();*/
		/*System.out.println(s.num);
		System.out.println(s.str);*/
		System.out.println(num);
		System.out.println(str);

	}

}
