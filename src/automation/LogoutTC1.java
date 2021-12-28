package automation;

public class LogoutTC1 {

	public static void main(String[] args) {

		BaseMethods base = new BaseMethods();
		
		base.launchBrowser();
		base.launchERP();
		base.loginERP();
		base.logoutERP();

	}

}
