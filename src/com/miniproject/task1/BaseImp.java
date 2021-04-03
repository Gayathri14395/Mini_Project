package com.miniproject.task1;

	
import com.automation.pom.AccountPage;
import com.automation.pom.AddressPage;
import com.automation.pom.DressPage;
import com.automation.pom.HomePage;
import com.automation.pom.LoginPage;
import com.automation.pom.OrderHistory;
import com.automation.pom.OrderPage;
import com.automation.pom.OrderStatus;
import com.automation.pom.PaymentPage;
import com.automation.pom.PersonalInfoPage;
import com.automation.pom.PurchaseHomePage;
import com.automation.pom.ShippingPage;
import com.automation.pom.ShoppingCart;
import com.automation.pom.logoutpage;
import com.automation.practice.BaseClass;
	
	public class BaseImp extends BaseClass {

		public static void main(String[] args) throws Throwable
		
		{
			toLaunchBrowser("chrome");
			
			toLaunchUrl("http://automationpractice.com/index.php");

			//toMaximize();
			
			//REGISTRATION PART
			
//			HomePage home = new HomePage(driver);
//			toClick(home.getSignin_btn());
//			
//			LoginPage loginp = new LoginPage(driver);
//			toEnterInput(loginp.getMailid(), "jiya11@gmail.com");
//			toClick(loginp.getSubmitbtn());
//			
//			toSleep();
//			
//			PersonalInfoPage pp = new PersonalInfoPage(driver);
//			toClick(pp.getGenderBtn());
//		
//			toSleep();
//								
//			toEnterInput(pp.getFirstname(), "Gayathri");
//
//			toSleep();
//						
//			toEnterInput(pp.getLastname(), "M");
//
//			toSleep();
//						
//			toEnterInput(pp.getPwd(), "123456");
//
//			toSleep();
//			
//			toSelectByValue(pp.getDays(), "29");
//			
//			toSleep();
//			
//			toSelectByValue(pp.getMonths(), "8");
//
//			toSleep();
//						
//			toSelectByIndex(pp.getYears(), 2);
//
//			toSleep();
//						
//			toEnterInput(pp.getAddress(), "Tambaram");
//			
//			toSleep();
//						
//			toEnterInput(pp.getCity(), "Chennai");
//			
//			toSleep();
//						
//			toSelectByValue(pp.getState(), "29");
//			
//			toSleep();
//			
//			toEnterInput(pp.getPc(), "03087");
//		
//			toSleep();
//						
//			toEnterInput(pp.getPh(), "0123456789");
//			
//			toSleep();
//						
//			toClear(pp.getMyadd());
//		
//			toSleep();
//					
//			toEnterInput(pp.getMyadd(), "India");
//		
//			toSleep();
//						
//			toClick(pp.getRegister());
//			
//			toSleep();
//			
//			logoutpage lp	= new logoutpage(driver);
//			toClick(lp.getLogout());
//		
//			toSleep();

			//PURCHASE PART
			
			PurchaseHomePage login = new PurchaseHomePage(driver);
			toClick(login.getAccountsignin());
						
			AccountPage ap = new AccountPage(driver);
			toEnterInput(ap.getEmail_id(), "abc@gmail.com");
			toEnterInput(ap.getPwd(),"123456");
			toClick(ap.getSubmit());
			
			DressPage dp = new DressPage(driver);
			toMoveToElement(dp.getDress());
			toClick(dp.getEveningdress());
			toMoveToElement(dp.getProduct());
			toSleep();
			toClick(dp.getQuickview());
			toSleep();
			toSwitchToFrame(dp.getFrame());
			toSleep();
			toClick(dp.getIncreaseQty());
			toSleep();
			toSelectByValue(dp.getSize(),"3");
			toSleep();
			toClick(dp.getColor());
			toSleep();
			toClick(dp.getAddtocart());
			toSleep();
			toClick(dp.getCheckout());
			
			toSleep();
			
			ShoppingCart sc = new ShoppingCart(driver);
			toClick(sc.getCheckout());
			
			toSleep();
			
			AddressPage adp = new AddressPage(driver);
			toClick(adp.getCheckout());
			
			toSleep();
			
			ShippingPage sp = new ShippingPage(driver);
			toClick(sp.getCheckbox());
			toClick(sp.getCheckout());
			
			toSleep();
			
			PaymentPage pyp = new PaymentPage(driver);
			toClick(pyp.getPayby()); 
			
			toSleep();
			
			OrderPage op = new OrderPage(driver);
			toClick(op.getOrderconfirm());
			
			toSleep();	
			
			OrderHistory oh = new OrderHistory(driver);
			toScroll(oh.getScroll());
			toSleep();
			toTakeScreenshot1(driver);
			toSleep();
			toClick(oh.getBacktoorder());
			toSleep();
			
			OrderStatus os = new OrderStatus(driver);
			toScroll(os.getOrderstatus());
			toSleep();
			toTakeScreenshot2(driver);
			toSleep();
			toClick(os.getLogout());
						
				}
	}

	



