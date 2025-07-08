package week1Day1;

import week1Day2.Browser;

public class FirstProgram {

	public static void main(String[] args) {
		int age = 20;

		System.out.println("Hello World" + age);

		Browser obj = new Browser();

		obj.loadUrl();
		obj.launchBrowser();

	}

}
