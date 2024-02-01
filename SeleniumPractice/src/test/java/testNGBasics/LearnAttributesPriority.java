package testNGBasics;

import org.testng.annotations.Test;

public class LearnAttributesPriority {

	@Test(priority = 1,enabled = false)
	public void signup() {
		System.out.println("SignUp");
	}
	@Test(priority = 2,description = "Its the second method")
	public void login() {
		System.out.println("Login");
	}
	@Test(priority = 3)
	public void searchProduct() {
		System.out.println("Product Searched");
	}
	@Test(priority = 4)
	public void addToCart() {
		System.out.println("CartAdded");
	}
	@Test(priority = 5,alwaysRun = true)
	public void signout() {
		System.out.println("SignOut");
	}
}
