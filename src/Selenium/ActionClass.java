package Selenium;

public class ActionClass {

	
	
	/*Action Class in Selenium is a built-in feature provided by the selenium for handling keyboard and mouse events. 
	 * It includes various operations such as multiple events clicking by control key, drag and drop events and many more. 
	 * These operations from the action class are performed using the advanced user interaction API in Selenium Webdriver.
	 * 
	 * Example of of Action Class to verify backgroud color of any element before and after hover
	 * 
	 *  String baseUrl = "http://demo.guru99.com/test/newtours/";
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
                WebDriver driver = new FirefoxDriver();

                driver.get(baseUrl);           
                WebElement link_Home = driver.findElement(By.linkText("Home"));
                WebElement td_Home = driver
                        .findElement(By
                        .xpath("//html/body/div"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr"));    
                 
                Actions builder = new Actions(driver);
                Action mouseOverHome = builder
                        .moveToElement(link_Home)
                        .build();
                 
                String bgColor = td_Home.getCssValue("background-color");
                System.out.println("Before hover: " + bgColor);        
                mouseOverHome.perform();        
                bgColor = td_Home.getCssValue("background-color");
                System.out.println("After hover: " + bgColor);
                driver.close();
                
                */
	
}
