package gittest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitTest {

	@Test
	public void loginTest() throws IOException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.bing.com/");
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("D:\\WorkSpace\\WorkOut\\File\\screenshot.png"));
	}
	
	@Test
	public void loginTest() throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("D:\\WorkSpace\\File\\screenshot.png"));
	
	
	}
}
