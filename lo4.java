package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class lo4 {
	
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub)
			System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91917\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
			WebDriver dr=new ChromeDriver();
			dr.get("https://www.youtube.com/");
			Thread.sleep(3000);
			
			dr.findElement(By.xpath("//input[@id='search']")).sendKeys("Hello");
			Thread.sleep(2000);

}
}

