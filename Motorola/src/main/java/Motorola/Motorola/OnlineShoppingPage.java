package Motorola.Motorola;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineShoppingPage extends BaseClass{
	
	public OnlineShoppingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='login']")
	public WebElement login;
	
	@FindBy(xpath="//input[@id='email_create']")
	public WebElement email_create;
	
	@FindBy(xpath="//form[@id='create-account_form']//span[1]")
	public WebElement create_account_form;
	
	@FindBy(xpath="//input[@id='id_gender1']")
	public WebElement id_gender;
	
	@FindBy(xpath="//input[@id='customer_firstname']")
	public WebElement customer_firstname;
	
	@FindBy(xpath="//input[@id='customer_lastname']")
	public WebElement customer_lastname;
	
	@FindBy(xpath="//select[@id='days']")
	public WebElement days;
	
	@FindBy(xpath="//div[@id='uniform-days']//option[2]")
	public WebElement day3;
	
	@FindBy(xpath="//select[@id='months']")
	public WebElement months;
	
	@FindBy(xpath="//option[contains(text(),'January')]")
	public WebElement january;
	
	@FindBy(xpath="//select[@id='years']")
	public WebElement years;
	
	@FindBy(xpath="//option[contains(text(),'2020')]")
	public WebElement yr2020;
	
	@FindBy(xpath="//input[@id='firstname']")
	public WebElement firstname;
	
	@FindBy(xpath="//input[@id='lastname']")
	public WebElement lastname;
	
	@FindBy(xpath="//input[@id='company']")
	public WebElement company;
	
	@FindBy(xpath="//input[@id='address1']")
	public WebElement address1;
	
	@FindBy(xpath="//input[@id='address2']")
	public WebElement address2;
	
	@FindBy(xpath="//input[@id='city']")
	public WebElement city;
	
	@FindBy(xpath="//select[@id='id_state']")
	public WebElement id_state;
	
	@FindBy(xpath="//option[contains(text(),'Alabama')]")
	public WebElement alabama;
	
	@FindBy(xpath="//input[@id='postcode']")
	public WebElement postcode;
	
	@FindBy(xpath="//select[@id='id_country']")
	public WebElement id_country;
	
	@FindBy(xpath="//option[contains(text(),'United States')]")
	public WebElement us;
	
	@FindBy(xpath="//input[@id='phone_mobile']")
	public WebElement phone_mobile;
	
	@FindBy(xpath="//span[contains(text(),'Register')]")
	public WebElement register;
	
	@FindBy(xpath="//a[@class='logout']")
	public WebElement logout;
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='passwd']")
	public WebElement passwd;
	
	@FindBy(xpath="//p[@class='submit']//span[1]")
	public WebElement submit;
	
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")
	public WebElement auth_failed;
	
	@FindBy(xpath="//li[contains(text(),'You must register at least one phone number.')]")
	public WebElement mandatoryPhone;
	
	@FindBy(xpath="//b[contains(text(),'lastname')]")
	public WebElement mandatorylastname;
	
	@FindBy(xpath="//b[contains(text(),'firstname')]")
	public WebElement mandatoryfirstname;
	
	@FindBy(xpath="//b[contains(text(),'passwd')]")
	public WebElement mandatorypasswd;
	
	@FindBy(xpath="//b[contains(text(),'address1')]")
	public WebElement mandatoryaddress1;
	
	@FindBy(xpath="//b[contains(text(),'city')]")
	public WebElement mandatorycity;
	
	@FindBy(xpath="//li[contains(text(),'The Zip')]")
	public WebElement mandatoryZip;
	
	@FindBy(xpath="//li[contains(text(),'This country requires you to choose a State.')]")
	public WebElement mandatoryState;
	
	@FindBy(xpath="//b[contains(text(),'phone_mobile')]")
	public WebElement invalidPhone;
	
	@FindBy(xpath="//a[@class='sf-with-ul'][contains(text(),'Women')]")
	public WebElement women;
	
	@FindBy(xpath="//li[@class='sfHover']//a[contains(text(),'T-shirts')]")
	public WebElement tshirts;
	
	@FindBy(xpath="//input[@id='search_query_top']")
	public WebElement search;
	
	@FindBy(xpath="//a[contains(text(),'Faded Short Sleeve T-shirts')]")
	public WebElement firstResult;
	
	@FindBy(xpath="//a[contains(text(),'Printed Summer Dress')]")
	public WebElement secondResult;
	
	@FindBy(xpath="//ul[@class='color_to_pick_list clearfix']")
	public WebElement color_to_pick_list;
	
	@FindBy(xpath="//span[contains(text(),'More')]")
	public WebElement more;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	public WebElement icon_plus;
	
	@FindBy(xpath="//select[@id='group_1']")
	public WebElement group_1;
	
	@FindBy(xpath="//option[contains(text(),'L')]")
	public WebElement sizeL;
	
	@FindBy(xpath="//a[@id='color_13']")
	public WebElement color_13;
	
	@FindBy(xpath="//span[contains(text(),'Add to cart')]")
	public WebElement addCart;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	public WebElement checkOut;
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
	public WebElement ProceedCheckOut;
	
	@FindBy(xpath="//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")
	public WebElement ProceedCheckOutAddress;
	
	@FindBy(xpath="//input[@id='cgv']")
	public WebElement tandc;
	
	@FindBy(xpath="//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
	public WebElement carrier;
	
	@FindBy(xpath="//a[@class='cheque']")
	public WebElement cheque;
	
	@FindBy(xpath="//span[contains(text(),'I confirm my order')]")
	public WebElement confirm;
	
	@FindBy(xpath="//a[@title='View my customer account']")
	public WebElement account;
	
	@FindBy(xpath="//span[contains(text(),'Order history and details')]")
	public WebElement history;
	
	@FindBy(xpath="//span[@class='label dark']")
	public WebElement status;
	
	@FindBy(xpath="//a[@id='wishlist_button']")
	public WebElement wishlist_button;
	
	@FindBy(xpath="//p[@class='fancybox-error']")
	public WebElement error;
	
	@FindBy(xpath="//a[@class='fancybox-item fancybox-close']")
	public WebElement errorClose;
	
	@FindBy(xpath="//span[contains(text(),'My wishlists')]")
	public WebElement wishlists;
	
	@FindBy(xpath="//a[contains(text(),'View')]")
	public WebElement view;
	
	@FindBy(xpath="//span[@id='total_price']")
	public WebElement total_price;
	
	public void login(String uname, String pwd)
	{
		login.click();
		elementClickable(driver, email, 30);
		email.sendKeys(uname);
		passwd.sendKeys(pwd);
		submit.click();
	}

}
