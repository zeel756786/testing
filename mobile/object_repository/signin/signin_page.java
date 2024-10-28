package mobile.object_repository.signin;

import com.github.javafaker.Faker;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;



public class signin_page {

    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Wait wait = null;
    AndroidDriver androidDriver = null;

    public signin_page(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
        androidDriver = (AndroidDriver) driver;
    }


    public void enterTextInSpecificTextBox(String text, int textBoxIndex) {
        try {

            List<WebElement> textBoxes = androidDriver.findElements(AppiumBy.className("android.widget.EditText"));


            if (textBoxes.size() > textBoxIndex) {

                textBoxes.get(textBoxIndex).sendKeys(text);


                androidDriver.hideKeyboard();
            } else {
                System.out.println("There are less than " + (textBoxIndex + 1) + " text boxes on the screen.");
            }

        } catch (Exception e) {
            System.out.println("Error entering text: " + e.getMessage());
        }
    }

    public void welcome_to_level_supermind() {
        wait.wait_for_second(10);
        wait.wait_until_element_is_visible("welcome_to_level_supermind");
    }

    public void learn_from_experts() {
        wait.wait_for_second(10);
        wait.wait_until_element_is_visible("learn_from_experts");
    }

    public void meditation() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("meditation");
    }

    public void workouts() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("workouts");
    }

    public void verify_sleep_tab_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sleep");
    }
    public void click_on_sleep_tab_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sleep");
        element.click("sleep");
    }

    public void verify_sign_in_button_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sign_in");
        verify.element_is_present("sign_in");
    }

    public void click_sign_in_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sign_in");
        element.click("sign_in");
    }

    public void verify_phone_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("phone");
        verify.element_is_present("phone");
    }

    public void verify_email_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("email");
        verify.element_is_present("email");
    }

    public void click_email_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("email");
        element.click("email");
    }

    public void click_and_enter_text_on_phone_no() {
        wait.wait_for_second(2);
        element.click("enter_mobile_no");
        wait.wait_for_second(5);

    }

    public void click_and_enter_text_on_email_id() {
        wait.wait_for_second(2);
        element.click("enter_email_id");
        wait.wait_for_second(5);
    }

    public void enter_random_mobile_number(int index) {
        Faker faker = new Faker();
        String fixedFiveDigitNumber = "97528";
        String randomFiveDigitNumber = faker.number().digits(5);
        String completeNumber = fixedFiveDigitNumber + randomFiveDigitNumber;
        List<WebElement> textFields = androidDriver.findElements(By.className("android.widget.EditText"));
        if (index >= 0 && index < textFields.size()) {
            WebElement numberTextField = textFields.get(index);
            numberTextField.click();
            numberTextField.sendKeys(completeNumber);
            androidDriver.hideKeyboard();
            System.out.println("10-digit number (first 5 fixed, last 5 random) in mobile : " + completeNumber);
        } else {
            System.out.println("Invalid index: " + index + " No such text field found ");
        }

    }

    public void verify_and_click_on_right_arrow() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("right_arrow");
        element.click("right_arrow");
        wait.wait_for_second(5);
    }

    public void click_on_enter_the_code_text_field() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("enter_the_code_text_box");
        element.click("enter_the_code_text_box");
        wait.wait_for_second(5);
    }

    public void verify_customise_your_experience_text() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("customise_your_experience");
        verify.element_is_present("customise_your_experience");

    }

    public void verify_tell_us_about_yourself_text() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("tell_us_about_yourself");
    }

    public void click_and_enter_your_name() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("your_name_text_field");
        element.click("your_name_text_field");
    }

    public void click_and_enter_your_email() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("your_email_text_field");
        element.click("your_email_text_field");
    }

    public void click_and_enter_your_email_or_mobile(boolean isEmail) {
        wait.wait_for_second(2);

        if (isEmail) {
            wait.wait_until_element_is_visible("your_email_text_field");
            element.click("your_email_text_field");
        } else {

            wait.wait_until_element_is_visible("your_phone_number");
            element.click("your_phone_number");
        }
    }

    public void verify_gender_text() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("gender");
    }

    public void verify_male_text() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("male");
    }

    public void verify_and_click_female_checkbox() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("female");
        element.click("female");
    }

    public void verify_other_text() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("other");
    }

    public void verify_text_i_agree_to_receive_marketing_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("i_agree_to_receive_marketing");
    }

    public void verify_text_i_agree_to_terms_and_conditions_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("i_agree_to_the_terms_and_conditions");
    }

    public void verify_text_got_a_referral_code_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("got_a_referral_code");
    }

    public void verify_text_what_type_of_meditations_are_you_looking_for_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("what_type_of_meditations_are_you_looking_for");
    }

    public void verify_stress_and_anxiety_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("stress_and_anxiety");
    }

    public void verify_focus_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("focus");
    }

    public void verify_productivity_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("productivity");
    }

    public void verify_relaxation_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("anger");
    }

    public void click_on_stress_and_anxiety() {
        wait.wait_for_second(2);
        element.click("stress_and_anxiety");
    }

    public void verify_text_what_are_you_looking_for_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("what_are_you_looking_for");
    }

    public void verify_text_stress_relief_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("stress_relief");
    }

    public void verify_text_better_sleep_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("better_sleep");
    }

    public void verify_text_personal_growth_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("personal_growth");
    }

    public void verify_text_spiritual_growth_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("spiritual_growth");
    }

    public void click_on_stress_relief() {
        wait.wait_for_second(2);
        element.click("stress_relief");
    }

    public void verify_thank_you_text_present_on_page() {
        wait.wait_until_element_is_visible("thank_you");
    }

    public void verify_how_your_free_trail_works_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("how_your_free_trail_works");
    }

    public void click_on_cross_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("cross_button");
        element.click("cross_button");
    }

    public void verify_you_ll_lose_out_on_this_offer_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("you_ll_lose_out_on_this_offer");
    }

    public void click_on_i_ll_lose_out_on_the_offer() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("i_ll_lose_out_on_the_offer");
        element.click("i_ll_lose_out_on_the_offer");
    }

    public void verify_i_ll_lose_out_on_the_offer_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("i_ll_lose_out_on_the_offer");
        element.click("i_ll_lose_out_on_the_offer");
    }

    public void verify_name_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("name_verify");
    }

    public void verify_continue_playing_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("continue_playing");
    }

    public void verify_meditation_tab_button_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("meditation_tab");
    }

    public void verify_and_click_sleep_tab_button_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sleep_tab");
        element.click("sleep_tab");
    }

    public void verify_today_tab_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("today_tab");
    }

    public void verify_body_tab_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("body_tab");
    }

    public void verify_insights_tab_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("insights_tab");
    }

    public void click_on_menu_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("menu");
        element.click("menu");
    }

    public void click_on_logout_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Logout");
        element.click("Logout");
    }

    public void scroll_down_to_the_bottom(String Text) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + Text + "\"));"));
    }

    public void verify_are_you_sure_page_display() {
        wait.wait_until_element_is_visible("are_you_sure");
    }

    public void click_on_are_you_sure_logout_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("are_you_sure_logout");
        element.click("are_you_sure_logout");
    }
    public void verify_and_click_on_view_profile() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("view_profile");
        element.click("view_profile");
    }
    public void verify_and_click_on_edit_profile() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("edit_profile");
        element.click("edit_profile");
    }
    public void verify_back_arrow_button_present_on_page() {
        wait.wait_until_element_is_visible("back_arrow_button");
    }
    public void verify_and_click_on_back_arrow_button_present_on_page() {
        wait.wait_until_element_is_visible("back_arrow_button");
        element.click("back_arrow_button");
    }
    public void verify_longest_streak_present_on_page() {
        wait.wait_until_element_is_visible("longest_streak");
    }
    public void verify_total_xp_present_on_page() {
        wait.wait_until_element_is_visible("total_xp");
    }
    public void verify_total_activities_on_page() {
        wait.wait_until_element_is_visible("total_activities");
    }
    public void verify_and_click_on_delete_account() {
        wait.wait_until_element_is_visible("delete_account");
        element.click("delete_account");
    }
    public void verify_and_click_on_delete_my_account() {
        wait.wait_until_element_is_visible("delete_my_account");
        element.click("delete_my_account");
    }
    public void verify_we_are_really_sad_to_see_you_go_present_on_page() {
        wait.wait_until_element_is_visible("we_are_really_sad_to_see_you_go");
    }
    public void verify_and_click_on_i_ve_found_other_apps_to_achieve_my_goals_present_on_page() {
        wait.wait_until_element_is_visible("i_ve_found_other_apps_to_achieve_my_goals");
        element.click("i_ve_found_other_apps_to_achieve_my_goals");
    }
    public void verify_and_click_delete_Account() {
        wait.wait_until_element_is_visible("Delete_Account");
        element.click("Delete_Account");
    }
    public void keyboard_hide() {
        wait.wait_for_second(2);
        try {
            if (((AndroidDriver) driver).isKeyboardShown()) {
                wait.wait_for_second(1);
                ((AndroidDriver) driver).hideKeyboard();
            } else {
                wait.wait_for_second(2);
            }
        } catch (Exception e) {
        }
    }

    public void enter_random_6_digit_code(int index) {
        Random random = new Random();
        int randomCode = 100000 + random.nextInt(900000);

        List<WebElement> textBoxes = androidDriver.findElements(By.className("android.widget.EditText"));

        if (index >= 0 && index < textBoxes.size()) {
            WebElement codeTextBox = textBoxes.get(index);
            codeTextBox.click();
            codeTextBox.sendKeys(String.valueOf(randomCode));
            androidDriver.hideKeyboard();
            System.out.println("Entered 6-digit random code: " + randomCode);
        } else {
            System.out.println("Invalid index: " + index + " No such text box found ");
        }
    }
    public void enter_6_digit_code(int index){
        wait.wait_for_second(2);
        List<WebElement> textField = androidDriver.findElements(By.className("android.widget.EditText"));
        textField.get(index).sendKeys("123456");
        androidDriver.hideKeyboard();
    }

    public void enterMobileNumberTextboxByIndex(int index) {
        wait.wait_for_second(2);
        String mobileNumber = "8000332637";
        List<WebElement> textFields = androidDriver.findElements(By.className("android.widget.EditText"));
        if (index >= 0 && index < textFields.size()) {
            WebElement numberTextField = textFields.get(index);
            numberTextField.click();
            numberTextField.sendKeys(mobileNumber);
            androidDriver.hideKeyboard();
            System.out.println("Successfully entered mobile number: " + mobileNumber);

        } else {
            System.out.println("Invalid index: " + index + " No such text field found ");
        }

    }
    public void handle_pop_up() {
        List<WebElement> featureAlert = androidDriver.findElements(By.xpath("//android.widget.TextView[@text='Feature Alert']"));

        if (featureAlert.size() > 0) {
            WebElement closeButton = androidDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc='close']"));
            closeButton.click();
            System.out.println("Close button clicked.");
        } else {
            System.out.println("Feature Alert is not visible. Skipping...");
        }
    }
}




