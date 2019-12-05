package GridTest;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		// Desired capabilities
		DesiredCapabilities cp=new DesiredCapabilities();
		cp.setBrowserName("chrome");
		cp.setPlatform(Platform.WIN10);
		
		//Chrome  Options
		
		ChromeOptions op=new ChromeOptions();
		op.merge(cp);
		
		String hubURL="http://192.168.29.71:4444/wd/hub";
		
		WebDriver driver=new RemoteWebDriver(new URL(hubURL),op);
		
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		
		
	}

}
