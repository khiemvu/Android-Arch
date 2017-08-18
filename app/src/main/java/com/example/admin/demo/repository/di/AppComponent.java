package com.example.admin.demo.repository.di;

import android.app.Application;
import com.example.admin.demo.ui.viewmodel.LoginViewModel;
import dagger.Component;

import javax.inject.Singleton;

/**
 * Created by admin on 8/16/2017.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent
{
    void inject(Application application);

    void inject(LoginViewModel loginViewModel);

}
