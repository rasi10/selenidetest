/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.helpers;

import se.nackademin.librarytest.pages.browsepages.BrowseBooksPage;
import static com.codeborne.selenide.Selenide.page;

import se.nackademin.librarytest.model.*;
import se.nackademin.librarytest.pages.*;

/**
 * @author testautomatisering
 */
public class BookHelper {
    
    

    public static void addNewBook(Book book) {

    }

    public static Book fetchBook(String searchQuery) {
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToBrowseBooks();
        BrowseBooksPage browseBooksPage = page(BrowseBooksPage.class);
        browseBooksPage.setTitleField("Guards!");
        browseBooksPage.clickSearchBooksButton();
        browseBooksPage.clickFirstResultTitle();

        BookPage bookPage = page(BookPage.class);
        Book book = new Book();
        book.setTitle(bookPage.getTitle());
        book.setAuthor(bookPage.getAuthor());
        book.setDescription(bookPage.getDescription());
        return book;
    }
}
