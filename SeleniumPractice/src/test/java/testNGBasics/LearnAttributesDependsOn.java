package testNGBasics;

import org.testng.annotations.Test;

public class LearnAttributesDependsOn {

	@Test()
	public void signup() {
		System.out.println("SignUp");
	}
	@Test(dependsOnMethods = "signup")
	public void login() {
		System.out.println("Login");
	}
	@Test(dependsOnMethods = "login")
	public void searchProduct() {
		System.out.println("Product Searched");
	}
	@Test(dependsOnMethods = "searchProduct")
	public void addToCart() {
		System.out.println("CartAdded");
	}
	@Test(dependsOnMethods = "addToCart")
	public void signout() {
		System.out.println("SignOut");
	}
}
