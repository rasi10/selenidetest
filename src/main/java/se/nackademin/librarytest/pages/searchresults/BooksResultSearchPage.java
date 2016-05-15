/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.pages.searchresults;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class BooksResultSearchPage {
    
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
        return titleText.getText();
    } 
    
    public String getPublishDateOfTheBook(){
        return publishDateText.getText();
    }
    
    public String getNumberOfCopiesAvailable(){
        return numberOfCopiesAvailableText.getText();
    }
    
    public String getTotalNumberOfCopies(){
        return totalNumberOfCopiesText.getText();
    }
    
    public void clickBorrowBookButton(){
        borrowBookButton.click();
    }
    
    public void clickEditBookButton(){
        editBookButton.click();
    }
    public void clickDeleteBookButton(){
        deleteBookButton.click();
    }
    
    public void clickConfirmationDialogYesButton(){
        confirmationDialogYesButton.click();
    }
    
    public void clickReturnBookButton(){
        returnBookButton.click();
    }
    
   
}
