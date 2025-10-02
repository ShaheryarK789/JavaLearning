package Selenium;

public class POM_Model {

	/* Explain the line of code Webdriver driver = new FirefoxDriver();.

WebDriver driver = new FirefoxDriver();

1. WebDriver

WebDriver is an interface in Selenium.

It defines a set of methods like .get(), .findElement(), .click(), etc., that any browser driver (Chrome, Firefox, Edge, etc.) must implement.

By declaring the variable as WebDriver, you make your code flexible — you can easily switch browsers by just changing the driver on the right-hand side without modifying the rest of the code.

2. driver

This is the reference variable of type WebDriver.

You’ll use driver to call methods like:

driver.get("https://google.com");
driver.findElement(By.name("q")).sendKeys("Selenium");

3. new FirefoxDriver()

FirefoxDriver is a class that implements the WebDriver interface.

When you write new FirefoxDriver(), you are creating an instance (object) of that class.

This launches a new Firefox browser window (provided you have Firefox installed and the correct geckodriver set up).

4. Putting it all together

The line:

WebDriver driver = new FirefoxDriver();


means:

Create a new Firefox browser instance.

Assign it to the driver reference variable of type WebDriver.

Now you can control Firefox using driver.

✅ Advantage of using WebDriver driver instead of FirefoxDriver driver:
If later you want to switch to Chrome, you just change:



*********************************************************





🔑 Why WebDriver is an interface and not an abstract class?
1. Multiple inheritance support

In Java, you can only extend one abstract class, but you can implement multiple interfaces.

Browser drivers (ChromeDriver, FirefoxDriver, EdgeDriver, etc.) often need to extend other classes (like RemoteWebDriver).

By making WebDriver an interface, Selenium lets these drivers implement it along with others (like JavascriptExecutor, TakesScreenshot, etc.) without restriction.

2. Flexibility

Interfaces define only what methods should exist (get(), findElement(), etc.) — not how they are implemented.

Each browser driver has different internals, but they all must follow the same "contract" defined by the interface.

Example:

Chrome opens a site differently than Firefox.

But both must implement driver.get("url").

3. Loose coupling

If WebDriver were an abstract class, all browser drivers would be forced into one inheritance hierarchy.

With an interface, they can be completely different internally but still guarantee the same set of behaviors.

This gives pluggability — you can switch from new ChromeDriver() to new FirefoxDriver() without touching the rest of your code.

4. Composition with other capabilities

Selenium uses many small interfaces for extra features:

TakesScreenshot

JavascriptExecutor

HasCapabilities

A driver class can implement multiple interfaces, picking up different features as needed.

If WebDriver were an abstract class, this would be far more rigid.

5. Industry best practice

In API design, interfaces are preferred for defining “what to do,” and classes are for “how to do it.”

WebDriver just defines the contract for a browser automation driver, not the implementation.

✅ In short:
WebDriver is an interface because Selenium needs maximum flexibility, multiple inheritance via interfaces, and a strict contract that every browser driver must follow — without forcing them into a single rigid class hierarchy.
	 */
}
