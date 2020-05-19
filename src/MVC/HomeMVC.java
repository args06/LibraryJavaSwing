package MVC;

import Controller.HomeController;
import View.HomeView;

public class HomeMVC {

    public HomeMVC(String[] data) {
        HomeView view = new HomeView();
        HomeController controller = new HomeController(data,view);
    }
}
