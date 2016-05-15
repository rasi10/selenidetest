/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.pages.browsepages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import se.nackademin.librarytest.pages.MenuPage;

/**
 * @author testautomatisering
 */
public class BrowseBooksPage extends MenuPage{
    @FindBy(css = "#gwt-uid-3")
    private SelenideElement titleField;
    @FindBy(css = "#search-books-button")
    private SelenideElement searchBooksButton;
    @FindBy(css = ".v-grid-cell:nth-child(1) > a:nth-child(1)")
    private SelenideElement firstResultTitle;    

    public void setTitleField(String title) {
        setTextFieldValue("title", title, titleField);
       
    }

    public void clickSearchBooksButton() {
        clickButton("search button", searchBooksButton);
        
    }
    
    public void clickFirstResultTitle() {
        clickFirstElementOnTable("first element on the table", firstResultTitle);
        
    }
}
