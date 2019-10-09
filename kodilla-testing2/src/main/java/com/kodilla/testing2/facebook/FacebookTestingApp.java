package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String DAY_SELECT_PATH = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String MONTH_SELECT_PATH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String YEAR_SELECT_PATH = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement daySelectElement = driver.findElement(By.xpath(DAY_SELECT_PATH));
        Select daySelect = new Select(daySelectElement);
        daySelect.selectByIndex(9);

        WebElement monthSelectElement = driver.findElement(By.xpath(MONTH_SELECT_PATH));
        Select monthSelect = new Select(monthSelectElement);
        monthSelect.selectByIndex(2);

        WebElement yearSelectElement = driver.findElement(By.xpath(YEAR_SELECT_PATH));
        Select yearSelect = new Select(yearSelectElement);
        yearSelect.selectByIndex(24);
    }
}
