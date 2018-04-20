package wdMethods;

import org.testng.annotations.Test;

//import org.junit.Test;

public class SeCreate extends ProjectMethods{
			@Test(groups={"smoke"})
			public void createLead() {
				/*startApp("chrome", "http://leaftaps.com/opentaps/control/main");
				WebElement uName = locateElement("id", "user name");
				type(uName, "DemoSalesManager");
				type(locateElement("id", "username"), "DemoSalesManager");
				//WebElement password = locateElement("id", "password");
				type(locateElement("id", "password"), "crmsfa");
				click(locateElement("class", "decorativeSubmit"));
				
				click(locateElement("linktext", "CRM/SFA"));*/
				//Click Lead tab
				click(locateElement("linktext", "Leads"));
				//Click create leads link
				click(locateElement("linktext", "Create Lead"));
				//Enter company name
				type(locateElement("id", "createLeadForm_companyName"),"ABCD");
				//Enter first name
				type(locateElement("id", "createLeadForm_firstName"),"Abi");
				//Enter last name
				type(locateElement("id", "createLeadForm_lastName"),"naya");
				//Click submit button
				click(locateElement("name", "submitButton"));
				
			}
		

	}


