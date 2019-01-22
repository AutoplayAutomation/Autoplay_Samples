package com.autoplay.actionRPG.core;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteTouchScreen;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class UnityDriver implements DriverSource {

    @Override
    public WebDriver newDriver() {
        URL remoteAddress = null;
        try {
            remoteAddress = new URL("http://localhost.charlesproxy.com:8833/wd/hub");
            //remoteAddress = new URL("http://0.0.0.0:8833/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setPlatform(Platform.MAC);
        desiredCapabilities.setJavascriptEnabled(true);
        desiredCapabilities.setCapability("version","");
        //Set device UDID (Android / IOS / IOS simulator)
        desiredCapabilities.setCapability("udid","9a7f2dd1a8e8df284f17b23b4c01153ec5555354");
        //desiredCapabilities.setCapability("udid","7EX0218402000769");

        return new SwipeableWebDriver(remoteAddress, desiredCapabilities);
    }

    public boolean takesScreenshots() {
        return false;
    }

    private static class SwipeableWebDriver extends RemoteWebDriver implements HasTouchScreen, TakesScreenshot {
        private RemoteTouchScreen touch;

        public SwipeableWebDriver(URL remoteAddress, DesiredCapabilities desiredCapabilities) {
            super(remoteAddress, desiredCapabilities);
            touch = new RemoteTouchScreen(getExecuteMethod());
        }

        public TouchScreen getTouch()    {
            return touch;
        }

        @Override
        public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
            String screen = execute(DriverCommand.SCREENSHOT).getValue().toString();
            return target.convertFromBase64Png(screen);
        }
    }
}