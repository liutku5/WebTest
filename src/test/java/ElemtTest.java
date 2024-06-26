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

        WebElement infoElement;
        try {
            infoElement = driver.findElement(By.className("info"));
            Assert.assertTrue(infoElement.isDisplayed());
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationEmptyUsername() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "Petras3@gmail.com";
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("Password"));
        String password = "Petras123";
        passwordField.sendKeys(password);

        WebElement passwordFieldRepeat = driver.findElement(By.name("Password2"));
        String passwordRepeat = "Petras123";
        passwordFieldRepeat.sendKeys(passwordRepeat);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement errorElement;
        try {
            errorElement = driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[1]/td[2]/span"));
            Assert.assertEquals(errorElement.getText(), "Įveskite vartotojo vardą.");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationShortUsername() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "wu";
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

        WebElement infoElement;
        try {
            infoElement = driver.findElement(By.className("info"));
            Assert.assertTrue(infoElement.isDisplayed());
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationLongUsername() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "qwertyuiopasdfghjklzxcvbnm";
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

        WebElement infoElement;
        try {
            infoElement = driver.findElement(By.className("info"));
            Assert.assertTrue(infoElement.isDisplayed());
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationUsernameWithSpaceAndDigit() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Mes 8";
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

        WebElement infoElement;
        try {
            infoElement = driver.findElement(By.className("info"));
            Assert.assertTrue(infoElement.isDisplayed());
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationEmailWithTwoDots() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Mes 8";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "Petras2@gmail..com";
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("Password"));
        String password = "Petras123";
        passwordField.sendKeys(password);

        WebElement passwordFieldRepeat = driver.findElement(By.name("Password2"));
        String passwordRepeat = "Petras123";
        passwordFieldRepeat.sendKeys(passwordRepeat);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement errorElement;
        try {
            errorElement = driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[4]/td[2]/span"));
            Assert.assertEquals(errorElement.getText(), "El. pašto adresas nėra tinkamas.");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationEmailWithTwoEtas() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Mes 8";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "Petras2@@gmail.com";
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("Password"));
        String password = "Petras123";
        passwordField.sendKeys(password);

        WebElement passwordFieldRepeat = driver.findElement(By.name("Password2"));
        String passwordRepeat = "Petras123";
        passwordFieldRepeat.sendKeys(passwordRepeat);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement errorElement;
        try {
            errorElement = driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[4]/td[2]/span"));
            Assert.assertEquals(errorElement.getText(), "El. pašto adresas nėra tinkamas.");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationEmailWithOutDomain() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Mes 8";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "Petras2@.com";
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("Password"));
        String password = "Petras123";
        passwordField.sendKeys(password);

        WebElement passwordFieldRepeat = driver.findElement(By.name("Password2"));
        String passwordRepeat = "Petras123";
        passwordFieldRepeat.sendKeys(passwordRepeat);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement errorElement;
        try {
            errorElement = driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[4]/td[2]/span"));
            Assert.assertEquals(errorElement.getText(), "El. pašto adresas nėra tinkamas.");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationEmailWithOutEnding() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Mes 8";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "Petras2@gmail";
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("Password"));
        String password = "Petras123";
        passwordField.sendKeys(password);

        WebElement passwordFieldRepeat = driver.findElement(By.name("Password2"));
        String passwordRepeat = "Petras123";
        passwordFieldRepeat.sendKeys(passwordRepeat);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement errorElement;
        try {
            errorElement = driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[4]/td[2]/span"));
            Assert.assertEquals(errorElement.getText(), "El. pašto adresas nėra tinkamas.");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationEmailWithName() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Mes 8";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "@gmail.com";
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("Password"));
        String password = "Petras123";
        passwordField.sendKeys(password);

        WebElement passwordFieldRepeat = driver.findElement(By.name("Password2"));
        String passwordRepeat = "Petras123";
        passwordFieldRepeat.sendKeys(passwordRepeat);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement errorElement;
        try {
            errorElement = driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[4]/td[2]/span"));
            Assert.assertEquals(errorElement.getText(), "El. pašto adresas nėra tinkamas.");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationEmailEmpty() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Mes 8";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "";
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("Password"));
        String password = "Petras123";
        passwordField.sendKeys(password);

        WebElement passwordFieldRepeat = driver.findElement(By.name("Password2"));
        String passwordRepeat = "Petras123";
        passwordFieldRepeat.sendKeys(passwordRepeat);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement errorElement;
        try {
            errorElement = driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[4]/td[2]/span"));
            Assert.assertEquals(errorElement.getText(), "Įveskite el. pašto adresą.");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationEmailWithSymbols() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Mes 8";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "Petras2.,@gmail.com";
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("Password"));
        String password = "Petras123";
        passwordField.sendKeys(password);

        WebElement passwordFieldRepeat = driver.findElement(By.name("Password2"));
        String passwordRepeat = "Petras123";
        passwordFieldRepeat.sendKeys(passwordRepeat);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement errorElement;
        try {
            errorElement = driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[4]/td[2]/span"));
            Assert.assertEquals(errorElement.getText(), "Įveskite el. pašto adresą.");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationPasswordsEmpty() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Mes 8";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "Petras4@gmail.com";
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("Password"));
        String password = "";
        passwordField.sendKeys(password);

        WebElement passwordFieldRepeat = driver.findElement(By.name("Password2"));
        String passwordRepeat = "";
        passwordFieldRepeat.sendKeys(passwordRepeat);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement errorElement;
        try {
            errorElement = driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[7]/td[2]/span"));
            Assert.assertEquals(errorElement.getText(), "Įveskite slaptažodį.");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationPasswordRepeatEmpty() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Mes 8";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "Petras4@gmail.com";
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("Password"));
        String password = "";
        passwordField.sendKeys(password);

        WebElement passwordFieldRepeat = driver.findElement(By.name("Password2"));
        String passwordRepeat = "";
        passwordFieldRepeat.sendKeys(passwordRepeat);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement errorElement;
        try {
            errorElement = driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[8]/td[2]/span"));
            Assert.assertEquals(errorElement.getText(), "Pakartotinai neįvedėte slaptažodžio.");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationDifferentPassword() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Mes 8";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "Petras4@gmail.com";
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("Password"));
        String password = "1234567";
        passwordField.sendKeys(password);

        WebElement passwordFieldRepeat = driver.findElement(By.name("Password2"));
        String passwordRepeat = "123456789";
        passwordFieldRepeat.sendKeys(passwordRepeat);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement errorElement;
        try {
            errorElement = driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[8]/td[2]/span"));
            Assert.assertEquals(errorElement.getText(), "Nesutampa slaptažodžiai. Pakartokite.");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationShortPassword() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Mes 10";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "Petras9@gmail.com";
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("Password"));
        String password = "123";
        passwordField.sendKeys(password);

        WebElement passwordFieldRepeat = driver.findElement(By.name("Password2"));
        String passwordRepeat = "123";
        passwordFieldRepeat.sendKeys(passwordRepeat);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement errorElement;
        try {
            errorElement = driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[7]/td[2]/span"));
            Assert.assertEquals(errorElement.getText(), "Įvestas slaptažodis per trumpas.");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationPasswordWithOutLowerLetter() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Mes 10";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "Petras6@gmail.com";
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("Password"));
        String password = "P1234567";
        passwordField.sendKeys(password);

        WebElement passwordFieldRepeat = driver.findElement(By.name("Password2"));
        String passwordRepeat = "P1234567";
        passwordFieldRepeat.sendKeys(passwordRepeat);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement errorElement;
        try {
            errorElement = driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[7]/td[2]/span"));
            Assert.assertEquals(errorElement.getText(), "Įvestas slaptažodis per trumpas.");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationPasswordWithOutUpperLetter() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Mes 10";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "Petras6@gmail.com";
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("Password"));
        String password = "p1234567";
        passwordField.sendKeys(password);

        WebElement passwordFieldRepeat = driver.findElement(By.name("Password2"));
        String passwordRepeat = "p1234567";
        passwordFieldRepeat.sendKeys(passwordRepeat);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement errorElement;
        try {
            errorElement = driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[7]/td[2]/span"));
            Assert.assertEquals(errorElement.getText(), "Įvestas slaptažodis per trumpas.");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationPasswordWithOutDigit() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Mes 10";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "Petras6@gmail.com";
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("Password"));
        String password = "Petriukas";
        passwordField.sendKeys(password);

        WebElement passwordFieldRepeat = driver.findElement(By.name("Password2"));
        String passwordRepeat = "Petriukas";
        passwordFieldRepeat.sendKeys(passwordRepeat);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement errorElement;
        try {
            errorElement = driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[7]/td[2]/span"));
            Assert.assertEquals(errorElement.getText(), "Įvestas slaptažodis per trumpas.");
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void websiteRegistrationPasswordWithSymbol() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Mes 9";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "Petras5@gmail.com";
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.name("Password"));
        String password = "Petriukas8!";
        passwordField.sendKeys(password);

        WebElement passwordFieldRepeat = driver.findElement(By.name("Password2"));
        String passwordRepeat = "Petriukas8!";
        passwordFieldRepeat.sendKeys(passwordRepeat);

        driver.findElement(By.xpath("//*[@id=\"main-container\"]/form/fieldset/table/tbody/tr[11]/td[2]/input")).click();

        WebElement infoElement;
        try {
            infoElement = driver.findElement(By.className("info"));
            Assert.assertTrue(infoElement.isDisplayed());
        } catch (Exception e) {
            Assert.fail();
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
