
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Selenium {
    
    public static void main(String[] args) {
        
        WebDriver test = new ChromeDriver();
        
    }
    @Test
    public void sipleTest()
    {
        System.out.println("Cześć");
    }
   
}
