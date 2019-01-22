package com.autoplay.actionRPG.steps.player;

import com.autoplay.actionRPG.pages.InventoryPage;
import com.autoplay.actionRPG.steps.CommonSteps;
import net.thucydides.core.annotations.Step;

public class AtInventoryPage extends CommonSteps {

    InventoryPage inventoryPage;

    @Step
    public void openSkillMenu(){
        inventoryPage.openSkillMenu();
    }

    @Step
    public void addSouls(){
        inventoryPage.tapAddSoulButton();
    }

    @Step
    public void verifyInventoryAppears(){
        inventoryPage.verifyInventoryAppears();
    }

    @Step
    public void selectFireWave(){
        inventoryPage.clickSkillFireWave();
    }

    @Step
    public void confirmPurchase(){
        inventoryPage.clickConfirm();
    }

    @Step
    public void clickBack(){
        inventoryPage.clickBack();
    }

}