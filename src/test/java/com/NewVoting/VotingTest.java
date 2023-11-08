package com.NewVoting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VotingTest {

	@Test
	public void test1()
	{
		VotingMain v=new VotingMain();
		Assert.assertEquals(0, v.check(-10));
	}
	@Test
	public void test2()
	{
		VotingMain v=new VotingMain();
		Assert.assertEquals(1, v.check(19));
	}
	@Test
	public void test3()
	{
		VotingMain v=new VotingMain();
		Assert.assertEquals(2, v.check(5));
	}
}
