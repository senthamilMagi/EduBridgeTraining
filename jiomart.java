package pkg1;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class jiomart {


public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://www.jiomart.com/");

driver.manage().window().maximize();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"nav_link_4\"]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"plp-category-desk\"]/div[3]/div/div[1]/div[2]/div/span")).click();
Thread.sleep(3000);
//select item
driver.findElement(By.xpath("//*[@id=\"category-724\"]/div[1]/div/div/a")).click();
//add to cart
driver.findElement(By.xpath("//*[@id=\"mstar_box\"]/div[1]/a/div[2]/div[1]/div/div[1]/img")).click();
//Buy now
driver.findElement(By.xpath("/html/body/main/section/section[2]/div[1]/div/div[1]/div/div[3]/div[1]/button")).click();
///select warranty
WebElement selectwarranty =driver.findElement(By.xpath("//*[@id=\"extended_services_form\"]/div/div[2]/div[2]/div/label/span"));
 selectwarranty.click();
 //proceed
 driver.findElement(By.xpath("//*[@id=\"elec_addon_dialog\"]/div[2]/div/div[3]/div[2]/div[2]/button")).click();
 //goto cart
 driver.findElement(By.xpath("/html/body/header/section[1]/div/section[2]/div[2]/div/div[1]")).click();
 
	}
}