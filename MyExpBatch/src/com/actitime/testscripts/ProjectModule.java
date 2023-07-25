package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test
	public void creatProject() {
		Reporter.log("creatProject", true);
	}

	@Test
	public void modiffyProject() {
		Reporter.log("modifyProject", true);
	}

	@Test
	public void deleteProject() {
		Reporter.log("deleteProject",true);

	}

}
