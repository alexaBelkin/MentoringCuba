package com.lambda.test;

import com.lambda.pages.LambdaMainPage;
import com.lambda.pages.LambdaSliders;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class LambdaScript {

   @Test
    public void LambdaPractice(){
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.manage().window().maximize();
       driver.navigate().to("https://www.lambdatest.com/selenium-playground/");

       LambdaMainPage lambdaMainPage=new LambdaMainPage(driver);
       lambdaMainPage.clickDragAndDrop();

      LambdaSliders lambdaSliders=new LambdaSliders(driver);
      lambdaSliders.slideSlider1();




   }
}
