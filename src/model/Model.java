package model;

public interface Model {
    ModelData getModelData();
    void loadUsers();
    void loadDeletedUsers();
    void loadUserById(long kekw);
    void deleteUserById (long kekwait);
    void changeUserData(String name, long id, int level);
}
