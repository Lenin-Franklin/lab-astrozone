package model;

//Type your code here

public class User
{
	public String name;
	public int d;
	public int m;
	
	public User(String name1,String date1,String month1)
	{
		this.name = name1;
		d = Integer.parseInt(date1);
		m = Integer.parseInt(month1);
	}
	
	}