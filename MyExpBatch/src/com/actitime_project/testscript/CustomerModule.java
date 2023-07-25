package com.actitime_project.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime_project.generic.BaseClass;

	@Listeners(com.actitime_project.generic.ListenerImplementation.class)
	public class CustomerModule extends BaseClass{
	
	@Test
	public void testCreatCustomer() {
		Reporter.log("Creat Customer",true);
		//Assert.fail();
	}

}
