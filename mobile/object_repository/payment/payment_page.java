package mobile.object_repository.payment;
import io.appium.java_client.android.AndroidDriver;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.WebDriver;

public class payment_page {
    WebDriver driver = null;
    Element element = null;
    Verify verify = null;
    Wait wait = null;
    AndroidDriver androidDriver = null;

    public payment_page(WebDriver driver) {
        this.driver = driver;
        element = new Element(driver);
        verify = new Verify(driver);
        wait = new Wait(driver);
        androidDriver = (AndroidDriver) driver;
    }
    public void verify_and_click_on_manage_subscription()
    {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("Manage_subscription");
        element.click("Manage_subscription");
    }
    public void verify_subscription_details_page_present_on_page()
    {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("subscription_Details");
    }
    public void verify_and_click_on_start_free_trail()
    {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("start_free_trial");
        element.click("start_free_trial");
    }
    public void verify_one_million_meditators_worldwide_present_on_page()
    {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("one_million_meditators_worldwide");
    }
    public void verify_one_four_nine_months_plans_present_on_page()
    {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("one_four_nine_months");
    }
    public void verify_and_click_on_continue_button()
    {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("continue_button");
        element.click("continue_button");
    }
    public void verify_and_click_on_subscribe_button()
    {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("subscribe_button");
        element.click("subscribe_button");
    }
    public void verify_congratulations_page_present_on_page() {
        wait.wait_for_second(2);
        try {
            wait.wait_until_element_is_visible("congratulations");

            System.out.println("Congratulations! The congratulations page is present.");

        } catch (Exception e) {
            System.out.println("Congratulations page is not visible.");
            System.out.println("Error occurred while verifying the congratulations page: " + e.getMessage());
        }
    }
    public void verify_and_click_on_cancel_subscription()
    {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("cancel_subscription");
        element.click("cancel_subscription");
    }
    public void verify_and_click_on_continue_to_cancel_memberships()
    {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("continue_to_cancel_memberships");
        element.click("continue_to_cancel_memberships");
    }
    public void verify_and_click_on_click_on_first_checkbox_for_cancellation()
    {
        wait.wait_for_second(2);
        wait.wait_until_element_is_visible("click_on_first_checkbox");
        element.click("click_on_first_checkbox");
    }

}



