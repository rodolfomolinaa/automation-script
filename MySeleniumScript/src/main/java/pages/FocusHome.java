package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FocusHome {

	public static String verifyButton(WebDriver driver, String button) {
		Boolean exists = false;
		try {
			List<WebElement> elements = driver.findElements(By.className("iUh30"));
			Iterator<WebElement> i = elements.iterator();

			while (i.hasNext()) {
				WebElement element = i.next();
				if (element.getText().equals(button)) {
					System.out.println(button + " exists");
					exists = true;
					break;
				} else {
					System.out.println(button + " does not exists");
				}
			}

		} catch (Exception e) {
			System.out.println("Element " + button + " not found" + e.getMessage());
		}

		return exists.toString();
	}

}
