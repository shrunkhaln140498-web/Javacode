package Javabasics;

import java.util.InputMismatchException;

public class ExceptionGName 
{
	

public static void main(String[] args) throws NullPointerException, InputMismatchException
{
	
	throw new NullPointerException("The cell value cannot be empty");

	if(1>1)
	{
	throw new NullPointerException("The cell value cannot be empty");
	}
	else
	{
	throw new InputMismatchException("input not matching");
	}
	
	
}
}				

