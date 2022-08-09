package module5.assignments.intellipaat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6 {

		public static void main(String[] args) throws InterruptedException {
			
			// Step-1 Launch ChromeBrowser
			WebDriverManager.chromedriver().setup();
			WebDriver driver;
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//Step-2 Open Test URL http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm  in Chrome Browser
			driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
			
			
			//Step-3 Switch into 0th  Frame
			driver.switchTo().frame(0);
			
			//Step-3 Get plain text into Console You've found my HTML tutorial site, which is my final year computing project.			
			System.out.println("Step 3: \n"+driver.findElement(By.xpath("//p[@class='examp3']")).getText());
			Thread.sleep(500);
			//Step-4 Switch into 1st  Frame
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);
			
			//Step-5 Clear text from Browser and versions: Text box 
			driver.findElement(By.xpath("//textarea[@name='browser']")).clear();
			
			//Step-6 Send text into Browser and versions: Text box
			Thread.sleep(500);
			driver.findElement(By.xpath("//textarea[@name='browser']")).sendKeys("Netscape 5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/103.0.0.0 Safari/537.36");
			
			//Step-7 Get given input into Console from Browser and versions: Text Box 
			String input = driver.findElement(By.xpath("//textarea[@name='browser']")).getAttribute("value");
			System.out.println("Step 7: "+input);
			
	       // Step-8 Switch into 2nd  Frame
			driver.switchTo().defaultContent();
			driver.switchTo().frame(2);
			
	      //  Step-9 Get plain text into Console A Tag in HTML denotes certain.............
			System.out.println("Step 9: \n"+driver.findElement(By.xpath("//font[contains(text(),'A Tag in HTML')]")).getText());
			
			//Step-10 Close Browser
			System.out.println("Done");
			driver.quit();
			
			
		}
}
