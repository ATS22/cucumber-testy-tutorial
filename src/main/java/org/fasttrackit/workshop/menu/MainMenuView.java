package org.fasttrackit.workshop.menu;

import com.sdl.selenium.web.button.Button;
import com.sdl.selenium.web.link.WebLink;

/**
 * Created by alexandru.sarbu on 04-Jul-15.
 */
public class MainMenuView {
    public static Button preferencesButton = new Button().setText("Preferences");
    public static WebLink logoutLink = new WebLink().setText("Logout");

}
