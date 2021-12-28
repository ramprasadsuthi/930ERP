package automation;

import org.openqa.selenium.By;

public class AccessToStockItemsPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseMethods base = new BaseMethods();
		
		base.launchBrowser();
		base.launchERP();
		base.loginERP();
		base.driver.findElement(By.id("mi_a_stock_items")).click();

	}

}
