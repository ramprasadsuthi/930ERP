package automation;

import org.openqa.selenium.By;

public class ResetLoginTC {

	public static void main(String[] args) {
		
		BaseMethods base = new BaseMethods();
		
		base.launchBrowser();
		base.launchERP();
		base.driver.findElement(By.id("btnreset")).click();
		// home work please add validation part also..

	}

}
