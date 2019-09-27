package kr.pe.mvp;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public LoginActivityContract.Presenter provideLoginActivityPresenter(LoginActivityContract.Model model){
        return new LoginActivityPresenter(model);
    }

    @Provides
    public LoginActivityContract.Model provideLoginActivityModel(LoginRepository repository){
        return new LoginModel(repository);
    }

    @Provides
    public LoginRepository provideLoginRepository(){
        return new UserRepository();
    }
}
