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

public class AddAuthorPage extends MenuPage {
    @FindBy(css = "#gwt-uid-7")
    SelenideElement firstNameField;
    
    @FindBy(css = "#gwt-uid-9")
    SelenideElement lastNameField;
    
    @FindBy(css = "#gwt-uid-3")
    SelenideElement countryField;
    
    @FindBy(css = "#gwt-uid-5")
    SelenideElement biographyField;  
    
    @FindBy(css = "#add-author-button")
    SelenideElement addAuthorButton;

    public void setFirstName(String firstName) {
       setTextFieldValue("first name", firstName, firstNameField);
      
    }

    public void setLastName(String lastName) {
        setTextFieldValue("last name", lastName, lastNameField);
    }
   
    public void setCountry(String country) {
        setTextFieldValue("country", country, countryField);
    }
    
    public void setBiography(String biography) {
        setTextFieldValue("biography", biography, biographyField);
    }

    public void clickAddAuthorButton() {
        clickButton("add author button", addAuthorButton);
    }
}
