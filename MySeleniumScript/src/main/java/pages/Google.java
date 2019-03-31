package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google {

	/**
	 * Method to search anything you want in Google
	 * 
	 * @param driver Instance of Chrome driver
	 * @param search Whatever you want to search in Google
	 */
	public static void searchInGoogle(WebDriver driver, String search) {
		driver.findElement(By.name("q")).sendKeys(search);
		driver.findElement(By.name("btnK")).click();
	}

	/**
	 * Method to verify if URL exist
	 * 
	 * @param driver Instance of Chrome driver
	 * @param url    you want to verify if exists
	 * @return
	 */
	public static String verifyURL(WebDriver driver, String url) {
		Boolean exists = false;
		try {
			List<WebElement> elements = driver.findElements(By.className("iUh30"));
			Iterator<WebElement> i = elements.iterator();

			while (i.hasNext()) {
				WebElement element = i.next();
				if (element.getText().equals(url)) {
					System.out.println(url + " exists");
					exists = true;
					break;
				} else {
					System.out.println(url + " does not exists");
				}
			}

		} catch (Exception e) {
			System.out.println("Element " + url + " not found" + e.getMessage());
		}

		return exists.toString();
	}

	/**
	 * Method to access to hyperlink you want
	 * 
	 * @param driver   Instance of Chrome driver
	 * @param selector the css selector you want to search in the web page
	 * @param text     the text you are looking for in hyperlink to click
	 */
	public static void getInFocusPage(WebDriver driver, String selector, String text) {
		try {
			List<WebElement> anchors = driver.findElements(By.cssSelector(selector));
			Iterator<WebElement> i = anchors.iterator();

			while (i.hasNext()) {
				WebElement anchor = i.next();
				if (anchor.getText().equals(text)) {
					anchor.click();
					break;
				}
			}

		} catch (Exception e) {
			System.out.println("Element " + text + " not found " + e.getMessage());
		}

	}

}
