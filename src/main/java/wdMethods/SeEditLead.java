package wdMethods;

import org.testng.annotations.Test;

//import org.junit.Test;

public class SeEditLead extends ProjectMethods{

	@Test
	public void edit(){
		login();
		click(locateElement("linktext", "Leads"));
		click(locateElement("xpath","//a[text()='Find Leads']"));
		type(locateElement("xpath","(//input[@name='firstName'])[1]"),"ed");
	}
}
