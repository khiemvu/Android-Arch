package com.example.admin.demo.repository.database.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import com.example.admin.demo.repository.database.entity.User;
import io.reactivex.Flowable;
import io.reactivex.Observable;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 * Created by admin on 8/15/2017.
 */
@Dao
public interface UserDAO
{
    @Insert(onConflict = REPLACE)
    void createOrUpdateUser(User user);
    @Insert
    void insertAll(User... users);
    @Query("SELECT * FROM user WHERE webUserId = :userId")
    Flowable<User> getUserByWebId(String userId);
//
//    @Query("SELECT * FROM user")
//    LiveData<List<User>> findAllUser();
//
    @Query("SELECT * FROM user")
    Flowable<List<User>> findAllUsers();
}
