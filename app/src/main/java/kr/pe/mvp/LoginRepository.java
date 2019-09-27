package kr.pe.mvp;

public interface LoginRepository {

    User getUser();

    void saveUser(User user);
}
