package com.corejava.ExceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionTest18 
{
public static void main(String[] args) {
		
		try
		{
			int i=1;
			
			if(i==1)
			  throw new IOException();
			else
				throw new SQLException();
		}catch(IOException|SQLException ex)
		{
			System.out.println(ex +" handled ");
		}
}

}
