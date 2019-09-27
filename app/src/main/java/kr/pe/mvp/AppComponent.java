package kr.pe.mvp;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, LoginModule.class})
public interface AppComponent {

    void inject(LoginActivity target);

}
