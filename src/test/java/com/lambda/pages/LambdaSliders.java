package com.lambda.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserUtils;

public class LambdaSliders {

    public LambdaSliders(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='sp__range']")
    WebElement slider1;

    @FindBy(xpath="//output[@id='range']")
    WebElement output;

    public void slideSlider1(){
//        while(!BrowserUtils.getText(output).equals("99")){
//            slider1.sendKeys(Keys.ARROW_RIGHT);
//        }

    }

}

