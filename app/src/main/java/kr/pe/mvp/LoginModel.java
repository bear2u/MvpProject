package kr.pe.mvp;

public class LoginModel implements LoginActivityContract.Model{

    private LoginRepository repository;

    public LoginModel() {
        this.repository = new UserRepository();
    }

    @Override
    public void createUser(String name, String lastName) {


        repository.saveUser(new User(name, lastName));


    }

    @Override
    public User getUser() {

        return repository.getUser();
    }
}
