package com.autoplay.zombie.steps;

import com.autoplay.zombie.steps.player.AtBattlePage;
import com.autoplay.zombie.steps.player.AtLabaratoryPage;
import com.autoplay.zombie.steps.player.AtMapPage;
import com.autoplay.zombie.steps.player.AtStartPage;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class PlayerSteps extends ScenarioSteps {

    @Steps
    public AtStartPage atStartPage;

    @Steps
    public AtLabaratoryPage atLabaratoryPage;

    @Steps
    public AtMapPage atMapPage;

    @Steps
    public AtBattlePage atBattlePage;

}
