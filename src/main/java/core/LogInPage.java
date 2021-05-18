package core;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInPage {

	public static void main(String[] args) throws InterruptedException {

		// @Before
		
		//new

		// public void launchBrowser() {
		// Setting up the property and launching the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sajad\\Desktop\\Programming\\Chrome WEbdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// User get the URL for the Company
		driver.get("https://dotnetfiddle.net/");

		// Maximizing the tab
		driver.manage().window().maximize();

		// Setting some wait times
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// @Test

		// public void clickOnRunBtn() {

		// User clicks on the 'Run' button
		WebElement runBtn = driver.findElement(By.id("run-button"));
		runBtn.click();

		// User applies some assertion to make the actual and expected are matching
		WebElement outputWin = driver.findElement(By.xpath("//div[@class='output-pane pane']"));
		String oupWin = outputWin.getText();
		System.out.println("The output-pane contains this text: " + oupWin);
		//Assert.assertEquals("Hello World", oupWin);

		// Test2

		try {

			// User name starts with A-Z
			String firstName = "Vardan";

			System.out.println("User name starts with A-E");
			if (firstName.charAt(0) >= 'A' && firstName.charAt(0) <= 'E') {

				Thread.sleep(1000);
				WebElement srch = driver.findElement(By.xpath("//input[@type='search']"));
				String srchV = "nUnit";
				srch.sendKeys(srchV);

				Thread.sleep(1000);
				WebElement nUnit = driver.findElement(By.xpath("//a[@package-id='NUnit']"));
				nUnit.click();

				Thread.sleep(2000);
				WebElement vSion = driver.findElement(By.xpath("//a[@version-name='3.12.0.0']"));
				vSion.click();

				// Now the User Check if the Package is added

				WebElement pAdded = driver.findElement(By.xpath("//div[@class='package-name']"));
				String pD = pAdded.getText();
				System.out.println("Print the package name: " + pD);
				//Assert.assertEquals("NUnit", pD);

			}

			// User check if the URL starts with the link

			if (firstName.charAt(0) >= 'F' && firstName.charAt(0) <= 'K') {
				Thread.sleep(1000);
				WebElement shareBtn = driver.findElement(By.id("Share"));
				shareBtn.click();

				Thread.holdsLock(2000);
				WebElement shaLink = driver.findElement(By.xpath("//*[@id=\"ShareLink\"]"));
				shaLink.click();
				Thread.sleep(1000);
				String shL = shaLink.getText();
				System.out.println(shL);
				System.out.println(shL.startsWith("https://dotnetfiddle.net/"));

			}

			// User hides the 'Option' panel , and then check if it is hidden or not
			if (firstName.charAt(0) >= 'L' && firstName.charAt(0) <= 'P') {

				WebElement toggleB = driver
						.findElement(By.xpath("//button[@class='btn btn-default btn-xs btn-sidebar-toggle']"));
				toggleB.click();

				if (!toggleB.isDisplayed()) {
					System.out.println("'Option' panel is hidden ");
				} else {
					System.out.println("'Option' is not hidden");
				}

			}

			// User click on Save button and then check if 'Log in' window appears
			if (firstName.charAt(0) >= 'Q' && firstName.charAt(0) <= 'U') {

				Thread.sleep(1000);
				WebElement saveBtn = driver.findElement(By.id("save-button"));
				System.out.println("The 'Save' button is clicked");
				saveBtn.click();

				// User make sure that login page appears

				Thread.sleep(1000);
				WebElement loginB = driver.findElement(By.xpath("//button[@type='submit']"));
				String logBtn = loginB.getText();
				System.out.println("The '" + logBtn + "' button is visible");
				loginB.click();

			}
			// User clicking on the 'Getting Started' button
			if (firstName.charAt(0) >= 'V' && firstName.charAt(0) <= 'Z') {

				System.out.println("User clicks on 'Getting Started' button");
				WebElement gettNStart = driver.findElement(By.xpath("//a[@type='button']"));
				gettNStart.click();

				// User Makes sure that 'Back Editor' button is appeared.
				WebElement bkEditor = driver.findElement(By.xpath("//*[@id=\"top-navbar\"]/div[2]/div[1]/a"));
				String bkEd = bkEditor.getText();
				System.out.println("The '" + bkEd + "' button is appeared");
				///Assert.assertEquals("Back To Editor", bkEd);

			}

		} catch (Exception e) {

		}

		Thread.sleep(3000);

		driver.close();

	}
}
