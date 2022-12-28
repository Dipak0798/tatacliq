package tatacliq;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cliqcash {
	

	public static String url="https://www.tatacliq.com";
	
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;

	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		WebDriverManager.edgedriver().setup();	
		driver=new ChromeDriver();	
		driver.get(url);	
		driver.manage().window().maximize();	
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
}
	@Test
	public void tc1() throws InterruptedException
	{
		//login
		//driver.findElement(By.xpath("//*[@class='DesktopHeader__signInAndLogout']")).click();
		//driver.findElement(By.xpath("//*[@class='Button__base']")).click();
		//driver.findElement(By.xpath("//*[@class='mobile-number-login__form_control']")).sendKeys("9773440798");
		
		
		// Cliqcash buttton on home page f
		driver.findElement(By.xpath("//*[@class='DesktopHeader__loginTab']")).click();
		driver.findElement(By.xpath("//*[@class='mobile-number-login__form_control']")).sendKeys("9773235356");
		driver.findElement(By.xpath("//*[@class='mobile-number-login__btnPrimary']")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@class='mobile-number-login__btnPrimary']")).click();
		
		Thread.sleep(3000);
		//Click on My Wishlist option u
		System.out.println(driver.findElement(By.xpath("//*[@class='ProfileMenu__textSelect ProfileMenu__gridText']")));		
        
		//1. Click on the ClLiQCash option under Menu. 2. Verify CLiQ Cash Wallet. f
		driver.findElement(By.xpath("//*[@class='CliqCashDesktop__cliqCashBalanceHeader']")).click();
		
		//Click on CLiQCare option f
		driver.findElement(By.xpath("//*[@class='DesktopHeader__loginTab']")).click();
		
		//1. Click on the Shopping tab. 2. Click on the questions. f
		driver.findElement(By.xpath("//*[@class='OrderRelatedIssue__faqHeader OrderRelatedIssue__colorRed']")).click();
		driver.findElement(By.xpath("//*[@class='CustomerIssue__faqHeading CustomerIssue__fontBold']")).click();
		driver.findElement(By.xpath("//*[@class='Button__base']")).click(); //click on yes button
		
		//1. Click on the Payment tab. 2. Click on the questions f
		driver.findElement(By.xpath("//*[@class='OrderRelatedIssue__faqHeader OrderRelatedIssue__colorRed']")).click();
		driver.findElement(By.xpath("//*[@class='CustomerIssue__faqHeading']")).click();
		driver.findElement(By.xpath("//*[@class='Button__base']")).click(); //click on yes button
		
		//1. Click on the Order tab. 2. Click on the questions f
		driver.findElement(By.xpath("//*[@class='OrderRelatedIssue__faqHeader']")).click();
		driver.findElement(By.xpath("//*[@class='CustomerIssue__faqHeading']")).click();
		driver.findElement(By.xpath("//*[@class='Button__base']")).click(); //click on yes button
		
		//Click on the Shopping link tc 16 f
		driver.findElement(By.xpath("//*[@href='https://www.tatacliq.com/shopping-faq']")).click();
		
		//shopping link is visible u
		System.out.println(driver.findElement(By.xpath("//*[@href='https://www.tatacliq.com/shopping-faq']")));
		
		//Click on the Offers & Promotions link f
		driver.findElement(By.xpath("//*[@href='https://www.tatacliq.com/offers-promotion-faq']")).click();
		
	}
	
}
