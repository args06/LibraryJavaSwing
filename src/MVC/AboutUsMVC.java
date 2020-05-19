package MVC;

import Controller.AboutUsController;
import View.AboutUsView;

public class AboutUsMVC {

    public AboutUsMVC(String[] data) {
        AboutUsView view = new AboutUsView();
        AboutUsController controller = new AboutUsController(data,view);
    }
}
