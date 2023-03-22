package com.lambda.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LambdaMainPage {

    public LambdaMainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Drag & Drop Sliders")
    WebElement dragAndDrop;

    public void clickDragAndDrop(){
        dragAndDrop.click();
    }





}
