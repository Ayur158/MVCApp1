package model;



import bean.User;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model {
    private ModelData modelData = new ModelData();
    @Override
    public ModelData getModelData() {
        return this.modelData;
    }

    @Override
    public void loadUsers() {
    List<User> list = new ArrayList<User>();
    User kekw = new User("Влад",1,1);
    User kekwait = new User("Стас",1,1);
    list.add(kekw);
    list.add(kekwait);
    this.modelData.setUsers(list);
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long kekw) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long kekwait) {
    throw new UnsupportedOperationException();
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }

}
