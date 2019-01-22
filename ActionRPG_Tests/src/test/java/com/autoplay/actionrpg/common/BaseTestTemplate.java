package com.autoplay.actionrpg.common;

import com.autoplay.actionRPG.steps.PlayerSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTestTemplate {
    @Managed
    public WebDriver driver;

    @Managed
    public Pages pages;

    @Steps
    public PlayerSteps player;
}
