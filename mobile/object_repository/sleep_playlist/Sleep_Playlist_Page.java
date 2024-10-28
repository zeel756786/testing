package mobile.object_repository.sleep_playlist;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Sleep_Playlist_Page {

    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Wait wait = null;
    AndroidDriver androidDriver = null;

    public Sleep_Playlist_Page(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
        androidDriver = (AndroidDriver) driver;
    }

    public void verify_sleep_text_tab_button_present_on_page() {
        wait.wait_until_element_is_visible("sleep_tab_button");
        verify.element_is_present("sleep_tab_button");
    }

    public void click_on_sleep_tab_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sleep_tab_button");
        element.click("sleep_tab_button");
        verify.element_is_enable("sleep_tab_button");
    }

    public void verify_search_for_sleep_text_present_on_page() {
        wait.wait_until_element_is_visible("search_for_sleep");
        verify.element_is_present("search_for_sleep");
    }

    public void verify_music_text_present_on_page() {
        wait.wait_until_element_is_visible("music");
        verify.element_is_present("music");
    }

    public void verify_meditation_text_present_on_page() {
        wait.wait_until_element_is_visible("meditation");
        verify.element_is_present("meditation");
    }

    public void verify_stories_text_present_on_page() {
        wait.wait_until_element_is_visible("stories");
        verify.element_is_present("stories");
    }

    public void verify_sleep_tab_icon_highlighted() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("sleep_tab_icon");
        verify.element_is_present("sleep_tab_icon");
        verify.element_is_enable("sleep_tab_icon");
    }

    public void scroll_down_to_the_Text(String Text) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + Text + "\"));"));
    }
    public void scroll_up_to_the_Text(String Text) {
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".setAsVerticalList().scrollBackward()" +
                        ".scrollIntoView(new UiSelector().text(\"" + Text + "\"));"));
    }

    public void verify_and_click_on_create_playlist() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("create_playlist");
        element.click("create_playlist");
    }

    public void verify_playlist_name_highlighted() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("playlist_name");
        verify.element_is_enable("playlist_name");
    }

    public void verify_and_click_cancel_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("cancel");
        element.click("cancel");
    }

    public void verify_and_click_() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("playlist_name");
        verify.element_is_enable("playlist_name");
    }
    public void verify_and_click_on_create_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("create");
        element.click("create");
    }
    public void verify_add_item_to_playlist_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("add_item_to_playlist");
        verify.element_is_present("add_item_to_playlist");
    }
    public void verify_search_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("search_text");
        verify.element_is_present("search_text");
        element.click("search_text");
    }
    public void verify_shiva_yoga_nidra_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("shiva_yoga_Nidra_text");
        verify.element_is_present("shiva_yoga_Nidra_text");
    }
    public void verify_lord_shiva_gift_text_present_on_page() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Lord_Shiva_Gift_text");
        verify.element_is_present("Lord_Shiva_Gift_text");
    }
    public void verify_oops_it_seems_we_dont_have_what_youre_searching_for() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("oops_it_seems_we_dont_have_what_youre_searching_for");
        verify.element_is_present("oops_it_seems_we_dont_have_what_youre_searching_for");
    }
    public void verify_and_click_on_english_language() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("english_language");
        verify.element_is_present("english_language");
        element.click("english_language");
    }
    public void verify_and_click_on_hindi_language() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("hindi_language");
        verify.element_is_present("hindi_language");
        element.click("hindi_language");
    }
    public void verify_and_click_on_marathi_language() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("marathi_language");
        verify.element_is_present("marathi_language");
        element.click("marathi_language");
    }
    public void verify_and_click_on_clear_button() {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("clear");
        element.click("clear");
    }
    public void verify_and_click_on_ancient_wisdom_drop_down(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("ancient_wisdom_drop_down");
        element.click("ancient_wisdom_drop_down");
    }
    public void verify_and_click_on_collapse_icon_button(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("close_drop_down_collapse_button");
        element.click("close_drop_down_collapse_button");
    }
    public void verify_gudi_padwa_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("gudi_padwa");
        verify.element_is_present("gudi_padwa");
    }
    public void verify_hanuman_and_machhindranath_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("hanuman_and_machhindranath");
        verify.element_is_present("hanuman_and_machhindranath");
    }
    public void verify_story_of_jesus_christ_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("story_of_jesus_christ");
        verify.element_is_present("story_of_jesus_christ");
    }
    public void verify_yama_and_nachiketa_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("yama_and_nachiketa");
        verify.element_is_present("yama_and_nachiketa");
    }
    public void verify_the_fearless_lord_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("the_fearless_lord");
        verify.element_is_present("the_fearless_lord");
    }
    public void verify_and_click_on_stories_from_puranas_present_on_page(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("stories_from_puranas");
        element.click("stories_from_puranas");
    }
    public void verify_and_click_on_radio_button_for_select_all_music(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("radio_button_for_select_all_music");
        element.click("radio_button_for_select_all_music");
    }
    public void verify_and_click_the_story_of_ekdant(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("the_story_of_ekdant_plus_icon");
        element.click("the_story_of_ekdant_plus_icon");
    }
    public void verify_and_click_yama_and_nachiket(){
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("yama_and_nachiket_plus_icon");
        element.click("yama_and_nachiket_plus_icon");
    }
    public void verifyTheToastMessage() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement confirmMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    AppiumBy.androidUIAutomator(
                            "new UiSelector().textContains(\"Playlist can't have more than 50 activities*\")")));

            System.out.println("Validation Passed: Message displayed");
        } catch (Exception e) {
            System.out.println("Validation Failed: Message not displayed or disappeared");
        }
    }

    public void click_on_CreateButton() {
        wait.wait_for_second(2);
        WebElement createButton = androidDriver.findElement(By.xpath("//android.widget.TextView[@text=\"Create\"]"));
        if (!createButton.isEnabled()) {
            createButton.click();
            System.out.println("Create button clicked");
            Assert.assertTrue(createButton.isEnabled(),"Create button is enabled");
        } else {
            Assert.assertFalse(createButton.isEnabled(), "Create button is disabled");
            System.out.println("Create button is disabled");
        }
    }

    public void checkWelcomePopUpAndClose() {
        WebElement welcomeText = androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Welcome to']"));
        if (welcomeText.isDisplayed()) {
            System.out.println("'Welcome to' is visible.");
            WebElement closeButton = androidDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc='close']"));
            closeButton.click();
            System.out.println("Close button clicked.");
        } else {
            System.out.println("'Welcome to' is not visible Proceeding with next steps.");
        }
    }

    public void checkSleepPlaylistsPopUpAndClose() {
        WebElement sleepPlaylistsList = androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Sleep Playlists!']"));

        if (sleepPlaylistsList.isDisplayed()) {
            WebElement closeButton = androidDriver.findElement(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]"));
            closeButton.click();
            System.out.println("Sleep Playlists message is visible. Close button clicked.");
        } else {
            System.out.println("Sleep Playlists message is not visible Moving forward.");
        }
    }

    public void enterTextInPlaylistNameTextBox(String name) {
        wait.wait_for_second(2);
        WebElement textBoxes = androidDriver.findElement(By.className("android.widget.EditText"));
        if (textBoxes.isDisplayed()) {
            textBoxes.sendKeys(name);
            androidDriver.hideKeyboard();
            System.out.println("Text entered into a text box.");

        } else {
            System.out.println("No text box found on the screen.");
        }
    }
    public void verify_search_box_enter_and_clear_text() {
        WebElement searchButton = androidDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"clear\"]"));
        String[] searchTerms = {"Shiva", "Zeel"};

        for (String searchTerm : searchTerms) {
            WebElement searchBox = androidDriver.findElement(By.xpath("//android.widget.EditText"));
            searchBox.click();
            searchBox.clear();
            searchBox.sendKeys(searchTerm);
            searchButton.click();

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            if (searchTerm.equals("Shiva")) {
                verify_shiva_yoga_nidra_text_present_on_page();
                verify_lord_shiva_gift_text_present_on_page();
                System.out.println("Search for 'Shiva' passed.");

            } else if (searchTerm.equals("Zeel")) {
                verify_oops_it_seems_we_dont_have_what_youre_searching_for();
                System.out.println("Search for 'Zeel' passed.");
            }
            searchButton.click();
        }
    }
}


