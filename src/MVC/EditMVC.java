package MVC;

import Controller.EditController;
import Model.ProccessModel;
import View.EditView;

public class EditMVC {

    public EditMVC(String[] data, String[] dataTerpilih) {
        EditView view = new EditView();
        ProccessModel model = new ProccessModel();
        EditController controller = new EditController(data, dataTerpilih, view, model);
    }
}
