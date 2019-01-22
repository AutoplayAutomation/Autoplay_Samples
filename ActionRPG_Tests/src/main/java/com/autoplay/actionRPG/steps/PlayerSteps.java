package com.autoplay.actionRPG.steps;

import com.autoplay.actionRPG.steps.player.AtGamePlayHUD;
import com.autoplay.actionRPG.steps.player.AtIntroPage;
import com.autoplay.actionRPG.steps.player.AtInventoryPage;
import com.autoplay.actionRPG.steps.player.AtStartPage;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class PlayerSteps extends ScenarioSteps {

    @Steps
    public AtStartPage atStartPage;

    @Steps
    public AtIntroPage atIntroPage;

    @Steps
    public AtInventoryPage atInventoryPage;

    @Steps
    public AtGamePlayHUD atGamePlayHUD;

}
