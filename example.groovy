@Grab('org.seleniumhq.selenium:selenium-java:2.45.0')
import org.openqa.selenium.WebDriver
@Grab('org.seleniumhq.selenium:selenium-chrome-driver:2.45.0')
import org.openqa.selenium.chrome.ChromeDriver

def driver = new ChromeDriver()
driver.get('http://www.google.de')