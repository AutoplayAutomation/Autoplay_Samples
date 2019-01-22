package com.autoplay.actionrpg.tests;

import com.autoplay.actionrpg.common.BaseTestTemplate;
import org.junit.Test;

public class AddFireWaveSkill extends BaseTestTemplate {

    @Test
    public void AddFireWareSkill(){

        // Wait loading && Click Button_Play
        player.atStartPage.waitStartPageAppears();
        player.atStartPage.clickStartButton();

        // Check Laboratory appears && Open Map
        player.atIntroPage.verifyIntroAppears();
        player.atIntroPage.clickSkipIntro();

        // Open Inventory
        player.atGamePlayHUD.checkGamePlayHUDAppears();
        player.atGamePlayHUD.openInventory();

        // Buy skill - "Fire Wave"
        player.atInventoryPage.verifyInventoryAppears();
        player.atInventoryPage.addSouls();
        player.atInventoryPage.addSouls();
        player.atInventoryPage.openSkillMenu();
        player.atInventoryPage.selectFireWave();
        player.atInventoryPage.confirmPurchase();
        player.atInventoryPage.clickBack();

        // Check main GamePlay view appears
        player.atGamePlayHUD.checkGamePlayHUDAppears();
        player.atGamePlayHUD.driverQuit();
    }
}
