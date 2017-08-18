package com.example.admin.demo.repository.service;

import com.example.admin.demo.repository.database.dao.UserDAO;
import com.example.admin.demo.repository.database.entity.User;
import com.example.admin.demo.repository.dto.LoginInfoDTO;
import com.example.admin.demo.repository.dto.ResponseDTO;
import com.example.admin.demo.repository.dto.UserDTO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.reactivex.Observable;

import javax.inject.Inject;
import javax.inject.Singleton;
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

    public Observable<ResponseDTO<List<UserDTO>>> doLogin(LoginInfoDTO loginInfoDTO)
    {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        return authenService
                        .doLogin(gson.toJson(loginInfoDTO));
    }

    public void doPersitData(List<UserDTO> userDTOs)
    {
        for (UserDTO userDTO : userDTOs)
        {
            User user = new UserDTO().convertFromDTO(userDTO);
            userDAO.createOrUpdateUser(user);
        }
    }

    public void getAllUser()
    {
        userDAO.findAllUsers();
    }
}
