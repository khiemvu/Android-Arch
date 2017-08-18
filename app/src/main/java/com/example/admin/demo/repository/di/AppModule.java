package com.example.admin.demo.repository.di;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.content.Context;
import com.example.admin.demo.repository.database.MyDataBase;
import com.example.admin.demo.repository.database.dao.UserDAO;
import com.example.admin.demo.repository.service.AuthenService;
import com.example.admin.demo.repository.service.LogJsonInterceptor;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.inject.Singleton;

import static com.example.admin.demo.repository.service.AuthenService.NAME_BASE_URL;

/**
 * Created by admin on 8/16/2017.
 */

@Module
public class AppModule
{
    private Application application;

    public AppModule(Application application)
    {
        this.application = application;
    }


    @Singleton
    @Provides
    AuthenService provideAuthenService()
    {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(new LogJsonInterceptor());
        return new Retrofit.Builder()
                .baseUrl(NAME_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(httpClient.build())
                .build()
                .create(AuthenService.class);
    }

    @Singleton
    @Provides
    MyDataBase provideDb()
    {
        return Room.databaseBuilder(application, MyDataBase.class, MyDataBase.DATABASE_NAME).build();
    }

    @Singleton
    @Provides
    UserDAO provideUserDao(MyDataBase db)
    {
        return db.userDao();
    }

    @Provides
    @Singleton
    public Context provideContext()
    {
        return application;
    }
}
