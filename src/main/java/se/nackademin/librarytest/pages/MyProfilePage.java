/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author testautomatisering
 */
public class MyProfilePage extends MenuPage {
    @FindBy(css = "#gwt-uid-5")
    SelenideElement userNameText;
    
    @FindBy(css = "#gwt-uid-7")
    SelenideElement firstNameText;
    
    @FindBy(css = "#gwt-uid-9")
    SelenideElement lastNameText;    
    
    @FindBy(css = "#gwt-uid-11")
    SelenideElement phoneNumberText;
    
    @FindBy(css = "#gwt-uid-13")
    SelenideElement emailText;    
    
    @FindBy(css = "#edit-user")
    SelenideElement editProfileButton;
       

    public String getUserName() {
        return userNameText.getText();
    }
    
    public String getFirstName() {
        return firstNameText.getText();
    }
    
    public String getlasTName() {
        return lastNameText.getText();
    }
    
    public String getPhoneNumber() {
        return phoneNumberText.getText();
    }    
    
    public String getUserEmail() {
        return emailText.getText();
    }

    public void clickEditProfileButton(){
        clickButton("add user button", editProfileButton);
    }

}
