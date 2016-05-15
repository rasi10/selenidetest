/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.helpers;

import se.nackademin.librarytest.pages.browsepages.BrowseBooksPage;
import static com.codeborne.selenide.Selenide.page;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import se.nackademin.librarytest.pages.*;
import se.nackademin.librarytest.pages.browsepages.BrowseAuthorsPage;
import se.nackademin.librarytest.pages.MenuPage;
import se.nackademin.librarytest.pages.SignInPage;
import se.nackademin.librarytest.pages.edit.EditBooksPage;
import se.nackademin.librarytest.pages.searchresults.BooksResultSearchPage;



/**
 *
 * @author rafael
 */
public class AdminHelper {
    public static void loginAsAdmin(){
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToSignIn();
        SignInPage signInPage = page(SignInPage.class);
        signInPage.setUsername("admin");
        signInPage.setPassword("1234567890");
        signInPage.clickLogIn();
    }
    
    public static void createNewBook(){
        
    }
    
    public static void createNewAuthor(String firstName, String lastName, String country, String biography) {
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToAddAnAuthor();        
        
        AddAuthorPage addAuthorPage = page(AddAuthorPage.class);
        addAuthorPage.setFirstName(firstName);
        addAuthorPage.setLastName(lastName);        
        addAuthorPage.setCountry(country);
        addAuthorPage.setBiography(biography);
        addAuthorPage.clickAddAuthorButton();
       
    }
    
     public static void fetchAuthor(String name, String country) {
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToBrowseAuthors();
        
        BrowseAuthorsPage browseAuthorsPage = page(BrowseAuthorsPage.class);     
        
        browseAuthorsPage.setNameField(name);
        browseAuthorsPage.setCountryField(country);
        browseAuthorsPage.clickSearchBooksButton();
        browseAuthorsPage.clickFirstResultTitle();        
    }
    
     public static boolean editPublishDateOfABook(String book){
        GenerateRandomDate generateDate = new GenerateRandomDate();
        
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToBrowseBooks();
        
        BrowseBooksPage browseBooksPage = page(BrowseBooksPage.class);
        browseBooksPage.setTitleField(book);
        browseBooksPage.clickSearchBooksButton();
        browseBooksPage.clickFirstResultTitle();
                
        BooksResultSearchPage booksResultSearchPage = page(BooksResultSearchPage.class);
        String publishDateBeforeEdit = booksResultSearchPage.getPublishDateOfTheBook();
        
        booksResultSearchPage.clickEditBookButton();
                 
        //work on the editbookspage
        EditBooksPage editBooksPage = page(EditBooksPage.class);
        editBooksPage.setPublishDate(generateDate.generateRandomPublishDateDate());
        editBooksPage.clickSaveChangesButton();
        
        
        menuPage.navigateToBrowseBooks();        
        browseBooksPage = page(BrowseBooksPage.class);
        browseBooksPage.setTitleField(book);
        browseBooksPage.clickSearchBooksButton();
        browseBooksPage.clickFirstResultTitle();
        String publishDateAfterEdit = booksResultSearchPage.getPublishDateOfTheBook();
        
        if (!publishDateBeforeEdit.equals(publishDateAfterEdit)){
            return true;
        }
        
        return false;
            
     }       
     
     
    
}
