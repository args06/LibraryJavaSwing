package MVC;

import Controller.SignUpController;
import Model.UserModel;
import View.SignUpView;

public class SignUpMVC {
    SignUpView view = new SignUpView();
    UserModel model = new UserModel();
    SignUpController controller = new SignUpController(view,model);
}
