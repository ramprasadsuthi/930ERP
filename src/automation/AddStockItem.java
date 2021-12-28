package automation;

public class AddStockItem {

	public static void main(String[] args) {

       BaseMethods base = new BaseMethods();
       
       base.launchBrowser();
       base.launchERP();
       base.loginERP();
       base.addStockItem();

	}

}
