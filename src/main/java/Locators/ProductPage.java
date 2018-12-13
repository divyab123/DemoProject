package Locators;

import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.By;

import BrowserInstance.CommonMethods;

public class ProductPage {

	CommonMethods commonLocators = new CommonMethods();
	
	public static By icixprdctPage = By.xpath("//span[@class='slds-truncate'][text()='ICIX Products']");
	public static By newprdBtn = By.xpath("//div[text()='New']");
	public static By prdheading = By.xpath("//li[@class='slds-breadcrumb__item slds-line-height--reset']/span[text()='ICIX Products']");
    public static By newprdbtn = By.xpath("//ul[@class='branding-actions slds-button-group slds-m-left--xx-small oneActionsRibbon forceActionsContainer']/li/a/div[text()='New']");
	public static By searchTPbox = By.xpath("//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon--right ng-scope']/input");
	
	public void openPrdPage() throws Exception
	{
		commonLocators.waitForElementToBeClickable(icixprdctPage);
		$(icixprdctPage).click();
	}
	
	public String getTitle()
	{
		return $(prdheading).getText();
	}
	
	public void clickNewBtn() throws Exception
	{
		commonLocators.waitForElementToBeClickable(newprdbtn);
		$(newprdbtn).click();
	}
	
	public void searchTP() throws Exception
	{
		commonLocators.waitForElementToBeVisible(searchTPbox);
		$(searchTPbox).setValue("QA Org 2 Automation Res Pkg Stg");
	}
}
