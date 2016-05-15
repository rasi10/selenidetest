/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.helpers;

import static com.codeborne.selenide.Selenide.page;

import se.nackademin.librarytest.pages.AddUserPage;
import se.nackademin.librarytest.pages.edit.EditUserPage;
import se.nackademin.librarytest.pages.MenuPage;
import se.nackademin.librarytest.pages.MyProfilePage;
import se.nackademin.librarytest.pages.SignInPage;
import se.nackademin.librarytest.pages.browsepages.BrowseBooksPage;
import se.nackademin.librarytest.pages.searchresults.BooksResultSearchPage;

/**
 * @author testautomatisering
 */
public class UserHelper {
    public static void createNewUser(String username, String password) {
        MenuPage menuPage = page(MenuPage.class);       
        menuPage.navigateToAddUser();

        AddUserPage addUserPage = page(AddUserPage.class);
        addUserPage.setUsername(username);
        addUserPage.setPassword(password);
        addUserPage.clickAddUserButton();
    }

    public static void logInAsUser(String username, String password) {
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToSignIn();
        SignInPage signInPage = page(SignInPage.class);
        signInPage.setUsername(username);
        signInPage.setPassword(password);
        signInPage.clickLogIn();

    }   
    
    public static boolean borrowABook() {
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToBrowseBooks();        
        
        BrowseBooksPage browseBooksPage = page(BrowseBooksPage.class);        
        browseBooksPage.clickSearchBooksButton();
        browseBooksPage.clickFirstResultTitle();
        
        BooksResultSearchPage booksResultSearchPage = page(BooksResultSearchPage.class);       
        String numberOfBooksBeforeBorrowing = booksResultSearchPage.getNumberOfCopiesAvailable();
        
        booksResultSearchPage.clickBorrowBookButton();        
        booksResultSearchPage.clickConfirmationDialogYesButton();
        String numberOfBooksAfterBorrowing = booksResultSearchPage.getNumberOfCopiesAvailable();
        
        booksResultSearchPage.clickReturnBookButton();
        booksResultSearchPage.clickConfirmationDialogYesButton();
        String numberOfBooksAfterRetuning = booksResultSearchPage.getNumberOfCopiesAvailable();
        
        if (numberOfBooksBeforeBorrowing.equalsIgnoreCase(numberOfBooksAfterRetuning)){
            if(!numberOfBooksBeforeBorrowing.equalsIgnoreCase(numberOfBooksAfterBorrowing)){
                return true;
            }
        }
        return false;        

    } 
    
    public static void singOut(){
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToSignOut();
    }
    
    public static boolean editUserProfile(String username, String password, String newEmail) {        
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToMyProfile();
        
        MyProfilePage myProfilePage = page(MyProfilePage.class);
        myProfilePage.clickEditProfileButton();
        String emailBeforeChanging = myProfilePage.getUserEmail();
        
        EditUserPage editUserPage = page(EditUserPage.class);
        editUserPage.setDisplayNameField(username);
        editUserPage.setPasswordField(password);
        editUserPage.setEmailField(newEmail);
        editUserPage.clickSaveChangesButton();
        
        menuPage.navigateToMyProfile();        
        String emailAfterChange = myProfilePage.getUserEmail();
        
        if (!emailBeforeChanging.equalsIgnoreCase(emailAfterChange)){
            return true;
        }
        
        return false;
        
        
    }

    public void createNewUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
