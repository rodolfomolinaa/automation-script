package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FocusHome;
import pages.Google;

public class LaunchChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		// Create a new Instance of the Chrome driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launch Chrome and direct it to Base URL
		driver.get("http://www.google.com");

		Google.searchInGoogle(driver, "Focus Services");
		Google.verifyURL(driver, "iUh30", "https://www.focusservices.com/");
		Google.getInFocusPage(driver, "h3.LC20lb", "Focus Services – Beyond Expectations");

		FocusHome.verifyButton(driver, "avia_iconbox_title", "Now Hiring!");
		FocusHome.getInCareerPage(driver, "avia-menu-text", "Careers");

	}

}
