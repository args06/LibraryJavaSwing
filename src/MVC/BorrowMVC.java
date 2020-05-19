package MVC;

import Controller.BorrowController;
import Model.ProccessModel;
import View.BorrowView;

public class BorrowMVC {

    public BorrowMVC(String[] data) {
        BorrowView view = new BorrowView();
        ProccessModel model = new ProccessModel();
        BorrowController controller = new BorrowController(data,view,model);
    }
}