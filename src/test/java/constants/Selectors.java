package constants;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class Selectors {
    static Faker faker = new Faker();

    public final static By EMAIL_CREATE_INPUT = By.id("email_create");
    public final static By SUBMIT_CREATE_USER_BUTTON = By.id("SubmitCreate");
    public final static By MALE_GENDER_USER_FORM = By.id("SubmitCreate");
    public final static By FIRST_NAME_USER_FORM = By.id("customer_firstname");
    public final static By LAST_NAME_USER_FORM = By.id("customer_lastname");
    public final static By PASSWORD_USER_FORM = By.id("passwd");
    public final static By DAYS_USER_FORM = By.id("days");
    public final static By RANDOM_DAY_USER_FORM = By.xpath("//*[@id=\"days\"]/option["+faker.number().numberBetween(2,29)+"]");
    public final static By MONTHS_USER_FORM = By.id("months");
    public final static By RANDOM_MONTH_USER_FORM = By.xpath("//*[@id=\"months\"]/option["+faker.number().numberBetween(2,13)+"]");
    public final static By YEARS_USER_FORM = By.id("years");
    public final static By RANDOM_YEAR_USER_FORM = By.xpath("//*[@id=\"years\"]/option["+faker.number().numberBetween(19,104)+"]");
    public final static By ADDRESS_USER_FORM = By.id("address1");
    public final static By CITY_USER_FORM = By.id("city");
    public final static By STATES_USER_FORM = By.id("id_state");
    public final static By RANDOM_STATE_USER_FORM = By.xpath("//*[@id=\"id_state\"]/option["+faker.number().numberBetween(2,51)+"]");
    public final static By POSTCODE_USER_FORM = By.id("postcode");
    public final static By PHONE_NUMBER_USER_FORM = By.id("phone_mobile");
    public final static By ALIAS_USER_FORM = By.id("alias");
    public final static By SUBMIT_USER_FORM_BUTTON = By.id("submitAccount");

    public final static By ADD_TO_SHOPPING_CART_BUTTON = By.xpath("//*[@id=\"add_to_cart\"]/button");

    public final static By FILTER_SELECT_PRODUCT_LIST = By.id("selectProductSort");
    public static By getFilterSelector(String filterText){
        Map<String,Integer> selectOptions = new HashMap<String,Integer>(){
            {
                put("Price: Lowest first", 2);
                put("Price: Highest first", 3);
                put("Product Name: A to Z", 4);
            }};
        return By.xpath("//*[@id=\"selectProductSort\"]/option["+selectOptions.get(filterText)+"]");
    }
    public static By getPriceByProductIndex(int i){
        String priceXpath =  "//*[@id=\"center_column\"]/ul/li["+i+"]/div/div[2]/div[1]/span";
        return By.xpath(priceXpath);
    }

    public final static By FILTER_LIST_ITEMS = By.xpath("//*[@id=\"center_column\"]/ul/li");
    public final static By SEARCH_INPUT = By.id("search_query_top");
    public final static By SUBMIT_SERACH_BUTTON = By.name("submit_search");
    public final static By SEARCH_OPTIONS_ITEM = By.xpath("//*[@id=\"index\"]/div[2]/ul/li[1]");

    public final static By SUCCESSFUL_LABEL_ADD_TO_CART_MODAL = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");
    public final static By CART_PRODUCT_COUNT = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[1]");
    public final static By GO_TO_SHOPPING_LIST_BUTTON = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
    public final static By PROCEED_TO_CHECKOUT_BUTTON = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
    public final static By PROCEED_TO_CHECKOUT_BUTTON_ADDRESS_PAGE = By.xpath("//*[@id=\"center_column\"]/form/p/button");
    public final static By ACCEPT_TERMS_CHECKBOX = By.xpath("//*[@id=\"form\"]/div/p[2]/label");
    public final static By PROCEED_TO_CHECKOUT_BUTTON_SHIPPING_PAGE = By.xpath("//*[@id=\"form\"]/p/button");
    public final static By CONFIRM_MY_ORDER_BUTTON = By.xpath("//*[@id=\"cart_navigation\"]/button");
    public final static By PAY_BY_BANK_WIRE_BUTTON = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
    public final static By CONFIRMATION_TEXT_PAYMENT = By.xpath("//*[@id=\"center_column\"]/form/div/p[3]");
    public final static By CONFIRMATION_TEXT_ORDER = By.xpath("//*[@id=\"center_column\"]/div");

}
