package mobile.tests.Playlist;
import io.unity.framework.init.base;
import mobile.object_repository.signin.signin_page;
import mobile.object_repository.sleep.sleep_page;
import org.testng.annotations.Test;

import java.time.Duration;

public class playlist_test  extends base {

    @Test
    public void user_can_create_a_playlist() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        sleep_page sleep_page = new sleep_page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.keyboard_hide();
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_cross_button();
        signin_page.handle_pop_up();
        //  signin_page.click_on_cross_button();
        signin_page.verify_and_click_sleep_tab_button_present_on_page();
        sleep_page.verify_all_categories_present_on_page();
        sleep_page.verify_new_present_on_page();
        sleep_page.verify_free_present_on_page();
        sleep_page.verify_music_present_on_page();
        sleep_page.verify_meditation_present_on_page();
        sleep_page.verify_stories_present_on_page();
        sleep_page.verify_new_arrivals_present_on_page();
        sleep_page.verify_see_all_present_on_page();
        signin_page.scroll_down_to_the_bottom("Create Playlist");
        sleep_page.verify_and_click_on_create_playlist();
        sleep_page.verify_give_your_playlist_a_name_present_on_page();
        sleep_page.verify_and_click_on_playlist_name("Song");
        sleep_page.verify_and_click_on_create_button();
        sleep_page.verify_add_items_to_playlist_present_on_page();
        sleep_page.verify_a_english_option_present_on_page();
        sleep_page.verify_a_hindi_option_present_on_page();
        sleep_page.verify_a_marathi_option_present_on_page();
        sleep_page.verify_ancient_wisdom_present_on_page();
        sleep_page.verify_and_click_on_playlist_card_first_dropdown();
        sleep_page.verify_and_click_on_plus_icon();
        sleep_page.verify_and_click_on_go_to_playlist();
        sleep_page.verify_golden_values_of_life_present_on_page();
        sleep_page.verify_siddhartha_chapter_present_on_page();
    }
}

