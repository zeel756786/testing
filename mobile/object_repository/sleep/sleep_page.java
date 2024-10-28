package mobile.object_repository.sleep;
import io.appium.java_client.android.AndroidDriver;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.WebDriver;

public class sleep_page {

    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Wait wait = null;
    AndroidDriver androidDriver = null;

    public sleep_page(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
        androidDriver = (AndroidDriver) driver;
    }
    public void verify_all_categories_present_on_page() {
        wait.wait_until_element_is_visible("all_categories");
    }
    public void click_on_all_categories() {
        wait.wait_for_second(2);
        element.click("all_categories");
    }
    public void verify_new_present_on_page() {
        wait.wait_until_element_is_visible("new");
    }
    public void verify_free_present_on_page() {
        wait.wait_until_element_is_visible("free");
    }
    public void verify_frequently_repeated_present_on_page() {
        wait.wait_until_element_is_visible("frequently_repeated");
    }
    public void verify_sleep_story_present_on_page() {
        wait.wait_until_element_is_visible("sleep_story");
    }
    public void verify_music_present_on_page() {
        wait.wait_until_element_is_visible("music");
    }
    public void verify_meditation_present_on_page() {
        wait.wait_until_element_is_visible("meditations");
    }
    public void verify_stories_present_on_page() {
        wait.wait_until_element_is_visible("stories");
    }
    public void verify_new_arrivals_present_on_page() {
        wait.wait_until_element_is_visible("new_arrivals");
    }
    public void verify_see_all_present_on_page() {
        wait.wait_until_element_is_visible("see_all");
    }
    public void verify_your_playlists_present_on_page() {
        wait.wait_until_element_is_visible("your_playlists");
    }
    public void verify_and_click_on_create_playlist() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("create_playlist");
        element.click("create_playlist");
    }
    public void verify_give_your_playlist_a_name_present_on_page() {

        wait.wait_until_element_is_visible("give_your_playlist_a_name");
    }
    public void verify_and_click_on_playlist_name(String playlistName) {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("playlist_name");
        element.click("playlist_name");
        element.clear_and_enter_in_text_field("playlist_name","playlistName");
    }
    public void verify_and_click_on_create_button() {
        wait.wait_until_element_is_visible("create");
        element.click("create");
    }
    public void verify_and_click_on_cancel_button() {
        wait.wait_until_element_is_visible("cancel");
        element.click("cancel");
    }
    public void verify_add_items_to_playlist_present_on_page() {
        wait.wait_until_element_is_visible("add_item_to_playlist");
    }
    public void verify_a_english_option_present_on_page() {
        wait.wait_until_element_is_visible("a_english");
    }
    public void verify_a_hindi_option_present_on_page() {
        wait.wait_until_element_is_visible("hindi");
    }
    public void verify_a_marathi_option_present_on_page() {
        wait.wait_until_element_is_visible("marathi");
    }
    public void verify_ancient_wisdom_present_on_page() {
        wait.wait_until_element_is_visible("ancient_wisdom");
    }
    public void verify_and_click_on_playlist_card_first_dropdown() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("playlist_card_first_dropdown");
        element.click("playlist_card_first_dropdown");
    }
    public void verify_and_click_on_plus_icon() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("first_plus_icon");
        element.click("first_plus_icon");
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("second_plus_icon");
        element.click("second_plus_icon");
    }
    public void verify_and_click_on_go_to_playlist() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("go_to_playlist");
        element.click("go_to_playlist");
    }
    public void verify_golden_values_of_life_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("golden_values_of_life");
    }
    public void verify_siddhartha_chapter_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("siddhartha_chapter");
    }
    public void verify_and_click_on_three_dots_playlist() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("three_dots_playlist");
        element.click("three_dots_playlist");
    }
    public void verify_and_click_delete_playlist() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("delete_playlist");
        element.click("delete_playlist");
    }
}

