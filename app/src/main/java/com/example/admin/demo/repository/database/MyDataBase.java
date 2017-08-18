package com.example.admin.demo.repository.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import com.example.admin.demo.repository.database.dao.UserDAO;
import com.example.admin.demo.repository.database.entity.User;

/**
 * Created by admin on 8/15/2017.
 */
@Database(entities = {User.class}, version = 1)
public abstract class MyDataBase extends RoomDatabase
{
    public static final String DATABASE_NAME = "login-demo-db";
    public abstract UserDAO userDao();
}
