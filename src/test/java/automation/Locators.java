package automation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Locators extends PageObject {

    @FindBy(xpath = "//a[@href='/home']")
    public WebElement solutionLink;

    @FindBy(xpath = "//a[@href='/pricing']")
    public WebElement pricingLink;

    @FindBy(xpath = "//a[@href='/blogs']")
    public WebElement blogLink;

    @FindBy(xpath = "//a[@href='/about-us']")
    public WebElement aboutUslink;

    @FindBy(xpath = "//a[@href='/contact-us']")
    public WebElement contactLink;


//    Login
    @FindBy(xpath = "//button[@class='primary-btn'][text()='Start now!']")
    public WebElement startNowBtn;

    @FindBy(xpath = "//input[@formcontrolname='phoneNo']")
    public WebElement phoneInput;

    @FindBy(xpath = "//span[@class='mdc-button__label'][text()='Next']")
    public WebElement nextBtn;

    @FindBy(xpath = "//div[@formgroupname='mobileNo']/following-sibling::div")
    public WebElement errorText;

    @FindBy(xpath = "//span[text()='Verify OTP']")
    public WebElement verifyOTPBtn;


//    CatalogGroup
    @FindBy(xpath = "//span[text()='Add']")
    public WebElement addBtn;

    @FindBy(xpath = "//mat-error[text()='This field is required']")
    public WebElement groupNameErrorText;

    @FindBy(xpath = "//div/span/div[@class='text-sm'][text()='Catalogue group']")
    public WebElement catalogueGroupBtn;

    @FindBy(xpath = "//input[@type='file']/../action-button/button")
    public WebElement uploadPhotoEditIcon1;

    @FindBy(xpath = "//input[@formcontrolname='name']")
    public WebElement groupName;

    @FindBy(xpath = "//span[@class='mdc-switch__handle']")
    public List<WebElement> allRadioBtns;

    @FindBy(xpath = "//mat-select[@formcontrolname='unitOfMeasure']")
    public WebElement unitOfMeasureSelect;

    @FindBy(xpath = "//mat-option[@role='option']/span[contains(text(), 'Grams')]")
    public WebElement unitOfMeasureGrams;

    @FindBy(xpath = "//mat-select[@formcontrolname='mainInventoryTypeId']")
    public WebElement quantitySelect;

    @FindBy(xpath = "//mat-option[@role='option']/span[contains(text(), 'Kilogram')]")
    public WebElement getQuantityKiloGram;

    @FindBy(xpath = "//input[@formcontrolname='keyName']")
    public WebElement otherFields1;

    @FindBy(xpath = "(//input[@formcontrolname='keyName'])[2]")
    public WebElement otherFields2;

    @FindBy(xpath = "//input[@value='WHITELIST']")
    public WebElement whiteListRadio;

    @FindBy(xpath = "//span[text()='Create']")
    public WebElement createBtn;

    @FindBy(xpath = "//button[text()='No']")
    public WebElement confirmNoBtn;


//    Catalog
    @FindBy(xpath = "//div/span/div[@class='text-sm'][text()='Catalogue']")
    public WebElement catalogueBtn;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadPhotoEditIcon2;

    @FindBy(xpath = "//input[@formcontrolname='title']")
    public WebElement catalogueName;

    @FindBy(xpath = "//mat-select[@id='mat-select-10']")
    public WebElement unitOfMeasureCatalogue;

    @FindBy(xpath = "//div[@formgroupname='settings']/label/span[text()='Public']")
    public WebElement privacyPublic;


//    CatalogPage
    @FindBy(xpath = "//button/span/span[@class='px-4'][text()=' Add Product']")
    public WebElement addProductButton;

    @FindBy(xpath = "(//input[@type='file']/../p)[2]")
    public WebElement uploadImage;

    @FindBy(xpath = "//input[@id='_0title']")
    public WebElement productTitle;

    @FindBy(xpath = "//input[@id='_0description']")
    public WebElement productDescription;

    @FindBy(xpath = "//input[@id='_0sku']")
    public WebElement productSKU;

    @FindBy(xpath = "//input[@id='_0uom']")
    public WebElement productUOM;

    @FindBy(xpath = "//input[@id='_0tags']")
    public WebElement productTag;

    @FindBy(xpath = "//span[@class='mdc-button__label'][text()='Save']")
    public WebElement productSave;

    @FindBy(xpath = "//button/div[@class='w-full h-full icon action-icon filter-icon']")
    public WebElement productFilter;

    @FindBy(xpath = "//span[text()=' Availability ']")
    public WebElement productAvailability;

    @FindBy(xpath = "//label[text()=' Out of Stock ']")
    public WebElement productOutOfStock;

    @FindBy(xpath = "//button/span[text()='Apply']")
    public WebElement productApply;

    @FindBy(xpath = "//button/div[@class='w-full h-full icon action-icon share-icon']")
    public WebElement productShare;

    @FindBy(xpath = "//button/div[@class='w-full h-full icon action-icon manageInventory-icon']")
    public WebElement productManageInventory;

    @FindBy(xpath = "//button/div[@class='w-full h-full icon action-icon forwardOrder-icon']")
    public WebElement forwardToSupplier;

    @FindBy(xpath = "//span[text()='Share']")
    public WebElement productShareBtn;

    @FindBy(xpath = "//p[text()='Copy Link']")
    public WebElement productShareLink;

    @FindBy(xpath = "//div[@class='w-6 h-6 icon close-icon bg-black']")
    public WebElement productShareClose;

    @FindBy(xpath = "//mat-label[text()='Search Supplier']")
    public WebElement searchSupplier;

    @FindBy(xpath = "//span[text()='Sanji (+918956237478)']")
    public WebElement supplier1;

    @FindBy(xpath = "//div[text()='Sanji']")
    public WebElement s1;

    @FindBy(xpath = "//div/input[@formcontrolname='value']")
    public WebElement orderValue;

    @FindBy(xpath = "//div/input[@formcontrolname='edd']")
    public WebElement orderDate;

    @FindBy(xpath = "//button/span[text()=' 6 ']")
    public WebElement selectDate;

    @FindBy(xpath = "//span[text()='Forward']")
    public WebElement forward;


    @FindBy(xpath = "//img[@class='w-full h-full object-contain cursor-grab']")
    public WebElement productImage;

    @FindBy(xpath = "//*[@id='mat-mdc-checkbox-10-input']")
    public WebElement productCheckBox;

    @FindBy(xpath = "//product-list/div/div[1]/div[2]/action-button[7]")
    public WebElement productDownload;

    @FindBy(xpath = "//span[text() = 'Select Supplier ']")
    public WebElement productSupplier;

    @FindBy(xpath = "//div[text()='Add New Supplier']")
    public WebElement productSupplierAdd;

    @FindBy(xpath = "//input[@id='mat-input-11']")
    public WebElement productCompanyName;

    @FindBy(xpath = "//input[@id='mat-input-12']")
    public WebElement productSupplierName;

    @FindBy(xpath = "//input[@id='mat-input-13']")
    public WebElement ProductSupplierNo;

    @FindBy(xpath = "//input[@id='mat-input-14']")
    public WebElement ProductSupplierEmail;

    @FindBy(xpath = "//input[@id='mat-input-15']")
    public WebElement ProductSupplierPinCode;

    @FindBy(xpath = "//input[@id='mat-input-16']")
    public WebElement ProductSupplierCountry;

    @FindBy(xpath = "//input[@id='mat-input-17']")
    public WebElement ProductSupplierState;

    @FindBy(xpath = "//input[@id='mat-input-18']")
    public WebElement ProductSupplierCity;

    @FindBy(xpath = "//input[@id='mat-input-19']")
    public WebElement productSupplierLandMark;

    @FindBy(xpath = "//input[@id='mat-input-20']")
    public WebElement productSupplierAdd1;

    @FindBy(xpath = "//input[@id='mat-input-21']")
    public WebElement productSupplierAdd2;

    @FindBy(xpath = "//*[@id='mat-mdc-dialog-4']/div/div/add-supplier-popup/div/button/span[2]")
    public WebElement productSupplierBtn;

    @FindBy(xpath = "//input[@id='mat-radio-7-input']")
    public WebElement productSupplierList;

    @FindBy(xpath = "//span[text()='Submit']")
    public WebElement productSupplierSubmit;

    @FindBy(xpath = "//div[@class='w-full h-full icon action-icon edit-icon']")
    public WebElement productEdit;

    @FindBy(xpath = "//button/span[text()='Save']")
    public WebElement productSupplierSave;

    @FindBy(xpath = "//button/div[@class='w-full h-full icon action-icon forwardOrder-icon']")
    public WebElement productForward;

    @FindBy(xpath = "//mat-label[text()='Search Supplier']")
    public WebElement selectSuppliers;

    @FindBy(xpath = "//span[text()='Sanji (+918956237478)']")
    public WebElement supplierDropDown;

    @FindBy(xpath = "//div[text()='Dashboard']")
    public WebElement dashboardBtn;

    @FindBy(xpath = "//div[@aria-haspopup='menu']/div[contains(@class, 'icon dropdown-icon')]")
    public WebElement menuDropDown;

    @FindBy(xpath = "//div[text()='My Profile']")
    public WebElement myProfileBtn;

    @FindBy(xpath = "//div[@class='w-full h-full icon action-icon edit-icon']")
    public WebElement uploadPhotoEditIcon;

    @FindBy(xpath = "//input[@formcontrolname='name']")
    public WebElement profileNameEdit;

    @FindBy(xpath = "//input[@formcontrolname='companyName']")
    public WebElement profileCompanyNameEdit;

    @FindBy(xpath = "//textarea[@formcontrolname='about']")
    public WebElement profileAbout;

    @FindBy(xpath = "//mat-select[@role='combobox'][@formcontrolname='currency']")
    public WebElement profileCurrencySelectDropDown;

    @FindBy(xpath = "//mat-option/span[contains(text(), 'Rupees')]")
    public WebElement profileRupeesOption;

    @FindBy(xpath = "//input[@formcontrolname='email']")
    public WebElement profileEmailInput;

    @FindBy(xpath = "//span[text()='Yes']")
    public WebElement confirmYesBtn;

    @FindBy(xpath = "//textarea[@id='mat-input-11']")
    public WebElement productDesc;

    @FindBy(xpath = "//div[@id='mat-select-value-15']")
    public WebElement productExpire;

    @FindBy(xpath = "//mat-option[@id='mat-option-41']")
    public WebElement productExpireOption;

}
