package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule {
	@Test
	public void creatTask() {
		Reporter.log("creatTask", true);
	}

	@Test
	public void modiffyTask() {
		Reporter.log("modifyTask", true);
	}

	@Test
	public void deleteTask() {
		Reporter.log("deleteTask",true);

	}

}
