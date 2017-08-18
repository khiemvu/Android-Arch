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
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
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
    private final CompositeDisposable mDisposable = new CompositeDisposable();
    @Inject
    public AuthenRespository authenRespository;
    private LoginInfoDTO loginInfoDTO;
    private MutableLiveData<List<UserDTO>> userDTOMutableLiveData;

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
        mDisposable.add(authenRespository.doLogin(loginInfoDTO)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.io())
                .subscribeWith(
                        new DisposableObserver<ResponseDTO<List<UserDTO>>>()
                        {

                            @Override
                            public void onComplete()
                            {
                                Log.i("XXX", "Get data from server completed");
//                                        return mutableLiveData;
                            }

                            @Override
                            public void onError(Throwable e)
                            {
//                                        Timber.e(e, "woops we got an error while getting the list of contributors");
                            }

                            @Override
                            public void onNext(ResponseDTO<List<UserDTO>> userDTOs)
                            {
                                authenRespository.doPersitData(userDTOs.getResult());
//                                authenRespository.getAllUser();
                            }
                        }));
    }

    @Override
    protected void onCleared()
    {
        super.onCleared();
        mDisposable.dispose();
    }

    public LiveData<List<UserDTO>> loadUsers()
    {
        if (userDTOMutableLiveData == null)
        {
            userDTOMutableLiveData = new MutableLiveData<>();
            getUsers();
        }
        return userDTOMutableLiveData;
    }

    private void getUsers()
    {
//        mDisposable.add((Disposable) authenRespository.getAllUser());
        mDisposable.add(authenRespository.getAllUser()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSubscriber<List<User>>()
                {
                    @Override
                    public void onNext(List<User> users)
                    {
                        List<UserDTO> userDTOs = new ArrayList<>();
                        for (User user : users)
                        {
                            userDTOs.add(new UserDTO().convertToDTO(user));
                        }
                        userDTOMutableLiveData.setValue(userDTOs);
                    }

                    @Override
                    public void onError(Throwable t)
                    {

                    }

                    @Override
                    public void onComplete()
                    {

                    }
                }));
//        List<User> users = authenRespository.getAllUser();
//        List<UserDTO> userDTOs = new ArrayList<>();
//        for (User user : users)
//        {
//            userDTOs.add(new UserDTO().convertToDTO(user));
//        }
//        userDTOMutableLiveData.setValue(userDTOs);
    }
}
