package se.nackademin.librarytest;

import static com.codeborne.selenide.Selenide.*;

import java.util.UUID;
import org.junit.Test;
import static org.junit.Assert.*;
import se.nackademin.librarytest.helpers.*;
import se.nackademin.librarytest.pages.*;

public class SelenideTest extends TestBase {

    public SelenideTest() {
    }
    
    @Test
    public void testLogin(){
        String values = UUID.randomUUID().toString();
        values = values.substring(0,6);
        AdminHelper.loginAsAdmin();
        AdminHelper.createNewAuthor(values,values, values, values);
        AdminHelper.fetchAuthor(values, values);        
        AuthorResultSearchPage authorResults = page(AuthorResultSearchPage.class);   
        assertEquals("The name of the author should be displayed!",authorResults.getAuthorName().contains(values),true);
        sleep(500);
        
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
