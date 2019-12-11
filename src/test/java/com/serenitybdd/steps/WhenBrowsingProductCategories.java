package com.serenitybdd.steps;

import com.serenitybdd.steps.NagigatingUser;
import com.serenitybdd.model.Category;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenBrowsingProductCategories {

    @Steps
    NagigatingUser user;

    @Managed
    WebDriver driver;

    @Test
    public void shouldBeAbleToNavigateToTheMotorsCategory() {
        //Given
        user.isOntheHomePage();
        // When
        user.navigateToCategory(Category.Motors);
        // Then
        user.shouldSePageTitleContaining("new & user cars");
    }


}
