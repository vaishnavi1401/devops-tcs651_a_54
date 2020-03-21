import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/Facebook-Project/");
		driver.findElement(By.id("firstname")).sendKeys("vaishnavi");
		driver.findElement(By.id("surname")).sendKeys("aggarwal");
		driver.findElement(By.id("phone_email")).sendKeys("vaishnaviaggarwal1401@gmail.com");
		driver.findElement(By.id("newpassword")).sendKeys("vaishnavi1401");
		driver.findElement(By.id("birthday")).sendKeys("14");
		driver.findElement(By.id("birthmonth")).sendKeys("Jan");
		driver.findElement(By.id("birthyear")).sendKeys("2000");
		driver.findElement(By.id("gender_female")).click();
		driver.findElement(By.id("signup")).click();
	}

}
