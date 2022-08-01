import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MyAppTest {
	@Test
    public void doTest() throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();

		// Set your access credentials
		caps.setCapability("browserstack.user", "salmanrahman_dzL7e9");
		caps.setCapability("browserstack.key", "8fAnofm35hnW9mrJ4hJx");

		// Set URL of the application under test
		caps.setCapability("app", "bs://56c27f2d8ace4cd8ab9bf58daee80f793ae80014");

		// Specify device and os_version for testing
		caps.setCapability("device", "Google Pixel 3");
		caps.setCapability("os_version", "9.0");

		// Set other BrowserStack capabilities
		caps.setCapability("project", "First Java Project");
		caps.setCapability("build", "browserstack-build-1");
		caps.setCapability("name", "first_test");


		// Initialise the remote Webdriver using BrowserStack remote URL
		// and desired capabilities defined above
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
				new URL("http://hub.browserstack.com/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Write your test case statements here
		Thread.sleep(3000);
		driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
//		String res= driver.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
//		Assert.assertEquals("13",res);


		// Invoke driver.quit() after the test is done to indicate that the test is completed.
		driver.quit();
	}
}
