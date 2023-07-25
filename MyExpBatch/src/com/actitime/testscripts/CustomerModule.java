package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test
	public void creatCustomer() {
		Reporter.log("creatCustomer", true);
	}

	@Test
	public void modiffyCustomer() {
		Reporter.log("modifyCustomer", true);
	}

	@Test
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);

	}
}
