package com.serenitybdd.pages;

import net.serenitybdd.core.pages.PageObject;
import com.serenitybdd.model.Category;
import org.openqa.selenium.By;

public class CategoryNavigationBar extends PageObject {
    public void selectCategory(Category category) {
        $("ul.hl-cat-nav__container .hl-cat-nav__js-tab").find(By.linkText(category.name())).click();

    }
}
