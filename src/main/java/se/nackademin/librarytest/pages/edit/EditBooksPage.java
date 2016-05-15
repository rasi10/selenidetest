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
public class EditBooksPage extends MenuPage{
    @FindBy (css = "#gwt-uid-7")
    private SelenideElement publishDateField;
    
    @FindBy (css = "#save-book-button")
    private SelenideElement saveChangeButton;
    
    public void setPublishDate(String newDate){
        setTextFieldValue("", newDate, publishDateField);
       
    }
    
    public void clickSaveChangesButton(){
        clickButton("save changes", saveChangeButton);
        
    }
    
    
    
}
