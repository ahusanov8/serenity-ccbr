package com.serenitybdd.steps;

import com.serenitybdd.model.Category;
import com.serenitybdd.pages.CategoryNavigationBar;
import com.serenitybdd.pages.CurrentPage;
import com.serenitybdd.pages.EbayHomePage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class NagigatingUser {

    EbayHomePage ebayHomePage;
    CurrentPage currentPage;
    CategoryNavigationBar categoryNavigationBar;

    @Step
    public void isOntheHomePage() {
        ebayHomePage.open();
    }

    @Step
    public void shouldSePageTitleContaining(String expectedTitle) {
        assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
    }

    @Step
    public void navigateToCategory(Category category) {
        categoryNavigationBar.selectCategory(category);
    }
}
