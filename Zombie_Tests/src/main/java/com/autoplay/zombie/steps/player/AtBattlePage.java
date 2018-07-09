package com.autoplay.zombie.steps.player;

import com.autoplay.zombie.pages.BattlePage;
import com.autoplay.zombie.steps.CommonSteps;
import net.thucydides.core.annotations.Step;

public class AtBattlePage extends CommonSteps {

    BattlePage battlePage;

    @Step
    public void moveFirstUnitToPosition(){
        battlePage.moveFirstUnitToPosition();
    }

    @Step
    public void openNewUnitInfo(){
        battlePage.openNewUnitInfo();
    }

    @Step
    public void closeNewUnitInfo(){
        battlePage.closeNewUnitInfo();
    }

    @Step
    public void verifyNewUnitInfoPoPUPAppears(){
        battlePage.verifyNewUnitInfoPoPUPAppears();
    }

    @Step
    public void verifyBattleFieldAppears(){
        battlePage.verifyBattleFieldAppears();
    }

    @Step
    public void verifyTipsAppears(String msg) {
        battlePage.verifyTipsAppears(msg);
    }

    public void holdForUpgrade() {
        battlePage.holdForUpgrade();
    }
}