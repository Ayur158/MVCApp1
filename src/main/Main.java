package main;

import controller.Controller;
import model.MainModel;
import model.Model;
import view.EditUserView;
import view.UsersView;

public class Main {
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        Controller controller = new Controller();

        usersView.setController(controller);
        controller.setModel(model);
        controller.setUsersView(usersView);

        usersView.fireEventShowAllUsers();
        EditUserView editUserView = new EditUserView();
        controller.setEditUserView(editUserView);
        editUserView.setController(controller);
        usersView.fireEventOpenUserEditForm(126);
        editUserView.fireEventUserDeleted(124);
        editUserView.fireEventUserChanged("HYI",125,90);
        usersView.fireEventShowDeletedUsers();
    }
}