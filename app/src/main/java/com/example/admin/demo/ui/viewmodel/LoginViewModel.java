package com.example.admin.demo.ui.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.util.Log;
import com.example.admin.demo.DemoApp;
import com.example.admin.demo.repository.database.entity.User;
import com.example.admin.demo.repository.dto.LoginInfoDTO;
import com.example.admin.demo.repository.dto.ResponseDTO;
import com.example.admin.demo.repository.dto.UserDTO;
import com.example.admin.demo.repository.service.AuthenRespository;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.completable.CompletableFromAction;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 8/15/2017.
 */

public class LoginViewModel extends AndroidViewModel
{
    @Inject
    public AuthenRespository authenRespository;
    private LoginInfoDTO loginInfoDTO;

    public LoginViewModel(Application application)
    {
        super(application);
        ((DemoApp) application).getAppComponent().inject(this);
    }


    public LoginInfoDTO getLoginInfoDTO()
    {
        return loginInfoDTO;
    }

    public void setLoginInfoDTO(LoginInfoDTO loginInfoDTO)
    {
        this.loginInfoDTO = loginInfoDTO;
    }

    public void doLogin(LoginInfoDTO loginInfoDTO)
    {
        authenRespository.doLogin(loginInfoDTO);
    }

    @Override
    protected void onCleared()
    {
        super.onCleared();
    }

    public LiveData<List<UserDTO>> loadUsers()
    {
        return authenRespository.getAllUser();
    }

    private void getUsers()
    {
        authenRespository.getAllUser();
    }
}
