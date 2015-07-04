package org.fasttrackit.workshop.Preferences;

import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.button.Button;
import com.sdl.selenium.web.form.TextField;
import com.sdl.selenium.web.utils.Utils;


/**
 * Created by alexandru.sarbu on 04-Jul-15.
 */
public class PreferencesWindow {

    private WebLocator window = new WebLocator().setId("preferences-win");

    private Button preferencesButton = new Button().setText("Preferences");
    private TextField currentPassword = new TextField().setLabel("Current Password");
    private TextField newPassword = new TextField().setLabel("New Password");
    private TextField confirmPass = new TextField().setLabel("Repeat Password");
    private Button saveButton = new Button().setText("Save").setContainer(window);
    private Button closeButton = new Button().setText("Close").setContainer(window);

    public static void main(String[] args) {
        PreferencesWindow preferencesWindow = new PreferencesWindow();
        System.out.println(preferencesWindow.closeButton.getPath());
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
        saveButton.click();
    }
}
