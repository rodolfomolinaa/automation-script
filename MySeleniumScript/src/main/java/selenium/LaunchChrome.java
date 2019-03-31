package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FocusCareer;
import pages.FocusCareerFound;
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

		// Search in Google
		Google.searchInGoogle(driver, "Focus Services");
		// Verify if URL Exists
		Google.verifyURL(driver, "https://www.focusservices.com/");
		// Get in Focus Services site
		Google.getInFocusPage(driver, "Focus Services – Beyond Expectations");

		// Verify if the button exists
		FocusHome.verifyButton(driver, "Now Hiring!");
		// Click Careers Tab
		FocusHome.getInCareerPage(driver, "Careers");

		// Search a work position
		FocusCareer.searchWorkPosition(driver, "inbound");
		// Select the second work position found
		FocusCareer.clickWorkCareer(driver, "position");

		// Verify if the work position has description
		FocusCareerFound.searchDescription(driver);

		// Quit the test
		driver.quit();
	}

}
