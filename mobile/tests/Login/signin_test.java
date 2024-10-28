package mobile.tests.Login;

import io.unity.framework.init.base;
import mobile.object_repository.signin.signin_page;
import org.testng.annotations.Test;

import java.time.Duration;

public class signin_test extends base {

    @Test
    public void user_can_login_the_account_by_mobile_no() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
       // signin_page.enter_random_mobile_number(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_random_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_customise_your_experience_text();
        signin_page.verify_tell_us_about_yourself_text();
        signin_page.click_and_enter_your_name();
        signin_page.enterTextInSpecificTextBox("zeel", 0);
        signin_page.click_and_enter_your_email();
        signin_page.click_and_enter_your_email_or_mobile(true);
        signin_page.enterTextInSpecificTextBox("zeel@qable.io", 1);
        signin_page.verify_gender_text();
        signin_page.verify_male_text();
        signin_page.verify_and_click_female_checkbox();
        signin_page.verify_other_text();
        signin_page.verify_text_i_agree_to_receive_marketing_present_on_page();
        signin_page.verify_text_i_agree_to_terms_and_conditions_present_on_page();
        signin_page.verify_text_got_a_referral_code_present_on_page();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_customise_your_experience_text();
        signin_page.verify_stress_and_anxiety_present_on_page();
        signin_page.verify_focus_present_on_page();
        signin_page.verify_productivity_present_on_page();
        signin_page.verify_relaxation_present_on_page();
        signin_page.click_on_stress_and_anxiety();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_text_stress_relief_present_on_page();
        signin_page.verify_text_better_sleep_present_on_page();
        signin_page.verify_text_personal_growth_present_on_page();
        signin_page.verify_text_spiritual_growth_present_on_page();
        signin_page.click_on_stress_relief();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_how_your_free_trail_works_text_present_on_page();
        signin_page.click_on_cross_button();
        signin_page.click_on_i_ll_lose_out_on_the_offer();
        signin_page.click_on_cross_button();
        signin_page.click_on_menu_button();
        signin_page.scroll_down_to_the_bottom("Logout");
        signin_page.click_on_logout_button();
        signin_page.verify_are_you_sure_page_display();
        signin_page.click_on_are_you_sure_logout_page();
        signin_page.verify_sign_in_button_present_on_page();
    }

    @Test
    public void user_can_login_the_account_by_email() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_email_text_present_on_page();
        signin_page.click_and_enter_text_on_email_id();
        signin_page.enterTextInSpecificTextBox("kikan56719@avzong.com", 0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_random_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_customise_your_experience_text();
        signin_page.verify_tell_us_about_yourself_text();
        signin_page.click_and_enter_your_name();
        signin_page.enterTextInSpecificTextBox("shubham", 0);
        signin_page.click_and_enter_your_email_or_mobile(false);
        signin_page.enterTextInSpecificTextBox("3535353355", 1);
        signin_page.verify_gender_text();
        signin_page.verify_male_text();
        signin_page.verify_other_text();
        signin_page.verify_text_i_agree_to_receive_marketing_present_on_page();
        signin_page.verify_text_i_agree_to_terms_and_conditions_present_on_page();
        signin_page.verify_text_got_a_referral_code_present_on_page();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_customise_your_experience_text();
        signin_page.verify_stress_and_anxiety_present_on_page();
        signin_page.verify_focus_present_on_page();
        signin_page.verify_productivity_present_on_page();
        signin_page.verify_relaxation_present_on_page();
        signin_page.click_on_stress_and_anxiety();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_text_stress_relief_present_on_page();
        signin_page.verify_text_better_sleep_present_on_page();
        signin_page.verify_text_personal_growth_present_on_page();
        signin_page.verify_text_spiritual_growth_present_on_page();
        signin_page.click_on_stress_relief();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_how_your_free_trail_works_text_present_on_page();
        signin_page.click_on_cross_button();
        signin_page.click_on_i_ll_lose_out_on_the_offer();
        signin_page.click_on_cross_button();
        signin_page.click_on_menu_button();
        signin_page.scroll_down_to_the_bottom("Logout");
        signin_page.click_on_logout_button();
        signin_page.verify_are_you_sure_page_display();
        signin_page.click_on_are_you_sure_logout_page();
        signin_page.verify_sign_in_button_present_on_page();
    }
    @Test
    public void user_can_delete_the_account(){
        signin_page signin_page = new signin_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        //   signin_page.enter_random_mobile_number(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        //   signin_page.enter_random_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_customise_your_experience_text();
        signin_page.verify_tell_us_about_yourself_text();
        signin_page.click_and_enter_your_name();
        signin_page.enterTextInSpecificTextBox("zeel", 0);
        signin_page.click_and_enter_your_email();
        signin_page.click_and_enter_your_email_or_mobile(true);
        signin_page.enterTextInSpecificTextBox("zeel@qable.io", 1);
        signin_page.verify_gender_text();
        signin_page.verify_male_text();
        signin_page.verify_and_click_female_checkbox();
        signin_page.verify_other_text();
        signin_page.verify_text_i_agree_to_receive_marketing_present_on_page();
        signin_page.verify_text_i_agree_to_terms_and_conditions_present_on_page();
        signin_page.verify_text_got_a_referral_code_present_on_page();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_customise_your_experience_text();
        signin_page.verify_stress_and_anxiety_present_on_page();
        signin_page.verify_focus_present_on_page();
        signin_page.verify_productivity_present_on_page();
        signin_page.verify_relaxation_present_on_page();
        signin_page.click_on_stress_and_anxiety();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_text_stress_relief_present_on_page();
        signin_page.verify_text_better_sleep_present_on_page();
        signin_page.verify_text_personal_growth_present_on_page();
        signin_page.verify_text_spiritual_growth_present_on_page();
        signin_page.click_on_stress_relief();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.verify_how_your_free_trail_works_text_present_on_page();
        signin_page.click_on_cross_button();
        signin_page.click_on_i_ll_lose_out_on_the_offer();
        signin_page.click_on_cross_button();
        signin_page.click_on_menu_button();
        signin_page.verify_and_click_on_view_profile();
        signin_page.verify_back_arrow_button_present_on_page();
        signin_page.scroll_down_to_the_bottom("Delete Account");
        signin_page.verify_and_click_on_delete_account();
        signin_page.verify_longest_streak_present_on_page();
        signin_page.verify_total_xp_present_on_page();
        signin_page.verify_total_xp_present_on_page();
        signin_page.verify_and_click_on_delete_my_account();
        signin_page.verify_we_are_really_sad_to_see_you_go_present_on_page();
        signin_page.verify_and_click_on_i_ve_found_other_apps_to_achieve_my_goals_present_on_page();
        signin_page.verify_and_click_delete_Account();
        signin_page.verify_sign_in_button_present_on_page();
    }

}


