/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.pages.searchresults;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import se.nackademin.librarytest.pages.MenuPage;

/**
 *
 * @author rafael
 */
public class AuthorResultSearchPage extends MenuPage {
    @FindBy(css = "#gwt-uid-3")
    private SelenideElement nameText;
    
    @FindBy(css = "#gwt-uid-5")
    private SelenideElement countryText;
    
    @FindBy(css = "#gwt-uid-7")
    private SelenideElement biographyText;
    
    public String getAuthorName(){
        return getTextValue("name", nameText);
        
    }
    
    public String getAuthorCountry(){
        return getTextValue("country", countryText);
        
    }
    public String getAuthorBiography(){
        return getTextValue("biography", biographyText);
        
    }
    
    
    
}
