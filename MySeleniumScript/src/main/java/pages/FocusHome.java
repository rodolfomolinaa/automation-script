package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FocusHome {

	/**
	 * Method to verify if a button exist
	 * 
	 * @param driver Instance of Chrome driver
	 * @param name   class you want to search
	 * @param button you want to verify if exists
	 * @return
	 */
	public static String verifyButton(WebDriver driver, String name, String button) {
		Boolean exists = false;
		try {
			List<WebElement> elements = driver.findElements(By.className(name));
			Iterator<WebElement> i = elements.iterator();

			while (i.hasNext()) {
				WebElement element = i.next();
				if (element.getText().equals(button)) {
					exists = true;
					break;
				}
			}

			if (exists) {
				System.out.println(button + " button exists");
			} else {
				System.out.println(button + " button does not exists");
			}

		} catch (Exception e) {
			System.out.println("Element " + button + " not found" + e.getMessage());
		}

		return exists.toString();
	}

	public static void getInCareerPage(WebDriver driver, String name, String text) {
		try {
			List<WebElement> anchors = driver.findElements(By.className(name));
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
