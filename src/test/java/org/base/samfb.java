package org.base;

public class samfb extends BaseClass {

	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://www.facebook.com/login/");
		WindowMaximize();
		
		
		FaceBookPojo f = new FaceBookPojo ();
		passText("Praveen", f.getEmail());
		passText("8609287", f.getPassword());
		
	}
}
