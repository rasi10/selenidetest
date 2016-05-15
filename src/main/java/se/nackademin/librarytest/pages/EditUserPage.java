/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author rafael
 */
public class EditUserPage {
    @FindBy(css = "#gwt-uid-3")
    SelenideElement displayNameField;
    
    @FindBy(css = "#gwt-uid-5")
    SelenideElement passwordField;
    
    @FindBy(css = "#gwt-uid-7")
    SelenideElement firstNameField;
     
    @FindBy(css = "#gwt-uid-9")
    SelenideElement lastNameField;
      
    @FindBy(css = "#gwt-uid-11")
    SelenideElement phoneNumberFieldField;
       
    @FindBy(css = "#gwt-uid-13")
    SelenideElement emailAddressField;
    
     @FindBy(css = "#save-user-button")
    SelenideElement saveChangesButton;
    
    
    
    public void setDisplayNameField(String displayName) {
        displayNameField.clear();
        displayNameField.sendKeys(displayName);
      
    }
    
    public void setPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
      
    }
    
    public void setfirstNameField(String firstName) {
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
      
    }
    
    public void setLastNameField(String lastName) {
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
      
    }
    
    public void setPhoneNumberField(String phoneNumber) {
        phoneNumberFieldField.clear();
        phoneNumberFieldField.sendKeys(phoneNumber);
      
    }
    
    public void setEmailField(String email) {
        emailAddressField.clear();
        emailAddressField.sendKeys(email);
      
    }
    
    public void clickSaveChangesButton() {
        saveChangesButton.click();
    }
    
}
