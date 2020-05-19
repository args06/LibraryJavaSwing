package MVC;

import Controller.ReadController;
import Model.ProccessModel;
import View.ReadView;

public class ReadMVC {

    public ReadMVC(String[] data) {
        ReadView view = new ReadView();
        ProccessModel model = new ProccessModel();
        ReadController controller = new ReadController(data,view,model);
    }
}
