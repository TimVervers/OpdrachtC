package com.example.OpdrachtC;

public class Program {

	public static void main(String args[])
	{
		System.out.println("Tim Ververs");
	}
	
	public String PrintLine(String p)
	{
		p += " grapje";
		return p;
	}
	
	public int calculate(int i)
	{
		i += i * (3 / 2) + 9 * 3 - 1;
		return i;
	}
}
