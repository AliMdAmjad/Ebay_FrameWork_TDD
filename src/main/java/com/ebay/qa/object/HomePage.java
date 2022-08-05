package com.ebay.qa.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.ebay.qa.commons.CommonFunction;


public class HomePage {
	
CommonFunction commons;
	
	public HomePage(WebDriver driver, CommonFunction commons) {
		PageFactory.initElements(driver, this);
		this.commons = commons;

}
}
