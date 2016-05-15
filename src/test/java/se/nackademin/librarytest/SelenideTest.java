package se.nackademin.librarytest;

import static com.codeborne.selenide.Selenide.*;

import java.util.UUID;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import se.nackademin.librarytest.helpers.BookHelper;
import se.nackademin.librarytest.helpers.Table;
import se.nackademin.librarytest.helpers.UserHelper;
import se.nackademin.librarytest.model.Book;
import se.nackademin.librarytest.pages.BrowseBooksPage;
import se.nackademin.librarytest.pages.MenuPage;
import se.nackademin.librarytest.pages.MyProfilePage;
import se.nackademin.librarytest.pages.SignInPage;

public class SelenideTest extends TestBase {

    public SelenideTest() {
    }

    @Test
    public void createANewAuthor(){
        page(MenuPage.class).navigateToSignIn();
        SignInPage signInPage = page(SignInPage.class);
        signInPage.setUsername("admin");
        signInPage.setPassword("1234567890");
        signInPage.clickLogIn();
        sleep(10000);        
    }
    
    
    
    //@Test
    public void testUsingTable() {
        page(MenuPage.class).navigateToBrowseBooks();
        BrowseBooksPage browseBooksPage = page(BrowseBooksPage.class);
        //browseBooksPage.setTitleField("G");
        browseBooksPage.clickSearchBooksButton();
        Table table = new Table($(".v-grid-tablewrapper"));
        System.out.println(table.getColumnCount());
        System.out.println(table.getRowCount());
        System.out.println(table.getCellValue(0, 0));
        System.out.println(table.getCellValue(1, 1));
        table.searchAndClick("American Gods", 0);
        sleep(2000);
    }
}
