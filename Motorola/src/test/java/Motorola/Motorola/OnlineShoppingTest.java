package Motorola.Motorola;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OnlineShoppingTest extends BaseClass{
	
	OnlineShoppingPage os= new OnlineShoppingPage(driver);
	
	@Test(priority = 1)
	public void registration()
	{
		os.email_create.sendKeys("1122eerr@gmail.com");
		os.create_account_form.click();
		elementClickable(driver, os.id_gender, 20);
		os.id_gender.click();
		
		os.customer_firstname.sendKeys("Roshan");
		os.customer_lastname.sendKeys("Pandey");
		os.passwd.sendKeys("qwer1234");
		
		os.days.click();
		os.day3.click();
		os.months.click();
		os.january.click();
		os.years.click();
		os.yr2020.click();
		os.firstname.sendKeys("Roshan");
		os.lastname.sendKeys("Pandey");
		os.company.sendKeys("Boeing");
		os.address1.sendKeys("abc");
		os.address2.sendKeys("aabc");
		os.city.click();
		os.alabama.click();
		os.postcode.sendKeys("12345");
		os.phone_mobile.sendKeys("9876543210");
		os.register.click();
		
		
		//Verifying if the user is getting logout button, if yes then he is registered successfully
		elementVisibility(driver, os.logout, 20);
		Assert.assertEquals(os.logout.getText(), "Sign out");
	}
	
	@Test(priority = 2)
	public void verifyInvalidEmail()
	{
		os.login("abc112233@gmaail.com", "fdsbfurweijgbeigb");
		elementVisibility(driver, os.auth_failed, 20);
		
		//Assert if the Username is wrong
		Assert.assertEquals(os.auth_failed.getText(), "Authentication failed.");
	}
	
	@Test(priority = 3)
	public void verifyErrorMandatory()
	{
		os.email_create.sendKeys("1122eerr@gmail.com");
		os.create_account_form.click();
		elementClickable(driver, os.id_gender, 20);
		os.register.click();
		
		elementVisibility(driver, os.mandatorylastname, 20);
		Assert.assertEquals(os.mandatoryPhone.getText(), "You must register at least one phone number.");
		Assert.assertEquals(os.mandatorypasswd.getText(), " is required.");
		Assert.assertEquals(os.mandatorylastname.getText(), " is required.");
		Assert.assertEquals(os.mandatoryfirstname.getText(), " is required.");
		Assert.assertEquals(os.mandatorycity.getText(), " is required.");
		Assert.assertEquals(os.mandatoryaddress1.getText(), " is required.");
		Assert.assertEquals(os.mandatoryState.getText(), "This country requires you to choose a State.");
		Assert.assertEquals(os.mandatoryZip.getText(), "The Zip/Postal code you've entered is invalid. It must follow this format: 00000");
	}
	
	@Test(priority = 4)
	public void verifyErrorIncorrectValues()
	{
		os.email_create.sendKeys("1122eerr@gmail.com");
		os.create_account_form.click();
		elementClickable(driver, os.id_gender, 20);
		os.customer_firstname.sendKeys("123");
		os.customer_lastname.sendKeys("123");
		os.postcode.sendKeys("12345");
		os.phone_mobile.sendKeys("abc");
		os.register.click();
		
		elementVisibility(driver, os.mandatorylastname, 20);
		Assert.assertEquals(os.mandatorylastname.getText(), " is invalid.");
		Assert.assertEquals(os.mandatoryfirstname.getText(), " is invalid.");
		Assert.assertEquals(os.invalidPhone.getText(), " is invalid.");
		Assert.assertEquals(os.mandatoryZip.getText(), "The Zip/Postal code you've entered is invalid. It must follow this format: 00000");
	}
	
	@Test(priority = 5)
	public void searchProduct()
	{
		os.login(propfile1.getProperty("Username"), propfile1.getProperty("Password"));
		elementClickable(driver, os.search, 20);
		Actions a = new Actions(driver);
		a.moveToElement(os.women).build().perform();
		os.tshirts.click();
		String firstProductName = os.firstResult.getText();
		elementClickable(driver, os.firstResult, 20);
		os.search.sendKeys(firstProductName);
		
		elementVisibility(driver, os.firstResult, 20);
		Assert.assertEquals(firstProductName, "Faded Short Sleeve T-shirts");
		
		
	}
	
	@Test(priority = 6)
	public void buyProduct()
	{
		os.login(propfile1.getProperty("Username"), propfile1.getProperty("Password"));
		elementClickable(driver, os.search, 20);
		Actions a = new Actions(driver);
		a.moveToElement(os.women).build().perform();
		os.tshirts.click();
		
		elementClickable(driver, os.secondResult, 20);
		a.moveToElement(os.color_to_pick_list).build().perform();
		os.more.click();
		
		elementClickable(driver, os.more, 20);
		os.more.click();
		
		os.group_1.click();
		os.sizeL.click();
		
		os.color_13.click();
		os.addCart.click();
		
		elementVisibility(driver, os.checkOut, 20);
		os.checkOut.click();
		elementVisibility(driver, os.ProceedCheckOut, 20);
		os.ProceedCheckOut.click();
		elementVisibility(driver, os.ProceedCheckOutAddress, 20);
		os.ProceedCheckOutAddress.click();
		
		elementVisibility(driver, os.tandc, 20);
		os.tandc.click();
		os.carrier.click();
		
		elementVisibility(driver, os.cheque, 20);
		os.cheque.click();
		elementVisibility(driver, os.confirm, 20);
		os.confirm.click();
		
		elementVisibility(driver, os.account, 20);
		os.account.click();
		
		os.history.click();
		
		elementVisibility(driver, os.status, 20);
		Assert.assertEquals(os.status.getText(), "On backorder");
	}
	
	@Test(priority = 7)
	public void addToWishlistLogin()
	{
		
		Actions a = new Actions(driver);
		a.moveToElement(os.women).build().perform();
		os.tshirts.click();
		elementClickable(driver, os.firstResult, 20);
		os.firstResult.click();
		elementVisibility(driver, os.wishlist_button, 20);
		elementClickable(driver, os.wishlist_button, 20);
		os.wishlist_button.click();
		
		elementVisibility(driver, os.error, 20);
		Assert.assertEquals(os.error.getText(), "You must be logged in to manage your wishlist.");
	}
	
	@Test(priority = 8)
	public void addToWishlist()
	{
		os.login(propfile1.getProperty("Username"), propfile1.getProperty("Password"));
		elementClickable(driver, os.search, 20);
		Actions a = new Actions(driver);
		a.moveToElement(os.women).build().perform();
		os.tshirts.click();
		String firstProductName = os.firstResult.getText();
		elementClickable(driver, os.firstResult, 20);
		os.search.sendKeys(firstProductName);
		
		elementVisibility(driver, os.firstResult, 20);
		os.firstResult.click();
		elementVisibility(driver, os.wishlist_button, 20);
		elementClickable(driver, os.wishlist_button, 20);
		os.wishlist_button.click();
		
		elementVisibility(driver, os.errorClose, 20);
		os.errorClose.click();
		os.account.click();
		elementVisibility(driver, os.wishlists, 20);
		os.wishlists.click();
		
		elementVisibility(driver, os.view, 20);
		os.view.click();
		
		Assert.assertEquals(os.view.getText(), "View");
	}
	
	@Test(priority = 9)
	public void totalPrice()
	{
		os.login(propfile1.getProperty("Username"), propfile1.getProperty("Password"));
		elementClickable(driver, os.search, 20);
		Actions a = new Actions(driver);
		a.moveToElement(os.women).build().perform();
		os.tshirts.click();
		
		elementClickable(driver, os.secondResult, 20);
		a.moveToElement(os.color_to_pick_list).build().perform();
		os.more.click();
		
		elementClickable(driver, os.more, 20);
		os.more.click();
		
		os.group_1.click();
		os.sizeL.click();
		
		os.color_13.click();
		os.addCart.click();
		elementVisibility(driver, os.checkOut, 20);
		os.checkOut.click();
		
		elementVisibility(driver, os.total_price, 20);
		String oldPrice = os.total_price.getText();
		
		os.icon_plus.click();
		String newPrice = os.total_price.getText();
		Assert.assertNotEquals(oldPrice, newPrice);	
	}
}
