import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//vardas 3-20 simbolių, raidės skaičiai ir tarpai galimi
//passwordas 8 simboliai maža, didelė raidė, skaicius, 8 simboliai. viskas kartu privaloma
import java.time.Duration;
import java.util.List;

public class ElemtTest {
    public static WebDriver driver;

    public static WebDriverWait wait;


    @Test
    public void websiteRegistration() {
        driver.get("https://elenta.lt/registracija");
        WebElement usernameField = driver.findElement(By.name("UserName"));
        String uesername = "Petras14782";
        usernameField.sendKeys(uesername);

        WebElement emailField = driver.findElement(By.name("Email"));
        String email = "Petras10@gmail.com";
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

    @Test
    public void websitePlacingAd() throws InterruptedException {
        driver.get("https://elenta.lt");
        driver.findElement(By.xpath("//*[@id=\"submit-new-ad-nav-button\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"select-top-category-list\"]/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"select-sub-category-list\"]/li[1]/a")).click();

        WebElement titleField = driver.findElement(By.name("title"));
        String title = "Pigus mašiniukas!";
        titleField.sendKeys(title);

        WebElement textField = driver.findElement(By.name("text"));
        String text = "spòrtinis automob\uE00Clis, ne mažiau kaip dviejų vietų automobilis, turintis pagrindinę įprasto serijinio automobilio įrangą, bet pritaikytas važiuoti didesniu greičiu. Sportinis automobilis, kitaip negu lenktyninis automobilis, turi dengtus ratus ir visus lengvojo automobilio elementus. Dažniausiai tai geriau valdomi, greičiau įsibėgėjantys ir sportiškesnės išvaizdos kėbulais automobiliai. Sportinių automobilių technines charakteristikas reglamentuoja Tarptautinė automobilių federacija (Fédération Internationale de I’Automobile, FIA, įkurta 1904, būstinė Paryžiuje, 2020 vienijo 144 šalių 240 nacionalinių organizacijų). Nuo 1982 yra viena sportinių automobilių klasė; ribojama tik sportinio automobilio masė, matmenys ir degalų sąnaudos.";
        textField.sendKeys(text);

        WebElement priceField = driver.findElement(By.name("price"));
        String price = "1000000";
        priceField.sendKeys(price);

        WebElement locationField = driver.findElement(By.name("location"));
        String location = "Kaunas";
        locationField.sendKeys(location);

        WebElement phoneField = driver.findElement(By.name("phone"));
        String phone = "+37012345678";
        phoneField.sendKeys(phone);

        WebElement emailField2 = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        String email2 = "Petras17@gmail.com";
        emailField2.sendKeys(email2);

        driver.findElement(By.xpath("//*[@id=\"submit-button\"]")).click();


        WebElement imageInput = driver.findElement(By.xpath("//*[@id=\"inputfile\"]"));
        String filePath = "C:/Users/l1utk/OneDrive/Desktop/paskaitos/maserati.jpg";
        imageInput.sendKeys(filePath);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"forward-button\"]")).click();
    }

    @Test
    public void websitevinoteka() throws InterruptedException {
        driver.get("https://vynoteka.lt/");
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
        driver.findElement(By.xpath("//*[@id=\"app__inner\"]/div[2]/div/div/div/div/div[2]/div[3]/div/div[1]/button")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div[2]/div[2]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[4]/div/div/div/button"))).click();

        WebElement inputField = driver.findElement(By.xpath("//*[@id=\"app__header\"]/div[2]/div/div/div[3]/div/div/div/form/div[1]/div/input"));
        String inputText = "Vynas";
        inputField.sendKeys(inputText);
        Thread.sleep(10000);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/header/div[2]/div/div/div[3]/div/div/div/form/div[2]/div/div[1]/div[1]/div")));
        driver.findElement(By.xpath("//*[@id=\"app__header\"]/div[2]/div/div/div[3]/div/div/div/form/div[1]/button")).click();

    }

    @Test
    public void websiteSkelbiuCountCards() throws InterruptedException {
        driver.get("https://skelbiu.lt/");
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();

        WebElement searchField = driver.findElement(By.id("searchKeyword"));
        String inputText = "verpimo ratelis";
        searchField.sendKeys(inputText);
        driver.findElement(By.id("searchButton")).click();
        Thread.sleep(2000);

        int totalCards = 0;

        while (true) {
            List<WebElement> cards = driver.findElements(By.className("extended-info"));

            for (WebElement card : cards) {
                WebElement titleElement = null;
                WebElement imageElement = null;

                try {
                    titleElement = card.findElement(By.className("title"));
                    imageElement = card.findElement(By.xpath(".//img[contains(@src, 'https://skelbiu-img')]"));
                } catch (Exception e) {
                    continue;
                }

                if (titleElement != null && imageElement != null) {
                    totalCards++;
                }
            }

            List<WebElement> nextPageElements = driver.findElements(By.cssSelector("a.pagination_link[rel='next']"));

            if (nextPageElements.size() > 0) {
                nextPageElements.get(0).click();
                Thread.sleep(1000);
            } else {
                break;
            }
        }
        System.out.println("Total number of cards with title and image found: " + totalCards);
    }

    @Test
    public void websiteSkelbiuCardsPriceAverage() throws InterruptedException {
        driver.get("https://skelbiu.lt/");
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();

        WebElement searchField = driver.findElement(By.id("searchKeyword"));
        String inputText = "stetoskopas";
        searchField.sendKeys(inputText);
        driver.findElement(By.id("searchButton")).click();
        Thread.sleep(2000);

        int totalCards = 0;
        double totalPrice = 0.0;

        while (true) {
            List<WebElement> cards = driver.findElements(By.className("extended-info"));

            for (WebElement card : cards) {
                WebElement titleElement = null;
                WebElement imageElement = null;
                WebElement priceElement = null;

                try {
                    titleElement = card.findElement(By.className("title"));
                    imageElement = card.findElement(By.xpath(".//img[contains(@src, 'https://skelbiu-img')]"));
                    priceElement = card.findElement(By.className("price"));
                } catch (Exception e) {
                    continue;
                }

                if (titleElement != null && imageElement != null && priceElement != null) {
                    totalCards++;
                    String priceText = priceElement.getText().replaceAll("[^\\d,]", "").replace(",", ".");
                    try {
                        double price = Double.parseDouble(priceText);
                        totalPrice += price;
                    } catch (NumberFormatException e) {
                    }
                }
            }
            List<WebElement> nextPageElements = driver.findElements(By.cssSelector("a.pagination_link[rel='next']"));

            if (nextPageElements.size() > 0) {
                nextPageElements.get(0).click();
                Thread.sleep(1000);
            } else {
                break;
            }
        }

        double averagePrice = (totalCards > 0) ? (totalPrice / totalCards) : 0.0;
        System.out.println("Total number of cards with title and image found: " + totalCards);
        System.out.println("Average price of the cards: " + averagePrice);
    }

    public void acceptCookies() {
        driver.get("https://elenta.lt");
        driver.findElement(By.className("fc-cta-consent")).click();
    }

    @Test
    public void websiteSkelbiuExtractInfoFromCards() throws InterruptedException {
        driver.get("https://skelbiu.lt/");
        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();

        WebElement searchField = driver.findElement(By.id("searchKeyword"));
        String inputText = "stetoskopas";
        searchField.sendKeys(inputText);
        driver.findElement(By.id("searchButton")).click();
        Thread.sleep(2000);

        int totalCards = 0;

        while (true) {
            List<WebElement> cards = driver.findElements(By.className("extended-info"));

            for (WebElement card : cards) {
                WebElement titleElement = null;
                WebElement imageElement = null;

                try {
                    titleElement = card.findElement(By.className("title"));
                    imageElement = card.findElement(By.xpath(".//img[contains(@src, 'https://skelbiu-img')]"));
                } catch (Exception e) {
                    continue;
                }

                if (titleElement != null && imageElement != null) {
                    totalCards++;
                }
            }

            List<WebElement> nextPageElements = driver.findElements(By.cssSelector("a.pagination_link[rel='next']"));

            if (nextPageElements.size() > 0) {
                nextPageElements.get(0).click();
                Thread.sleep(1000);
            } else {
                break;
            }
        }
        System.out.println("Total number of cards with title and image found: " + totalCards);
    }

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
//        acceptCookies();
    }

    @AfterClass
    public void tearDown() {
//        driver.close();
    }
}


