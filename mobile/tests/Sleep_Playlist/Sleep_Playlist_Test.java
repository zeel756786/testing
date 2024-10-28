package mobile.tests.Sleep_Playlist;

import io.unity.framework.init.base;
import io.unity.framework.remotegrid.LambdaTestConfig;
import mobile.object_repository.signin.signin_page;
import mobile.object_repository.sleep_playlist.Sleep_Playlist_Page;
import org.testng.annotations.Test;

import java.time.Duration;

public class Sleep_Playlist_Test extends base {

    @Test
    public void To_verify_when_the_user_taps_on_the_Sleep_menu_on_th_bottom_menu_bar_SLP_PL_001() {

        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To_verify_when_the_user_taps_on_the_Sleep_menu_on_th_bottom_menu_bar");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        sleep_playlist_page.verify_sleep_text_tab_button_present_on_page();
        sleep_playlist_page.verify_sleep_tab_icon_highlighted();
        sleep_playlist_page.verify_search_for_sleep_text_present_on_page();
        sleep_playlist_page.verify_music_text_present_on_page();
        sleep_playlist_page.verify_meditation_text_present_on_page();
    }

    @Test()
    public void To_verify_when_the_user_taps_on_the_Create_Playlist_button_on_the_Your_Playlist_section_SLP_PL_002() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To_verify_when_the_user_taps_on_the_Create_Playlist_button_on_the_Your_Playlist_section");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        sleep_playlist_page.scroll_down_to_the_Text("Create Playlist");
        sleep_playlist_page.verify_and_click_on_create_playlist();
        sleep_playlist_page.verify_playlist_name_highlighted();
    }

    @Test()
    public void To_verify_the_UI_of_theCreate_Playlist_screen_SLP_PL_003() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To_verify_the_UI_of_the_'Create_Playlist'_screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        sleep_playlist_page.scroll_down_to_the_Text("Create Playlist");
        sleep_playlist_page.verify_and_click_on_create_playlist();
    }

    @Test()
    public void To_verify_when_the_use_taps_on_the_Playlist_Name_filed_SLP_PL_004() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the use taps on the the 'Playlist Name' filed");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        sleep_playlist_page.scroll_down_to_the_Text("Create Playlist");
        sleep_playlist_page.verify_and_click_on_create_playlist();
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "@123jay");
    }

    @Test()
    public void To_verify_when_the_user_taps_on_the_Cancel_button_SLP_PL_005() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Cancel' button");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        sleep_playlist_page.scroll_down_to_the_Text("Create Playlist");
        sleep_playlist_page.verify_and_click_on_create_playlist();
        sleep_playlist_page.verify_playlist_name_highlighted();
        signin_page.keyboard_hide();
        sleep_playlist_page.verify_and_click_cancel_button();
        sleep_playlist_page.verify_sleep_tab_icon_highlighted();
    }
    @Test()
    public void To_verify_when_user_try_to_taps_on_the_Create_Button_on_the_Create_Playlist_screen_without_entering_any_data_in_the_Playlist_Name_field_SLP_PL_006(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when user try to taps on the Create Button on the Create Playlist screen without entering any data in the Playlist Name field");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        sleep_playlist_page.scroll_down_to_the_Text("Create Playlist");
        sleep_playlist_page.verify_and_click_on_create_playlist();
        sleep_playlist_page.verify_playlist_name_highlighted();
        signin_page.keyboard_hide();
        sleep_playlist_page.click_on_CreateButton();
    }
    @Test()
    public void To_verify_when_user_try_to_taps_on_the_Create_Button_on_the_Create_Playlist_screen_after_entering_any_data_in_the_Playlist_Name_field_SLP_PL_007() {
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when user try to taps on the 'Create' Button on the 'Create Playlist' screen after entering any data in the 'Playlist Name' field");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        sleep_playlist_page.scroll_down_to_the_Text("Create Playlist");
        sleep_playlist_page.verify_and_click_on_create_playlist();
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "Automation Testing");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_add_item_to_playlist_present_on_page();
    }
    @Test
    public void To_verify_the_UI_of_the_Add_Items_to_playlist_screen_SLP_PL_008(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify the UI of the 'Add Items to playlist screen");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        sleep_playlist_page.scroll_down_to_the_Text("Create Playlist");
        sleep_playlist_page.verify_and_click_on_create_playlist();
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "Automation Testing");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_add_item_to_playlist_present_on_page();
    }
    @Test()
    public void To_verify_when_the_user_enters_the_any_keyword_in_search_field_of_the_Add_item_to_playlist_screen_SLP_PL_009(){
        LambdaTestConfig config = new LambdaTestConfig(driver); signin_page signin_page = new signin_page(driver);
        config.addTestName("To verify when the user enters the any keyword in search field of the 'Add item to playlist' screen");
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        sleep_playlist_page.scroll_down_to_the_Text("Create Playlist");
        sleep_playlist_page.verify_and_click_on_create_playlist();
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "Automation Testing");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_add_item_to_playlist_present_on_page();
        sleep_playlist_page.verify_search_text_present_on_page();
        sleep_playlist_page.verify_search_box_enter_and_clear_text();
    }
    @Test()
    public void To_verify_when_the_user_taps_on_the_any_language_filter_below_the_search_field_SLP_PL_010_and_SLP_PL_011(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the any language filter below the search field");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        sleep_playlist_page.scroll_down_to_the_Text("Create Playlist");
        sleep_playlist_page.verify_and_click_on_create_playlist();
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "Automation Testing");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_hindi_language();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.verify_gudi_padwa_present_on_page();
        sleep_playlist_page.scroll_down_to_the_Text("Akbar And Birbal's Adventure (हिन्दी)");
        sleep_playlist_page.verify_hanuman_and_machhindranath_present_on_page();
        sleep_playlist_page.verify_story_of_jesus_christ_present_on_page();
        sleep_playlist_page.verify_yama_and_nachiketa_present_on_page();
        sleep_playlist_page.scroll_up_to_the_Text("Add items to playlist");
        sleep_playlist_page.verify_and_click_on_marathi_language();
        sleep_playlist_page.verify_the_fearless_lord_present_on_page();
    }
    @Test()
    public void To_verify_when_the_user_taps_on_the_Collapse_icon_on_the_any_category_from_the_list_SLP_PL_012(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the Collapse icon on the any category from the list");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        sleep_playlist_page.scroll_down_to_the_Text("Create Playlist");
        sleep_playlist_page.verify_and_click_on_create_playlist();
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "Automation Testing");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_hindi_language();
        sleep_playlist_page.verify_and_click_on_ancient_wisdom_drop_down();
        sleep_playlist_page.verify_gudi_padwa_present_on_page();
        sleep_playlist_page.scroll_down_to_the_Text("Akbar And Birbal's Adventure (हिन्दी)");
        sleep_playlist_page.verify_hanuman_and_machhindranath_present_on_page();
        sleep_playlist_page.verify_story_of_jesus_christ_present_on_page();
        sleep_playlist_page.verify_yama_and_nachiketa_present_on_page();
        sleep_playlist_page.scroll_up_to_the_Text("Add items to playlist");
        sleep_playlist_page.verify_and_click_on_collapse_icon_button();
    }
    @Test()
    public void To_verify_when_user_try_to_add_more_than_50_tracks_in_the_any_created_playlist_SLP_PL_014(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when user try to add more than 50 tracks in the any created playlist");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        sleep_playlist_page.scroll_down_to_the_Text("Create Playlist");
        sleep_playlist_page.verify_and_click_on_create_playlist();
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "Automation Testing");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_hindi_language();
        sleep_playlist_page.scroll_down_to_the_Text("Sleep Music");
        sleep_playlist_page.verify_and_click_on_stories_from_puranas_present_on_page();
        sleep_playlist_page.verify_and_click_on_radio_button_for_select_all_music();
        sleep_playlist_page.verifyTheToastMessage();
    }
    @Test()
    public void To_verify_when_the_user_taps_on_the_Add_music_plus_button_on_the_any_music_track_from_the_expanded_music_list_SLP_PL_015(){
        LambdaTestConfig config = new LambdaTestConfig(driver);
        config.addTestName("To verify when the user taps on the 'Add music +' button on the any music track from the expanded music list");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        signin_page signin_page = new signin_page(driver);
        Sleep_Playlist_Page sleep_playlist_page = new Sleep_Playlist_Page(driver);
        signin_page.click_sign_in_button();
        signin_page.verify_phone_text_present_on_page();
        signin_page.verify_email_text_present_on_page();
        signin_page.click_and_enter_text_on_phone_no();
        signin_page.enterMobileNumberTextboxByIndex(0);
        signin_page.verify_and_click_on_right_arrow();
        signin_page.click_on_enter_the_code_text_field();
        signin_page.enter_6_digit_code(0);
        signin_page.verify_and_click_on_right_arrow();
        sleep_playlist_page.checkWelcomePopUpAndClose();
        sleep_playlist_page.click_on_sleep_tab_button();
        sleep_playlist_page.checkSleepPlaylistsPopUpAndClose();
        sleep_playlist_page.scroll_down_to_the_Text("Create Playlist");
        sleep_playlist_page.verify_and_click_on_create_playlist();
        sleep_playlist_page.verify_playlist_name_highlighted();
        sleep_playlist_page.enterTextInPlaylistNameTextBox( "Automation Testing");
        sleep_playlist_page.verify_and_click_on_create_button();
        sleep_playlist_page.verify_and_click_on_hindi_language();
        sleep_playlist_page.scroll_down_to_the_Text("Sleep Music");
        sleep_playlist_page.verify_and_click_on_stories_from_puranas_present_on_page();
        sleep_playlist_page.verify_and_click_the_story_of_ekdant();
        sleep_playlist_page.verify_and_click_yama_and_nachiket();

    }
}
