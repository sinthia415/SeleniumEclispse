import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassActivity3 {

	
		public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sinth\\Downloads\\chromedriver.exe");

	        WebDriver dr = new ChromeDriver();
	        dr.get("https://omayo.blogspot.com/2013/05/page-one.html");

	        WebElement Continents= dr.findElement(By.xpath("//select[@id='multiselect1']"));
	        Continents.click(); // for multiselection box
	        Thread.sleep(2000);

	        WebElement Continents1= dr.findElement(By.xpath("//select[@id='drop1']"));
	        Continents1.click(); // for older newsletter


	        Thread.sleep(2000);

	        WebElement textArea = dr.findElement(By.xpath("//textarea[@id='ta1']"));
	        textArea.sendKeys("this is a text area"); // for text area

	        Thread.sleep(2000);

	        WebElement Continents2= dr.findElement(By.xpath("//input[@value='Selenium WebDriver']"));
	        Continents2.click(); //

	        Thread.sleep(2000);

	        WebElement textArea1 = dr.findElement(By.xpath("//textarea[contains(text(),'The cat was playing in the garden.')]"));
	        textArea.sendKeys("this is a text area 2"); // for text area

	        Thread.sleep(2000);

	        dr.findElement(By.xpath("//button[@id='but2']")).click();

	        Thread.sleep(2000);

	         dr.findElement(By.xpath("//button[@id='but1']]")).click();

	         Thread.sleep(2000);

	         WebElement textArea2 = dr.findElement(By.xpath("//input[@id='tb2']"));

	         Thread.sleep(2000);

	         textArea.sendKeys("this is a text area 2"); // for text area

	          Thread.sleep(2000);

	        WebElement textArea3 = dr.findElement(By.xpath("//h2[contains(text(),'Buttons with same name attribute values')]"));
	        textArea.sendKeys("this is a text area 2"); // for text area

	        dr.findElement(By.xpath("//button[@name=\"samename\" ][1]")).click(); // for submit button

	        dr.findElement(By.xpath("//button[@name=\"samename\" ][2]")).click(); // for login button

	        dr.findElement(By.xpath("//button[@name=\"samename\" ][3]")).click(); // for register button

	        dr.findElement(By.id("//form[@name=\"form1\"]//input[@ type =\"text\"]")).sendKeys("john"); //for username

	        dr.findElement(By.id("//form[@name=\"form1\"]//input[@ type =\"password\"]")).sendKeys("john123"); // for password

	        dr.findElement(By.xpath("//button[contains(text(),'LogIn')]")).click(); // for login button




		// TODO Auto-generated method stub

	}

}
