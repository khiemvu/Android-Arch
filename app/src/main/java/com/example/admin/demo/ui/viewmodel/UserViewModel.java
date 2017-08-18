package com.example.admin.demo.ui.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import com.example.admin.demo.repository.database.entity.User;
import com.example.admin.demo.repository.service.AuthenRespository;

/**
 * Created by admin on 8/15/2017.
 */

public class UserViewModel extends ViewModel
{
    private LiveData<User> user;
    private AuthenRespository authenRespository;

    private LiveData<User> getUser()
    {
        return user;
    }

    public AuthenRespository getAuthenRespository()
    {
        return authenRespository;
    }
}
