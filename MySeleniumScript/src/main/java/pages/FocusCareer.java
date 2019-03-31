package pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FocusCareer {

	/**
	 * Method to search a work position.
	 * 
	 * @param driver       Instance of Chrome Driver.
	 * @param workPosition Specific Work Position you are looking for.
	 */
	public static void searchWorkPosition(WebDriver driver, String workPosition) {
		driver.findElement(By.id("search_keywords")).sendKeys(workPosition);
		driver.findElement(By.id("search_keywords")).sendKeys(Keys.ENTER);

	}

	/**
	 * Method to click in second register found.
	 * 
	 * @param driver Instance of Chrome Driver.
	 * @param name   ClassName you are looking for.
	 */

	public static void clickWorkCareer(WebDriver driver, String name) {
		try {
			List<WebElement> positions = driver.findElements(By.className(name));
			List<WebElement> registersFound = new ArrayList<WebElement>();
			Iterator<WebElement> i = positions.iterator();

			while (i.hasNext()) {
				WebElement anchor = i.next();
				if (anchor.isDisplayed()) {
					registersFound.add(anchor);
				}
			}

			registersFound.get(1).click();

		} catch (Exception e) {
			System.out.println("Element " + name + " not found " + e.getMessage());
		}

	}

}
