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
public class AuthorResultSearchPage {
    @FindBy(css = "#gwt-uid-3")
    private SelenideElement nameText;
    
    @FindBy(css = "#gwt-uid-5")
    private SelenideElement countryText;
    
    @FindBy(css = "#gwt-uid-7")
    private SelenideElement biographyText;
    
    public String getAuthorName(){
        return nameText.getText();
    }
    
    public String getAuthorCountry(){
        return nameText.getText();
    }
    public String getAuthorBiography(){
        return nameText.getText();
    }
    
    
    
}
