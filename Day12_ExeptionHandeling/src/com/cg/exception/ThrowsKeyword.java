package com.cg.exception;

import java.io.IOException;

public class ThrowsKeyword 
{
	  static void display(int x)throws Exception,ClassNotFoundException
	{
		if(x==5)
		{
			throw new IOException("ioexcepoin");
		}
		else
		{
			throw new IOException("classnotfound exception");
		}
	}
}

	public static void main(String[] args) throws Exception,ClassNotFoundException new IOException("ioexcepoin"); 
	{
		// TODO Auto-generated method stub
		try
		{
			display(10);
		}
		
		catch(Exception e)
		{
			throw new IOException("ioexcepoin");
		}

	}

}
