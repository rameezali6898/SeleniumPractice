package testNGBasics;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups = "smoke")
	public void signup() {
		System.out.println("SignUp");
	}
	@Test(groups = "reg")
	public void login() {
		System.out.println("Login");
	}
	@Test(groups = "sanity")
	public void searchProduct() {
		System.out.println("Product Searched");
	}
	@Test(groups = "smoke")
	public void addToCart() {
		System.out.println("CartAdded");
	}
	@Test(dependsOnMethods = "addToCart",groups = "reg")
	public void signout() {
		System.out.println("SignOut");
	}
}


