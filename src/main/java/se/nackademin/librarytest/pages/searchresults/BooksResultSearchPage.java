/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.pages.searchresults;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import se.nackademin.librarytest.pages.MenuPage;

public class BooksResultSearchPage extends MenuPage {
    
     @FindBy(css = "#gwt-uid-3")
    private SelenideElement titleText;
     
    @FindBy(css = "#gwt-uid-11")
    private SelenideElement publishDateText;
     
    @FindBy(css = "#gwt-uid-13")
    private SelenideElement numberOfCopiesAvailableText;
    
    @FindBy(css = "#gwt-uid-15")
    private SelenideElement totalNumberOfCopiesText;
    
    
    @FindBy(css = "#borrow-book-button")
    private SelenideElement borrowBookButton;
    
    @FindBy(css = "#edit-book-button")
    private SelenideElement editBookButton;
    
    @FindBy(css = "#delete-book-button")
    private SelenideElement deleteBookButton;
    
    @FindBy(css = "#return-book-button")
    private SelenideElement returnBookButton;
    
            
    //confirmationDialog
    @FindBy(css = "#confirmdialog-ok-button")
    private SelenideElement confirmationDialogYesButton;
    
       
    public String getTitleOfTheBook(){
        return getTextValue("title", titleText);
        
    } 
    
    public String getPublishDateOfTheBook(){
        return getTextValue("publish date", publishDateText);
        
    }
    
    public String getNumberOfCopiesAvailable(){
        return getTextValue("No of copies available", numberOfCopiesAvailableText);
        
    }
    
    public String getTotalNumberOfCopies(){
        return getTextValue("total No of copies", totalNumberOfCopiesText);
       
    }
    
    public void clickBorrowBookButton(){
        clickButton("borrow button", borrowBookButton);
       
    }
    
    public void clickEditBookButton(){
        clickButton("edit button", editBookButton);
       
    }
    public void clickDeleteBookButton(){
        clickButton("delete button", deleteBookButton);
        
    }
    
    public void clickConfirmationDialogYesButton(){
        clickButton("confirmation dialog yes", confirmationDialogYesButton);
        
    }
    
    public void clickReturnBookButton(){
        clickButton("return button", returnBookButton);
        
    }
    
   
}
