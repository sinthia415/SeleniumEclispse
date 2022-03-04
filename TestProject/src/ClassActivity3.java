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
	        Continents2.click(); //Text Box with Preloaded Text

	        Thread.sleep(2000);

	        WebElement textArea1 = dr.findElement(By.xpath("//textarea[contains(text(),'The cat was playing in the garden.')]"));
	        textArea1.sendKeys("this is a text area 2"); // for text area 2

	        Thread.sleep(2000);

	        WebElement enablebutton = dr.findElement(By.xpath("//button[@id='but2']"));
	        System.out.println("check enable = " + enablebutton.isEnabled()); //for enable button

	        //isenabled - true disable -false
	        //isdisplayed - true /false  // displayed
	        //isselected - checkbox

	     //   dr.findElement(By.xpath("//button[@id='but2']")).click();

	       // Thread.sleep(2000);

	       WebElement btn1 =  dr.findElement(By.xpath("//button[@id='but1']"));
	        System.out.println("Check enabled = " + btn1.isEnabled()); // for disable button

	         Thread.sleep(2000);

	       // WebElement textArea2 = dr.findElement(By.xpath("//input[@id='tb2'])"));
	       // textArea2.sendKeys("this is a text area 3"); // for text area 2

	          Thread.sleep(2000);

	       // WebElement textArea3 = dr.findElement(By.xpath("//h2[contains(text(),'Buttons with same name attribute values')]"));
	       // textArea3.sendKeys("this is a text area 2"); // for disabled text area

	        WebElement button = dr.findElement(By.xpath("//button[@name='samename' ][1]"));
	        button.click(); //for submit button

	        WebElement button1 = dr.findElement(By.xpath("//button[@name='samename' ][2]"));
	        button1.click(); // for login button

	        WebElement button2 = dr.findElement(By.xpath("//button[@name='samename' ][3]"));
	        button2.click(); // for register button

	        WebElement Username = dr.findElement(By.xpath("//form[@name='form1']//input[@type='text']"));
	        Username.sendKeys("john"); //for username

	        WebElement Password = dr.findElement(By.xpath("//form[@name='form1']//input[@type='password']"));
	        Password.sendKeys("john"); //for password

	        WebElement LoginButton = dr.findElement(By.xpath("//form[@name='form1']//button[@type='button']"));
	        LoginButton.click(); //for login button



		// TODO Auto-generated method stub

	}

}
