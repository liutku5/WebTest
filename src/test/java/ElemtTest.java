import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//vardas 3-20 simbolių, raidės skaičiai ir tarpai galimi
//passwordas 8 simboliai maža, didelė raidė, skaicius, 8 simboliai. viskas kartu privaloma
import java.time.Duration;

public class ElemtTest {
    public static WebDriver driver;

    @Test
    public void websiteRegistration() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Petras1478";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "Petras2@gmail.com";
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("Password"));
        String password = "Petras123";
        passwordField.sendKeys(password);

        WebElement passwordFieldRepeat = driver.findElement(By.name("Password2"));
        String passwordRepeat = "Petras123";
        passwordFieldRepeat.sendKeys(passwordRepeat);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement info;
        try {
            info = driver.findElement(By.className("info"));
            Assert.assertTrue(info.isDisplayed(), "The info element should be displayed");
        } catch (Exception e) {
            Assert.fail("The info element was not found or displayed");
        }
    }

    public void acceptCookies() {
        driver.get("https://elenta.lt");
        driver.findElement(By.className("fc-cta-consent")).click();
    }

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        acceptCookies();
    }


    @AfterClass
    public void tearDown() {
//        driver.close();
    }
}
