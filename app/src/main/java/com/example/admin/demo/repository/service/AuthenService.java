package com.example.admin.demo.repository.service;

import com.example.admin.demo.repository.dto.ResponseDTO;
import com.example.admin.demo.repository.dto.UserDTO;
import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

import java.util.List;

/**
 * Created by admin on 8/15/2017.
 */
public interface AuthenService
{
    public static final String NAME_BASE_URL = "https://dl.gemvietnam.com:8038/";

    @FormUrlEncoded
    @POST("/authentication-2.0.0/login/getAccounts?version=1.5.3-0&os=ANDROID")
    Observable<ResponseDTO<List<UserDTO>>> doLogin(@Field("loginInfoDTO") String loginInfoDTO);
}
