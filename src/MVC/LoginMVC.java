package MVC;

import Controller.LoginController;
import Model.UserModel;
import View.LoginView;

public class LoginMVC {
    LoginView view = new LoginView();
    UserModel model = new UserModel();
    LoginController controller = new LoginController(view, model);
}
