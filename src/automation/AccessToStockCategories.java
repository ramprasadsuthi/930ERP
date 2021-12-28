package automation;

public class AccessToStockCategories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        BaseMethods base = new BaseMethods();
		
		base.launchBrowser();
		base.launchERP();
		base.loginERP();
		base.selectStockCategories();

	}

}
