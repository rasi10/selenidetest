/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.pages;

import com.codeborne.selenide.SelenideElement;

import java.util.logging.Logger;

import org.openqa.selenium.support.FindBy;

/**
 * @author testautomatisering
 */
public class MenuPage extends PageBase {
    private static final Logger LOG = Logger.getLogger(MenuPage.class.getName());
  
    @FindBy(css = "#side-menu-link-browse-books")
    private SelenideElement browseBooks;
    
    @FindBy(css = "#side-menu-link-browse-authors")
    private SelenideElement browseAuthors;  
    
    @FindBy(css = "#side-menu-link-add-user")
    private SelenideElement addUser;
    
    @FindBy(css = "#side-menu-link-sign-in")
    private SelenideElement signIn;
    
    @FindBy(css = "#side-menu-link-sign-out")
    private SelenideElement sigOut;
    
    //if the user is logged in as a normal user    
    @FindBy(css = "#side-menu-link-my-profile")
    private SelenideElement myProfile;
    
    //if the user is logged in as admin    
    @FindBy(css = "#side-menu-link-add-book")
    private SelenideElement addBooks;
    
    @FindBy(css = "#side-menu-link-add-author")
    private SelenideElement addAuthors; 
    
    
    public void navigateToBrowseBooks() {
        clickButton("browse books", browseBooks);
    }

    public void navigateToBrowseAuthors() {
        clickButton("browse authors", browseAuthors);
    }     
    
    public void navigateToAddUser() {
        clickButton("add user", addUser);
    }

    public void navigateToSignIn() {
        clickButton("sign in", signIn);
    }
    
    public void navigateToSignOut() {
        clickButton("sign out", sigOut);
    }
    
    //logged in as a normal user: 
    public void navigateToMyProfile() {
        clickButton("my profile", myProfile);
    }
    
    //logged in as administrator:
    
      public void navigateToAddABook() {
        clickButton("add book", addBooks);
    }
    
    public void navigateToAddAnAuthor() {
        clickButton("add author", addAuthors);
    }
}
