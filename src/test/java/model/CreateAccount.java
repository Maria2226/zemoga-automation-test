package model;

import com.github.javafaker.Faker;
import config.BaseConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Selectors.*;

public class CreateAccount extends BaseConfig {
    Faker faker = new Faker();

    public void enterEmailAndProceedToCreateAccount () {
        WebElement emailCreateInput = driver.findElement(EMAIL_CREATE_INPUT);
        emailCreateInput.sendKeys(faker.internet().emailAddress());
        WebElement submitCreateButton = driver.findElement(SUBMIT_CREATE_USER_BUTTON);
        submitCreateButton.click();
    }

    public void fillCreateAccountForm () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement maleRadio = wait.until(
                ExpectedConditions.visibilityOfElementLocated(MALE_GENDER_USER_FORM));
        maleRadio.click();
        WebElement firstname = wait.until(
                ExpectedConditions.visibilityOfElementLocated(FIRST_NAME_USER_FORM));
        firstname.sendKeys(faker.name().firstName());
        WebElement lastname = driver.findElement(LAST_NAME_USER_FORM);
        WebElement passwd = driver.findElement(PASSWORD_USER_FORM);
        passwd.sendKeys(faker.internet().password(5,10));
        WebElement days = driver.findElement(DAYS_USER_FORM);
        days.click();
        WebElement day = driver.findElement(RANDOM_DAY_USER_FORM);
        day.click();
        WebElement months = driver.findElement(MONTHS_USER_FORM);
        months.click();
        WebElement month = driver.findElement(RANDOM_MONTH_USER_FORM);
        month.click();
        WebElement years = driver.findElement(YEARS_USER_FORM);
        years.click();
        WebElement year = driver.findElement(RANDOM_YEAR_USER_FORM);
        year.click();
        lastname.sendKeys(faker.name().lastName());
        WebElement address = driver.findElement(ADDRESS_USER_FORM);
        address.sendKeys(faker.address().streetAddress());
        WebElement city = driver.findElement(CITY_USER_FORM);
        WebElement states = driver.findElement(STATES_USER_FORM);
        states.click();
        WebElement state = driver.findElement(RANDOM_STATE_USER_FORM);
        state.click();
        city.sendKeys(faker.address().cityName());
        WebElement postcode = driver.findElement(POSTCODE_USER_FORM);
        postcode.sendKeys(faker.number().numberBetween(10000,99999)+"");
        WebElement phoneMobile = driver.findElement(PHONE_NUMBER_USER_FORM);
        phoneMobile.sendKeys(faker.phoneNumber().cellPhone());
        WebElement alias = driver.findElement(ALIAS_USER_FORM);
        alias.sendKeys("Home");
        WebElement submitAccount = driver.findElement(SUBMIT_USER_FORM_BUTTON);
        submitAccount.click();

    }
}