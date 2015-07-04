package org.fasttrackit.workshop.Preferences;

import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.button.Button;
import com.sdl.selenium.web.form.TextField;
import com.sdl.selenium.web.utils.Utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


/**
 * Created by alexandru.sarbu on 04-Jul-15.
 */
public class PreferencesWindow {

    private WebLocator window = new WebLocator().setId("preferences-win");

    private Button preferencesButton = new Button().setText("Preferences");

    private TextField currentPassword = new TextField(window).setLabel("Current Password");
    private TextField newPassword = new TextField(window).setLabel("New Password");
    private TextField confirmPass = new TextField(window).setLabel("Repeat Password");
    private Button saveButton = new Button(window).setText("Save").setContainer(window);
    private Button closeButton = new Button(window).setText("Close").setContainer(window);
    private WebLocator statusMessageEl = new WebLocator(window).setClasses("status-msg");

    public static void main(String[] args) {
        PreferencesWindow preferencesWindow = new PreferencesWindow();
        System.out.println(preferencesWindow.statusMessageEl.getPath());
        System.out.println(preferencesWindow.window.getPath());
    }

    public void open() {
        preferencesButton.click();
    }

    public void typeCurrentPassword(String password) {
        Utils.sleep(2000); // because of fading window
        currentPassword.setValue(password);
    }

    public void typeNewPassword(String password) {
        newPassword.setValue(password);
    }

    public void confirmNewPassword(String confirmPassword) {
        confirmPass.setValue(confirmPassword);
    }

    public void clickSaveButton() {
        saveButton.assertClick();
    }

    public void isMessageDisplayed(String expectedMessage) {
        assertThat(statusMessageEl.getHtmlText(), is(expectedMessage));
    }

    public void clickCloseButton() {
        closeButton.assertClick();
    }
}
