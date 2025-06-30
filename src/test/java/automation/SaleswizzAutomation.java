package automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class SaleswizzAutomation extends Locators {

    public static String URL = "https://saleswizz.com/";

    /**
     * This method initializes the webdriver and sets implicit wait
     */
    public void setupDriver() {
        getDriver().get(URL);
        getDriver().manage().window().maximize();
    }

    /**
     * This method performs login operation with phone number
     * @param data is the parameter which is passed from the feature file
     */
    public void login(Map<String, String> data) {
        startNowBtn.click();
        phoneInput.sendKeys("57673");
        nextBtn.click();

        String errorTextOnSubmit = errorText.getText();
        if (errorTextOnSubmit.contains("Mobile number is not valid")) {
            AssertionUtils.softAssertions("Mobile number is not valid", false);
            phoneInput.clear();
            phoneInput.sendKeys(data.get("phoneNumber"));
            nextBtn.click();
        }

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        verifyOTPBtn.click();
    }

    /**
     * This method performs adds catalogue group details
     * @param data is the parameter which is passed from the feature file
     * @throws InterruptedException exception added for Thread sleep
     */
    public void addCatalogueGroupDetails(Map<String, String> data) throws InterruptedException, AWTException {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(addBtn)).click();

        catalogueGroupBtn.click();

        createBtn.click();
        String errorText = groupNameErrorText.getText();

        if (errorText.contains("This field is required")) {
            AssertionUtils.softAssertions("Catalogue Group Name is not entered", false);
            Thread.sleep(8000);
        }

        uploadPhotoEditIcon1.click();
        String path = "C:\\Users\\PC\\IdeaProjects\\SalesWizzAutomation\\src\\test\\resources\\images\\Gold.jpg";
        fileUpload(path);

        groupName.sendKeys(data.get("groupName"));

        List<WebElement> radioButtons = allRadioBtns;
        for (int i = 0; i < radioButtons.size()-2; i++) {
            Thread.sleep(100);
            radioButtons.get(i).click();
            radioButtons.get(i).click();
        }

        unitOfMeasureSelect.click();
        unitOfMeasureGrams.click();
        quantitySelect.click();
        getQuantityKiloGram.click();
        otherFields1.sendKeys("Hi");
        otherFields2.sendKeys("Hello");
//        whiteListRadio.click();
        createBtn.click();
        confirmNoBtn.click();

    }

    /**
     * This method performs adds catalogue details
     * @param data is the parameter which is passed from the feature file
     * @throws InterruptedException exception added for Thread sleep
     */
    public void addCatalogueDetails(Map<String, String> data) throws InterruptedException, AWTException {
        addBtn.click();
        catalogueBtn.click();

        Thread.sleep(500);
        createBtn.click();
        String errorText = groupNameErrorText.getText();

        if (errorText.contains("This field is required")) {
            AssertionUtils.softAssertions("Catalogue Name is not entered", false);
            Thread.sleep(8000);
        }

        uploadPhotoEditIcon1.click();
        String path = "C:\\Users\\PC\\IdeaProjects\\SalesWizzAutomation\\src\\test\\resources\\images\\Chain.jpg";
        fileUpload(path);

        catalogueName.sendKeys(data.get("catalogue"));

        List<WebElement> radioButtons = allRadioBtns;
        for (int i = 0; i < radioButtons.size(); i++) {
            Thread.sleep(200);
            radioButtons.get(i).click();
            radioButtons.get(i).click();
        }

        unitOfMeasureCatalogue.click();
        unitOfMeasureGrams.click();
//        whiteListRadio.click();
        privacyPublic.click();
        createBtn.click();
        confirmNoBtn.click();
    }

    /**
     * This method performs add product
     * @param data is the parameter which is passed from the feature file
     */
    public void addProduct(Map<String, String> data) throws InterruptedException, AWTException {
        addProductButton.click();

        uploadImage.click();
        String path = "C:\\Users\\PC\\IdeaProjects\\SalesWizzAutomation\\src\\test\\resources\\images\\chain1.jpg";
        fileUpload(path);

        productTitle.sendKeys(data.get("productTitle"));
        productDescription.sendKeys(data.get("productDescription"));
        productSKU.sendKeys(data.get("productDescription"));
        productUOM.sendKeys(data.get("productUOM"));
        productTag.sendKeys(data.get("productTag"));
        productSave.click();
        productFilter.click();
        productAvailability.click();
        productOutOfStock.click();
        productApply.click();
        productShare.click();
        productShareBtn.click();
        productShareLink.click();
        productShareClose.click();
        productManageInventory.click();
        forwardToSupplier.click();
        searchSupplier.click();
        supplier1.click();
        s1.click();
        orderValue.sendKeys(data.get("orderValue"));
        orderDate.sendKeys(data.get("orderDate"));

        selectDate.click();
        forward.click();
    }

    public void fileUpload(String path) throws InterruptedException, AWTException {
        StringSelection selectPath = new StringSelection(path);
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        clip.setContents(selectPath, selectPath);
        Thread.sleep(2000);
        Robot file = new Robot();
        file.keyPress(KeyEvent.VK_CONTROL);
        file.keyPress(KeyEvent.VK_V);
        file.delay(1000);
        file.keyRelease(KeyEvent.VK_CONTROL);
        file.keyRelease(KeyEvent.VK_V);
        file.keyPress(KeyEvent.VK_ENTER);
        file.keyRelease(KeyEvent.VK_ENTER);
    }
}
