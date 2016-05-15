/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.pages.edit;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import se.nackademin.librarytest.pages.MenuPage;

/**
 *
 * @author rafael
 */
public class EditUserPage extends MenuPage{
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
        setTextFieldValue("display name", displayName, displayNameField);
       
      
    }
    
    public void setPasswordField(String password) {
        setTextFieldValue("password", password, passwordField);
       
      
    }
    
    public void setfirstNameField(String firstName) {
        setTextFieldValue("first name", firstName, firstNameField);
     
      
    }
    
    public void setLastNameField(String lastName) {
        setTextFieldValue("last name", lastName, lastNameField);
      
      
    }
    
    public void setPhoneNumberField(String phoneNumber) {
        setTextFieldValue("phone number", phoneNumber, phoneNumberFieldField);
        
      
    }
    
    public void setEmailField(String email) {
        setTextFieldValue("email number", email, emailAddressField);
       
      
    }
    
    public void clickSaveChangesButton() {
        clickButton("save changes", saveChangesButton);
        
    }
    
}
