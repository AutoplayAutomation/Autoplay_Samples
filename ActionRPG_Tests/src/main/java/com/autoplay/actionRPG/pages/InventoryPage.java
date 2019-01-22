package com.autoplay.actionRPG.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends PageObject {

    @FindBy(xpath = "//*[@ID='TopMenu']//*[@Class='TextBlock' and @Text='INVENTORY']")
    private WebElementFacade lblInventory;

    @FindBy(id = "AddSoulsButton")
    private WebElementFacade btnAddSoulBtn;

    @FindBy(id = "SkillSlot")
    private WebElementFacade btnSkillSlot;

    @FindBy(xpath = "//*[@Class='WB_PurchaseItem_C']//*[@Class='TextBlock' and @Text='Fire Wave']")
    private WebElementFacade skillFireWave;

    @FindBy(id = "ConfirmButton")
    private WebElementFacade btnConfirm;

    @FindBy(id = "BackButton")
    private WebElementFacade btnBack;

    ////////////////////  INPUT ACTIONS SECTION START  /////////////////////////////////////////

    public void tapAddSoulButton() {
        btnAddSoulBtn.click();
    }

    public void openSkillMenu() {
        btnSkillSlot.click();
    }

    public void clickSkillFireWave(){
        skillFireWave.click();
    }

    public void clickConfirm(){

        btnConfirm.click();
    }

    public void clickBack(){
        btnBack.click();
    }

    ////////////////////  INPUT ACTIONS SECTION END  /////////////////////////////////////////


    ////////////////////  VERIFY ACTIONS SECTION START  /////////////////////////////////////////

    public void verifyInventoryAppears() {
        lblInventory.shouldBeVisible();
        btnAddSoulBtn.shouldBeVisible();
        btnSkillSlot.shouldBeVisible();
    }

    ////////////////////  VERIFY ACTIONS SECTION END  /////////////////////////////////////////
}