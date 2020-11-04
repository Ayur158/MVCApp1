package view;


import controller.Controller;
import model.ModelData;

public class EditUserView implements View {
    private Controller controller;
    private EditUserView editUserView;

    public void setEditUserView(EditUserView editUserView) {
        this.editUserView = editUserView;
    }

    @Override
    public void refresh(ModelData modelData) {
        System.out.println("User to be edited:");
        System.out.println("\t" + modelData.getActiveUser() );
        System.out.println("===================================================");
    }
    public void fireEventUserDeleted(long id) {
        controller.onUserDelete(id);
    }
    public void fireEventUserChanged(String name, long id, int level) {
        controller.onUserChange(name, id, level);
    }
    @Override
    public void setController(Controller controller) {
    this.controller = controller;
    }
}
