package com.itacademy;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidTest {
    @Test
    public void androidTest() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554")
                .setApp("D:\\idea\\android\\saucelabs.apk").setAppWaitActivity("com.swaglabsmobileapp.MainActivity");
        AndroidDriver driver = new AndroidDriver(
                // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                new URL("http://127.0.0.1:4723"), options
        );
        try {
            WebElement el = driver.findElement(AppiumBy.accessibilityId("test-LOGIN"));
            el.click();
            driver.getPageSource();
        } finally {
            driver.quit();
        }
    }
}
