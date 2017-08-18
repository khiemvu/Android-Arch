package com.example.admin.demo.repository.service;

import android.arch.lifecycle.MutableLiveData;
import android.util.Log;
import com.example.admin.demo.repository.database.dao.UserDAO;
import com.example.admin.demo.repository.database.entity.User;
import com.example.admin.demo.repository.dto.LoginInfoDTO;
import com.example.admin.demo.repository.dto.ResponseDTO;
import com.example.admin.demo.repository.dto.UserDTO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 8/15/2017.
 */
@Singleton
public class AuthenRespository
{
    private UserDAO userDAO;
    private AuthenService authenService;

    @Inject
    public AuthenRespository(AuthenService authenService, UserDAO userDAO)
    {
        this.authenService = authenService;
        this.userDAO = userDAO;
    }

    public void doLogin(LoginInfoDTO loginInfoDTO)
    {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        authenService
                .doLogin(gson.toJson(loginInfoDTO))
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
                            }

                            @Override
                            public void onNext(ResponseDTO<List<UserDTO>> userDTOs)
                            {
                                doPersitData(userDTOs.getResult());
                            }
                        });
    }

    public void doPersitData(List<UserDTO> userDTOs)
    {
        for (UserDTO userDTO : userDTOs)
        {
            User user = new UserDTO().convertFromDTO(userDTO);
            userDAO.createOrUpdateUser(user);
        }
    }

    public MutableLiveData<List<UserDTO>> getAllUser()
    {
        MutableLiveData<List<UserDTO>> userDTOMutableLiveData = new MutableLiveData<>();
        getUsers(userDTOMutableLiveData);
        return userDTOMutableLiveData;
    }

    private void getUsers(final MutableLiveData<List<UserDTO>> userDTOMutableLiveData)
    {
        userDAO.findAllUsers()
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
                });
    }
}
