/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.pages.browsepages;
import se.nackademin.librarytest.pages.PageBase;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import se.nackademin.librarytest.pages.MenuPage;

/**
 *
 * @author rafael
 */
public class BrowseAuthorsPage extends MenuPage{   
    @FindBy(css = "#gwt-uid-3")
    private SelenideElement nameField;
    
    @FindBy(css = "#gwt-uid-5")
    private SelenideElement countryField;
    
    
    @FindBy(css = "#search-authors-button")
    private SelenideElement searchAuthorsButton;
   
    @FindBy(css = ".v-grid-cell-focused > a:nth-child(1)")
    private SelenideElement firstResultTitle;    

        
    public void setNameField(String name) {           
        setTextFieldValue("name", name, nameField);
        
    }
    
    public void setCountryField(String country) {        
        setTextFieldValue("country", country, countryField);
        
    }
    

    public void clickSearchBooksButton() {
        clickButton("search", searchAuthorsButton);
        
    }
    
    public void clickFirstResultTitle() {
        clickFirstElementOnTable("first element on the table", firstResultTitle);
        
    }

    
}
