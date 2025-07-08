package week1Day2;

public class Browser {

//	 To Create methods as launchBrowser() with 
	public void launchBrowser() {
//		 -Print the statement "Browser launched successfully"
		System.out.println("Browser launched successfully");
	}

	public static void main(String[] args) {
		// creating object for Browser class to call the methods
		Browser obj = new Browser();
		// to call the launchBrowser method
		obj.launchBrowser();
		// to call loadUrl method
		obj.loadUrl();

	}

	// To Create a method as loadUrl()
	public void loadUrl() {
		// -Print the statement "Application url loaded successfully"
		System.out.println("Application url loaded successfully");
	}
}
