package com.autoplay.zombie.tests;

import com.autoplay.zombie.common.BaseTestTemplate;
import org.junit.Test;

public class TutorialPassVol1 extends BaseTestTemplate {

    @Test
    public void TutorialPassVol1(){

        // Wait loading && Click Button_Play
        player.atStartPage.waitStartPageAppears();
        player.atStartPage.clickPlayButton();

        // Check Laboratory appears && Open Map
        player.atLabaratoryPage.verifyLabaratoryAppears();
        player.atLabaratoryPage.clickMap();

        // Check Map appears && Open First Level
        player.atMapPage.verifyMapPanelAppears();
        player.atMapPage.verifyTipsAppears("Click to start level");
        player.atMapPage.clickLevelButton();
        player.atMapPage.verifyStartLevelPopUpAppears();
        player.atMapPage.verifyTipsAppears("Click to start level");
        player.atMapPage.clickNormalLevelButton();

        // Pass first mission
        player.atBattlePage.verifyBattleFieldAppears();
        player.atBattlePage.verifyTipsAppears("Click and slide to build Unit");
        player.atBattlePage.moveFirstUnitToPosition();
        player.atBattlePage.openNewUnitInfo();
        player.atBattlePage.verifyNewUnitInfoPoPUPAppears();
        player.atBattlePage.closeNewUnitInfo();
    }
}
