# Getting Started with AutoPlay and Selenium!

Current sample describe way how to use Selenium and Serenity framework with AutoPlay for automate Unity and Unreal Engine games. 

> Selenium documentation [click](https://github.com/SeleniumHQ/selenium/wiki/Getting-Started)
> Serenity documentation  [click](http://www.thucydides.info/docs/serenity/#introduction)

This tools allow create flexible tests for mobile and web, and for mobile games using AutoPlay. In our samples we used PageObject pattern, you can do it in another way, if you already experienced with automation.

## Structure of Tests

Src folders contains main and test

    main--
	    -- [java]/[com]/[autoplay]
								  -- [core] // Contains UnityDriver class for interaction with Autoplay
								  -- [pages] // Contains implementation for PageObjects (each screen in game described by separate class)
								  -- [steps] // Contains our Scenario Steps
	test--
		-- [java]/[com]/[autoplay]
								  -- [common] // Contains base code for all Tests
								  -- [test] // Contains our tests

For run tests we using JUnit.

So, from first perspective it looks like usual tests for mobile or web testing.

Youtube: [enter link description here](https://www.youtube.com/watch?v=-pFEZVTpCmk)
