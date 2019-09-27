package kr.pe.mvp;

public class UserRepository implements LoginRepository{

    private User user;

    @Override
    public User getUser() {

        if (user == null) {
            User user = new User("홍길동", "김철수");
            user.setId(1);
            return user;
        } else {
            return user;
        }

    }

    @Override
    public void saveUser(User user) {

        if (user == null) {
            user = getUser();
        }

        this.user = user;

    }
}
