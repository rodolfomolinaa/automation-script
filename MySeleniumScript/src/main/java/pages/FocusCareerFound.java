package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FocusCareerFound {

	/**
	 * Method to search if the work position we clicked has description.
	 * 
	 * @param driver Instance of Chrome Driver.
	 * @return True if it has job's description or false if it has not.
	 */
	public static Boolean searchDescription(WebDriver driver) {
		Boolean exists = false;
		try {
			List<WebElement> elements = driver.findElements(By.tagName("span"));
			Iterator<WebElement> i = elements.iterator();
			// elements.get(0).

			while (i.hasNext()) {
				WebElement element = i.next();
				if (element.getText().equals("JOB DESCRIPTION")) {
					exists = true;
					break;
				}
			}

			if (exists) {
				System.out.println("The work position has Job Description \nIt passed the test!");
			} else {
				System.out.println("The work position does not have Job Description \nIt does not passed the test!");
			}

		} catch (Exception e) {
			System.out.println("Element " + " not found " + e.getMessage());
		}

		return exists;
	}
}
