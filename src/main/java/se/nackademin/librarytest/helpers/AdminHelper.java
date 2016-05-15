/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.helpers;

import static com.codeborne.selenide.Selenide.page;
import com.thoughtworks.selenium.SeleneseTestBase;
import se.nackademin.librarytest.pages.*;
import se.nackademin.librarytest.pages.BrowseAuthorsPage;
import se.nackademin.librarytest.pages.MenuPage;
import se.nackademin.librarytest.pages.SignInPage;



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
    
}
