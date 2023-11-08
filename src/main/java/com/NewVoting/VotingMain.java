package com.NewVoting;

//import java.util.ResourceBundle;

public class VotingMain {

	int check(int a)
	{
		//ResourceBundle rb=ResourceBundle.getBundle("config");
		//int a=Integer.parseInt(rb.getString("age"));
		if(a<0 || a>100)
		{
			return 0;
		}
		else
		{
			if(a>18)
			{
				return 1;
			}
			else
			{
				return 2;
			}
		}
	}
}
